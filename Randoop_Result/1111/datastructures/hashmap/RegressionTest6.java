package datastructures.hashmap;

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
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean9 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (short) 100);
        boolean boolean12 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash(96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3002");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean10 = hashMapLinearProbing1.isFull();
        boolean boolean11 = hashMapLinearProbing1.isFull();
        boolean boolean12 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        int int15 = hashMapLinearProbing1.hashing(51);
        hashMapLinearProbing1.insertHash(0);
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
    }

    @Test
    public void test3003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3003");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        boolean boolean9 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (short) 0);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(15);
        boolean boolean15 = hashMapLinearProbing1.isFull();
        int int17 = hashMapLinearProbing1.findHash(16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test3004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3004");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(100);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (byte) 0);
        hashMapLinearProbing1.displayHashtable();
        int int7 = hashMapLinearProbing1.hashing(7);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 7 + "'", int7 == 7);
    }

    @Test
    public void test3005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3005");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(30);
        boolean boolean11 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (short) 100);
        int int15 = hashMapLinearProbing1.findHash(17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test3006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3006");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 0);
        hashMapLinearProbing1.displayHashtable();
        int int8 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.insertHash((int) (short) 10);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash((int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 27 + "'", int8 == 27);
    }

    @Test
    public void test3007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3007");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(0);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(27);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3008");
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
        int int16 = hashMapLinearProbing1.hashing(44);
        java.lang.Class<?> wildcardClass17 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3009");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        hashMapLinearProbing1.displayHashtable();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(27);
        boolean boolean10 = hashMapLinearProbing1.isFull();
        int int12 = hashMapLinearProbing1.hashing((-1));
        boolean boolean13 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3010");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        hashMapLinearProbing1.deleteHash(27);
        boolean boolean4 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(27);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3011");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(0);
        hashMapLinearProbing1.deleteHash(35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3012");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.insertHash((int) (byte) -1);
        int int7 = hashMapLinearProbing1.findHash(45);
        int int9 = hashMapLinearProbing1.hashing(0);
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        int int12 = hashMapLinearProbing1.hashing(14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 14 + "'", int12 == 14);
    }

    @Test
    public void test3013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3013");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(52);
    }

    @Test
    public void test3014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3014");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(44);
        boolean boolean14 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3015");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (short) -1);
        hashMapLinearProbing1.insertHash(10);
        int int11 = hashMapLinearProbing1.findHash((int) (short) 10);
        hashMapLinearProbing1.insertHash((int) (short) 100);
        int int15 = hashMapLinearProbing1.findHash(51);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test3016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3016");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(34);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash(9);
        boolean boolean5 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3017");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.findHash(0);
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.checkLoadFactor();
        int int13 = hashMapLinearProbing1.findHash((int) (short) -1);
        hashMapLinearProbing1.deleteHash((int) '4');
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(99);
        hashMapLinearProbing1.deleteHash((int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3018");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        int int4 = hashMapLinearProbing1.hashing(30);
        hashMapLinearProbing1.deleteHash((int) (byte) 100);
        int int8 = hashMapLinearProbing1.findHash((int) '4');
        hashMapLinearProbing1.checkLoadFactor();
        int int11 = hashMapLinearProbing1.hashing(14);
        hashMapLinearProbing1.insertHash(5);
        hashMapLinearProbing1.deleteHash(1);
        boolean boolean16 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 30 + "'", int4 == 30);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 14 + "'", int11 == 14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3019");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash((int) ' ');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        int int9 = hashMapLinearProbing1.findHash(17);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3020");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) (byte) 1);
        hashMapLinearProbing1.checkLoadFactor();
        int int13 = hashMapLinearProbing1.hashing(26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 26 + "'", int13 == 26);
    }

    @Test
    public void test3021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3021");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (short) -1);
        int int10 = hashMapLinearProbing1.hashing((-1));
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash((int) 'a');
        int int15 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        int int18 = hashMapLinearProbing1.findHash(2);
        boolean boolean19 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3022");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean10 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3023");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        int int7 = hashMapLinearProbing1.findHash((int) (byte) -1);
        hashMapLinearProbing1.insertHash((int) (short) 10);
        int int11 = hashMapLinearProbing1.findHash(51);
        int int13 = hashMapLinearProbing1.hashing(44);
        boolean boolean14 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3024");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int10 = hashMapLinearProbing1.findHash((int) 'a');
        int int12 = hashMapLinearProbing1.hashing(45);
        hashMapLinearProbing1.insertHash(0);
        boolean boolean15 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3025");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((-1));
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        int int11 = hashMapLinearProbing1.findHash(17);
        boolean boolean12 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3026");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 0);
        hashMapLinearProbing1.displayHashtable();
        int int8 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash(45);
        boolean boolean12 = hashMapLinearProbing1.isFull();
        int int14 = hashMapLinearProbing1.hashing(5);
        java.lang.Class<?> wildcardClass15 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 27 + "'", int8 == 27);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3027");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (short) -1);
        int int10 = hashMapLinearProbing1.hashing((-1));
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        boolean boolean12 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        int int15 = hashMapLinearProbing1.hashing((int) (short) -1);
        int int17 = hashMapLinearProbing1.findHash((int) (short) 10);
        boolean boolean18 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3028");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean4 = hashMapLinearProbing1.isFull();
        int int6 = hashMapLinearProbing1.findHash(1);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        int int10 = hashMapLinearProbing1.findHash((int) '#');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3029");
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
        int int17 = hashMapLinearProbing1.findHash(96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test3030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3030");
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
        int int21 = hashMapLinearProbing1.findHash((int) (short) 0);
        hashMapLinearProbing1.deleteHash(27);
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test3031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3031");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (short) -1);
        boolean boolean8 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(34);
        int int12 = hashMapLinearProbing1.hashing((-1));
        hashMapLinearProbing1.displayHashtable();
        boolean boolean14 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean16 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3032");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 0);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        int int9 = hashMapLinearProbing1.hashing((int) '4');
        hashMapLinearProbing1.displayHashtable();
        boolean boolean11 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 17 + "'", int9 == 17);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3033");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash((-1));
        hashMapLinearProbing1.deleteHash(10);
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        hashMapLinearProbing1.insertHash(16);
        int int16 = hashMapLinearProbing1.hashing(48);
        int int18 = hashMapLinearProbing1.hashing(9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 13 + "'", int16 == 13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
    }

    @Test
    public void test3034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3034");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        java.lang.Class<?> wildcardClass11 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3035");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash((int) (byte) 10);
        java.lang.Class<?> wildcardClass5 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3036");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        int int8 = hashMapLinearProbing1.findHash(10);
        int int10 = hashMapLinearProbing1.hashing((int) ' ');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test3037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3037");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        boolean boolean9 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (short) 0);
        hashMapLinearProbing1.insertHash(30);
        boolean boolean14 = hashMapLinearProbing1.isEmpty();
        int int16 = hashMapLinearProbing1.hashing(34);
        hashMapLinearProbing1.deleteHash(5);
        hashMapLinearProbing1.displayHashtable();
        int int21 = hashMapLinearProbing1.findHash((int) (byte) 10);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 34 + "'", int16 == 34);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test3038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3038");
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
        int int18 = hashMapLinearProbing1.findHash(17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 30 + "'", int14 == 30);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3039");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean8 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3040");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        int int9 = hashMapLinearProbing1.findHash(51);
        int int11 = hashMapLinearProbing1.findHash((int) ' ');
        int int13 = hashMapLinearProbing1.findHash(100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3041");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean4 = hashMapLinearProbing1.isFull();
        int int6 = hashMapLinearProbing1.hashing(27);
        boolean boolean7 = hashMapLinearProbing1.isFull();
        int int9 = hashMapLinearProbing1.findHash(0);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean11 = hashMapLinearProbing1.isFull();
        boolean boolean12 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27 + "'", int6 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3042");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        hashMapLinearProbing1.deleteHash(100);
        int int11 = hashMapLinearProbing1.findHash((int) (byte) -1);
        hashMapLinearProbing1.deleteHash(44);
        int int15 = hashMapLinearProbing1.hashing((int) (byte) 100);
        boolean boolean16 = hashMapLinearProbing1.isFull();
        int int18 = hashMapLinearProbing1.hashing((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 30 + "'", int15 == 30);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3043");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        int int7 = hashMapLinearProbing1.findHash((int) (byte) -1);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash((int) ' ');
        int int12 = hashMapLinearProbing1.hashing((-1));
        boolean boolean13 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3044");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.displayHashtable();
        boolean boolean3 = hashMapLinearProbing1.isEmpty();
        boolean boolean4 = hashMapLinearProbing1.isFull();
        boolean boolean5 = hashMapLinearProbing1.isEmpty();
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        int int8 = hashMapLinearProbing1.findHash(7);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3045");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3046");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        hashMapLinearProbing1.insertHash(17);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        int int11 = hashMapLinearProbing1.hashing(0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3047");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        int int4 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.deleteHash(30);
        hashMapLinearProbing1.deleteHash(35);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(51);
        hashMapLinearProbing1.insertHash((int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 45 + "'", int4 == 45);
    }

    @Test
    public void test3048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3048");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        int int8 = hashMapLinearProbing1.findHash(10);
        hashMapLinearProbing1.displayHashtable();
        java.lang.Class<?> wildcardClass10 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3049");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        int int4 = hashMapLinearProbing1.hashing(30);
        hashMapLinearProbing1.deleteHash((int) (byte) 100);
        int int8 = hashMapLinearProbing1.findHash((int) '4');
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        boolean boolean10 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 30 + "'", int4 == 30);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3050");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(0);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        boolean boolean3 = hashMapLinearProbing1.isEmpty();
        boolean boolean4 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3051");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        int int10 = hashMapLinearProbing1.findHash((int) (byte) 1);
        int int12 = hashMapLinearProbing1.findHash(0);
        boolean boolean13 = hashMapLinearProbing1.isFull();
        int int15 = hashMapLinearProbing1.findHash(26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test3052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3052");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(27);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean11 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3053");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        int int9 = hashMapLinearProbing1.findHash(34);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash((int) (short) 0);
        int int14 = hashMapLinearProbing1.findHash(100);
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3054");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(10);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean4 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(14);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3055");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) (short) 100);
        hashMapLinearProbing1.deleteHash((int) (byte) 0);
        int int5 = hashMapLinearProbing1.hashing((int) (short) 0);
        int int7 = hashMapLinearProbing1.findHash((-1));
        int int9 = hashMapLinearProbing1.hashing((int) (short) -1);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
    }

    @Test
    public void test3056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3056");
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
        hashMapLinearProbing1.insertHash(100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3057");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) 'a');
        hashMapLinearProbing1.deleteHash(30);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean5 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(15);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3058");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        boolean boolean4 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash(35);
        int int9 = hashMapLinearProbing1.hashing((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test3059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3059");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        hashMapLinearProbing1.displayHashtable();
        int int8 = hashMapLinearProbing1.hashing((int) (byte) 1);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(26);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3060");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        int int8 = hashMapLinearProbing1.findHash(48);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3061");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) 'a');
        hashMapLinearProbing1.deleteHash(30);
        int int5 = hashMapLinearProbing1.hashing(3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
    }

    @Test
    public void test3062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3062");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        int int11 = hashMapLinearProbing1.hashing(45);
        hashMapLinearProbing1.deleteHash(3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test3063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3063");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(0);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        boolean boolean3 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean8 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3064");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(30);
        boolean boolean11 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3065");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash(9);
        boolean boolean5 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3066");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (short) -1);
        int int10 = hashMapLinearProbing1.hashing((-1));
        hashMapLinearProbing1.insertHash((int) '#');
        int int14 = hashMapLinearProbing1.hashing(35);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean16 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3067");
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
        int int23 = hashMapLinearProbing1.findHash((int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 17 + "'", int13 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test3068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3068");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) 'a');
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash((int) '4');
        hashMapLinearProbing1.insertHash((int) (short) 10);
        int int8 = hashMapLinearProbing1.findHash((int) '4');
        hashMapLinearProbing1.deleteHash(5);
        boolean boolean11 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3069");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        int int9 = hashMapLinearProbing1.findHash(34);
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        int int12 = hashMapLinearProbing1.findHash((int) (byte) -1);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3070");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) (byte) 0);
        boolean boolean2 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean4 = hashMapLinearProbing1.isEmpty();
        boolean boolean5 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3071");
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
        int int18 = hashMapLinearProbing1.findHash(16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3072");
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
        hashMapLinearProbing1.deleteHash(44);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 30 + "'", int17 == 30);
    }

    @Test
    public void test3073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3073");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int12 = hashMapLinearProbing1.findHash(44);
        boolean boolean13 = hashMapLinearProbing1.isEmpty();
        int int15 = hashMapLinearProbing1.hashing((int) (short) 0);
        int int17 = hashMapLinearProbing1.hashing(27);
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 27 + "'", int17 == 27);
    }

    @Test
    public void test3074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3074");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(15);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        int int10 = hashMapLinearProbing1.findHash((int) (byte) 0);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3075");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(30);
        int int6 = hashMapLinearProbing1.findHash((int) (byte) 0);
        hashMapLinearProbing1.insertHash(17);
        hashMapLinearProbing1.deleteHash((int) (byte) 10);
        boolean boolean11 = hashMapLinearProbing1.isFull();
        boolean boolean12 = hashMapLinearProbing1.isEmpty();
        int int14 = hashMapLinearProbing1.hashing(27);
        hashMapLinearProbing1.deleteHash(16);
        hashMapLinearProbing1.insertHash((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test3076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3076");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        int int11 = hashMapLinearProbing1.hashing((int) (byte) -1);
        boolean boolean12 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 34 + "'", int11 == 34);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3077");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 1);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(45);
        boolean boolean13 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3078");
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
        int int19 = hashMapLinearProbing1.hashing(52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 30 + "'", int17 == 30);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 17 + "'", int19 == 17);
    }

    @Test
    public void test3079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3079");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) (byte) 10);
        hashMapLinearProbing1.deleteHash(30);
        hashMapLinearProbing1.deleteHash((-1));
        int int7 = hashMapLinearProbing1.hashing(27);
        hashMapLinearProbing1.displayHashtable();
        java.lang.Class<?> wildcardClass9 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 7 + "'", int7 == 7);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3080");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash((-1));
        hashMapLinearProbing1.deleteHash(10);
        int int12 = hashMapLinearProbing1.hashing(35);
        java.lang.Class<?> wildcardClass13 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3081");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        int int11 = hashMapLinearProbing1.hashing(45);
        int int13 = hashMapLinearProbing1.hashing(48);
        int int15 = hashMapLinearProbing1.findHash(45);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 13 + "'", int13 == 13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test3082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3082");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(0);
        boolean boolean12 = hashMapLinearProbing1.isFull();
        boolean boolean13 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(48);
        boolean boolean16 = hashMapLinearProbing1.isEmpty();
        int int18 = hashMapLinearProbing1.hashing(9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
    }

    @Test
    public void test3083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3083");
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
        hashMapLinearProbing1.deleteHash(17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3084");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        hashMapLinearProbing1.checkLoadFactor();
        int int6 = hashMapLinearProbing1.findHash((int) (byte) 100);
        hashMapLinearProbing1.insertHash(100);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash(32);
        hashMapLinearProbing1.insertHash(0);
        hashMapLinearProbing1.deleteHash(17);
        boolean boolean16 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3085");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.findHash(0);
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(27);
        boolean boolean14 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (short) -1);
        hashMapLinearProbing1.insertHash(27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3086");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        int int5 = hashMapLinearProbing1.findHash(27);
        int int7 = hashMapLinearProbing1.findHash((int) (byte) -1);
        hashMapLinearProbing1.deleteHash(1);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3087");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(100);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (byte) 0);
        hashMapLinearProbing1.deleteHash(48);
        int int8 = hashMapLinearProbing1.hashing(100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3088");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        int int8 = hashMapLinearProbing1.findHash((int) '4');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(15);
        boolean boolean13 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash((int) (byte) 100);
        int int17 = hashMapLinearProbing1.hashing((int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
    }

    @Test
    public void test3089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3089");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.hashing((int) (short) 100);
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        boolean boolean10 = hashMapLinearProbing1.isFull();
        int int12 = hashMapLinearProbing1.hashing((int) (byte) 1);
        int int14 = hashMapLinearProbing1.findHash(30);
        int int16 = hashMapLinearProbing1.findHash(2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 30 + "'", int8 == 30);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3090");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.findHash(0);
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.checkLoadFactor();
        int int13 = hashMapLinearProbing1.findHash((int) (short) -1);
        hashMapLinearProbing1.deleteHash((int) '4');
        hashMapLinearProbing1.deleteHash((int) (short) -1);
        boolean boolean18 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(1);
        int int22 = hashMapLinearProbing1.findHash(48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test3091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3091");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        int int9 = hashMapLinearProbing1.findHash(34);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3092");
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
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(2);
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3093");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        hashMapLinearProbing1.insertHash(17);
        int int8 = hashMapLinearProbing1.findHash((int) (byte) 1);
        hashMapLinearProbing1.deleteHash(13);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(0);
        boolean boolean14 = hashMapLinearProbing1.isFull();
        boolean boolean15 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash((int) ' ');
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3094");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(30);
        boolean boolean5 = hashMapLinearProbing1.isFull();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(1);
        hashMapLinearProbing1.insertHash(96);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3095");
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
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 44 + "'", int14 == 44);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3096");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean4 = hashMapLinearProbing1.isFull();
        int int6 = hashMapLinearProbing1.hashing(27);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        int int10 = hashMapLinearProbing1.hashing((int) (short) -1);
        int int12 = hashMapLinearProbing1.findHash(5);
        hashMapLinearProbing1.deleteHash((int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27 + "'", int6 == 27);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 51 + "'", int10 == 51);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3097");
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
        hashMapLinearProbing1.insertHash((int) (byte) 100);
        hashMapLinearProbing1.insertHash(99);
        boolean boolean22 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3098");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(0);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        boolean boolean3 = hashMapLinearProbing1.isEmpty();
        boolean boolean4 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3099");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        hashMapLinearProbing1.deleteHash((int) (byte) 100);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        int int13 = hashMapLinearProbing1.hashing(10);
        hashMapLinearProbing1.deleteHash((int) (byte) 100);
        int int17 = hashMapLinearProbing1.hashing((int) 'a');
        boolean boolean18 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 27 + "'", int17 == 27);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3100");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 0);
        hashMapLinearProbing1.displayHashtable();
        int int8 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash(45);
        int int13 = hashMapLinearProbing1.findHash(1);
        hashMapLinearProbing1.insertHash((int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 27 + "'", int8 == 27);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3101");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(0);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(32);
        int int13 = hashMapLinearProbing1.hashing(45);
        java.lang.Class<?> wildcardClass14 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3102");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) 'a');
        hashMapLinearProbing1.deleteHash(30);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean5 = hashMapLinearProbing1.isEmpty();
        int int7 = hashMapLinearProbing1.findHash(0);
        int int9 = hashMapLinearProbing1.hashing(45);
        int int11 = hashMapLinearProbing1.findHash((int) (short) 100);
        boolean boolean12 = hashMapLinearProbing1.isFull();
        boolean boolean13 = hashMapLinearProbing1.isFull();
        int int15 = hashMapLinearProbing1.hashing(99);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 45 + "'", int9 == 45);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test3103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3103");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        int int4 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.deleteHash(30);
        hashMapLinearProbing1.insertHash(34);
        hashMapLinearProbing1.insertHash(15);
        hashMapLinearProbing1.displayHashtable();
        java.lang.Class<?> wildcardClass12 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 45 + "'", int4 == 45);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3104");
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
        hashMapLinearProbing1.insertHash(44);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash((int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 27 + "'", int20 == 27);
    }

    @Test
    public void test3105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3105");
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
        hashMapLinearProbing1.insertHash(44);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 34 + "'", int19 == 34);
    }

    @Test
    public void test3106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3106");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (short) -1);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        int int10 = hashMapLinearProbing1.hashing((-1));
        hashMapLinearProbing1.deleteHash(35);
        hashMapLinearProbing1.insertHash(100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
    }

    @Test
    public void test3107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3107");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(30);
        boolean boolean5 = hashMapLinearProbing1.isFull();
        int int7 = hashMapLinearProbing1.findHash((int) (byte) -1);
        hashMapLinearProbing1.insertHash(45);
        hashMapLinearProbing1.deleteHash((int) (byte) 1);
        hashMapLinearProbing1.checkLoadFactor();
        int int14 = hashMapLinearProbing1.findHash(13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3108");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(1);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean3 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (byte) 1);
        hashMapLinearProbing1.insertHash(0);
        boolean boolean9 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3109");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        int int10 = hashMapLinearProbing1.findHash((int) (short) 10);
        hashMapLinearProbing1.deleteHash(30);
        hashMapLinearProbing1.insertHash(0);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3110");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) (byte) 1);
        hashMapLinearProbing1.displayHashtable();
        int int4 = hashMapLinearProbing1.hashing((int) ' ');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3111");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        int int4 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.deleteHash(30);
        hashMapLinearProbing1.insertHash(34);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean12 = hashMapLinearProbing1.isFull();
        boolean boolean13 = hashMapLinearProbing1.isFull();
        int int15 = hashMapLinearProbing1.findHash(51);
        int int17 = hashMapLinearProbing1.hashing(0);
        int int19 = hashMapLinearProbing1.hashing((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 45 + "'", int4 == 45);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 48 + "'", int19 == 48);
    }

    @Test
    public void test3112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3112");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        int int5 = hashMapLinearProbing1.hashing((int) '#');
        int int7 = hashMapLinearProbing1.hashing((int) (short) 1);
        hashMapLinearProbing1.insertHash((int) (byte) 100);
        int int11 = hashMapLinearProbing1.hashing((int) (byte) 100);
        boolean boolean12 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash(35);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 48 + "'", int11 == 48);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3113");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(30);
        int int6 = hashMapLinearProbing1.findHash((int) (byte) 0);
        hashMapLinearProbing1.insertHash(17);
        hashMapLinearProbing1.deleteHash((int) (byte) 10);
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        hashMapLinearProbing1.checkLoadFactor();
        java.lang.Class<?> wildcardClass14 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3114");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (short) 10);
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        java.lang.Class<?> wildcardClass11 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3115");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        int int7 = hashMapLinearProbing1.findHash((int) (byte) -1);
        hashMapLinearProbing1.deleteHash((int) (byte) 0);
        hashMapLinearProbing1.insertHash((int) (short) 100);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (byte) 0);
        hashMapLinearProbing1.checkLoadFactor();
        int int17 = hashMapLinearProbing1.findHash((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test3116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3116");
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
        hashMapLinearProbing1.insertHash(17);
        int int19 = hashMapLinearProbing1.hashing((int) (byte) 100);
        int int21 = hashMapLinearProbing1.hashing(32);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 44 + "'", int14 == 44);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 48 + "'", int19 == 48);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
    }

    @Test
    public void test3117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3117");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        int int5 = hashMapLinearProbing1.findHash(27);
        int int7 = hashMapLinearProbing1.findHash((int) (byte) -1);
        hashMapLinearProbing1.deleteHash(1);
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash((int) (byte) 0);
        int int14 = hashMapLinearProbing1.findHash(3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3118");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 10);
        hashMapLinearProbing1.insertHash((int) (byte) 1);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean10 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean12 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3119");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean9 = hashMapLinearProbing1.isFull();
        int int11 = hashMapLinearProbing1.hashing((int) ' ');
        hashMapLinearProbing1.deleteHash((int) (byte) 100);
        int int15 = hashMapLinearProbing1.findHash(48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test3120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3120");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 0);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(100);
        hashMapLinearProbing1.checkLoadFactor();
        java.lang.Class<?> wildcardClass10 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3121");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(34);
        hashMapLinearProbing1.insertHash(0);
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        hashMapLinearProbing1.deleteHash(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3122");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.findHash(0);
        int int10 = hashMapLinearProbing1.hashing(1);
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(35);
        int int15 = hashMapLinearProbing1.hashing(9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
    }

    @Test
    public void test3123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3123");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        hashMapLinearProbing1.insertHash(17);
        int int8 = hashMapLinearProbing1.findHash((int) (byte) -1);
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(44);
        boolean boolean13 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3124");
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
        boolean boolean14 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3125");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 0);
        hashMapLinearProbing1.displayHashtable();
        int int8 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (byte) 100);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 27 + "'", int8 == 27);
    }

    @Test
    public void test3126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3126");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (byte) 10);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3127");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(17);
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3128");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(45);
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        hashMapLinearProbing1.deleteHash(10);
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3129");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.deleteHash((-1));
        hashMapLinearProbing1.insertHash(27);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash(34);
        boolean boolean13 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3130");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) (byte) 1);
        hashMapLinearProbing1.insertHash((int) (short) 0);
        int int5 = hashMapLinearProbing1.findHash(15);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (byte) 10);
        hashMapLinearProbing1.insertHash((int) '#');
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3131");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        int int9 = hashMapLinearProbing1.hashing((int) (byte) 10);
        hashMapLinearProbing1.deleteHash((int) '#');
        hashMapLinearProbing1.displayHashtable();
        boolean boolean13 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3132");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) 'a');
        hashMapLinearProbing1.deleteHash(30);
        int int5 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3133");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) 'a');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3134");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.findHash(0);
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.checkLoadFactor();
        int int13 = hashMapLinearProbing1.findHash((int) (short) -1);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(35);
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3135");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (short) 10);
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        int int12 = hashMapLinearProbing1.findHash(30);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean14 = hashMapLinearProbing1.isEmpty();
        boolean boolean15 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3136");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(48);
        int int3 = hashMapLinearProbing1.findHash(27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test3137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3137");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean4 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(48);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3138");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean4 = hashMapLinearProbing1.isFull();
        int int6 = hashMapLinearProbing1.hashing(27);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        int int10 = hashMapLinearProbing1.hashing((int) (short) -1);
        hashMapLinearProbing1.checkLoadFactor();
        int int13 = hashMapLinearProbing1.hashing(44);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27 + "'", int6 == 27);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 51 + "'", int10 == 51);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 44 + "'", int13 == 44);
    }

    @Test
    public void test3139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3139");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        hashMapLinearProbing1.insertHash(17);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        java.lang.Class<?> wildcardClass11 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3140");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(45);
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        hashMapLinearProbing1.insertHash((-1));
    }

    @Test
    public void test3141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3141");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (byte) 1);
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3142");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        hashMapLinearProbing1.checkLoadFactor();
        int int6 = hashMapLinearProbing1.findHash((int) (byte) 100);
        hashMapLinearProbing1.insertHash(100);
        hashMapLinearProbing1.displayHashtable();
        int int11 = hashMapLinearProbing1.findHash(32);
        hashMapLinearProbing1.deleteHash(7);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3143");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (short) -1);
        boolean boolean8 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(34);
        java.lang.Class<?> wildcardClass11 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3144");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(30);
        int int6 = hashMapLinearProbing1.findHash((int) (byte) 0);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(9);
        hashMapLinearProbing1.displayHashtable();
        int int13 = hashMapLinearProbing1.findHash(29);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3145");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        int int4 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.deleteHash(30);
        hashMapLinearProbing1.insertHash((int) (short) 100);
        int int10 = hashMapLinearProbing1.hashing(34);
        int int12 = hashMapLinearProbing1.findHash((-1));
        boolean boolean13 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(0);
        int int17 = hashMapLinearProbing1.findHash(100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 45 + "'", int4 == 45);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 48 + "'", int17 == 48);
    }

    @Test
    public void test3146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3146");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean9 = hashMapLinearProbing1.isFull();
        int int11 = hashMapLinearProbing1.hashing((int) ' ');
        int int13 = hashMapLinearProbing1.hashing((int) '4');
        int int15 = hashMapLinearProbing1.hashing((int) (short) 10);
        hashMapLinearProbing1.checkLoadFactor();
        int int18 = hashMapLinearProbing1.findHash(35);
        hashMapLinearProbing1.deleteHash(99);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 17 + "'", int13 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3147");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        int int11 = hashMapLinearProbing1.findHash(48);
        boolean boolean12 = hashMapLinearProbing1.isFull();
        java.lang.Class<?> wildcardClass13 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3148");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        hashMapLinearProbing1.displayHashtable();
        int int8 = hashMapLinearProbing1.hashing((int) (byte) 1);
        int int10 = hashMapLinearProbing1.findHash((int) (short) 10);
        int int12 = hashMapLinearProbing1.findHash((int) (byte) 0);
        int int14 = hashMapLinearProbing1.findHash((int) (byte) 1);
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3149");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.findHash(0);
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(10);
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        hashMapLinearProbing1.deleteHash((int) '4');
        boolean boolean19 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3150");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        int int7 = hashMapLinearProbing1.findHash((int) (byte) -1);
        hashMapLinearProbing1.deleteHash((int) (byte) 0);
        hashMapLinearProbing1.insertHash((int) (short) 100);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (byte) 0);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean16 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3151");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        hashMapLinearProbing1.deleteHash((int) (byte) 1);
        boolean boolean10 = hashMapLinearProbing1.isFull();
        int int12 = hashMapLinearProbing1.findHash((int) (short) -1);
        boolean boolean13 = hashMapLinearProbing1.isFull();
        int int15 = hashMapLinearProbing1.findHash(14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test3152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3152");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(13);
        int int13 = hashMapLinearProbing1.hashing((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3153");
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
        int int17 = hashMapLinearProbing1.hashing(96);
        int int19 = hashMapLinearProbing1.findHash((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 30 + "'", int15 == 30);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 26 + "'", int17 == 26);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test3154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3154");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) 'a');
        hashMapLinearProbing1.deleteHash(30);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean5 = hashMapLinearProbing1.isFull();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3155");
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
        boolean boolean17 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3156");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (byte) 10);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        boolean boolean12 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3157");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(0);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        int int12 = hashMapLinearProbing1.findHash(2);
        boolean boolean13 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3158");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean3 = hashMapLinearProbing1.isFull();
        boolean boolean4 = hashMapLinearProbing1.isFull();
        boolean boolean5 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3159");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(35);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(10);
        boolean boolean5 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3160");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        hashMapLinearProbing1.insertHash((int) '#');
        boolean boolean4 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(32);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3161");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(10);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean4 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(16);
        hashMapLinearProbing1.deleteHash(12);
        hashMapLinearProbing1.insertHash((int) (byte) 100);
        java.lang.Class<?> wildcardClass11 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3162");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.findHash(0);
        int int10 = hashMapLinearProbing1.hashing(1);
        hashMapLinearProbing1.deleteHash(0);
        int int14 = hashMapLinearProbing1.hashing((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3163");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 0);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        int int9 = hashMapLinearProbing1.hashing((int) '4');
        int int11 = hashMapLinearProbing1.hashing((int) ' ');
        hashMapLinearProbing1.displayHashtable();
        boolean boolean13 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 17 + "'", int9 == 17);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3164");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 0);
        hashMapLinearProbing1.deleteHash((int) (byte) 10);
        hashMapLinearProbing1.deleteHash((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3165");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        int int4 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.deleteHash(30);
        int int8 = hashMapLinearProbing1.findHash(51);
        boolean boolean9 = hashMapLinearProbing1.isFull();
        int int11 = hashMapLinearProbing1.findHash(30);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 45 + "'", int4 == 45);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3166");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        hashMapLinearProbing1.insertHash(17);
        int int8 = hashMapLinearProbing1.findHash((int) (byte) 1);
        hashMapLinearProbing1.deleteHash(13);
        int int12 = hashMapLinearProbing1.findHash((int) (byte) 1);
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3167");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        hashMapLinearProbing1.insertHash(17);
        int int8 = hashMapLinearProbing1.findHash(32);
        hashMapLinearProbing1.deleteHash(32);
        int int12 = hashMapLinearProbing1.findHash(15);
        hashMapLinearProbing1.insertHash(44);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3168");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        hashMapLinearProbing1.insertHash(35);
        hashMapLinearProbing1.checkLoadFactor();
        int int10 = hashMapLinearProbing1.findHash(16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3169");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        hashMapLinearProbing1.deleteHash(100);
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3170");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        int int4 = hashMapLinearProbing1.hashing(30);
        int int6 = hashMapLinearProbing1.hashing(32);
        hashMapLinearProbing1.deleteHash((int) (short) 10);
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 30 + "'", int4 == 30);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test3171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3171");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 0);
        hashMapLinearProbing1.displayHashtable();
        int int8 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) '4');
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 27 + "'", int8 == 27);
    }

    @Test
    public void test3172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3172");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash((-1));
        hashMapLinearProbing1.deleteHash(10);
        int int12 = hashMapLinearProbing1.hashing(35);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash(15);
        boolean boolean17 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3173");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(45);
        hashMapLinearProbing1.deleteHash(32);
        boolean boolean4 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        java.lang.Class<?> wildcardClass6 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3174");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(13);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean13 = hashMapLinearProbing1.isFull();
        int int15 = hashMapLinearProbing1.findHash(5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test3175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3175");
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
        java.lang.Class<?> wildcardClass19 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3176");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        int int4 = hashMapLinearProbing1.hashing(30);
        hashMapLinearProbing1.deleteHash((int) (byte) 100);
        hashMapLinearProbing1.insertHash((int) 'a');
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        boolean boolean10 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean12 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(5);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 30 + "'", int4 == 30);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3177");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (short) -1);
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3178");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(34);
        int int10 = hashMapLinearProbing1.hashing(1);
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.checkLoadFactor();
        int int15 = hashMapLinearProbing1.hashing((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test3179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3179");
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
        int int18 = hashMapLinearProbing1.findHash(13);
        boolean boolean19 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 17 + "'", int16 == 17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3180");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.findHash(0);
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean13 = hashMapLinearProbing1.isEmpty();
        boolean boolean14 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3181");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) (byte) 100);
        boolean boolean2 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(9);
        hashMapLinearProbing1.deleteHash((int) (byte) 1);
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3182");
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
        hashMapLinearProbing1.deleteHash((int) (byte) 10);
        int int22 = hashMapLinearProbing1.hashing(15);
        int int24 = hashMapLinearProbing1.hashing(7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 15 + "'", int22 == 15);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 7 + "'", int24 == 7);
    }

    @Test
    public void test3183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3183");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        int int9 = hashMapLinearProbing1.hashing((int) 'a');
        boolean boolean10 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        int int14 = hashMapLinearProbing1.hashing((int) '#');
        java.lang.Class<?> wildcardClass15 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 27 + "'", int9 == 27);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3184");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.findHash(0);
        int int10 = hashMapLinearProbing1.hashing(1);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean12 = hashMapLinearProbing1.isEmpty();
        boolean boolean13 = hashMapLinearProbing1.isEmpty();
        int int15 = hashMapLinearProbing1.hashing((int) (short) 0);
        hashMapLinearProbing1.insertHash(99);
        int int19 = hashMapLinearProbing1.hashing(100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 30 + "'", int19 == 30);
    }

    @Test
    public void test3185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3185");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        boolean boolean9 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        boolean boolean12 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(0);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean16 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3186");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (byte) 10);
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) 'a');
        java.lang.Class<?> wildcardClass16 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3187");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int10 = hashMapLinearProbing1.findHash((int) 'a');
        hashMapLinearProbing1.insertHash((int) (short) 100);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean14 = hashMapLinearProbing1.isEmpty();
        java.lang.Class<?> wildcardClass15 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3188");
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
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test3189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3189");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (byte) 10);
        hashMapLinearProbing1.insertHash(17);
        int int12 = hashMapLinearProbing1.hashing((int) (byte) 0);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        int int16 = hashMapLinearProbing1.findHash((int) (short) 10);
        boolean boolean17 = hashMapLinearProbing1.isFull();
        java.lang.Class<?> wildcardClass18 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3190");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        hashMapLinearProbing1.deleteHash((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
    }

    @Test
    public void test3191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3191");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean3 = hashMapLinearProbing1.isEmpty();
        boolean boolean4 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3192");
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
        int int17 = hashMapLinearProbing1.hashing(5);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean19 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3193");
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
        hashMapLinearProbing1.displayHashtable();
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
    public void test3194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3194");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        int int5 = hashMapLinearProbing1.hashing((int) '#');
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        int int9 = hashMapLinearProbing1.hashing(48);
        boolean boolean10 = hashMapLinearProbing1.isFull();
        boolean boolean11 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) 'a');
        hashMapLinearProbing1.insertHash(100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 48 + "'", int9 == 48);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3195");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 0);
        hashMapLinearProbing1.displayHashtable();
        int int8 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.insertHash((int) 'a');
        hashMapLinearProbing1.insertHash((int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 27 + "'", int8 == 27);
    }

    @Test
    public void test3196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3196");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        hashMapLinearProbing1.displayHashtable();
        int int8 = hashMapLinearProbing1.findHash((-1));
        hashMapLinearProbing1.insertHash(32);
        int int12 = hashMapLinearProbing1.findHash((int) (byte) 1);
        boolean boolean13 = hashMapLinearProbing1.isEmpty();
        int int15 = hashMapLinearProbing1.hashing(51);
        boolean boolean16 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3197");
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
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3198");
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
        boolean boolean13 = hashMapLinearProbing1.isFull();
        boolean boolean14 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3199");
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
        boolean boolean20 = hashMapLinearProbing1.isFull();
        boolean boolean21 = hashMapLinearProbing1.isFull();
        int int23 = hashMapLinearProbing1.findHash((int) (byte) 10);
        hashMapLinearProbing1.insertHash(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test3200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3200");
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
        int int18 = hashMapLinearProbing1.hashing((int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 27 + "'", int18 == 27);
    }

    @Test
    public void test3201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3201");
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
        hashMapLinearProbing1.insertHash((int) ' ');
        int int19 = hashMapLinearProbing1.hashing(96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 26 + "'", int19 == 26);
    }

    @Test
    public void test3202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3202");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(45);
        hashMapLinearProbing1.insertHash((int) (byte) 0);
        hashMapLinearProbing1.insertHash(17);
        boolean boolean15 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean19 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3203");
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
        hashMapLinearProbing1.deleteHash((int) 'a');
        hashMapLinearProbing1.deleteHash(96);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3204");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        hashMapLinearProbing1.deleteHash(100);
        int int11 = hashMapLinearProbing1.hashing(30);
        boolean boolean12 = hashMapLinearProbing1.isFull();
        boolean boolean13 = hashMapLinearProbing1.isFull();
        boolean boolean14 = hashMapLinearProbing1.isFull();
        boolean boolean15 = hashMapLinearProbing1.isFull();
        boolean boolean16 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 30 + "'", int11 == 30);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3205");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        int int5 = hashMapLinearProbing1.hashing((int) (short) -1);
        hashMapLinearProbing1.deleteHash((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
    }

    @Test
    public void test3206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3206");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) ' ');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash(29);
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3207");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) (short) 100);
        hashMapLinearProbing1.deleteHash((int) (byte) 0);
        int int5 = hashMapLinearProbing1.hashing((int) (short) 0);
        hashMapLinearProbing1.insertHash(32);
        hashMapLinearProbing1.insertHash(5);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3208");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((-1));
        hashMapLinearProbing1.deleteHash(27);
        int int8 = hashMapLinearProbing1.findHash(99);
        int int10 = hashMapLinearProbing1.hashing(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3209");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.findHash((int) (byte) 1);
        int int10 = hashMapLinearProbing1.hashing(32);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(45);
        java.lang.Class<?> wildcardClass14 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3210");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) (short) 10);
        int int11 = hashMapLinearProbing1.findHash((int) (short) 0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash(35);
        int int16 = hashMapLinearProbing1.hashing(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3211");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        hashMapLinearProbing1.deleteHash((int) ' ');
        hashMapLinearProbing1.insertHash(10);
        hashMapLinearProbing1.insertHash(30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3212");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) ' ');
        hashMapLinearProbing1.displayHashtable();
        int int9 = hashMapLinearProbing1.hashing((int) ' ');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) ' ');
        hashMapLinearProbing1.deleteHash(29);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
    }

    @Test
    public void test3213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3213");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(30);
        int int6 = hashMapLinearProbing1.findHash((int) (byte) 0);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(30);
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3214");
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
        hashMapLinearProbing1.insertHash(32);
        boolean boolean23 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        int int26 = hashMapLinearProbing1.hashing((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test3215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3215");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (short) -1);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean10 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(51);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3216");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash(0);
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3217");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (byte) 10);
        hashMapLinearProbing1.insertHash(17);
        int int12 = hashMapLinearProbing1.findHash(34);
        int int14 = hashMapLinearProbing1.findHash((int) '4');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash(26);
        int int19 = hashMapLinearProbing1.findHash(32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test3218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3218");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(100);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (byte) 0);
        hashMapLinearProbing1.deleteHash((int) (byte) 1);
        boolean boolean7 = hashMapLinearProbing1.isFull();
        java.lang.Class<?> wildcardClass8 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3219");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(35);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test3220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3220");
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
        boolean boolean26 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 27 + "'", int20 == 27);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test3221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3221");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        int int12 = hashMapLinearProbing1.findHash((int) (short) 0);
        boolean boolean13 = hashMapLinearProbing1.isEmpty();
        int int15 = hashMapLinearProbing1.hashing((int) (byte) 1);
        int int17 = hashMapLinearProbing1.hashing((int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 27 + "'", int17 == 27);
    }

    @Test
    public void test3222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3222");
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
        boolean boolean19 = hashMapLinearProbing1.isEmpty();
        int int21 = hashMapLinearProbing1.findHash(12);
        hashMapLinearProbing1.deleteHash((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test3223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3223");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) 'a');
        hashMapLinearProbing1.deleteHash(30);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean5 = hashMapLinearProbing1.isFull();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3224");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.hashing((int) (short) 100);
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash((int) '4');
        hashMapLinearProbing1.deleteHash(100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 30 + "'", int8 == 30);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3225");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 0);
        hashMapLinearProbing1.displayHashtable();
        int int8 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash(45);
        hashMapLinearProbing1.insertHash(29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 27 + "'", int8 == 27);
    }

    @Test
    public void test3226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3226");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        int int4 = hashMapLinearProbing1.hashing(30);
        hashMapLinearProbing1.deleteHash((int) (byte) 100);
        hashMapLinearProbing1.insertHash((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        boolean boolean12 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(0);
        hashMapLinearProbing1.insertHash((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 30 + "'", int4 == 30);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3227");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (byte) 10);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) '#');
        hashMapLinearProbing1.deleteHash(0);
        int int16 = hashMapLinearProbing1.hashing(27);
        int int18 = hashMapLinearProbing1.findHash(16);
        hashMapLinearProbing1.displayHashtable();
        int int21 = hashMapLinearProbing1.hashing((int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 27 + "'", int16 == 27);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
    }

    @Test
    public void test3228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3228");
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
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3229");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(10);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean4 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(14);
        hashMapLinearProbing1.deleteHash(0);
        java.lang.Class<?> wildcardClass9 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3230");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        int int4 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.deleteHash(30);
        hashMapLinearProbing1.insertHash(34);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(32);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(12);
        int int18 = hashMapLinearProbing1.findHash((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 45 + "'", int4 == 45);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3231");
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
        hashMapLinearProbing1.deleteHash(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3232");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3233");
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
        hashMapLinearProbing1.insertHash((int) 'a');
        boolean boolean22 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3234");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean4 = hashMapLinearProbing1.isFull();
        int int6 = hashMapLinearProbing1.findHash(27);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        int int11 = hashMapLinearProbing1.hashing((int) ' ');
        int int13 = hashMapLinearProbing1.findHash(3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3235");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.findHash(0);
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(16);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3236");
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
        hashMapLinearProbing1.deleteHash((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        java.lang.Class<?> wildcardClass22 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test3237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3237");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        int int10 = hashMapLinearProbing1.findHash((int) (short) 10);
        hashMapLinearProbing1.insertHash((int) '#');
        boolean boolean13 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3238");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.hashing((int) (short) 100);
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        boolean boolean10 = hashMapLinearProbing1.isFull();
        int int12 = hashMapLinearProbing1.hashing((int) (byte) 1);
        int int14 = hashMapLinearProbing1.findHash(30);
        hashMapLinearProbing1.deleteHash(16);
        hashMapLinearProbing1.deleteHash(96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 30 + "'", int8 == 30);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3239");
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
        boolean boolean16 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        hashMapLinearProbing1.deleteHash(52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3240");
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
        hashMapLinearProbing1.deleteHash(29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test3241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3241");
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
        int int18 = hashMapLinearProbing1.findHash(13);
        hashMapLinearProbing1.displayHashtable();
        java.lang.Class<?> wildcardClass20 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3242");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.findHash(0);
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(27);
        hashMapLinearProbing1.deleteHash(100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3243");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3244");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 1);
        hashMapLinearProbing1.deleteHash((int) (short) 0);
        hashMapLinearProbing1.deleteHash(35);
        int int14 = hashMapLinearProbing1.hashing((int) (short) 10);
        hashMapLinearProbing1.insertHash(5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test3245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3245");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        hashMapLinearProbing1.deleteHash((int) ' ');
        hashMapLinearProbing1.insertHash(10);
        boolean boolean13 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3246");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        int int9 = hashMapLinearProbing1.findHash(34);
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        int int12 = hashMapLinearProbing1.findHash((int) (byte) -1);
        hashMapLinearProbing1.checkLoadFactor();
        int int15 = hashMapLinearProbing1.findHash(17);
        boolean boolean16 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test3247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3247");
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
        hashMapLinearProbing1.deleteHash((int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 27 + "'", int20 == 27);
    }

    @Test
    public void test3248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3248");
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
        int int20 = hashMapLinearProbing1.hashing(14);
        boolean boolean21 = hashMapLinearProbing1.isEmpty();
        int int23 = hashMapLinearProbing1.hashing(51);
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 14 + "'", int20 == 14);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 16 + "'", int23 == 16);
    }

    @Test
    public void test3249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3249");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        int int4 = hashMapLinearProbing1.hashing(30);
        boolean boolean5 = hashMapLinearProbing1.isFull();
        int int7 = hashMapLinearProbing1.findHash((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 30 + "'", int4 == 30);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test3250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3250");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        int int4 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.deleteHash(30);
        hashMapLinearProbing1.deleteHash(35);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 45 + "'", int4 == 45);
    }

    @Test
    public void test3251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3251");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (short) -1);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        int int10 = hashMapLinearProbing1.hashing((-1));
        int int12 = hashMapLinearProbing1.findHash((int) (short) 0);
        int int14 = hashMapLinearProbing1.hashing(100);
        hashMapLinearProbing1.insertHash((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 30 + "'", int14 == 30);
    }

    @Test
    public void test3252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3252");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        hashMapLinearProbing1.insertHash(17);
        int int8 = hashMapLinearProbing1.findHash(32);
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.deleteHash(0);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean14 = hashMapLinearProbing1.isEmpty();
        int int16 = hashMapLinearProbing1.hashing((int) (short) 1);
        boolean boolean17 = hashMapLinearProbing1.isFull();
        int int19 = hashMapLinearProbing1.hashing(34);
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 34 + "'", int19 == 34);
    }

    @Test
    public void test3253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3253");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (byte) 10);
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) 'a');
        int int17 = hashMapLinearProbing1.findHash(13);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test3254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3254");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (short) -1);
        int int10 = hashMapLinearProbing1.hashing((-1));
        hashMapLinearProbing1.insertHash((int) '#');
        int int14 = hashMapLinearProbing1.findHash(15);
        hashMapLinearProbing1.deleteHash(15);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3255");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        int int11 = hashMapLinearProbing1.hashing((int) '#');
        hashMapLinearProbing1.insertHash((int) (byte) 0);
        hashMapLinearProbing1.deleteHash(100);
        hashMapLinearProbing1.insertHash(9);
        int int19 = hashMapLinearProbing1.findHash(45);
        java.lang.Class<?> wildcardClass20 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3256");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.insertHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        int int8 = hashMapLinearProbing1.findHash((int) (byte) 1);
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        int int11 = hashMapLinearProbing1.findHash((int) ' ');
        java.lang.Class<?> wildcardClass12 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3257");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(34);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        boolean boolean3 = hashMapLinearProbing1.isFull();
        boolean boolean4 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(51);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean8 = hashMapLinearProbing1.isFull();
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3258");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) (byte) 1);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(45);
        hashMapLinearProbing1.insertHash((int) (byte) 0);
        hashMapLinearProbing1.insertHash(0);
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        int int11 = hashMapLinearProbing1.hashing((int) '4');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3259");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        int int11 = hashMapLinearProbing1.hashing(45);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) 'a');
        boolean boolean15 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3260");
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
        java.lang.Class<?> wildcardClass17 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3261");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) (short) 1);
        hashMapLinearProbing1.deleteHash(17);
        boolean boolean4 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(34);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3262");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        int int5 = hashMapLinearProbing1.findHash(27);
        int int7 = hashMapLinearProbing1.findHash((int) (byte) -1);
        int int9 = hashMapLinearProbing1.hashing(29);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 29 + "'", int9 == 29);
    }

    @Test
    public void test3263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3263");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(30);
        boolean boolean5 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(35);
        hashMapLinearProbing1.insertHash(12);
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3264");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        hashMapLinearProbing1.displayHashtable();
        int int8 = hashMapLinearProbing1.findHash((-1));
        hashMapLinearProbing1.insertHash(32);
        int int12 = hashMapLinearProbing1.findHash(0);
        hashMapLinearProbing1.deleteHash(0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3265");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean4 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(48);
        int int8 = hashMapLinearProbing1.hashing((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test3266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3266");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(30);
        int int6 = hashMapLinearProbing1.findHash((int) (byte) 0);
        int int8 = hashMapLinearProbing1.hashing(1);
        hashMapLinearProbing1.displayHashtable();
        int int11 = hashMapLinearProbing1.hashing(34);
        hashMapLinearProbing1.deleteHash(27);
        hashMapLinearProbing1.deleteHash((int) (short) 10);
        int int17 = hashMapLinearProbing1.findHash(12);
        boolean boolean18 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3267");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        hashMapLinearProbing1.deleteHash(100);
        int int11 = hashMapLinearProbing1.findHash((int) (byte) -1);
        hashMapLinearProbing1.insertHash(0);
        hashMapLinearProbing1.insertHash((int) ' ');
        int int17 = hashMapLinearProbing1.findHash((int) 'a');
        int int19 = hashMapLinearProbing1.findHash((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test3268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3268");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3269");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(0);
        boolean boolean8 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        int int11 = hashMapLinearProbing1.findHash(0);
        hashMapLinearProbing1.insertHash(52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3270");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        int int4 = hashMapLinearProbing1.hashing((int) ' ');
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean7 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3271");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        boolean boolean9 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        hashMapLinearProbing1.deleteHash(7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3272");
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
        int int17 = hashMapLinearProbing1.hashing(99);
        hashMapLinearProbing1.insertHash(44);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 29 + "'", int17 == 29);
    }

    @Test
    public void test3273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3273");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        int int4 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.deleteHash(30);
        hashMapLinearProbing1.insertHash((int) (short) -1);
        int int10 = hashMapLinearProbing1.findHash(35);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 45 + "'", int4 == 45);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3274");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3275");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        hashMapLinearProbing1.displayHashtable();
        int int8 = hashMapLinearProbing1.findHash((-1));
        java.lang.Class<?> wildcardClass9 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3276");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(100);
        int int10 = hashMapLinearProbing1.hashing((int) (byte) 1);
        java.lang.Class<?> wildcardClass11 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3277");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        int int5 = hashMapLinearProbing1.hashing(1);
        hashMapLinearProbing1.insertHash(27);
        hashMapLinearProbing1.deleteHash(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test3278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3278");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        int int10 = hashMapLinearProbing1.findHash((int) (short) 10);
        hashMapLinearProbing1.insertHash((int) (short) 100);
        boolean boolean13 = hashMapLinearProbing1.isFull();
        boolean boolean14 = hashMapLinearProbing1.isEmpty();
        int int16 = hashMapLinearProbing1.findHash(17);
        int int18 = hashMapLinearProbing1.findHash((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3279");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        int int4 = hashMapLinearProbing1.hashing(30);
        hashMapLinearProbing1.deleteHash((int) (byte) 100);
        int int8 = hashMapLinearProbing1.findHash((int) '4');
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        int int11 = hashMapLinearProbing1.hashing(1);
        hashMapLinearProbing1.insertHash(2);
        hashMapLinearProbing1.deleteHash(15);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 30 + "'", int4 == 30);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test3280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3280");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        int int4 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.deleteHash(30);
        hashMapLinearProbing1.insertHash(34);
        hashMapLinearProbing1.displayHashtable();
        int int11 = hashMapLinearProbing1.findHash((int) (short) 10);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean13 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash((int) (byte) 1);
        hashMapLinearProbing1.deleteHash(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 45 + "'", int4 == 45);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3281");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(10);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash((int) '4');
        boolean boolean5 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) '#');
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        int int10 = hashMapLinearProbing1.hashing((int) '4');
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test3282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3282");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(30);
        boolean boolean5 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(35);
        hashMapLinearProbing1.checkLoadFactor();
        int int10 = hashMapLinearProbing1.hashing(29);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 12 + "'", int10 == 12);
    }

    @Test
    public void test3283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3283");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        hashMapLinearProbing1.displayHashtable();
        int int8 = hashMapLinearProbing1.hashing((int) (byte) 1);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(17);
        hashMapLinearProbing1.deleteHash(48);
        java.lang.Class<?> wildcardClass15 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3284");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        int int11 = hashMapLinearProbing1.hashing(45);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean13 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3285");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 1);
        hashMapLinearProbing1.deleteHash((int) (short) 0);
        hashMapLinearProbing1.deleteHash(35);
        hashMapLinearProbing1.insertHash(35);
        int int16 = hashMapLinearProbing1.findHash((int) (byte) 1);
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test3286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3286");
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
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean20 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 30 + "'", int14 == 30);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 30 + "'", int17 == 30);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3287");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(0);
        boolean boolean12 = hashMapLinearProbing1.isFull();
        boolean boolean13 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(48);
        boolean boolean16 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash((int) '#');
        hashMapLinearProbing1.deleteHash(32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3288");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3289");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        hashMapLinearProbing1.deleteHash(100);
        int int11 = hashMapLinearProbing1.findHash((int) (byte) -1);
        hashMapLinearProbing1.deleteHash(44);
        int int15 = hashMapLinearProbing1.hashing((int) (byte) 100);
        boolean boolean16 = hashMapLinearProbing1.isFull();
        int int18 = hashMapLinearProbing1.hashing(99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 30 + "'", int15 == 30);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 29 + "'", int18 == 29);
    }

    @Test
    public void test3290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3290");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.findHash((int) (byte) 1);
        int int10 = hashMapLinearProbing1.hashing(32);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test3291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3291");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(10);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash((int) '4');
        boolean boolean5 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) '#');
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3292");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 0);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) 'a');
        boolean boolean10 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3293");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean4 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3294");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.insertHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        java.lang.Class<?> wildcardClass10 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3295");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        int int10 = hashMapLinearProbing1.findHash((int) (short) 10);
        hashMapLinearProbing1.insertHash((int) '#');
        boolean boolean13 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        java.lang.Class<?> wildcardClass15 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3296");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) (short) 0);
        boolean boolean2 = hashMapLinearProbing1.isFull();
        boolean boolean3 = hashMapLinearProbing1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = hashMapLinearProbing1.findHash(45);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test3297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3297");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) (short) 100);
        hashMapLinearProbing1.deleteHash((int) (byte) 0);
        boolean boolean4 = hashMapLinearProbing1.isEmpty();
        int int6 = hashMapLinearProbing1.findHash(12);
        int int8 = hashMapLinearProbing1.findHash((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3298");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(35);
        boolean boolean2 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3299");
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
        boolean boolean16 = hashMapLinearProbing1.isFull();
        int int18 = hashMapLinearProbing1.hashing(34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 34 + "'", int18 == 34);
    }

    @Test
    public void test3300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3300");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        int int12 = hashMapLinearProbing1.findHash(35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3301");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(100);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (byte) 0);
        hashMapLinearProbing1.deleteHash((int) (byte) 1);
        boolean boolean7 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(15);
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3302");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(10);
        hashMapLinearProbing1.displayHashtable();
        int int4 = hashMapLinearProbing1.findHash(30);
        hashMapLinearProbing1.deleteHash(5);
        int int8 = hashMapLinearProbing1.findHash(5);
        boolean boolean9 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3303");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        int int7 = hashMapLinearProbing1.findHash((int) (byte) -1);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(34);
        boolean boolean13 = hashMapLinearProbing1.isEmpty();
        boolean boolean14 = hashMapLinearProbing1.isFull();
        int int16 = hashMapLinearProbing1.hashing(96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 26 + "'", int16 == 26);
    }

    @Test
    public void test3304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3304");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        boolean boolean9 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        int int14 = hashMapLinearProbing1.findHash(7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3305");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        int int12 = hashMapLinearProbing1.findHash((int) (short) 0);
        int int14 = hashMapLinearProbing1.findHash(100);
        boolean boolean15 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3306");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(0);
        boolean boolean8 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        int int11 = hashMapLinearProbing1.hashing((int) (byte) 100);
        hashMapLinearProbing1.insertHash(45);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 30 + "'", int11 == 30);
    }

    @Test
    public void test3307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3307");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        hashMapLinearProbing1.checkLoadFactor();
        int int4 = hashMapLinearProbing1.hashing(2);
        hashMapLinearProbing1.checkLoadFactor();
        java.lang.Class<?> wildcardClass6 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test3308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3308");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        hashMapLinearProbing1.deleteHash(100);
        int int11 = hashMapLinearProbing1.hashing(15);
        boolean boolean12 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash(32);
        hashMapLinearProbing1.deleteHash(100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 15 + "'", int11 == 15);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3309");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(100);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (byte) 0);
        boolean boolean5 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(48);
        boolean boolean8 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3310");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean10 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3311");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        int int10 = hashMapLinearProbing1.findHash((int) (short) 10);
        hashMapLinearProbing1.insertHash((int) (short) 100);
        boolean boolean13 = hashMapLinearProbing1.isFull();
        boolean boolean14 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash((int) (short) -1);
        int int18 = hashMapLinearProbing1.hashing((int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 32 + "'", int18 == 32);
    }

    @Test
    public void test3312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3312");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(35);
        int int3 = hashMapLinearProbing1.hashing((int) (short) 0);
        int int5 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash(99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3313");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) (short) 100);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash((int) '4');
        hashMapLinearProbing1.deleteHash(3);
        int int8 = hashMapLinearProbing1.hashing((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test3314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3314");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (short) -1);
        int int10 = hashMapLinearProbing1.hashing((-1));
        hashMapLinearProbing1.insertHash((int) '#');
        int int14 = hashMapLinearProbing1.findHash(15);
        hashMapLinearProbing1.checkLoadFactor();
        java.lang.Class<?> wildcardClass16 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3315");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        int int11 = hashMapLinearProbing1.hashing(45);
        int int13 = hashMapLinearProbing1.hashing(48);
        int int15 = hashMapLinearProbing1.findHash(7);
        hashMapLinearProbing1.insertHash((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 13 + "'", int13 == 13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test3316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3316");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        hashMapLinearProbing1.insertHash(17);
        int int8 = hashMapLinearProbing1.findHash((int) (byte) 1);
        int int10 = hashMapLinearProbing1.hashing(27);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        hashMapLinearProbing1.insertHash((int) '4');
        hashMapLinearProbing1.displayHashtable();
        int int18 = hashMapLinearProbing1.findHash((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 27 + "'", int10 == 27);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test3317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3317");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.insertHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        int int8 = hashMapLinearProbing1.findHash((int) (byte) 1);
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        int int11 = hashMapLinearProbing1.findHash((int) ' ');
        int int13 = hashMapLinearProbing1.hashing(17);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 17 + "'", int13 == 17);
    }

    @Test
    public void test3318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3318");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(30);
        boolean boolean5 = hashMapLinearProbing1.isFull();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(1);
        hashMapLinearProbing1.insertHash((int) (short) -1);
        int int13 = hashMapLinearProbing1.hashing(51);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test3319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3319");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(35);
        int int3 = hashMapLinearProbing1.hashing((int) (short) 0);
        int int5 = hashMapLinearProbing1.hashing(0);
        int int7 = hashMapLinearProbing1.hashing((int) (byte) 1);
        boolean boolean8 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3320");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        int int11 = hashMapLinearProbing1.hashing((int) '#');
        boolean boolean12 = hashMapLinearProbing1.isFull();
        int int14 = hashMapLinearProbing1.findHash((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3321");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 0);
        hashMapLinearProbing1.deleteHash((int) (byte) 10);
        boolean boolean8 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) (byte) 10);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3322");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 0);
        hashMapLinearProbing1.displayHashtable();
        int int8 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean10 = hashMapLinearProbing1.isFull();
        int int12 = hashMapLinearProbing1.hashing((int) (byte) 1);
        hashMapLinearProbing1.displayHashtable();
        int int15 = hashMapLinearProbing1.findHash(48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 27 + "'", int8 == 27);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test3323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3323");
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
        int int20 = hashMapLinearProbing1.hashing(48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 13 + "'", int20 == 13);
    }

    @Test
    public void test3324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3324");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        hashMapLinearProbing1.displayHashtable();
        int int8 = hashMapLinearProbing1.findHash((-1));
        hashMapLinearProbing1.insertHash(32);
        hashMapLinearProbing1.deleteHash(27);
        int int14 = hashMapLinearProbing1.hashing((int) (byte) 10);
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test3325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3325");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        int int4 = hashMapLinearProbing1.hashing(30);
        hashMapLinearProbing1.deleteHash((int) (byte) 100);
        hashMapLinearProbing1.insertHash((int) 'a');
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        boolean boolean10 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 30 + "'", int4 == 30);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3326");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.insertHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        int int9 = hashMapLinearProbing1.findHash(30);
        boolean boolean10 = hashMapLinearProbing1.isFull();
        int int12 = hashMapLinearProbing1.hashing(32);
        int int14 = hashMapLinearProbing1.findHash((int) '4');
        hashMapLinearProbing1.displayHashtable();
        int int17 = hashMapLinearProbing1.hashing(15);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 15 + "'", int17 == 15);
    }

    @Test
    public void test3327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3327");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(100);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (byte) 0);
        hashMapLinearProbing1.deleteHash((int) (byte) 1);
        boolean boolean7 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(15);
        int int11 = hashMapLinearProbing1.findHash((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3328");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash(100);
        int int10 = hashMapLinearProbing1.findHash((int) (short) 100);
        hashMapLinearProbing1.deleteHash(100);
        boolean boolean13 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 30 + "'", int10 == 30);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3329");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        int int5 = hashMapLinearProbing1.hashing((int) '#');
        int int7 = hashMapLinearProbing1.hashing((int) (short) 1);
        int int9 = hashMapLinearProbing1.findHash((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3330");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        int int8 = hashMapLinearProbing1.findHash((int) '4');
        hashMapLinearProbing1.deleteHash((int) 'a');
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3331");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(0);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        int int12 = hashMapLinearProbing1.hashing((int) '#');
        boolean boolean13 = hashMapLinearProbing1.isEmpty();
        boolean boolean14 = hashMapLinearProbing1.isEmpty();
        boolean boolean15 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3332");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(29);
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test3333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3333");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        int int12 = hashMapLinearProbing1.findHash((int) (short) 0);
        boolean boolean13 = hashMapLinearProbing1.isEmpty();
        int int15 = hashMapLinearProbing1.hashing((int) (byte) 1);
        int int17 = hashMapLinearProbing1.findHash(0);
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test3334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3334");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        int int9 = hashMapLinearProbing1.findHash(34);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean12 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3335");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 0);
        hashMapLinearProbing1.displayHashtable();
        int int8 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash(45);
        boolean boolean12 = hashMapLinearProbing1.isFull();
        boolean boolean13 = hashMapLinearProbing1.isEmpty();
        int int15 = hashMapLinearProbing1.hashing((int) (byte) 1);
        int int17 = hashMapLinearProbing1.findHash(27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 27 + "'", int8 == 27);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test3336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3336");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) (short) 10);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean4 = hashMapLinearProbing1.isEmpty();
        int int6 = hashMapLinearProbing1.findHash((int) (short) 10);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test3337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3337");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (short) -1);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(2);
        hashMapLinearProbing1.checkLoadFactor();
        java.lang.Class<?> wildcardClass12 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3338");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        int int4 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.deleteHash(0);
        int int8 = hashMapLinearProbing1.hashing(17);
        boolean boolean9 = hashMapLinearProbing1.isFull();
        boolean boolean10 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(48);
        boolean boolean13 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 45 + "'", int4 == 45);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 17 + "'", int8 == 17);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3339");
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
        hashMapLinearProbing1.deleteHash((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3340");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(100);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (byte) 0);
        hashMapLinearProbing1.checkLoadFactor();
        int int7 = hashMapLinearProbing1.hashing(0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3341");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean5 = hashMapLinearProbing1.isEmpty();
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        java.lang.Class<?> wildcardClass8 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3342");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        int int5 = hashMapLinearProbing1.hashing((int) '#');
        int int7 = hashMapLinearProbing1.hashing((int) (short) 1);
        hashMapLinearProbing1.insertHash((int) (byte) 100);
        int int11 = hashMapLinearProbing1.hashing((int) (byte) 100);
        boolean boolean12 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(100);
        int int16 = hashMapLinearProbing1.hashing(100);
        hashMapLinearProbing1.insertHash(100);
        boolean boolean19 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(27);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 48 + "'", int11 == 48);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 48 + "'", int16 == 48);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3343");
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
        int int16 = hashMapLinearProbing1.findHash(15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3344");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(27);
        java.lang.Class<?> wildcardClass2 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3345");
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
        int int18 = hashMapLinearProbing1.hashing((int) (byte) 0);
        boolean boolean19 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3346");
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
        hashMapLinearProbing1.insertHash(32);
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
    }

    @Test
    public void test3347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3347");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        int int4 = hashMapLinearProbing1.hashing((int) 'a');
        int int6 = hashMapLinearProbing1.findHash((int) (short) 0);
        boolean boolean7 = hashMapLinearProbing1.isFull();
        int int9 = hashMapLinearProbing1.hashing(96);
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 45 + "'", int4 == 45);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 44 + "'", int9 == 44);
    }

    @Test
    public void test3348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3348");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(0);
        boolean boolean2 = hashMapLinearProbing1.isFull();
        boolean boolean3 = hashMapLinearProbing1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = hashMapLinearProbing1.hashing(32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test3349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3349");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (short) -1);
        boolean boolean8 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(1);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3350");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) (short) 100);
        hashMapLinearProbing1.deleteHash((int) (byte) 0);
        int int5 = hashMapLinearProbing1.hashing((int) (short) 0);
        hashMapLinearProbing1.insertHash(32);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        int int10 = hashMapLinearProbing1.hashing(5);
        int int12 = hashMapLinearProbing1.hashing(0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test3351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3351");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(45);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3352");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean3 = hashMapLinearProbing1.isEmpty();
        boolean boolean4 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3353");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (short) -1);
        boolean boolean8 = hashMapLinearProbing1.isFull();
        boolean boolean9 = hashMapLinearProbing1.isFull();
        int int11 = hashMapLinearProbing1.hashing(29);
        int int13 = hashMapLinearProbing1.findHash(100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 29 + "'", int11 == 29);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3354");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        int int4 = hashMapLinearProbing1.hashing(30);
        int int6 = hashMapLinearProbing1.hashing(32);
        int int8 = hashMapLinearProbing1.findHash((-1));
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        int int12 = hashMapLinearProbing1.hashing(48);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean15 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 30 + "'", int4 == 30);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 13 + "'", int12 == 13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3355");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        int int9 = hashMapLinearProbing1.hashing((int) (byte) 10);
        hashMapLinearProbing1.deleteHash((int) '#');
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) '#');
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test3356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3356");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        int int5 = hashMapLinearProbing1.findHash(27);
        int int7 = hashMapLinearProbing1.findHash((int) (byte) -1);
        hashMapLinearProbing1.deleteHash(0);
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        java.lang.Class<?> wildcardClass12 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3357");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(34);
        hashMapLinearProbing1.insertHash(0);
        hashMapLinearProbing1.deleteHash(34);
        int int14 = hashMapLinearProbing1.hashing(29);
        boolean boolean15 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 29 + "'", int14 == 29);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3358");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(0);
        boolean boolean8 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        int int11 = hashMapLinearProbing1.hashing((int) (byte) 100);
        boolean boolean12 = hashMapLinearProbing1.isEmpty();
        boolean boolean13 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 30 + "'", int11 == 30);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3359");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) (short) 10);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
    }

    @Test
    public void test3360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3360");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) 'a');
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        java.lang.Class<?> wildcardClass4 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3361");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        int int4 = hashMapLinearProbing1.hashing(30);
        int int6 = hashMapLinearProbing1.hashing(32);
        hashMapLinearProbing1.deleteHash((int) (byte) 1);
        int int10 = hashMapLinearProbing1.hashing((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 30 + "'", int4 == 30);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 30 + "'", int10 == 30);
    }

    @Test
    public void test3362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3362");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 10);
        hashMapLinearProbing1.insertHash((int) (byte) 1);
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        int int11 = hashMapLinearProbing1.hashing(35);
        hashMapLinearProbing1.displayHashtable();
        int int14 = hashMapLinearProbing1.findHash((int) 'a');
        int int16 = hashMapLinearProbing1.hashing(13);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 13 + "'", int16 == 13);
    }

    @Test
    public void test3363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3363");
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
        hashMapLinearProbing1.insertHash(10);
        hashMapLinearProbing1.displayHashtable();
        int int24 = hashMapLinearProbing1.findHash(100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 30 + "'", int24 == 30);
    }

    @Test
    public void test3364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3364");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        boolean boolean7 = hashMapLinearProbing1.isFull();
        int int9 = hashMapLinearProbing1.findHash((int) (byte) 10);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test3365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3365");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean10 = hashMapLinearProbing1.isFull();
        boolean boolean11 = hashMapLinearProbing1.isFull();
        boolean boolean12 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean15 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3366");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash((int) ' ');
        java.lang.Class<?> wildcardClass10 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3367");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash((int) ' ');
        hashMapLinearProbing1.deleteHash((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3368");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        hashMapLinearProbing1.deleteHash(27);
        hashMapLinearProbing1.deleteHash((int) (short) -1);
        hashMapLinearProbing1.insertHash(14);
        hashMapLinearProbing1.displayHashtable();
        java.lang.Class<?> wildcardClass9 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3369");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(10);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash((int) '4');
        hashMapLinearProbing1.insertHash(30);
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        int int9 = hashMapLinearProbing1.findHash((-1));
        hashMapLinearProbing1.deleteHash(32);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test3370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3370");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        int int9 = hashMapLinearProbing1.findHash(34);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        java.lang.Class<?> wildcardClass12 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3371");
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
        boolean boolean16 = hashMapLinearProbing1.isEmpty();
        int int18 = hashMapLinearProbing1.hashing(45);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test3372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3372");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean9 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (short) -1);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(1);
        boolean boolean15 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3373");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(30);
        boolean boolean5 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(35);
        int int9 = hashMapLinearProbing1.hashing((int) (short) 0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(52);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test3374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3374");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(30);
        hashMapLinearProbing1.insertHash((-1));
        hashMapLinearProbing1.deleteHash((int) 'a');
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3375");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.insertHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(34);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3376");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash((-1));
        hashMapLinearProbing1.insertHash(30);
        hashMapLinearProbing1.insertHash(14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test3377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3377");
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
        int int18 = hashMapLinearProbing1.findHash(45);
        hashMapLinearProbing1.insertHash(96);
        int int22 = hashMapLinearProbing1.hashing((-1));
        int int24 = hashMapLinearProbing1.findHash((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 34 + "'", int22 == 34);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test3378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3378");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        int int10 = hashMapLinearProbing1.hashing((int) (byte) 1);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test3379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3379");
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
        hashMapLinearProbing1.deleteHash(32);
        hashMapLinearProbing1.insertHash((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3380");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        hashMapLinearProbing1.deleteHash(100);
        int int11 = hashMapLinearProbing1.findHash((int) (byte) -1);
        int int13 = hashMapLinearProbing1.findHash((int) (short) 10);
        boolean boolean14 = hashMapLinearProbing1.isEmpty();
        int int16 = hashMapLinearProbing1.findHash(27);
        int int18 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.insertHash((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3381");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 10);
        hashMapLinearProbing1.insertHash((int) (byte) 1);
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        int int11 = hashMapLinearProbing1.hashing(35);
        boolean boolean12 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(2);
        hashMapLinearProbing1.deleteHash(51);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3382");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        hashMapLinearProbing1.displayHashtable();
        int int8 = hashMapLinearProbing1.hashing((int) (byte) 1);
        hashMapLinearProbing1.insertHash(32);
        hashMapLinearProbing1.deleteHash((int) ' ');
        hashMapLinearProbing1.deleteHash(0);
        boolean boolean15 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3383");
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
        boolean boolean19 = hashMapLinearProbing1.isFull();
        int int21 = hashMapLinearProbing1.hashing((int) (byte) 1);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test3384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3384");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(100);
        hashMapLinearProbing1.deleteHash(44);
        int int12 = hashMapLinearProbing1.hashing((int) (short) 1);
        int int14 = hashMapLinearProbing1.findHash(15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3385");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        int int11 = hashMapLinearProbing1.hashing(45);
        int int13 = hashMapLinearProbing1.hashing(48);
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        boolean boolean16 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 13 + "'", int13 == 13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3386");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 10);
        hashMapLinearProbing1.insertHash((int) (byte) 1);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean9 = hashMapLinearProbing1.isFull();
        int int11 = hashMapLinearProbing1.hashing((int) '4');
        boolean boolean12 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 17 + "'", int11 == 17);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3387");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        int int8 = hashMapLinearProbing1.findHash((int) (short) 0);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3388");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        int int9 = hashMapLinearProbing1.hashing((int) 'a');
        int int11 = hashMapLinearProbing1.findHash((int) (short) 0);
        hashMapLinearProbing1.insertHash((int) (short) 100);
        hashMapLinearProbing1.deleteHash(9);
        hashMapLinearProbing1.insertHash(45);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 27 + "'", int9 == 27);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test3389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3389");
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
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3390");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(100);
        hashMapLinearProbing1.deleteHash(44);
        int int12 = hashMapLinearProbing1.hashing((int) (short) 1);
        hashMapLinearProbing1.insertHash(48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test3391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3391");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) 'a');
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash((int) '4');
        hashMapLinearProbing1.insertHash((int) (short) 10);
        int int8 = hashMapLinearProbing1.findHash((int) '4');
        java.lang.Class<?> wildcardClass9 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3392");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(35);
        int int7 = hashMapLinearProbing1.findHash((int) (byte) 10);
        int int9 = hashMapLinearProbing1.hashing((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 34 + "'", int9 == 34);
    }

    @Test
    public void test3393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3393");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        hashMapLinearProbing1.deleteHash((int) (byte) 100);
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        int int14 = hashMapLinearProbing1.findHash((int) (short) 10);
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test3394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3394");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean3 = hashMapLinearProbing1.isEmpty();
        boolean boolean4 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash(17);
        hashMapLinearProbing1.deleteHash(2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3395");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) (byte) 1);
        hashMapLinearProbing1.insertHash((int) (short) 0);
        int int5 = hashMapLinearProbing1.findHash(15);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test3396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3396");
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
        hashMapLinearProbing1.insertHash(32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test3397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3397");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        int int11 = hashMapLinearProbing1.hashing(45);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) 'a');
        hashMapLinearProbing1.displayHashtable();
        boolean boolean16 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3398");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        int int4 = hashMapLinearProbing1.hashing(30);
        hashMapLinearProbing1.deleteHash((int) (byte) 100);
        int int8 = hashMapLinearProbing1.findHash((int) '4');
        hashMapLinearProbing1.checkLoadFactor();
        int int11 = hashMapLinearProbing1.hashing(14);
        int int13 = hashMapLinearProbing1.hashing((int) (short) 100);
        boolean boolean14 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 30 + "'", int4 == 30);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 14 + "'", int11 == 14);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 30 + "'", int13 == 30);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3399");
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
        int int15 = hashMapLinearProbing1.hashing(15);
        boolean boolean16 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(9);
        boolean boolean19 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3400");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) (byte) 0);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean3 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        java.lang.Class<?> wildcardClass5 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3401");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 0);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (byte) 100);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3402");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        int int10 = hashMapLinearProbing1.findHash((int) (byte) -1);
        hashMapLinearProbing1.deleteHash((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3403");
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
        hashMapLinearProbing1.deleteHash((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3404");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        int int7 = hashMapLinearProbing1.findHash((int) (byte) -1);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(34);
        boolean boolean13 = hashMapLinearProbing1.isEmpty();
        boolean boolean14 = hashMapLinearProbing1.isFull();
        int int16 = hashMapLinearProbing1.findHash((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test3405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3405");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(100);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean3 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test3406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3406");
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
        hashMapLinearProbing1.checkLoadFactor();
        int int26 = hashMapLinearProbing1.findHash(27);
        int int28 = hashMapLinearProbing1.hashing(16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 7 + "'", int22 == 7);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 16 + "'", int28 == 16);
    }

    @Test
    public void test3407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3407");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(0);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash((int) (byte) -1);
        int int12 = hashMapLinearProbing1.findHash((int) (short) 0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash(3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3408");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        int int5 = hashMapLinearProbing1.hashing((int) '#');
        int int7 = hashMapLinearProbing1.hashing((int) (short) 1);
        hashMapLinearProbing1.insertHash((int) (byte) 100);
        int int11 = hashMapLinearProbing1.hashing((int) (byte) 100);
        boolean boolean12 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(100);
        int int16 = hashMapLinearProbing1.hashing(100);
        hashMapLinearProbing1.insertHash(100);
        boolean boolean19 = hashMapLinearProbing1.isEmpty();
        int int21 = hashMapLinearProbing1.hashing(27);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 48 + "'", int11 == 48);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 48 + "'", int16 == 48);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 27 + "'", int21 == 27);
    }

    @Test
    public void test3409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3409");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        int int11 = hashMapLinearProbing1.findHash(48);
        boolean boolean12 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3410");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(30);
        boolean boolean5 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(35);
        int int9 = hashMapLinearProbing1.hashing((int) (short) 0);
        boolean boolean10 = hashMapLinearProbing1.isFull();
        boolean boolean11 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3411");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(9);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(48);
        int int6 = hashMapLinearProbing1.findHash((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test3412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3412");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        int int12 = hashMapLinearProbing1.findHash((int) (short) 0);
        boolean boolean13 = hashMapLinearProbing1.isEmpty();
        int int15 = hashMapLinearProbing1.hashing((int) (byte) 1);
        int int17 = hashMapLinearProbing1.findHash(44);
        java.lang.Class<?> wildcardClass18 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3413");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        hashMapLinearProbing1.deleteHash((int) (byte) 1);
        boolean boolean10 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        java.lang.Class<?> wildcardClass12 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3414");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        int int5 = hashMapLinearProbing1.hashing((int) '#');
        int int7 = hashMapLinearProbing1.hashing((int) (short) 1);
        hashMapLinearProbing1.insertHash((int) (byte) 100);
        int int11 = hashMapLinearProbing1.hashing((int) (byte) 100);
        boolean boolean12 = hashMapLinearProbing1.isEmpty();
        boolean boolean13 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 48 + "'", int11 == 48);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3415");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        int int8 = hashMapLinearProbing1.findHash((int) '4');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean12 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash(17);
        int int16 = hashMapLinearProbing1.hashing(30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 30 + "'", int16 == 30);
    }

    @Test
    public void test3416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3416");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        hashMapLinearProbing1.deleteHash((int) (byte) 100);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        int int13 = hashMapLinearProbing1.hashing(10);
        hashMapLinearProbing1.insertHash((int) 'a');
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(44);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test3417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3417");
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
        int int22 = hashMapLinearProbing1.findHash(52);
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
    public void test3418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3418");
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
        hashMapLinearProbing1.deleteHash(15);
        int int21 = hashMapLinearProbing1.hashing((int) (byte) 0);
        boolean boolean22 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3419");
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
        hashMapLinearProbing1.insertHash(17);
        int int19 = hashMapLinearProbing1.hashing((int) (byte) 100);
        int int21 = hashMapLinearProbing1.hashing(32);
        hashMapLinearProbing1.deleteHash(0);
        boolean boolean24 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 44 + "'", int14 == 44);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 48 + "'", int19 == 48);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3420");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.insertHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        int int9 = hashMapLinearProbing1.findHash(30);
        boolean boolean10 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash(48);
        int int14 = hashMapLinearProbing1.hashing((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3421");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(27);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean12 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3422");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        int int5 = hashMapLinearProbing1.findHash(32);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test3423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3423");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        hashMapLinearProbing1.deleteHash((int) ' ');
        hashMapLinearProbing1.insertHash(10);
        hashMapLinearProbing1.insertHash((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test3424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3424");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(15);
        boolean boolean2 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test3425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3425");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(100);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (byte) 0);
        boolean boolean5 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3426");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        hashMapLinearProbing1.displayHashtable();
        int int8 = hashMapLinearProbing1.hashing((int) (byte) 1);
        hashMapLinearProbing1.displayHashtable();
        int int11 = hashMapLinearProbing1.hashing(16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
    }

    @Test
    public void test3427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3427");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash(100);
        int int10 = hashMapLinearProbing1.findHash((int) (short) 100);
        hashMapLinearProbing1.deleteHash(100);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 30 + "'", int10 == 30);
    }

    @Test
    public void test3428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3428");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(0);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash((int) (byte) -1);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean12 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3429");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
    }

    @Test
    public void test3430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3430");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean10 = hashMapLinearProbing1.isFull();
        boolean boolean11 = hashMapLinearProbing1.isFull();
        boolean boolean12 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) 'a');
        int int16 = hashMapLinearProbing1.hashing(5);
        boolean boolean17 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3431");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        int int4 = hashMapLinearProbing1.hashing(30);
        hashMapLinearProbing1.deleteHash((int) (byte) 100);
        hashMapLinearProbing1.insertHash((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        int int12 = hashMapLinearProbing1.findHash(2);
        hashMapLinearProbing1.insertHash(99);
        boolean boolean15 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 30 + "'", int4 == 30);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3432");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        int int4 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.deleteHash(30);
        hashMapLinearProbing1.insertHash(34);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(27);
        int int15 = hashMapLinearProbing1.hashing(26);
        boolean boolean16 = hashMapLinearProbing1.isEmpty();
        boolean boolean17 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 45 + "'", int4 == 45);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 26 + "'", int15 == 26);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3433");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean4 = hashMapLinearProbing1.isFull();
        int int6 = hashMapLinearProbing1.findHash(27);
        hashMapLinearProbing1.deleteHash(48);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test3434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3434");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        hashMapLinearProbing1.deleteHash((int) (byte) 100);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        int int13 = hashMapLinearProbing1.hashing(10);
        hashMapLinearProbing1.insertHash((int) 'a');
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (byte) 10);
        boolean boolean20 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3435");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.findHash(0);
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(10);
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test3436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3436");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        boolean boolean9 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        boolean boolean12 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3437");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        int int8 = hashMapLinearProbing1.findHash((int) '4');
        int int10 = hashMapLinearProbing1.hashing(0);
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        boolean boolean12 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean14 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3438");
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
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        int int19 = hashMapLinearProbing1.hashing(17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 17 + "'", int13 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 17 + "'", int19 == 17);
    }

    @Test
    public void test3439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3439");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 0);
        hashMapLinearProbing1.displayHashtable();
        int int8 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean10 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash(10);
        hashMapLinearProbing1.insertHash((int) (byte) -1);
        hashMapLinearProbing1.insertHash(100);
        int int18 = hashMapLinearProbing1.hashing((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 27 + "'", int8 == 27);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 10 + "'", int18 == 10);
    }

    @Test
    public void test3440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3440");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(0);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean3 = hashMapLinearProbing1.isEmpty();
        boolean boolean4 = hashMapLinearProbing1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = hashMapLinearProbing1.findHash(15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test3441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3441");
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
        int int22 = hashMapLinearProbing1.findHash(16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 30 + "'", int14 == 30);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 30 + "'", int17 == 30);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test3442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3442");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 0);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (byte) 100);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3443");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        hashMapLinearProbing1.insertHash((int) '#');
        boolean boolean4 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3444");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        int int7 = hashMapLinearProbing1.findHash((int) (byte) -1);
        hashMapLinearProbing1.deleteHash((int) (byte) 0);
        hashMapLinearProbing1.insertHash((int) (byte) 1);
        hashMapLinearProbing1.insertHash(30);
        int int15 = hashMapLinearProbing1.findHash((int) (short) 0);
        hashMapLinearProbing1.displayHashtable();
        int int18 = hashMapLinearProbing1.hashing((int) (short) 0);
        hashMapLinearProbing1.insertHash(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3445");
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
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3446");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean3 = hashMapLinearProbing1.isEmpty();
        boolean boolean4 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(0);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean9 = hashMapLinearProbing1.isFull();
        int int11 = hashMapLinearProbing1.hashing(29);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 29 + "'", int11 == 29);
    }

    @Test
    public void test3447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3447");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        int int4 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.deleteHash(30);
        hashMapLinearProbing1.insertHash(34);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) 'a');
        int int13 = hashMapLinearProbing1.findHash((int) (short) -1);
        boolean boolean14 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 45 + "'", int4 == 45);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3448");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        int int4 = hashMapLinearProbing1.hashing(30);
        hashMapLinearProbing1.deleteHash((int) (byte) 100);
        hashMapLinearProbing1.insertHash((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean13 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 30 + "'", int4 == 30);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3449");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash((-1));
        hashMapLinearProbing1.deleteHash(10);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean12 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(51);
        hashMapLinearProbing1.deleteHash((int) (short) 0);
        hashMapLinearProbing1.deleteHash(48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3450");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        int int7 = hashMapLinearProbing1.findHash((int) (byte) -1);
        hashMapLinearProbing1.deleteHash((int) (byte) 0);
        hashMapLinearProbing1.insertHash((int) (short) 100);
        int int13 = hashMapLinearProbing1.findHash(27);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(17);
        hashMapLinearProbing1.deleteHash((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test3451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3451");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        int int11 = hashMapLinearProbing1.findHash(5);
        boolean boolean12 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3452");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.findHash(0);
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.checkLoadFactor();
        int int13 = hashMapLinearProbing1.findHash((int) (short) -1);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean16 = hashMapLinearProbing1.isFull();
        boolean boolean17 = hashMapLinearProbing1.isEmpty();
        int int19 = hashMapLinearProbing1.findHash(30);
        hashMapLinearProbing1.deleteHash(7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test3453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3453");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(45);
        hashMapLinearProbing1.deleteHash(32);
        boolean boolean4 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        int int7 = hashMapLinearProbing1.hashing(45);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test3454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3454");
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
        hashMapLinearProbing1.deleteHash(52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test3455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3455");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.findHash(0);
        int int10 = hashMapLinearProbing1.hashing(1);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean12 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3456");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (short) -1);
        boolean boolean8 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        int int11 = hashMapLinearProbing1.findHash((int) 'a');
        hashMapLinearProbing1.insertHash((int) (byte) 1);
        int int15 = hashMapLinearProbing1.findHash(9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test3457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3457");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean10 = hashMapLinearProbing1.isFull();
        boolean boolean11 = hashMapLinearProbing1.isFull();
        boolean boolean12 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(51);
        boolean boolean16 = hashMapLinearProbing1.isFull();
        int int18 = hashMapLinearProbing1.hashing((int) (byte) -1);
        int int20 = hashMapLinearProbing1.findHash(26);
        boolean boolean21 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 34 + "'", int18 == 34);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3458");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(17);
        hashMapLinearProbing1.deleteHash((int) '4');
        hashMapLinearProbing1.deleteHash((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        int int17 = hashMapLinearProbing1.findHash(3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test3459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3459");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        int int5 = hashMapLinearProbing1.findHash(27);
        int int7 = hashMapLinearProbing1.findHash((int) (byte) -1);
        hashMapLinearProbing1.deleteHash(0);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean11 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3460");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (short) 10);
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        int int12 = hashMapLinearProbing1.findHash(30);
        int int14 = hashMapLinearProbing1.findHash(45);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test3461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3461");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        int int4 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.deleteHash(30);
        hashMapLinearProbing1.insertHash(14);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(44);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 45 + "'", int4 == 45);
    }

    @Test
    public void test3462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3462");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        hashMapLinearProbing1.insertHash(17);
        int int8 = hashMapLinearProbing1.findHash((int) (byte) 1);
        hashMapLinearProbing1.deleteHash(13);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean12 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(45);
        int int16 = hashMapLinearProbing1.hashing((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test3463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3463");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        hashMapLinearProbing1.insertHash((int) '#');
        boolean boolean4 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(27);
        hashMapLinearProbing1.deleteHash(5);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3464");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        int int4 = hashMapLinearProbing1.hashing(30);
        boolean boolean5 = hashMapLinearProbing1.isFull();
        int int7 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean8 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 30 + "'", int4 == 30);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3465");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        hashMapLinearProbing1.deleteHash(100);
        int int11 = hashMapLinearProbing1.findHash((int) (byte) -1);
        int int13 = hashMapLinearProbing1.findHash((int) (short) 10);
        boolean boolean14 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash(35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3466");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(45);
        int int12 = hashMapLinearProbing1.findHash(52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test3467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3467");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        int int4 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.deleteHash(30);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        java.lang.Class<?> wildcardClass10 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 45 + "'", int4 == 45);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3468");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) (byte) 100);
        boolean boolean2 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(9);
        java.lang.Class<?> wildcardClass5 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test3469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3469");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 0);
        hashMapLinearProbing1.displayHashtable();
        int int8 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) '4');
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean15 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 27 + "'", int8 == 27);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3470");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        int int4 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.deleteHash(30);
        hashMapLinearProbing1.insertHash(34);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean12 = hashMapLinearProbing1.isFull();
        boolean boolean13 = hashMapLinearProbing1.isFull();
        int int15 = hashMapLinearProbing1.findHash(51);
        int int17 = hashMapLinearProbing1.hashing(45);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 45 + "'", int4 == 45);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 45 + "'", int17 == 45);
    }

    @Test
    public void test3471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3471");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        int int9 = hashMapLinearProbing1.findHash(13);
        int int11 = hashMapLinearProbing1.findHash(5);
        java.lang.Class<?> wildcardClass12 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3472");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.insertHash((int) (byte) 100);
        int int7 = hashMapLinearProbing1.findHash((int) '4');
        int int9 = hashMapLinearProbing1.hashing((int) '#');
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
    }

    @Test
    public void test3473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3473");
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
        hashMapLinearProbing1.insertHash(100);
        boolean boolean21 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test3474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3474");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        hashMapLinearProbing1.insertHash(17);
        int int8 = hashMapLinearProbing1.findHash((int) (byte) 1);
        hashMapLinearProbing1.deleteHash(0);
        boolean boolean11 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean13 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3475");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(45);
        hashMapLinearProbing1.checkLoadFactor();
        int int4 = hashMapLinearProbing1.findHash((int) '4');
        hashMapLinearProbing1.deleteHash(7);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test3476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3476");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 0);
        hashMapLinearProbing1.displayHashtable();
        int int8 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash(45);
        boolean boolean12 = hashMapLinearProbing1.isFull();
        int int14 = hashMapLinearProbing1.findHash(0);
        hashMapLinearProbing1.deleteHash((int) 'a');
        int int18 = hashMapLinearProbing1.hashing(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 27 + "'", int8 == 27);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test3477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3477");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 0);
        hashMapLinearProbing1.displayHashtable();
        int int8 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean10 = hashMapLinearProbing1.isFull();
        boolean boolean11 = hashMapLinearProbing1.isFull();
        boolean boolean12 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 27 + "'", int8 == 27);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3478");
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
        hashMapLinearProbing1.insertHash(17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 30 + "'", int16 == 30);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3479");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 0);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(17);
        boolean boolean9 = hashMapLinearProbing1.isFull();
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash((int) (short) -1);
        boolean boolean13 = hashMapLinearProbing1.isEmpty();
        boolean boolean14 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3480");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        int int7 = hashMapLinearProbing1.hashing(1);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3481");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) 'a');
        hashMapLinearProbing1.deleteHash(30);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean5 = hashMapLinearProbing1.isEmpty();
        int int7 = hashMapLinearProbing1.findHash(0);
        int int9 = hashMapLinearProbing1.hashing(45);
        int int11 = hashMapLinearProbing1.findHash((int) (short) 100);
        boolean boolean12 = hashMapLinearProbing1.isFull();
        boolean boolean13 = hashMapLinearProbing1.isFull();
        boolean boolean14 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 45 + "'", int9 == 45);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3482");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean4 = hashMapLinearProbing1.isFull();
        int int6 = hashMapLinearProbing1.findHash(1);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3483");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash((int) (byte) 10);
        hashMapLinearProbing1.insertHash(32);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean8 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3484");
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
        hashMapLinearProbing1.deleteHash(14);
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 27 + "'", int16 == 27);
    }

    @Test
    public void test3485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3485");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(35);
        int int7 = hashMapLinearProbing1.findHash((int) '4');
        hashMapLinearProbing1.insertHash((int) (short) 10);
        int int11 = hashMapLinearProbing1.hashing((int) (byte) -1);
        hashMapLinearProbing1.deleteHash(30);
        hashMapLinearProbing1.insertHash(26);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 34 + "'", int11 == 34);
    }

    @Test
    public void test3486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3486");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(45);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        int int5 = hashMapLinearProbing1.findHash(32);
        int int7 = hashMapLinearProbing1.hashing(0);
        boolean boolean8 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3487");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        int int5 = hashMapLinearProbing1.findHash(27);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3488");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.hashing((int) (short) 100);
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        boolean boolean10 = hashMapLinearProbing1.isFull();
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash((int) (short) -1);
        boolean boolean14 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 30 + "'", int8 == 30);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3489");
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
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash(30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3490");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(30);
        int int6 = hashMapLinearProbing1.hashing(100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 15 + "'", int6 == 15);
    }

    @Test
    public void test3491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3491");
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
        int int18 = hashMapLinearProbing1.hashing(51);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16 + "'", int18 == 16);
    }

    @Test
    public void test3492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3492");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        hashMapLinearProbing1.displayHashtable();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(27);
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        int int15 = hashMapLinearProbing1.findHash(48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test3493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3493");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 0);
        int int7 = hashMapLinearProbing1.hashing((int) '#');
        hashMapLinearProbing1.displayHashtable();
        boolean boolean9 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3494");
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
        hashMapLinearProbing1.deleteHash(99);
        java.lang.Class<?> wildcardClass21 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 30 + "'", int14 == 30);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3495");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        int int4 = hashMapLinearProbing1.hashing(30);
        hashMapLinearProbing1.deleteHash((int) (byte) 100);
        hashMapLinearProbing1.insertHash((int) 'a');
        hashMapLinearProbing1.deleteHash(27);
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 30 + "'", int4 == 30);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3496");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        hashMapLinearProbing1.insertHash(17);
        int int8 = hashMapLinearProbing1.findHash((int) (byte) 1);
        int int10 = hashMapLinearProbing1.hashing(27);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 27 + "'", int10 == 27);
    }

    @Test
    public void test3497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3497");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(30);
        int int6 = hashMapLinearProbing1.findHash((int) (byte) 0);
        hashMapLinearProbing1.insertHash(17);
        hashMapLinearProbing1.insertHash(48);
        int int12 = hashMapLinearProbing1.hashing(30);
        hashMapLinearProbing1.deleteHash(16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 13 + "'", int12 == 13);
    }

    @Test
    public void test3498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3498");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(0);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        boolean boolean3 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean8 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = hashMapLinearProbing1.hashing(52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3499");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(45);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        int int5 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.insertHash((int) (short) -1);
        hashMapLinearProbing1.checkLoadFactor();
        int int10 = hashMapLinearProbing1.findHash(30);
        hashMapLinearProbing1.insertHash(1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test3500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest6.test3500");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        int int4 = hashMapLinearProbing1.hashing(30);
        hashMapLinearProbing1.deleteHash((int) (byte) 100);
        int int8 = hashMapLinearProbing1.findHash((int) '4');
        hashMapLinearProbing1.checkLoadFactor();
        int int11 = hashMapLinearProbing1.hashing(14);
        boolean boolean12 = hashMapLinearProbing1.isFull();
        int int14 = hashMapLinearProbing1.hashing((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 30 + "'", int4 == 30);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 14 + "'", int11 == 14);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }
}

