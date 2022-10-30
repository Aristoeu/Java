package hashmap;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest14 {

    public static boolean debug = false;

    @Test
    public void test7001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7001");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean3 = hashMapCuckooHashing1.isEmpty();
        boolean boolean4 = hashMapCuckooHashing1.isFull();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = hashMapCuckooHashing1.hashFunction2((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test7002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7002");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) (byte) 1);
        boolean boolean2 = hashMapCuckooHashing1.isEmpty();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.insertKey2HashTable((int) (byte) 10);
        int int7 = hashMapCuckooHashing1.hashFunction1(20);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test7003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7003");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean7 = hashMapCuckooHashing1.isFull();
        int int9 = hashMapCuckooHashing1.hashFunction2(3);
        boolean boolean10 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test7004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7004");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        int int7 = hashMapCuckooHashing1.hashFunction2((-1));
        int int9 = hashMapCuckooHashing1.hashFunction2((int) (short) 1);
        int int11 = hashMapCuckooHashing1.hashFunction1((int) (byte) 0);
        boolean boolean12 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.insertKey2HashTable(5);
        boolean boolean16 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        int int18 = hashMapCuckooHashing1.hashFunction1(30);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test7005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7005");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean7 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 1);
        boolean boolean8 = hashMapCuckooHashing1.isFull();
        int int9 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        double double10 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean11 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 1);
        int int14 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int15 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int17 = hashMapCuckooHashing1.hashFunction1(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test7006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7006");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int8 = hashMapCuckooHashing1.hashFunction1((int) (short) 10);
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 1);
        int int12 = hashMapCuckooHashing1.hashFunction1(3);
        double double13 = hashMapCuckooHashing1.checkLoadFactor();
        int int15 = hashMapCuckooHashing1.hashFunction1(48);
        boolean boolean16 = hashMapCuckooHashing1.isEmpty();
        boolean boolean17 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.05d + "'", double13 == 0.05d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test7007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7007");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 0);
        double double7 = hashMapCuckooHashing1.checkLoadFactor();
        double double8 = hashMapCuckooHashing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.1d + "'", double7 == 0.1d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.1d + "'", double8 == 0.1d);
    }

    @Test
    public void test7008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7008");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        int int7 = hashMapCuckooHashing1.hashFunction2((-1));
        int int9 = hashMapCuckooHashing1.hashFunction2((int) (short) 1);
        int int11 = hashMapCuckooHashing1.hashFunction1((int) (byte) 0);
        boolean boolean12 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.insertKey2HashTable(5);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable(39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Key 39 already inside, no duplicates allowed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test7009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7009");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        double double4 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test7010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7010");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean4 = hashMapCuckooHashing1.isFull();
        int int6 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int8 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int11 = hashMapCuckooHashing1.hashFunction2(100);
        int int13 = hashMapCuckooHashing1.hashFunction1(9);
        boolean boolean14 = hashMapCuckooHashing1.isEmpty();
        int int15 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.displayHashtable();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = hashMapCuckooHashing1.findKeyInTable(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test7011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7011");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(1);
        boolean boolean2 = hashMapCuckooHashing1.isEmpty();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.insertKey2HashTable((int) (byte) -1);
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 10);
        int int9 = hashMapCuckooHashing1.findKeyInTable((int) (short) 10);
        boolean boolean10 = hashMapCuckooHashing1.isEmpty();
        int int11 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean13 = hashMapCuckooHashing1.checkTableContainsKey(12);
        int int15 = hashMapCuckooHashing1.findKeyInTable((int) (byte) -1);
        boolean boolean16 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test7012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7012");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean4 = hashMapCuckooHashing1.checkTableContainsKey(10);
        hashMapCuckooHashing1.insertKey2HashTable(12);
        boolean boolean8 = hashMapCuckooHashing1.checkTableContainsKey(0);
        java.lang.Class<?> wildcardClass9 = hashMapCuckooHashing1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test7013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7013");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean8 = hashMapCuckooHashing1.checkTableContainsKey((-1));
        boolean boolean9 = hashMapCuckooHashing1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test7014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7014");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        int int4 = hashMapCuckooHashing1.hashFunction2((int) (short) 10);
        hashMapCuckooHashing1.insertKey2HashTable((int) ' ');
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey(0);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.insertKey2HashTable((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = hashMapCuckooHashing1.findKeyInTable((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Key 100 not found in table");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test7015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7015");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) '4');
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.insertKey2HashTable((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction1((int) (short) 10);
        double double7 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.019230769230769232d + "'", double7 == 0.019230769230769232d);
    }

    @Test
    public void test7016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7016");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean4 = hashMapCuckooHashing1.checkTableContainsKey(10);
        hashMapCuckooHashing1.insertKey2HashTable(5);
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        boolean boolean8 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test7017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7017");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        int int5 = hashMapCuckooHashing1.hashFunction2(100);
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean7 = hashMapCuckooHashing1.isFull();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey(48);
        boolean boolean10 = hashMapCuckooHashing1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable(16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test7018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7018");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double4 = hashMapCuckooHashing1.checkLoadFactor();
        int int5 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean6 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test7019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7019");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(1);
        int int3 = hashMapCuckooHashing1.hashFunction1((int) 'a');
        boolean boolean4 = hashMapCuckooHashing1.isFull();
        int int5 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int7 = hashMapCuckooHashing1.hashFunction2(2);
        int int9 = hashMapCuckooHashing1.hashFunction1((int) (byte) 100);
        boolean boolean10 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test7020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7020");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean3 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 0);
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) '#');
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean8 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 0);
        hashMapCuckooHashing1.insertKey2HashTable(79);
        int int12 = hashMapCuckooHashing1.hashFunction1((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
    }

    @Test
    public void test7021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7021");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) (short) 1);
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 10);
        int int5 = hashMapCuckooHashing1.hashFunction2(100);
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        double double7 = hashMapCuckooHashing1.checkLoadFactor();
        int int9 = hashMapCuckooHashing1.hashFunction2((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5d + "'", double7 == 0.5d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test7022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7022");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean7 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 1);
        int int9 = hashMapCuckooHashing1.hashFunction1(12);
        hashMapCuckooHashing1.insertKey2HashTable(4);
        int int12 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean14 = hashMapCuckooHashing1.isEmpty();
        boolean boolean16 = hashMapCuckooHashing1.checkTableContainsKey(30);
        boolean boolean18 = hashMapCuckooHashing1.checkTableContainsKey(29);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 12 + "'", int9 == 12);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test7023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7023");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        int int4 = hashMapCuckooHashing1.hashFunction2((int) (short) 10);
        int int6 = hashMapCuckooHashing1.hashFunction2((int) (short) 10);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.insertKey2HashTable((int) '#');
        int int11 = hashMapCuckooHashing1.hashFunction2((int) '#');
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 0);
        double double14 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int17 = hashMapCuckooHashing1.hashFunction2((int) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.1d + "'", double14 == 0.1d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test7024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7024");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) '#');
        int int3 = hashMapCuckooHashing1.hashFunction2(0);
        hashMapCuckooHashing1.insertKey2HashTable(3);
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test7025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7025");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) (byte) 1);
        boolean boolean3 = hashMapCuckooHashing1.checkTableContainsKey((-1));
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey(0);
        boolean boolean7 = hashMapCuckooHashing1.checkTableContainsKey(79);
        int int9 = hashMapCuckooHashing1.hashFunction1(1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test7026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7026");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        int int9 = hashMapCuckooHashing1.hashFunction2((int) (byte) 100);
        boolean boolean10 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean12 = hashMapCuckooHashing1.isFull();
        int int14 = hashMapCuckooHashing1.hashFunction1(39);
        int int16 = hashMapCuckooHashing1.hashFunction1((int) (byte) 10);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test7027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7027");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) (short) 1);
        boolean boolean3 = hashMapCuckooHashing1.checkTableContainsKey(7);
        double double4 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean7 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) -1);
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test7028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7028");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        int int5 = hashMapCuckooHashing1.hashFunction1((int) '4');
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int8 = hashMapCuckooHashing1.hashFunction2((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test7029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7029");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        int int4 = hashMapCuckooHashing1.hashFunction2((int) (short) 10);
        int int6 = hashMapCuckooHashing1.hashFunction1(10);
        double double7 = hashMapCuckooHashing1.checkLoadFactor();
        int int9 = hashMapCuckooHashing1.hashFunction2((int) (byte) -1);
        int int11 = hashMapCuckooHashing1.hashFunction1((int) 'a');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
    }

    @Test
    public void test7030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7030");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean4 = hashMapCuckooHashing1.isFull();
        int int6 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int8 = hashMapCuckooHashing1.hashFunction1((int) (short) 1);
        hashMapCuckooHashing1.insertKey2HashTable((int) '#');
        boolean boolean11 = hashMapCuckooHashing1.isEmpty();
        double double12 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean13 = hashMapCuckooHashing1.isFull();
        double double14 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        double double16 = hashMapCuckooHashing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.1d + "'", double12 == 0.1d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.1d + "'", double14 == 0.1d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.1d + "'", double16 == 0.1d);
    }

    @Test
    public void test7031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7031");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        boolean boolean7 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 0);
        int int9 = hashMapCuckooHashing1.hashFunction1(100);
        boolean boolean10 = hashMapCuckooHashing1.isEmpty();
        int int12 = hashMapCuckooHashing1.hashFunction1((int) (short) -1);
        hashMapCuckooHashing1.insertKey2HashTable(0);
        boolean boolean15 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test7032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7032");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        int int6 = hashMapCuckooHashing1.hashFunction2((int) (short) 1);
        boolean boolean8 = hashMapCuckooHashing1.checkTableContainsKey(2);
        boolean boolean9 = hashMapCuckooHashing1.isEmpty();
        int int10 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int11 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int13 = hashMapCuckooHashing1.hashFunction1(2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test7033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7033");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isEmpty();
        boolean boolean4 = hashMapCuckooHashing1.isEmpty();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean9 = hashMapCuckooHashing1.isEmpty();
        boolean boolean10 = hashMapCuckooHashing1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.insertKey2HashTable(19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test7034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7034");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean3 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 0);
        int int5 = hashMapCuckooHashing1.hashFunction1(0);
        int int7 = hashMapCuckooHashing1.hashFunction1((int) '#');
        double double8 = hashMapCuckooHashing1.checkLoadFactor();
        double double9 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean11 = hashMapCuckooHashing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test7035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7035");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.insertKey2HashTable((int) ' ');
        int int9 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        java.lang.Class<?> wildcardClass11 = hashMapCuckooHashing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test7036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7036");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction2((int) '#');
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey(0);
        boolean boolean11 = hashMapCuckooHashing1.checkTableContainsKey(3);
        int int13 = hashMapCuckooHashing1.hashFunction2((int) (byte) 100);
        int int14 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test7037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7037");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) (byte) 1);
        int int3 = hashMapCuckooHashing1.hashFunction2(5);
        hashMapCuckooHashing1.displayHashtable();
        double double5 = hashMapCuckooHashing1.checkLoadFactor();
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        int int8 = hashMapCuckooHashing1.hashFunction1(35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test7038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7038");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean7 = hashMapCuckooHashing1.isFull();
        int int9 = hashMapCuckooHashing1.hashFunction1(1);
        int int10 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        java.lang.Class<?> wildcardClass12 = hashMapCuckooHashing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test7039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7039");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        int int6 = hashMapCuckooHashing1.hashFunction2((int) (short) 1);
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        int int9 = hashMapCuckooHashing1.hashFunction1(16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 6 + "'", int9 == 6);
    }

    @Test
    public void test7040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7040");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean7 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 1);
        boolean boolean8 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        int int11 = hashMapCuckooHashing1.hashFunction2((int) (short) 100);
        boolean boolean13 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 10);
        boolean boolean14 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test7041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7041");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction2((int) '#');
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey((int) ' ');
        boolean boolean10 = hashMapCuckooHashing1.isEmpty();
        boolean boolean11 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        int int13 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean16 = hashMapCuckooHashing1.isEmpty();
        boolean boolean18 = hashMapCuckooHashing1.checkTableContainsKey(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test7042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7042");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean4 = hashMapCuckooHashing1.checkTableContainsKey(10);
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test7043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7043");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean6 = hashMapCuckooHashing1.checkTableContainsKey(100);
        int int8 = hashMapCuckooHashing1.hashFunction1((int) '4');
        boolean boolean10 = hashMapCuckooHashing1.checkTableContainsKey(5);
        boolean boolean12 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 0);
        boolean boolean13 = hashMapCuckooHashing1.isEmpty();
        double double14 = hashMapCuckooHashing1.checkLoadFactor();
        int int16 = hashMapCuckooHashing1.hashFunction2((int) (byte) 0);
        int int18 = hashMapCuckooHashing1.hashFunction2(69);
        int int19 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 12 + "'", int8 == 12);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test7044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7044");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean6 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 1);
        boolean boolean8 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 1);
        hashMapCuckooHashing1.displayHashtable();
        int int10 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int11 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        java.lang.Class<?> wildcardClass12 = hashMapCuckooHashing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test7045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7045");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        double double3 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean4 = hashMapCuckooHashing1.isFull();
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        double double7 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        int int9 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test7046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7046");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction2((int) '#');
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey(0);
        boolean boolean11 = hashMapCuckooHashing1.checkTableContainsKey(3);
        int int12 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean13 = hashMapCuckooHashing1.isFull();
        boolean boolean15 = hashMapCuckooHashing1.checkTableContainsKey(100);
        boolean boolean17 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) -1);
        int int19 = hashMapCuckooHashing1.hashFunction2((int) 'a');
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 9 + "'", int19 == 9);
    }

    @Test
    public void test7047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7047");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction2((int) '#');
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey(0);
        double double10 = hashMapCuckooHashing1.checkLoadFactor();
        int int11 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int12 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean13 = hashMapCuckooHashing1.isFull();
        boolean boolean15 = hashMapCuckooHashing1.checkTableContainsKey(9);
        int int17 = hashMapCuckooHashing1.hashFunction2(0);
        double double18 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable(35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test7048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7048");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean4 = hashMapCuckooHashing1.isFull();
        int int6 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        double double8 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean9 = hashMapCuckooHashing1.isFull();
        int int10 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int11 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test7049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7049");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int9 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.insertKey2HashTable(48);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test7050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7050");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean4 = hashMapCuckooHashing1.checkTableContainsKey(10);
        int int6 = hashMapCuckooHashing1.hashFunction1((int) (short) 0);
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 0);
        int int10 = hashMapCuckooHashing1.findKeyInTable((int) (byte) 0);
        java.lang.Class<?> wildcardClass11 = hashMapCuckooHashing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test7051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7051");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.displayHashtable();
        int int8 = hashMapCuckooHashing1.hashFunction2(100);
        boolean boolean9 = hashMapCuckooHashing1.isFull();
        int int10 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test7052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7052");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction1(1);
        int int8 = hashMapCuckooHashing1.hashFunction2((int) '#');
        boolean boolean9 = hashMapCuckooHashing1.isFull();
        boolean boolean10 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.insertKey2HashTable(2);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = hashMapCuckooHashing1.findKeyInTable((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Key 0 not found in table");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test7053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7053");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) ' ');
        hashMapCuckooHashing1.insertKey2HashTable(0);
        boolean boolean4 = hashMapCuckooHashing1.isEmpty();
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        boolean boolean6 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.insertKey2HashTable((-1));
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int11 = hashMapCuckooHashing1.hashFunction2(30);
        boolean boolean12 = hashMapCuckooHashing1.isFull();
        boolean boolean13 = hashMapCuckooHashing1.isEmpty();
        int int15 = hashMapCuckooHashing1.hashFunction2(12);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test7054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7054");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) (byte) 1);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        int int3 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean6 = hashMapCuckooHashing1.checkTableContainsKey(10);
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 100);
        int int10 = hashMapCuckooHashing1.hashFunction2(10);
        double double11 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean12 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5d + "'", double11 == 0.5d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test7055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7055");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        hashMapCuckooHashing1.displayHashtable();
        int int8 = hashMapCuckooHashing1.hashFunction2((int) (short) 1);
        hashMapCuckooHashing1.displayHashtable();
        double double10 = hashMapCuckooHashing1.checkLoadFactor();
        int int12 = hashMapCuckooHashing1.hashFunction2((int) (short) 10);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean16 = hashMapCuckooHashing1.checkTableContainsKey(7);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = hashMapCuckooHashing1.findKeyInTable((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test7056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7056");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 0);
        int int8 = hashMapCuckooHashing1.hashFunction2((int) (byte) 1);
        boolean boolean9 = hashMapCuckooHashing1.isFull();
        boolean boolean11 = hashMapCuckooHashing1.checkTableContainsKey(0);
        int int13 = hashMapCuckooHashing1.hashFunction2((int) (byte) 10);
        boolean boolean15 = hashMapCuckooHashing1.checkTableContainsKey(8);
        double double16 = hashMapCuckooHashing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.1d + "'", double16 == 0.1d);
    }

    @Test
    public void test7057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7057");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.insertKey2HashTable((int) (byte) 10);
        boolean boolean10 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean12 = hashMapCuckooHashing1.isEmpty();
        boolean boolean13 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test7058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7058");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int3 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double5 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        int int9 = hashMapCuckooHashing1.hashFunction2((int) '4');
        double double10 = hashMapCuckooHashing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test7059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7059");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 0);
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        int int9 = hashMapCuckooHashing1.hashFunction1((int) (byte) 1);
        boolean boolean10 = hashMapCuckooHashing1.isFull();
        boolean boolean12 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 1);
        boolean boolean13 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.deleteKeyFromHashTable(0);
        double double16 = hashMapCuckooHashing1.checkLoadFactor();
        int int18 = hashMapCuckooHashing1.hashFunction1((int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
    }

    @Test
    public void test7060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7060");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.displayHashtable();
        int int10 = hashMapCuckooHashing1.hashFunction1(30);
        boolean boolean12 = hashMapCuckooHashing1.checkTableContainsKey((int) ' ');
        int int13 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int15 = hashMapCuckooHashing1.hashFunction2(10);
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable(35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test7061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7061");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) ' ');
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.insertKey2HashTable(9);
        int int9 = hashMapCuckooHashing1.hashFunction1((int) (byte) 1);
        boolean boolean10 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test7062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7062");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) '#');
        hashMapCuckooHashing1.insertKey2HashTable((int) '#');
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) '#');
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.02857142857142857d + "'", double6 == 0.02857142857142857d);
    }

    @Test
    public void test7063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7063");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 0);
        int int8 = hashMapCuckooHashing1.hashFunction2((int) (byte) 1);
        hashMapCuckooHashing1.deleteKeyFromHashTable(0);
        double double11 = hashMapCuckooHashing1.checkLoadFactor();
        int int13 = hashMapCuckooHashing1.hashFunction1((int) (short) -1);
        int int15 = hashMapCuckooHashing1.hashFunction1(100);
        double double16 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean17 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int20 = hashMapCuckooHashing1.hashFunction2(79);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test7064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7064");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.displayHashtable();
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean8 = hashMapCuckooHashing1.isEmpty();
        boolean boolean10 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test7065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7065");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction2((int) '#');
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey(0);
        double double10 = hashMapCuckooHashing1.checkLoadFactor();
        int int11 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int13 = hashMapCuckooHashing1.hashFunction1((int) (short) 100);
        boolean boolean14 = hashMapCuckooHashing1.isFull();
        int int16 = hashMapCuckooHashing1.hashFunction1((-1));
        hashMapCuckooHashing1.insertKey2HashTable(99);
        int int20 = hashMapCuckooHashing1.findKeyInTable(99);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
    }

    @Test
    public void test7066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7066");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean6 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 1);
        boolean boolean8 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 1);
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.insertKey2HashTable(69);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test7067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7067");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(1);
        boolean boolean2 = hashMapCuckooHashing1.isEmpty();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.insertKey2HashTable((int) (byte) -1);
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 10);
        int int9 = hashMapCuckooHashing1.findKeyInTable((int) (short) 10);
        boolean boolean10 = hashMapCuckooHashing1.isEmpty();
        boolean boolean11 = hashMapCuckooHashing1.isEmpty();
        boolean boolean13 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test7068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7068");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean3 = hashMapCuckooHashing1.isEmpty();
        boolean boolean4 = hashMapCuckooHashing1.isFull();
        double double5 = hashMapCuckooHashing1.checkLoadFactor();
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        double double7 = hashMapCuckooHashing1.checkLoadFactor();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = hashMapCuckooHashing1.hashFunction1(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test7069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7069");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean3 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 0);
        double double4 = hashMapCuckooHashing1.checkLoadFactor();
        double double5 = hashMapCuckooHashing1.checkLoadFactor();
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.insertKey2HashTable(1);
        int int9 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int11 = hashMapCuckooHashing1.hashFunction2((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test7070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7070");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        int int5 = hashMapCuckooHashing1.hashFunction2(100);
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean7 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        int int9 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test7071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7071");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction2((int) '#');
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey((int) ' ');
        boolean boolean10 = hashMapCuckooHashing1.isEmpty();
        int int11 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int13 = hashMapCuckooHashing1.hashFunction2((-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test7072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7072");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(1);
        boolean boolean2 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 0);
        double double5 = hashMapCuckooHashing1.checkLoadFactor();
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        double double7 = hashMapCuckooHashing1.checkLoadFactor();
        int int9 = hashMapCuckooHashing1.hashFunction1(15);
        java.lang.Class<?> wildcardClass10 = hashMapCuckooHashing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5d + "'", double7 == 0.5d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test7073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7073");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction2((int) '#');
        int int8 = hashMapCuckooHashing1.hashFunction2((int) (byte) 100);
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) -1);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int13 = hashMapCuckooHashing1.hashFunction2((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = hashMapCuckooHashing1.findKeyInTable((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Key 10 not found in table");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test7074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7074");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int8 = hashMapCuckooHashing1.hashFunction1((int) (short) 10);
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 1);
        int int12 = hashMapCuckooHashing1.hashFunction1(3);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean15 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 100);
        hashMapCuckooHashing1.insertKey2HashTable((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.insertKey2HashTable(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Key already inside, no duplicates allowed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test7075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7075");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int9 = hashMapCuckooHashing1.hashFunction1(0);
        int int11 = hashMapCuckooHashing1.hashFunction2((int) ' ');
        hashMapCuckooHashing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test7076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7076");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) -1);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean11 = hashMapCuckooHashing1.checkTableContainsKey((int) '#');
        int int13 = hashMapCuckooHashing1.hashFunction2(100);
        hashMapCuckooHashing1.insertKey2HashTable(0);
        int int16 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test7077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7077");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction2((int) '#');
        int int8 = hashMapCuckooHashing1.hashFunction2((int) (byte) 100);
        hashMapCuckooHashing1.insertKey2HashTable((int) '#');
        int int12 = hashMapCuckooHashing1.hashFunction2((int) (short) -1);
        hashMapCuckooHashing1.displayHashtable();
        double double14 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.insertKey2HashTable(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.1d + "'", double14 == 0.1d);
    }

    @Test
    public void test7078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7078");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) '#');
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        int int4 = hashMapCuckooHashing1.hashFunction1(7);
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        int int8 = hashMapCuckooHashing1.hashFunction1(5);
        hashMapCuckooHashing1.insertKey2HashTable(99);
        int int12 = hashMapCuckooHashing1.hashFunction2(29);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test7079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7079");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        int int4 = hashMapCuckooHashing1.hashFunction2((int) (short) 10);
        int int5 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test7080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7080");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean6 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 1);
        boolean boolean8 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 1);
        int int9 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean11 = hashMapCuckooHashing1.checkTableContainsKey(19);
        int int13 = hashMapCuckooHashing1.hashFunction2(0);
        int int15 = hashMapCuckooHashing1.hashFunction2(48);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test7081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7081");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        boolean boolean7 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 0);
        int int9 = hashMapCuckooHashing1.hashFunction1(100);
        boolean boolean10 = hashMapCuckooHashing1.isEmpty();
        int int12 = hashMapCuckooHashing1.hashFunction1((int) (short) -1);
        hashMapCuckooHashing1.insertKey2HashTable((int) (byte) 1);
        boolean boolean16 = hashMapCuckooHashing1.checkTableContainsKey(100);
        boolean boolean17 = hashMapCuckooHashing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test7082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7082");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        boolean boolean7 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 10);
        boolean boolean8 = hashMapCuckooHashing1.isFull();
        int int10 = hashMapCuckooHashing1.hashFunction1(0);
        int int12 = hashMapCuckooHashing1.hashFunction1(10);
        java.lang.Class<?> wildcardClass13 = hashMapCuckooHashing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test7083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7083");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double5 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test7084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7084");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) (byte) 1);
        int int3 = hashMapCuckooHashing1.hashFunction2(5);
        hashMapCuckooHashing1.displayHashtable();
        double double5 = hashMapCuckooHashing1.checkLoadFactor();
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = hashMapCuckooHashing1.findKeyInTable(34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test7085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7085");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        int int5 = hashMapCuckooHashing1.hashFunction2(100);
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean7 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        int int10 = hashMapCuckooHashing1.hashFunction2(9);
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean13 = hashMapCuckooHashing1.checkTableContainsKey(10);
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.insertKey2HashTable(69);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test7086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7086");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int9 = hashMapCuckooHashing1.hashFunction2(15);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test7087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7087");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction2((int) '#');
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey((int) ' ');
        boolean boolean10 = hashMapCuckooHashing1.isEmpty();
        boolean boolean11 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 1);
        boolean boolean14 = hashMapCuckooHashing1.isFull();
        int int16 = hashMapCuckooHashing1.hashFunction2(12);
        int int17 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Key 10 already inside, no duplicates allowed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test7088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7088");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean8 = hashMapCuckooHashing1.checkTableContainsKey((int) ' ');
        hashMapCuckooHashing1.insertKey2HashTable(3);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable(99);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Key 99 already inside, no duplicates allowed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test7089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7089");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int8 = hashMapCuckooHashing1.hashFunction1((int) (short) 10);
        boolean boolean9 = hashMapCuckooHashing1.isEmpty();
        int int10 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean14 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) -1);
        int int16 = hashMapCuckooHashing1.hashFunction2((int) (byte) 10);
        java.lang.Class<?> wildcardClass17 = hashMapCuckooHashing1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test7090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7090");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean4 = hashMapCuckooHashing1.isFull();
        int int6 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean8 = hashMapCuckooHashing1.isEmpty();
        int int9 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.insertKey2HashTable((int) (byte) 1);
        boolean boolean13 = hashMapCuckooHashing1.checkTableContainsKey(2);
        int int15 = hashMapCuckooHashing1.hashFunction1((int) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test7091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7091");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double3 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean4 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        double double8 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean9 = hashMapCuckooHashing1.isEmpty();
        boolean boolean10 = hashMapCuckooHashing1.isFull();
        boolean boolean11 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean13 = hashMapCuckooHashing1.isFull();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test7092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7092");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction2((int) '#');
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean8 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 100);
        int int10 = hashMapCuckooHashing1.hashFunction1(3);
        int int11 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int13 = hashMapCuckooHashing1.hashFunction2(9);
        int int15 = hashMapCuckooHashing1.hashFunction1(7);
        boolean boolean17 = hashMapCuckooHashing1.checkTableContainsKey(79);
        boolean boolean18 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean21 = hashMapCuckooHashing1.checkTableContainsKey(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test7093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7093");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double4 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = hashMapCuckooHashing1.hashFunction1((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
    }

    @Test
    public void test7094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7094");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean3 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 0);
        double double4 = hashMapCuckooHashing1.checkLoadFactor();
        int int6 = hashMapCuckooHashing1.hashFunction1((int) (short) 1);
        boolean boolean7 = hashMapCuckooHashing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test7095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7095");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean6 = hashMapCuckooHashing1.checkTableContainsKey(100);
        int int8 = hashMapCuckooHashing1.hashFunction1((int) '4');
        boolean boolean10 = hashMapCuckooHashing1.checkTableContainsKey(5);
        boolean boolean12 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 0);
        boolean boolean13 = hashMapCuckooHashing1.isEmpty();
        double double14 = hashMapCuckooHashing1.checkLoadFactor();
        int int16 = hashMapCuckooHashing1.hashFunction2((int) (byte) 0);
        double double17 = hashMapCuckooHashing1.checkLoadFactor();
        // The following exception was thrown during execution in test generation
        try {
            int int19 = hashMapCuckooHashing1.findKeyInTable(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 12 + "'", int8 == 12);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test7096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7096");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 0);
        int int8 = hashMapCuckooHashing1.hashFunction2((int) (byte) 1);
        hashMapCuckooHashing1.deleteKeyFromHashTable(0);
        double double11 = hashMapCuckooHashing1.checkLoadFactor();
        int int13 = hashMapCuckooHashing1.hashFunction1((int) (short) -1);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int16 = hashMapCuckooHashing1.hashFunction2((-1));
        java.lang.Class<?> wildcardClass17 = hashMapCuckooHashing1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test7097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7097");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) ' ');
        hashMapCuckooHashing1.insertKey2HashTable(0);
        boolean boolean4 = hashMapCuckooHashing1.isEmpty();
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        boolean boolean6 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.insertKey2HashTable((-1));
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int11 = hashMapCuckooHashing1.hashFunction2(30);
        boolean boolean12 = hashMapCuckooHashing1.isEmpty();
        double double13 = hashMapCuckooHashing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.03125d + "'", double13 == 0.03125d);
    }

    @Test
    public void test7098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7098");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean3 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 0);
        double double4 = hashMapCuckooHashing1.checkLoadFactor();
        int int5 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean7 = hashMapCuckooHashing1.isFull();
        boolean boolean8 = hashMapCuckooHashing1.isFull();
        boolean boolean10 = hashMapCuckooHashing1.checkTableContainsKey(10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test7099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7099");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        int int4 = hashMapCuckooHashing1.hashFunction2((int) (short) 10);
        int int6 = hashMapCuckooHashing1.hashFunction1(10);
        hashMapCuckooHashing1.insertKey2HashTable(5);
        boolean boolean9 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int15 = hashMapCuckooHashing1.hashFunction2((int) 'a');
        hashMapCuckooHashing1.insertKey2HashTable(69);
        boolean boolean19 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test7100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7100");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction2((int) '#');
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey(0);
        double double10 = hashMapCuckooHashing1.checkLoadFactor();
        int int11 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int12 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean13 = hashMapCuckooHashing1.isFull();
        int int14 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int15 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        double double16 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean17 = hashMapCuckooHashing1.isFull();
        int int19 = hashMapCuckooHashing1.hashFunction2(39);
        java.lang.Class<?> wildcardClass20 = hashMapCuckooHashing1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test7101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7101");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        int int9 = hashMapCuckooHashing1.hashFunction2((int) (byte) 100);
        boolean boolean10 = hashMapCuckooHashing1.isFull();
        double double11 = hashMapCuckooHashing1.checkLoadFactor();
        int int13 = hashMapCuckooHashing1.hashFunction1(12);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = hashMapCuckooHashing1.findKeyInTable(99);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test7102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7102");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) (short) 1);
        boolean boolean3 = hashMapCuckooHashing1.checkTableContainsKey(7);
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey(0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test7103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7103");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction1(1);
        boolean boolean7 = hashMapCuckooHashing1.isFull();
        int int9 = hashMapCuckooHashing1.hashFunction1(10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test7104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7104");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test7105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7105");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int3 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int5 = hashMapCuckooHashing1.hashFunction1((-1));
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test7106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7106");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        boolean boolean7 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 10);
        hashMapCuckooHashing1.insertKey2HashTable(100);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean11 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int14 = hashMapCuckooHashing1.hashFunction2(8);
        int int15 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test7107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7107");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int3 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 1);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int8 = hashMapCuckooHashing1.hashFunction1(3);
        int int10 = hashMapCuckooHashing1.hashFunction2((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
    }

    @Test
    public void test7108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7108");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean4 = hashMapCuckooHashing1.checkTableContainsKey((int) '4');
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        boolean boolean6 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test7109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7109");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.displayHashtable();
        int int8 = hashMapCuckooHashing1.hashFunction1(5);
        double double9 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean10 = hashMapCuckooHashing1.isEmpty();
        int int12 = hashMapCuckooHashing1.hashFunction2(0);
        int int14 = hashMapCuckooHashing1.hashFunction2(20);
        boolean boolean16 = hashMapCuckooHashing1.checkTableContainsKey(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test7110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7110");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        int int7 = hashMapCuckooHashing1.hashFunction2((-1));
        int int9 = hashMapCuckooHashing1.hashFunction2((int) (short) 1);
        int int11 = hashMapCuckooHashing1.hashFunction1((int) (byte) 0);
        boolean boolean12 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.insertKey2HashTable(0);
        hashMapCuckooHashing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test7111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7111");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int3 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double5 = hashMapCuckooHashing1.checkLoadFactor();
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean8 = hashMapCuckooHashing1.checkTableContainsKey((int) '4');
        int int10 = hashMapCuckooHashing1.hashFunction2(3);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean12 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.insertKey2HashTable(3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test7112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7112");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int3 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.displayHashtable();
        int int5 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean6 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test7113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7113");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean4 = hashMapCuckooHashing1.isFull();
        int int6 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int8 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int11 = hashMapCuckooHashing1.hashFunction2(100);
        boolean boolean12 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean14 = hashMapCuckooHashing1.isEmpty();
        double double15 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.insertKey2HashTable(100);
        double double19 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.insertKey2HashTable((int) (byte) -1);
        boolean boolean23 = hashMapCuckooHashing1.checkTableContainsKey(12);
        boolean boolean25 = hashMapCuckooHashing1.checkTableContainsKey((int) '#');
        int int26 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.025d + "'", double19 == 0.025d);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2 + "'", int26 == 2);
    }

    @Test
    public void test7114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7114");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int3 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int5 = hashMapCuckooHashing1.hashFunction1((int) (short) 10);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int9 = hashMapCuckooHashing1.hashFunction1(10);
        boolean boolean10 = hashMapCuckooHashing1.isEmpty();
        double double11 = hashMapCuckooHashing1.checkLoadFactor();
        java.lang.Class<?> wildcardClass12 = hashMapCuckooHashing1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test7115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7115");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction2((int) '#');
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey(0);
        hashMapCuckooHashing1.insertKey2HashTable((int) (byte) 0);
        int int13 = hashMapCuckooHashing1.hashFunction1((int) (byte) 100);
        double double14 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean17 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) -1);
        hashMapCuckooHashing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.1d + "'", double14 == 0.1d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test7116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7116");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction2((int) '#');
        int int8 = hashMapCuckooHashing1.hashFunction2((int) (byte) 100);
        hashMapCuckooHashing1.insertKey2HashTable((int) '#');
        int int12 = hashMapCuckooHashing1.hashFunction2((int) (short) -1);
        int int14 = hashMapCuckooHashing1.hashFunction2(10);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test7117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7117");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int8 = hashMapCuckooHashing1.hashFunction1((int) (short) 10);
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 1);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean14 = hashMapCuckooHashing1.checkTableContainsKey(3);
        boolean boolean15 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int18 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int19 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test7118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7118");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey(0);
        int int7 = hashMapCuckooHashing1.hashFunction1(3);
        double double8 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double11 = hashMapCuckooHashing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test7119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7119");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean6 = hashMapCuckooHashing1.checkTableContainsKey(100);
        int int8 = hashMapCuckooHashing1.hashFunction2((int) (byte) 0);
        double double9 = hashMapCuckooHashing1.checkLoadFactor();
        int int11 = hashMapCuckooHashing1.hashFunction2((int) 'a');
        hashMapCuckooHashing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
    }

    @Test
    public void test7120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7120");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.displayHashtable();
        int int7 = hashMapCuckooHashing1.hashFunction2(19);
        double double8 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean10 = hashMapCuckooHashing1.checkTableContainsKey(19);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test7121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7121");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        boolean boolean7 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 10);
        hashMapCuckooHashing1.insertKey2HashTable(12);
        boolean boolean10 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int12 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.insertKey2HashTable((int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test7122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7122");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) (short) 1);
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 10);
        double double4 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.insertKey2HashTable(12);
        hashMapCuckooHashing1.insertKey2HashTable(5);
        int int10 = hashMapCuckooHashing1.hashFunction2(9);
        double double11 = hashMapCuckooHashing1.checkLoadFactor();
        int int12 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean13 = hashMapCuckooHashing1.isFull();
        double double14 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = hashMapCuckooHashing1.findKeyInTable(79);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Key 79 not found in table");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.375d + "'", double11 == 0.375d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.375d + "'", double14 == 0.375d);
    }

    @Test
    public void test7123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7123");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) '4');
        int int3 = hashMapCuckooHashing1.hashFunction1((int) (short) 10);
        double double4 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test7124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7124");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction2((int) '#');
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean8 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        int int11 = hashMapCuckooHashing1.hashFunction2(9);
        hashMapCuckooHashing1.insertKey2HashTable((-1));
        int int14 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.insertKey2HashTable(100);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean18 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test7125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7125");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        int int4 = hashMapCuckooHashing1.hashFunction2((int) (short) 10);
        int int6 = hashMapCuckooHashing1.hashFunction1(10);
        int int8 = hashMapCuckooHashing1.hashFunction1((int) (short) 1);
        int int10 = hashMapCuckooHashing1.hashFunction2(0);
        int int12 = hashMapCuckooHashing1.hashFunction2((-1));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test7126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7126");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean7 = hashMapCuckooHashing1.isFull();
        int int9 = hashMapCuckooHashing1.hashFunction1(100);
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean11 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test7127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7127");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        boolean boolean7 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 10);
        int int9 = hashMapCuckooHashing1.hashFunction2(100);
        double double10 = hashMapCuckooHashing1.checkLoadFactor();
        double double11 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean13 = hashMapCuckooHashing1.checkTableContainsKey(48);
        int int14 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean16 = hashMapCuckooHashing1.checkTableContainsKey(0);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test7128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7128");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.insertKey2HashTable((int) ' ');
        int int10 = hashMapCuckooHashing1.hashFunction2((int) (byte) -1);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean12 = hashMapCuckooHashing1.isFull();
        boolean boolean13 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test7129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7129");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean3 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 0);
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int6 = hashMapCuckooHashing1.hashFunction1(35);
        boolean boolean8 = hashMapCuckooHashing1.checkTableContainsKey(10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test7130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7130");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        int int5 = hashMapCuckooHashing1.hashFunction2(100);
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean7 = hashMapCuckooHashing1.isFull();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean11 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test7131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest14.test7131");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double3 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean4 = hashMapCuckooHashing1.isEmpty();
        int int5 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        double double7 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean8 = hashMapCuckooHashing1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = hashMapCuckooHashing1.hashFunction2((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }
}

