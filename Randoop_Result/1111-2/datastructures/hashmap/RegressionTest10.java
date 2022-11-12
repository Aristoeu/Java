package datastructures.hashmap;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest10 {

    public static boolean debug = false;

    @Test
    public void test5001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5001");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) '#');
        hashMapCuckooHashing1.insertKey2HashTable((int) '#');
        boolean boolean4 = hashMapCuckooHashing1.isFull();
        int int6 = hashMapCuckooHashing1.hashFunction2((int) (short) -1);
        java.lang.Class<?> wildcardClass7 = hashMapCuckooHashing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean6 = hashMapCuckooHashing1.checkTableContainsKey(100);
        int int8 = hashMapCuckooHashing1.hashFunction1((int) '4');
        boolean boolean10 = hashMapCuckooHashing1.checkTableContainsKey(5);
        boolean boolean12 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 0);
        int int14 = hashMapCuckooHashing1.hashFunction2((int) (short) -1);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 12 + "'", int8 == 12);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        int int7 = hashMapCuckooHashing1.hashFunction2((-1));
        int int9 = hashMapCuckooHashing1.hashFunction2((int) (short) 1);
        hashMapCuckooHashing1.insertKey2HashTable(0);
        boolean boolean12 = hashMapCuckooHashing1.isFull();
        boolean boolean13 = hashMapCuckooHashing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        int int7 = hashMapCuckooHashing1.hashFunction2(3);
        int int8 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int10 = hashMapCuckooHashing1.hashFunction1(10);
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 10);
        int int14 = hashMapCuckooHashing1.hashFunction1(17);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) ' ');
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1(1);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.insertKey2HashTable(39);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = hashMapCuckooHashing1.findKeyInTable(69);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Key 69 not found in table");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction2((int) '#');
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey(0);
        double double10 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean12 = hashMapCuckooHashing1.checkTableContainsKey(30);
        int int14 = hashMapCuckooHashing1.hashFunction1(19);
        double double15 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean17 = hashMapCuckooHashing1.checkTableContainsKey(8);
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean20 = hashMapCuckooHashing1.checkTableContainsKey(9);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) ' ');
        hashMapCuckooHashing1.insertKey2HashTable((int) 'a');
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean9 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean6 = hashMapCuckooHashing1.checkTableContainsKey(100);
        int int8 = hashMapCuckooHashing1.hashFunction1(2);
        int int9 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean4 = hashMapCuckooHashing1.isFull();
        int int6 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean8 = hashMapCuckooHashing1.isEmpty();
        int int9 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean11 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean13 = hashMapCuckooHashing1.isFull();
        java.lang.Class<?> wildcardClass14 = hashMapCuckooHashing1.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) (short) 1);
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 10);
        int int5 = hashMapCuckooHashing1.hashFunction1((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        int int7 = hashMapCuckooHashing1.hashFunction2((-1));
        int int9 = hashMapCuckooHashing1.hashFunction2((int) (short) 1);
        int int11 = hashMapCuckooHashing1.hashFunction2((int) (byte) 100);
        hashMapCuckooHashing1.insertKey2HashTable((-1));
        // The following exception was thrown during execution in test generation
        try {
            int int15 = hashMapCuckooHashing1.findKeyInTable(7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Key 7 not found in table");
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
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean4 = hashMapCuckooHashing1.isFull();
        int int6 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean8 = hashMapCuckooHashing1.isEmpty();
        int int9 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int10 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double12 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean4 = hashMapCuckooHashing1.checkTableContainsKey((int) '4');
        int int5 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.insertKey2HashTable(4);
        boolean boolean8 = hashMapCuckooHashing1.isFull();
        int int9 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean4 = hashMapCuckooHashing1.isFull();
        int int6 = hashMapCuckooHashing1.hashFunction1((int) '#');
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        double double8 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean10 = hashMapCuckooHashing1.checkTableContainsKey(3);
        boolean boolean11 = hashMapCuckooHashing1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = hashMapCuckooHashing1.findKeyInTable((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.insertKey2HashTable((int) ' ');
        int int10 = hashMapCuckooHashing1.hashFunction1(5);
        double double11 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean12 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.1d + "'", double11 == 0.1d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.insertKey2HashTable(0);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int12 = hashMapCuckooHashing1.hashFunction2((int) (byte) -1);
        int int14 = hashMapCuckooHashing1.hashFunction2(39);
        int int16 = hashMapCuckooHashing1.hashFunction1(2);
        hashMapCuckooHashing1.insertKey2HashTable(39);
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable(9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Key 9 already inside, no duplicates allowed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        int int4 = hashMapCuckooHashing1.hashFunction2((int) (short) 10);
        int int6 = hashMapCuckooHashing1.hashFunction2((int) (short) 10);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.insertKey2HashTable((int) '#');
        int int11 = hashMapCuckooHashing1.hashFunction2((int) '#');
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 0);
        double double14 = hashMapCuckooHashing1.checkLoadFactor();
        double double15 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.insertKey2HashTable(20);
        boolean boolean18 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.1d + "'", double14 == 0.1d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.1d + "'", double15 == 0.1d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(1);
        boolean boolean2 = hashMapCuckooHashing1.isEmpty();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.insertKey2HashTable((int) (byte) -1);
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 10);
        int int9 = hashMapCuckooHashing1.findKeyInTable((int) (short) 10);
        int int11 = hashMapCuckooHashing1.findKeyInTable(10);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) (short) 1);
        boolean boolean3 = hashMapCuckooHashing1.checkTableContainsKey(7);
        int int5 = hashMapCuckooHashing1.hashFunction2((-1));
        int int7 = hashMapCuckooHashing1.hashFunction2(0);
        int int9 = hashMapCuckooHashing1.hashFunction2(1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean7 = hashMapCuckooHashing1.isFull();
        double double8 = hashMapCuckooHashing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean3 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 0);
        int int5 = hashMapCuckooHashing1.hashFunction1(0);
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int3 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int5 = hashMapCuckooHashing1.hashFunction1((-1));
        int int7 = hashMapCuckooHashing1.hashFunction1((int) (short) 1);
        hashMapCuckooHashing1.displayHashtable();
        int int9 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean4 = hashMapCuckooHashing1.checkTableContainsKey((int) '4');
        int int6 = hashMapCuckooHashing1.hashFunction2((int) 'a');
        hashMapCuckooHashing1.insertKey2HashTable(9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 9 + "'", int6 == 9);
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean3 = hashMapCuckooHashing1.isEmpty();
        boolean boolean4 = hashMapCuckooHashing1.isFull();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        java.lang.Class<?> wildcardClass8 = hashMapCuckooHashing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(39);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean4 = hashMapCuckooHashing1.isFull();
        int int6 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int8 = hashMapCuckooHashing1.hashFunction1((int) (short) 1);
        hashMapCuckooHashing1.insertKey2HashTable((int) '#');
        boolean boolean11 = hashMapCuckooHashing1.isEmpty();
        int int13 = hashMapCuckooHashing1.hashFunction1((int) (byte) 1);
        int int15 = hashMapCuckooHashing1.hashFunction2((int) (short) 1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.insertKey2HashTable(0);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int12 = hashMapCuckooHashing1.hashFunction1((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = hashMapCuckooHashing1.findKeyInTable(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Key 10 not found in table");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean7 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 1);
        int int9 = hashMapCuckooHashing1.hashFunction1(12);
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.insertKey2HashTable(12);
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean14 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 12 + "'", int9 == 12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        int int7 = hashMapCuckooHashing1.hashFunction2(3);
        double double8 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.insertKey2HashTable((int) '#');
        boolean boolean12 = hashMapCuckooHashing1.checkTableContainsKey(5);
        boolean boolean14 = hashMapCuckooHashing1.checkTableContainsKey((int) '#');
        int int16 = hashMapCuckooHashing1.hashFunction2((-1));
        boolean boolean18 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        int int5 = hashMapCuckooHashing1.hashFunction2(100);
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean7 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean9 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.insertKey2HashTable((int) ' ');
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 100);
        hashMapCuckooHashing1.displayHashtable();
        int int15 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable(48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Key 48 already inside, no duplicates allowed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction1(1);
        int int8 = hashMapCuckooHashing1.hashFunction2((int) '#');
        boolean boolean9 = hashMapCuckooHashing1.isFull();
        boolean boolean10 = hashMapCuckooHashing1.isFull();
        boolean boolean12 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) -1);
        boolean boolean13 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) (short) 10);
        int int3 = hashMapCuckooHashing1.hashFunction2(1);
        double double4 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.insertKey2HashTable(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isEmpty();
        boolean boolean4 = hashMapCuckooHashing1.isEmpty();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean7 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        int int9 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        double double10 = hashMapCuckooHashing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean4 = hashMapCuckooHashing1.checkTableContainsKey(10);
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        int int7 = hashMapCuckooHashing1.hashFunction1(0);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean9 = hashMapCuckooHashing1.isEmpty();
        boolean boolean11 = hashMapCuckooHashing1.checkTableContainsKey(48);
        boolean boolean12 = hashMapCuckooHashing1.isFull();
        int int14 = hashMapCuckooHashing1.hashFunction2((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int3 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int5 = hashMapCuckooHashing1.hashFunction1((-1));
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean8 = hashMapCuckooHashing1.checkTableContainsKey(9);
        double double9 = hashMapCuckooHashing1.checkLoadFactor();
        int int10 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.insertKey2HashTable(12);
        int int14 = hashMapCuckooHashing1.hashFunction1((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        int int4 = hashMapCuckooHashing1.hashFunction2((int) (short) 10);
        int int6 = hashMapCuckooHashing1.hashFunction2((int) (short) 10);
        int int8 = hashMapCuckooHashing1.hashFunction2((int) (byte) 100);
        boolean boolean9 = hashMapCuckooHashing1.isFull();
        boolean boolean10 = hashMapCuckooHashing1.isFull();
        boolean boolean12 = hashMapCuckooHashing1.checkTableContainsKey((int) 'a');
        double double13 = hashMapCuckooHashing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean4 = hashMapCuckooHashing1.isEmpty();
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        boolean boolean8 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) (short) 1);
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 10);
        double double4 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.insertKey2HashTable(12);
        hashMapCuckooHashing1.displayHashtable();
        int int9 = hashMapCuckooHashing1.findKeyInTable(10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        int int4 = hashMapCuckooHashing1.hashFunction2((int) (short) 10);
        hashMapCuckooHashing1.insertKey2HashTable((int) ' ');
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey(0);
        boolean boolean11 = hashMapCuckooHashing1.checkTableContainsKey(100);
        int int12 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        int int4 = hashMapCuckooHashing1.hashFunction2((int) (short) 10);
        int int6 = hashMapCuckooHashing1.hashFunction1(10);
        int int8 = hashMapCuckooHashing1.hashFunction1((int) (short) 1);
        int int10 = hashMapCuckooHashing1.hashFunction1(2);
        int int12 = hashMapCuckooHashing1.hashFunction2(1);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.insertKey2HashTable(0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(1);
        boolean boolean2 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 0);
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean8 = hashMapCuckooHashing1.checkTableContainsKey(0);
        int int9 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean8 = hashMapCuckooHashing1.checkTableContainsKey((-1));
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = hashMapCuckooHashing1.findKeyInTable((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        int int7 = hashMapCuckooHashing1.hashFunction2((-1));
        double double8 = hashMapCuckooHashing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(4);
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 100);
        double double4 = hashMapCuckooHashing1.checkLoadFactor();
        int int5 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int7 = hashMapCuckooHashing1.hashFunction2((int) 'a');
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.25d + "'", double4 == 0.25d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) (byte) 0);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean3 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double5 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double9 = hashMapCuckooHashing1.checkLoadFactor();
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.insertKey2HashTable(17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        int int9 = hashMapCuckooHashing1.hashFunction2((int) (byte) 100);
        boolean boolean10 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction2((int) '#');
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey((int) ' ');
        int int11 = hashMapCuckooHashing1.hashFunction2((int) (short) 10);
        hashMapCuckooHashing1.displayHashtable();
        int int14 = hashMapCuckooHashing1.hashFunction2((int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(1);
        boolean boolean2 = hashMapCuckooHashing1.isEmpty();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.insertKey2HashTable((int) (byte) -1);
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Key 8 already inside, no duplicates allowed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean6 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 1);
        boolean boolean8 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 1);
        hashMapCuckooHashing1.insertKey2HashTable(10);
        hashMapCuckooHashing1.insertKey2HashTable((int) '#');
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean15 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int7 = hashMapCuckooHashing1.hashFunction2((int) (byte) 1);
        hashMapCuckooHashing1.displayHashtable();
        int int10 = hashMapCuckooHashing1.hashFunction1(10);
        hashMapCuckooHashing1.insertKey2HashTable(7);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = hashMapCuckooHashing1.findKeyInTable(12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Key 12 not found in table");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        int int4 = hashMapCuckooHashing1.hashFunction2((int) (short) 10);
        int int6 = hashMapCuckooHashing1.hashFunction2((int) (short) 10);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.insertKey2HashTable((int) '#');
        boolean boolean10 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.insertKey2HashTable(9);
        hashMapCuckooHashing1.displayHashtable();
        java.lang.Class<?> wildcardClass14 = hashMapCuckooHashing1.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction2((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction1((int) (short) 1);
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        boolean boolean8 = hashMapCuckooHashing1.isEmpty();
        int int10 = hashMapCuckooHashing1.hashFunction2(19);
        hashMapCuckooHashing1.displayHashtable();
        int int13 = hashMapCuckooHashing1.hashFunction1(3);
        boolean boolean14 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        boolean boolean7 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 10);
        hashMapCuckooHashing1.insertKey2HashTable(100);
        boolean boolean11 = hashMapCuckooHashing1.checkTableContainsKey((int) ' ');
        hashMapCuckooHashing1.insertKey2HashTable(35);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 0);
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        int int9 = hashMapCuckooHashing1.hashFunction1((int) (byte) 1);
        int int11 = hashMapCuckooHashing1.hashFunction2((int) '4');
        int int13 = hashMapCuckooHashing1.hashFunction2(10);
        int int14 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int3 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 1);
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        boolean boolean8 = hashMapCuckooHashing1.isFull();
        boolean boolean10 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 0);
        hashMapCuckooHashing1.insertKey2HashTable(0);
        int int14 = hashMapCuckooHashing1.hashFunction2(5);
        boolean boolean15 = hashMapCuckooHashing1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 100);
        double double10 = hashMapCuckooHashing1.checkLoadFactor();
        int int12 = hashMapCuckooHashing1.hashFunction1(20);
        int int14 = hashMapCuckooHashing1.hashFunction1(2);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        int int9 = hashMapCuckooHashing1.hashFunction2((int) (byte) 100);
        boolean boolean10 = hashMapCuckooHashing1.isFull();
        double double11 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.insertKey2HashTable((int) ' ');
        double double14 = hashMapCuckooHashing1.checkLoadFactor();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = hashMapCuckooHashing1.findKeyInTable(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Key 0 not found in table");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.1d + "'", double14 == 0.1d);
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        boolean boolean6 = hashMapCuckooHashing1.checkTableContainsKey(12);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.insertKey2HashTable(79);
        boolean boolean10 = hashMapCuckooHashing1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = hashMapCuckooHashing1.findKeyInTable(36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Key 36 not found in table");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
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
        boolean boolean15 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 0);
        boolean boolean17 = hashMapCuckooHashing1.checkTableContainsKey(30);
        double double18 = hashMapCuckooHashing1.checkLoadFactor();
        double double19 = hashMapCuckooHashing1.checkLoadFactor();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.0d + "'", double19 == 0.0d);
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean4 = hashMapCuckooHashing1.isFull();
        int int6 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int8 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean9 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.insertKey2HashTable((int) (byte) 1);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.insertKey2HashTable(20);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        int int4 = hashMapCuckooHashing1.hashFunction2((int) (short) 10);
        int int6 = hashMapCuckooHashing1.hashFunction1(10);
        int int8 = hashMapCuckooHashing1.hashFunction1((int) (short) 1);
        int int10 = hashMapCuckooHashing1.hashFunction2(0);
        int int12 = hashMapCuckooHashing1.hashFunction1(3);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean14 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.insertKey2HashTable((int) ' ');
        double double9 = hashMapCuckooHashing1.checkLoadFactor();
        int int10 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int12 = hashMapCuckooHashing1.hashFunction2(0);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean14 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        int int17 = hashMapCuckooHashing1.hashFunction1((int) (byte) -1);
        hashMapCuckooHashing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.1d + "'", double9 == 0.1d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 19 + "'", int17 == 19);
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        int int4 = hashMapCuckooHashing1.hashFunction2((int) (short) 10);
        int int6 = hashMapCuckooHashing1.hashFunction1(10);
        hashMapCuckooHashing1.insertKey2HashTable(5);
        hashMapCuckooHashing1.displayHashtable();
        int int10 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean12 = hashMapCuckooHashing1.checkTableContainsKey(1);
        hashMapCuckooHashing1.insertKey2HashTable((int) (byte) -1);
        double double15 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean16 = hashMapCuckooHashing1.isFull();
        int int18 = hashMapCuckooHashing1.hashFunction2(1);
        int int20 = hashMapCuckooHashing1.hashFunction1((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int22 = hashMapCuckooHashing1.findKeyInTable(69);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Key 69 not found in table");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.2d + "'", double15 == 0.2d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        int int5 = hashMapCuckooHashing1.hashFunction2(100);
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean8 = hashMapCuckooHashing1.checkTableContainsKey(10);
        int int9 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int11 = hashMapCuckooHashing1.hashFunction2(39);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        double double8 = hashMapCuckooHashing1.checkLoadFactor();
        int int10 = hashMapCuckooHashing1.hashFunction1((int) (byte) -1);
        boolean boolean11 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) -1);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int11 = hashMapCuckooHashing1.hashFunction2((int) (short) 1);
        int int12 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int3 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 1);
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        boolean boolean8 = hashMapCuckooHashing1.isFull();
        int int10 = hashMapCuckooHashing1.hashFunction1(10);
        double double11 = hashMapCuckooHashing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        int int5 = hashMapCuckooHashing1.hashFunction2(100);
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean7 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        int int10 = hashMapCuckooHashing1.hashFunction2((int) (byte) 1);
        int int11 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable(48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        int int9 = hashMapCuckooHashing1.hashFunction2((int) (short) -1);
        hashMapCuckooHashing1.insertKey2HashTable(20);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int3 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int5 = hashMapCuckooHashing1.hashFunction1((-1));
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean8 = hashMapCuckooHashing1.checkTableContainsKey(9);
        double double9 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean11 = hashMapCuckooHashing1.checkTableContainsKey((int) 'a');
        hashMapCuckooHashing1.insertKey2HashTable(15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int8 = hashMapCuckooHashing1.hashFunction1((int) (short) 10);
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 1);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean14 = hashMapCuckooHashing1.checkTableContainsKey(12);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int16 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.insertKey2HashTable((int) (byte) 0);
        int int8 = hashMapCuckooHashing1.hashFunction1((int) (byte) -1);
        int int10 = hashMapCuckooHashing1.hashFunction1((int) (short) 1);
        boolean boolean11 = hashMapCuckooHashing1.isFull();
        int int12 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double14 = hashMapCuckooHashing1.checkLoadFactor();
        int int15 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        double double16 = hashMapCuckooHashing1.checkLoadFactor();
        int int17 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 19 + "'", int8 == 19);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.025d + "'", double14 == 0.025d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.025d + "'", double16 == 0.025d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction2((int) '#');
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        int int8 = hashMapCuckooHashing1.hashFunction1((int) (byte) 10);
        boolean boolean9 = hashMapCuckooHashing1.isEmpty();
        int int11 = hashMapCuckooHashing1.hashFunction1((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean8 = hashMapCuckooHashing1.checkTableContainsKey((int) ' ');
        int int9 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        int int5 = hashMapCuckooHashing1.hashFunction2(100);
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean7 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        int int10 = hashMapCuckooHashing1.hashFunction2((int) (byte) 1);
        int int11 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        double double12 = hashMapCuckooHashing1.checkLoadFactor();
        int int13 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) (byte) 1);
        boolean boolean3 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 100);
        boolean boolean4 = hashMapCuckooHashing1.isEmpty();
        double double5 = hashMapCuckooHashing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.insertKey2HashTable((int) ' ');
        double double9 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean11 = hashMapCuckooHashing1.checkTableContainsKey(1);
        int int12 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean13 = hashMapCuckooHashing1.isEmpty();
        int int14 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.insertKey2HashTable((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable(36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Key 36 already inside, no duplicates allowed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.1d + "'", double9 == 0.1d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction2((int) '#');
        int int8 = hashMapCuckooHashing1.hashFunction2((int) (byte) 100);
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) -1);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean13 = hashMapCuckooHashing1.checkTableContainsKey(0);
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Key 5 already inside, no duplicates allowed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
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
        boolean boolean11 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
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
        int int17 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int19 = hashMapCuckooHashing1.hashFunction1((int) (short) 1);
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
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean8 = hashMapCuckooHashing1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = hashMapCuckooHashing1.findKeyInTable(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(1);
        boolean boolean2 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean6 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 0);
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        int int9 = hashMapCuckooHashing1.hashFunction1((int) (byte) 1);
        boolean boolean10 = hashMapCuckooHashing1.isFull();
        int int12 = hashMapCuckooHashing1.findKeyInTable(0);
        int int14 = hashMapCuckooHashing1.hashFunction1((int) (byte) -1);
        int int16 = hashMapCuckooHashing1.hashFunction2((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.displayHashtable();
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        double double7 = hashMapCuckooHashing1.checkLoadFactor();
        int int8 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = hashMapCuckooHashing1.checkTableContainsKey(99);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean4 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 0);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean7 = hashMapCuckooHashing1.checkTableContainsKey(8);
        double double8 = hashMapCuckooHashing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean7 = hashMapCuckooHashing1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        int int5 = hashMapCuckooHashing1.hashFunction2(100);
        hashMapCuckooHashing1.displayHashtable();
        int int8 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.displayHashtable();
        int int11 = hashMapCuckooHashing1.hashFunction2(10);
        java.lang.Class<?> wildcardClass12 = hashMapCuckooHashing1.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean3 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 0);
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int6 = hashMapCuckooHashing1.hashFunction2(0);
        int int8 = hashMapCuckooHashing1.hashFunction1((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean6 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 1);
        hashMapCuckooHashing1.insertKey2HashTable((int) ' ');
        boolean boolean9 = hashMapCuckooHashing1.isEmpty();
        int int11 = hashMapCuckooHashing1.hashFunction2(0);
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable(19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Key 19 already inside, no duplicates allowed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int8 = hashMapCuckooHashing1.hashFunction1((int) (short) 10);
        int int10 = hashMapCuckooHashing1.hashFunction1((int) (byte) 100);
        int int11 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int13 = hashMapCuckooHashing1.hashFunction2(99);
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) '#');
        hashMapCuckooHashing1.insertKey2HashTable((int) '#');
        boolean boolean4 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 100);
        boolean boolean8 = hashMapCuckooHashing1.checkTableContainsKey(10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean4 = hashMapCuckooHashing1.isFull();
        int int6 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean8 = hashMapCuckooHashing1.isEmpty();
        int int10 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int11 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.insertKey2HashTable((int) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean6 = hashMapCuckooHashing1.checkTableContainsKey(100);
        int int8 = hashMapCuckooHashing1.hashFunction1(3);
        boolean boolean10 = hashMapCuckooHashing1.checkTableContainsKey(5);
        boolean boolean12 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 0);
        boolean boolean14 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int3 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double5 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean7 = hashMapCuckooHashing1.checkTableContainsKey((int) '4');
        int int8 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        java.lang.Class<?> wildcardClass9 = hashMapCuckooHashing1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction2((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction1((int) (short) 1);
        int int8 = hashMapCuckooHashing1.hashFunction1(17);
        double double9 = hashMapCuckooHashing1.checkLoadFactor();
        int int10 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        double double11 = hashMapCuckooHashing1.checkLoadFactor();
        int int13 = hashMapCuckooHashing1.hashFunction2((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1(0);
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        boolean boolean6 = hashMapCuckooHashing1.isEmpty();
        int int8 = hashMapCuckooHashing1.hashFunction2(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction2((int) '#');
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey(0);
        int int11 = hashMapCuckooHashing1.hashFunction1((int) (short) -1);
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean13 = hashMapCuckooHashing1.isFull();
        int int15 = hashMapCuckooHashing1.hashFunction2((int) (byte) 0);
        boolean boolean16 = hashMapCuckooHashing1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        int int5 = hashMapCuckooHashing1.hashFunction2(100);
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean7 = hashMapCuckooHashing1.isFull();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        boolean boolean11 = hashMapCuckooHashing1.checkTableContainsKey(3);
        int int12 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.insertKey2HashTable(2);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction2((int) '#');
        boolean boolean6 = hashMapCuckooHashing1.checkTableContainsKey(2);
        int int8 = hashMapCuckooHashing1.hashFunction2(99);
        int int10 = hashMapCuckooHashing1.hashFunction1((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable(39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction2((int) '#');
        int int8 = hashMapCuckooHashing1.hashFunction2((int) (byte) 100);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int11 = hashMapCuckooHashing1.hashFunction1((int) (short) 10);
        int int12 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int13 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean6 = hashMapCuckooHashing1.checkTableContainsKey(100);
        boolean boolean8 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) -1);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) ' ');
        hashMapCuckooHashing1.insertKey2HashTable(0);
        boolean boolean4 = hashMapCuckooHashing1.isEmpty();
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        boolean boolean7 = hashMapCuckooHashing1.checkTableContainsKey((-1));
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean9 = hashMapCuckooHashing1.isFull();
        boolean boolean10 = hashMapCuckooHashing1.isEmpty();
        boolean boolean11 = hashMapCuckooHashing1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.insertKey2HashTable((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Key already inside, no duplicates allowed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int3 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int5 = hashMapCuckooHashing1.hashFunction1((-1));
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey(3);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = hashMapCuckooHashing1.findKeyInTable(48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean6 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 1);
        hashMapCuckooHashing1.insertKey2HashTable((int) ' ');
        boolean boolean9 = hashMapCuckooHashing1.isEmpty();
        int int11 = hashMapCuckooHashing1.hashFunction2((int) (byte) 100);
        hashMapCuckooHashing1.insertKey2HashTable(15);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = hashMapCuckooHashing1.findKeyInTable((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Key 97 not found in table");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean7 = hashMapCuckooHashing1.isFull();
        int int9 = hashMapCuckooHashing1.hashFunction1(1);
        int int10 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean12 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 100);
        double double13 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean14 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.displayHashtable();
        int int9 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) ' ');
        int int6 = hashMapCuckooHashing1.hashFunction2((int) (short) -1);
        int int8 = hashMapCuckooHashing1.hashFunction2((int) (short) 100);
        int int9 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean11 = hashMapCuckooHashing1.checkTableContainsKey(48);
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 12 + "'", int4 == 12);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) (short) 1);
        boolean boolean3 = hashMapCuckooHashing1.checkTableContainsKey(7);
        double double4 = hashMapCuckooHashing1.checkLoadFactor();
        int int6 = hashMapCuckooHashing1.hashFunction2(0);
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey(79);
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction1(1);
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean4 = hashMapCuckooHashing1.checkTableContainsKey((int) '4');
        double double5 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        int int8 = hashMapCuckooHashing1.hashFunction1((int) '4');
        boolean boolean9 = hashMapCuckooHashing1.isFull();
        int int11 = hashMapCuckooHashing1.hashFunction2(9);
        boolean boolean12 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        int int5 = hashMapCuckooHashing1.hashFunction2(100);
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean8 = hashMapCuckooHashing1.checkTableContainsKey(10);
        boolean boolean9 = hashMapCuckooHashing1.isFull();
        int int11 = hashMapCuckooHashing1.hashFunction2((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction2((int) '#');
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey(0);
        double double10 = hashMapCuckooHashing1.checkLoadFactor();
        int int11 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean13 = hashMapCuckooHashing1.checkTableContainsKey(0);
        boolean boolean14 = hashMapCuckooHashing1.isEmpty();
        int int15 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int8 = hashMapCuckooHashing1.hashFunction1((int) (short) 10);
        int int10 = hashMapCuckooHashing1.hashFunction1((int) (byte) 100);
        boolean boolean12 = hashMapCuckooHashing1.checkTableContainsKey((int) '#');
        java.lang.Class<?> wildcardClass13 = hashMapCuckooHashing1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 0);
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        int int9 = hashMapCuckooHashing1.hashFunction1((int) (byte) 1);
        boolean boolean10 = hashMapCuckooHashing1.isFull();
        int int12 = hashMapCuckooHashing1.findKeyInTable(0);
        int int14 = hashMapCuckooHashing1.hashFunction1((int) 'a');
        int int16 = hashMapCuckooHashing1.findKeyInTable(0);
        int int18 = hashMapCuckooHashing1.hashFunction1(10);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        double double4 = hashMapCuckooHashing1.checkLoadFactor();
        int int5 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double8 = hashMapCuckooHashing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5118");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        double double3 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean4 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
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
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.insertKey2HashTable(39);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int21 = hashMapCuckooHashing1.hashFunction2(100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.1d + "'", double14 == 0.1d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.insertKey2HashTable(0);
        boolean boolean10 = hashMapCuckooHashing1.checkTableContainsKey(30);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5121");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int7 = hashMapCuckooHashing1.hashFunction2(17);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction2((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction1((int) (short) 1);
        int int8 = hashMapCuckooHashing1.hashFunction1(17);
        boolean boolean10 = hashMapCuckooHashing1.checkTableContainsKey(3);
        boolean boolean11 = hashMapCuckooHashing1.isFull();
        boolean boolean12 = hashMapCuckooHashing1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.insertKey2HashTable((int) (byte) 10);
        hashMapCuckooHashing1.displayHashtable();
        double double11 = hashMapCuckooHashing1.checkLoadFactor();
        double double12 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean13 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.insertKey2HashTable(20);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.05d + "'", double11 == 0.05d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.05d + "'", double12 == 0.05d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction2((int) '#');
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean8 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 100);
        boolean boolean9 = hashMapCuckooHashing1.isFull();
        java.lang.Class<?> wildcardClass10 = hashMapCuckooHashing1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean4 = hashMapCuckooHashing1.checkTableContainsKey(10);
        int int6 = hashMapCuckooHashing1.hashFunction1((int) (short) 0);
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = hashMapCuckooHashing1.findKeyInTable(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean4 = hashMapCuckooHashing1.isFull();
        int int6 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        double double8 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean10 = hashMapCuckooHashing1.checkTableContainsKey((int) ' ');
        int int12 = hashMapCuckooHashing1.hashFunction2((int) 'a');
        double double13 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean15 = hashMapCuckooHashing1.checkTableContainsKey((int) 'a');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) (byte) 1);
        int int3 = hashMapCuckooHashing1.hashFunction2(5);
        int int5 = hashMapCuckooHashing1.hashFunction2(3);
        boolean boolean6 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5128");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction2((int) '#');
        int int8 = hashMapCuckooHashing1.hashFunction2((int) (byte) 100);
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) -1);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean13 = hashMapCuckooHashing1.checkTableContainsKey(0);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean15 = hashMapCuckooHashing1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5129");
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
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5130");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) '4');
        int int3 = hashMapCuckooHashing1.hashFunction2(12);
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey(0);
        boolean boolean6 = hashMapCuckooHashing1.isEmpty();
        boolean boolean8 = hashMapCuckooHashing1.checkTableContainsKey(100);
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean10 = hashMapCuckooHashing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5131");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isEmpty();
        boolean boolean4 = hashMapCuckooHashing1.isEmpty();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        boolean boolean6 = hashMapCuckooHashing1.isEmpty();
        java.lang.Class<?> wildcardClass7 = hashMapCuckooHashing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5132");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        int int7 = hashMapCuckooHashing1.hashFunction2((-1));
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean10 = hashMapCuckooHashing1.isEmpty();
        double double11 = hashMapCuckooHashing1.checkLoadFactor();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = hashMapCuckooHashing1.findKeyInTable(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5133");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        int int7 = hashMapCuckooHashing1.hashFunction2((-1));
        int int9 = hashMapCuckooHashing1.hashFunction2((int) (short) 1);
        int int11 = hashMapCuckooHashing1.hashFunction2((int) (byte) 100);
        hashMapCuckooHashing1.insertKey2HashTable((-1));
        boolean boolean15 = hashMapCuckooHashing1.checkTableContainsKey((int) '4');
        int int17 = hashMapCuckooHashing1.hashFunction1(10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5134");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean4 = hashMapCuckooHashing1.checkTableContainsKey(10);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int8 = hashMapCuckooHashing1.hashFunction1((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = hashMapCuckooHashing1.findKeyInTable(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5135");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 0);
        int int8 = hashMapCuckooHashing1.hashFunction2((int) (byte) 1);
        int int10 = hashMapCuckooHashing1.hashFunction1((int) (short) 0);
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean14 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 1);
        boolean boolean16 = hashMapCuckooHashing1.checkTableContainsKey((int) ' ');
        boolean boolean17 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.deleteKeyFromHashTable((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5136");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        double double7 = hashMapCuckooHashing1.checkLoadFactor();
        int int9 = hashMapCuckooHashing1.hashFunction2((int) (byte) 1);
        boolean boolean11 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 10);
        int int13 = hashMapCuckooHashing1.hashFunction1(3);
        hashMapCuckooHashing1.insertKey2HashTable(10);
        java.lang.Class<?> wildcardClass16 = hashMapCuckooHashing1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5137");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean4 = hashMapCuckooHashing1.isEmpty();
        int int5 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        double double7 = hashMapCuckooHashing1.checkLoadFactor();
        int int8 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int9 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5138");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        boolean boolean7 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 10);
        hashMapCuckooHashing1.insertKey2HashTable(100);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean11 = hashMapCuckooHashing1.isFull();
        double double12 = hashMapCuckooHashing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.05d + "'", double12 == 0.05d);
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5139");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) '#');
        hashMapCuckooHashing1.insertKey2HashTable((int) '#');
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey(0);
        boolean boolean6 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5140");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        boolean boolean7 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 10);
        int int9 = hashMapCuckooHashing1.hashFunction2(100);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean11 = hashMapCuckooHashing1.isEmpty();
        boolean boolean12 = hashMapCuckooHashing1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = hashMapCuckooHashing1.findKeyInTable(69);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5141");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int3 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 1);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int8 = hashMapCuckooHashing1.hashFunction1(3);
        int int10 = hashMapCuckooHashing1.hashFunction2((int) 'a');
        int int12 = hashMapCuckooHashing1.hashFunction2(4);
        double double13 = hashMapCuckooHashing1.checkLoadFactor();
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable(35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5142");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean4 = hashMapCuckooHashing1.isEmpty();
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        boolean boolean6 = hashMapCuckooHashing1.isEmpty();
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5143");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean4 = hashMapCuckooHashing1.isFull();
        int int6 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int8 = hashMapCuckooHashing1.hashFunction1((int) (short) 1);
        hashMapCuckooHashing1.insertKey2HashTable((int) '#');
        boolean boolean11 = hashMapCuckooHashing1.isEmpty();
        double double12 = hashMapCuckooHashing1.checkLoadFactor();
        int int14 = hashMapCuckooHashing1.hashFunction1(2);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.1d + "'", double12 == 0.1d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5144");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        int int6 = hashMapCuckooHashing1.hashFunction2((int) (short) 1);
        boolean boolean8 = hashMapCuckooHashing1.checkTableContainsKey(2);
        hashMapCuckooHashing1.insertKey2HashTable(100);
        boolean boolean11 = hashMapCuckooHashing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5145");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        int int7 = hashMapCuckooHashing1.hashFunction2((-1));
        hashMapCuckooHashing1.insertKey2HashTable((int) (byte) -1);
        int int10 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        double double11 = hashMapCuckooHashing1.checkLoadFactor();
        int int13 = hashMapCuckooHashing1.hashFunction2(19);
        int int15 = hashMapCuckooHashing1.hashFunction1((int) (byte) 100);
        int int17 = hashMapCuckooHashing1.hashFunction1(35);
        boolean boolean19 = hashMapCuckooHashing1.checkTableContainsKey(10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.1d + "'", double11 == 0.1d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5146");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean4 = hashMapCuckooHashing1.isFull();
        int int6 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean8 = hashMapCuckooHashing1.isEmpty();
        int int9 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int10 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int11 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5147");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction2((int) '#');
        int int8 = hashMapCuckooHashing1.hashFunction2((int) (byte) 100);
        hashMapCuckooHashing1.insertKey2HashTable((int) '#');
        boolean boolean12 = hashMapCuckooHashing1.checkTableContainsKey(0);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Key 6 already inside, no duplicates allowed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5148");
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
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 100);
        double double18 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.insertKey2HashTable(99);
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
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.1d + "'", double18 == 0.1d);
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5149");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean6 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 1);
        boolean boolean8 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 1);
        int int9 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean11 = hashMapCuckooHashing1.checkTableContainsKey(19);
        int int13 = hashMapCuckooHashing1.hashFunction2(0);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int16 = hashMapCuckooHashing1.hashFunction1(79);
        int int18 = hashMapCuckooHashing1.hashFunction1(7);
        boolean boolean19 = hashMapCuckooHashing1.isFull();
        boolean boolean21 = hashMapCuckooHashing1.checkTableContainsKey(48);
        boolean boolean22 = hashMapCuckooHashing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 19 + "'", int16 == 19);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5150");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int3 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int5 = hashMapCuckooHashing1.hashFunction1((int) '4');
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double7 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey(7);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5151");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean4 = hashMapCuckooHashing1.checkTableContainsKey(10);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean8 = hashMapCuckooHashing1.checkTableContainsKey((int) 'a');
        boolean boolean9 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.insertKey2HashTable(19);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5152");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) ' ');
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction2(5);
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5153");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean4 = hashMapCuckooHashing1.isFull();
        int int6 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int8 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean9 = hashMapCuckooHashing1.isEmpty();
        boolean boolean10 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean12 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5154");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double3 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean4 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        double double8 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean10 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5155");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.displayHashtable();
        int int8 = hashMapCuckooHashing1.hashFunction1(5);
        double double9 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean10 = hashMapCuckooHashing1.isEmpty();
        int int12 = hashMapCuckooHashing1.hashFunction2(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5156");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        int int4 = hashMapCuckooHashing1.hashFunction2((int) (short) 10);
        int int6 = hashMapCuckooHashing1.hashFunction2((int) (short) 10);
        int int8 = hashMapCuckooHashing1.hashFunction2((int) (byte) 100);
        boolean boolean9 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.insertKey2HashTable((int) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5157");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean4 = hashMapCuckooHashing1.checkTableContainsKey(10);
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        int int7 = hashMapCuckooHashing1.hashFunction1(0);
        boolean boolean8 = hashMapCuckooHashing1.isFull();
        boolean boolean10 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) -1);
        hashMapCuckooHashing1.insertKey2HashTable(5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5158");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.insertKey2HashTable(6);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5159");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        int int4 = hashMapCuckooHashing1.hashFunction2((int) (short) 10);
        int int6 = hashMapCuckooHashing1.hashFunction1(10);
        hashMapCuckooHashing1.insertKey2HashTable(5);
        hashMapCuckooHashing1.displayHashtable();
        int int10 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        double double11 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = hashMapCuckooHashing1.findKeyInTable((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Key 32 not found in table");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.1d + "'", double11 == 0.1d);
    }

    @Test
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5160");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int8 = hashMapCuckooHashing1.hashFunction1((int) (short) 10);
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 1);
        boolean boolean11 = hashMapCuckooHashing1.isFull();
        int int13 = hashMapCuckooHashing1.hashFunction1((int) (byte) 1);
        int int15 = hashMapCuckooHashing1.hashFunction1(5);
        double double16 = hashMapCuckooHashing1.checkLoadFactor();
        double double17 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.05d + "'", double16 == 0.05d);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.05d + "'", double17 == 0.05d);
    }

    @Test
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5161");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isEmpty();
        boolean boolean4 = hashMapCuckooHashing1.isEmpty();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        double double7 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean8 = hashMapCuckooHashing1.isEmpty();
        boolean boolean9 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean11 = hashMapCuckooHashing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5162");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction2((int) '#');
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 10);
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean11 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5163");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey((int) '#');
        boolean boolean10 = hashMapCuckooHashing1.isEmpty();
        boolean boolean12 = hashMapCuckooHashing1.checkTableContainsKey(3);
        boolean boolean13 = hashMapCuckooHashing1.isFull();
        boolean boolean15 = hashMapCuckooHashing1.checkTableContainsKey(0);
        hashMapCuckooHashing1.displayHashtable();
        int int17 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5164");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.insertKey2HashTable((int) (byte) 10);
        boolean boolean10 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5165");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(1);
        boolean boolean2 = hashMapCuckooHashing1.isEmpty();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.insertKey2HashTable((int) (byte) -1);
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 10);
        int int9 = hashMapCuckooHashing1.findKeyInTable((int) (short) 10);
        boolean boolean10 = hashMapCuckooHashing1.isEmpty();
        int int11 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean12 = hashMapCuckooHashing1.isFull();
        boolean boolean14 = hashMapCuckooHashing1.checkTableContainsKey(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5166");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        double double7 = hashMapCuckooHashing1.checkLoadFactor();
        int int9 = hashMapCuckooHashing1.hashFunction2((int) (byte) 1);
        boolean boolean11 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 10);
        int int13 = hashMapCuckooHashing1.hashFunction1(3);
        hashMapCuckooHashing1.insertKey2HashTable(10);
        boolean boolean16 = hashMapCuckooHashing1.isEmpty();
        boolean boolean17 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5167");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int8 = hashMapCuckooHashing1.hashFunction1((int) (short) 10);
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 1);
        boolean boolean11 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean14 = hashMapCuckooHashing1.checkTableContainsKey(0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5168");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction2((int) '#');
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey(0);
        hashMapCuckooHashing1.insertKey2HashTable((int) (byte) 0);
        boolean boolean12 = hashMapCuckooHashing1.isEmpty();
        int int14 = hashMapCuckooHashing1.hashFunction1((int) (short) 100);
        int int15 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int17 = hashMapCuckooHashing1.hashFunction1(79);
        int int19 = hashMapCuckooHashing1.hashFunction2((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5169");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) (short) 1);
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 10);
        double double4 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.insertKey2HashTable(12);
        boolean boolean7 = hashMapCuckooHashing1.isFull();
        int int9 = hashMapCuckooHashing1.hashFunction1(2);
        int int11 = hashMapCuckooHashing1.hashFunction2((-1));
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5170");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int8 = hashMapCuckooHashing1.hashFunction1((int) (short) 10);
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 1);
        boolean boolean11 = hashMapCuckooHashing1.isFull();
        int int13 = hashMapCuckooHashing1.hashFunction1((int) (byte) 1);
        int int15 = hashMapCuckooHashing1.hashFunction1(5);
        int int16 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int17 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5171");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double3 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean4 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = hashMapCuckooHashing1.hashFunction1((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5172");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean4 = hashMapCuckooHashing1.isFull();
        int int6 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean8 = hashMapCuckooHashing1.isEmpty();
        int int9 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int10 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double12 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5173");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int8 = hashMapCuckooHashing1.hashFunction1((int) (short) 10);
        int int10 = hashMapCuckooHashing1.hashFunction1((int) (byte) 100);
        boolean boolean11 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int13 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5174");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction2((int) '#');
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean8 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 100);
        int int10 = hashMapCuckooHashing1.hashFunction1(3);
        int int11 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int13 = hashMapCuckooHashing1.hashFunction2(9);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.displayHashtable();
        int int16 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int17 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5175");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) ' ');
        hashMapCuckooHashing1.insertKey2HashTable(0);
        boolean boolean4 = hashMapCuckooHashing1.isEmpty();
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        boolean boolean7 = hashMapCuckooHashing1.checkTableContainsKey((-1));
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean9 = hashMapCuckooHashing1.isFull();
        boolean boolean10 = hashMapCuckooHashing1.isEmpty();
        boolean boolean11 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5176");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction1(1);
        int int8 = hashMapCuckooHashing1.hashFunction2((int) '#');
        boolean boolean9 = hashMapCuckooHashing1.isFull();
        boolean boolean10 = hashMapCuckooHashing1.isFull();
        boolean boolean12 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) -1);
        boolean boolean13 = hashMapCuckooHashing1.isFull();
        boolean boolean15 = hashMapCuckooHashing1.checkTableContainsKey(1);
        int int17 = hashMapCuckooHashing1.hashFunction1((int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5177");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        int int5 = hashMapCuckooHashing1.hashFunction2(100);
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int8 = hashMapCuckooHashing1.hashFunction2((int) (short) 1);
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 100);
        hashMapCuckooHashing1.displayHashtable();
        int int13 = hashMapCuckooHashing1.hashFunction1(100);
        boolean boolean14 = hashMapCuckooHashing1.isFull();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5178");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean6 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 1);
        boolean boolean8 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 1);
        hashMapCuckooHashing1.displayHashtable();
        int int10 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int11 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean13 = hashMapCuckooHashing1.checkTableContainsKey(99);
        int int14 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5179");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean4 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.insertKey2HashTable(69);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test5180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5180");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.insertKey2HashTable((-1));
        int int10 = hashMapCuckooHashing1.hashFunction1((int) '4');
        int int12 = hashMapCuckooHashing1.hashFunction2((int) (byte) 10);
        boolean boolean13 = hashMapCuckooHashing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5181");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        int int7 = hashMapCuckooHashing1.hashFunction2((-1));
        int int9 = hashMapCuckooHashing1.hashFunction2((int) (short) 1);
        int int11 = hashMapCuckooHashing1.hashFunction1((int) (byte) 0);
        boolean boolean12 = hashMapCuckooHashing1.isFull();
        int int14 = hashMapCuckooHashing1.hashFunction1(69);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
    }

    @Test
    public void test5182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5182");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(1);
        boolean boolean2 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 0);
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean8 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 1);
        int int10 = hashMapCuckooHashing1.hashFunction1((int) (short) 0);
        double double11 = hashMapCuckooHashing1.checkLoadFactor();
        int int13 = hashMapCuckooHashing1.hashFunction2(30);
        hashMapCuckooHashing1.insertKey2HashTable(5);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5d + "'", double11 == 0.5d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test5183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5183");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        int int5 = hashMapCuckooHashing1.hashFunction2(100);
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean7 = hashMapCuckooHashing1.isFull();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        boolean boolean11 = hashMapCuckooHashing1.checkTableContainsKey(3);
        boolean boolean12 = hashMapCuckooHashing1.isFull();
        double double13 = hashMapCuckooHashing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test5184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5184");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) (byte) 1);
        int int3 = hashMapCuckooHashing1.hashFunction2(5);
        boolean boolean4 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.insertKey2HashTable(2);
        int int8 = hashMapCuckooHashing1.hashFunction1(2);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int11 = hashMapCuckooHashing1.hashFunction2(20);
        int int13 = hashMapCuckooHashing1.hashFunction1(2);
        double double14 = hashMapCuckooHashing1.checkLoadFactor();
        double double15 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean17 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.25d + "'", double14 == 0.25d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.25d + "'", double15 == 0.25d);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5185");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.insertKey2HashTable((int) (byte) 0);
        int int8 = hashMapCuckooHashing1.hashFunction1((int) (byte) -1);
        int int10 = hashMapCuckooHashing1.hashFunction1((int) (short) 1);
        boolean boolean11 = hashMapCuckooHashing1.isFull();
        int int13 = hashMapCuckooHashing1.hashFunction2((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 19 + "'", int8 == 19);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5186");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean4 = hashMapCuckooHashing1.checkTableContainsKey((int) '4');
        int int6 = hashMapCuckooHashing1.hashFunction1(1);
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int8 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        java.lang.Class<?> wildcardClass10 = hashMapCuckooHashing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5187");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean8 = hashMapCuckooHashing1.checkTableContainsKey((-1));
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 100);
        hashMapCuckooHashing1.insertKey2HashTable(30);
        double double13 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean15 = hashMapCuckooHashing1.checkTableContainsKey(29);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.1d + "'", double13 == 0.1d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5188");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        int int4 = hashMapCuckooHashing1.hashFunction2((int) (short) 10);
        int int6 = hashMapCuckooHashing1.hashFunction1(10);
        hashMapCuckooHashing1.insertKey2HashTable(5);
        boolean boolean9 = hashMapCuckooHashing1.isFull();
        boolean boolean11 = hashMapCuckooHashing1.checkTableContainsKey(2);
        hashMapCuckooHashing1.insertKey2HashTable(3);
        hashMapCuckooHashing1.insertKey2HashTable(7);
        hashMapCuckooHashing1.insertKey2HashTable(12);
        boolean boolean18 = hashMapCuckooHashing1.isFull();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5189");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) (short) 10);
        boolean boolean2 = hashMapCuckooHashing1.isEmpty();
        double double3 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.insertKey2HashTable(0);
        int int7 = hashMapCuckooHashing1.hashFunction1(36);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 6 + "'", int7 == 6);
    }

    @Test
    public void test5190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5190");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        int int7 = hashMapCuckooHashing1.hashFunction2((-1));
        int int9 = hashMapCuckooHashing1.hashFunction2((int) (short) 1);
        int int11 = hashMapCuckooHashing1.hashFunction1((int) (byte) 0);
        boolean boolean12 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.insertKey2HashTable((int) (byte) 10);
        int int16 = hashMapCuckooHashing1.hashFunction2((int) ' ');
        boolean boolean18 = hashMapCuckooHashing1.checkTableContainsKey(36);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5191");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        boolean boolean6 = hashMapCuckooHashing1.checkTableContainsKey(12);
        boolean boolean7 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 100);
        java.lang.Class<?> wildcardClass10 = hashMapCuckooHashing1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5192");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean6 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 1);
        boolean boolean8 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 1);
        hashMapCuckooHashing1.displayHashtable();
        int int10 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.insertKey2HashTable(30);
        boolean boolean13 = hashMapCuckooHashing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5193");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) (short) 1);
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 10);
        double double4 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.insertKey2HashTable(12);
        hashMapCuckooHashing1.insertKey2HashTable(5);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean11 = hashMapCuckooHashing1.isEmpty();
        double double12 = hashMapCuckooHashing1.checkLoadFactor();
        int int14 = hashMapCuckooHashing1.findKeyInTable(12);
        hashMapCuckooHashing1.insertKey2HashTable(79);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.09375d + "'", double12 == 0.09375d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 12 + "'", int14 == 12);
    }

    @Test
    public void test5194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5194");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean4 = hashMapCuckooHashing1.isFull();
        int int6 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.displayHashtable();
        int int9 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean10 = hashMapCuckooHashing1.isFull();
        boolean boolean11 = hashMapCuckooHashing1.isEmpty();
        int int12 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean13 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5195");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) -1);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean11 = hashMapCuckooHashing1.checkTableContainsKey((int) '#');
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean13 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.insertKey2HashTable(29);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5196");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int3 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int5 = hashMapCuckooHashing1.hashFunction1((int) (short) 10);
        boolean boolean7 = hashMapCuckooHashing1.checkTableContainsKey((-1));
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey(1);
        boolean boolean11 = hashMapCuckooHashing1.checkTableContainsKey((int) ' ');
        double double12 = hashMapCuckooHashing1.checkLoadFactor();
        double double13 = hashMapCuckooHashing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test5197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5197");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        int int4 = hashMapCuckooHashing1.hashFunction2((int) (short) 10);
        int int6 = hashMapCuckooHashing1.hashFunction2((int) (short) 10);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.insertKey2HashTable((int) '#');
        int int11 = hashMapCuckooHashing1.hashFunction2((int) '#');
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 0);
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        int int17 = hashMapCuckooHashing1.hashFunction1((int) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test5198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5198");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.insertKey2HashTable(5);
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean8 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 1);
        hashMapCuckooHashing1.insertKey2HashTable((int) (byte) 0);
        int int11 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        java.lang.Class<?> wildcardClass12 = hashMapCuckooHashing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5199");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean3 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 0);
        double double4 = hashMapCuckooHashing1.checkLoadFactor();
        double double5 = hashMapCuckooHashing1.checkLoadFactor();
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.displayHashtable();
        double double9 = hashMapCuckooHashing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test5200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5200");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int7 = hashMapCuckooHashing1.hashFunction2((int) (byte) 1);
        hashMapCuckooHashing1.displayHashtable();
        int int10 = hashMapCuckooHashing1.hashFunction2((int) (byte) 100);
        boolean boolean11 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.insertKey2HashTable((int) (byte) 100);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int15 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean17 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5201");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 0);
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int10 = hashMapCuckooHashing1.hashFunction1(5);
        int int12 = hashMapCuckooHashing1.hashFunction1(0);
        boolean boolean13 = hashMapCuckooHashing1.isFull();
        int int14 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test5202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5202");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        int int4 = hashMapCuckooHashing1.hashFunction2((int) (short) 10);
        int int6 = hashMapCuckooHashing1.hashFunction2((int) (short) 10);
        double double7 = hashMapCuckooHashing1.checkLoadFactor();
        double double8 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5203");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) (byte) 1);
        boolean boolean3 = hashMapCuckooHashing1.checkTableContainsKey((-1));
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int6 = hashMapCuckooHashing1.hashFunction2((int) '4');
        boolean boolean8 = hashMapCuckooHashing1.checkTableContainsKey(8);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5204");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey((int) '#');
        boolean boolean10 = hashMapCuckooHashing1.isEmpty();
        boolean boolean12 = hashMapCuckooHashing1.checkTableContainsKey(3);
        boolean boolean13 = hashMapCuckooHashing1.isFull();
        boolean boolean15 = hashMapCuckooHashing1.checkTableContainsKey(0);
        double double16 = hashMapCuckooHashing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test5205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5205");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        double double4 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        double double7 = hashMapCuckooHashing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test5206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5206");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) (short) 1);
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 10);
        double double4 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.insertKey2HashTable(12);
        hashMapCuckooHashing1.insertKey2HashTable(5);
        hashMapCuckooHashing1.insertKey2HashTable((int) '4');
        int int11 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean13 = hashMapCuckooHashing1.checkTableContainsKey(2);
        int int14 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.insertKey2HashTable(7);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
    }

    @Test
    public void test5207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5207");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        int int4 = hashMapCuckooHashing1.hashFunction2((int) (short) 10);
        int int6 = hashMapCuckooHashing1.hashFunction1(10);
        double double7 = hashMapCuckooHashing1.checkLoadFactor();
        int int9 = hashMapCuckooHashing1.hashFunction2((int) (byte) -1);
        boolean boolean10 = hashMapCuckooHashing1.isFull();
        int int12 = hashMapCuckooHashing1.hashFunction2((int) (short) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5208");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) (short) 1);
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 10);
        double double4 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.insertKey2HashTable(12);
        hashMapCuckooHashing1.insertKey2HashTable(5);
        hashMapCuckooHashing1.insertKey2HashTable((int) '4');
        int int11 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean13 = hashMapCuckooHashing1.checkTableContainsKey(2);
        int int14 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int16 = hashMapCuckooHashing1.hashFunction2((-1));
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test5209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5209");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) (short) 1);
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 10);
        double double4 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.insertKey2HashTable(12);
        hashMapCuckooHashing1.insertKey2HashTable(5);
        int int10 = hashMapCuckooHashing1.hashFunction2(9);
        double double11 = hashMapCuckooHashing1.checkLoadFactor();
        int int12 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        double double13 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean14 = hashMapCuckooHashing1.isFull();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.375d + "'", double11 == 0.375d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.375d + "'", double13 == 0.375d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5210");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean4 = hashMapCuckooHashing1.isFull();
        int int6 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean8 = hashMapCuckooHashing1.isEmpty();
        int int9 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5211");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isEmpty();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean6 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey(7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test5212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5212");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.insertKey2HashTable((int) (byte) 10);
        boolean boolean11 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 10);
        hashMapCuckooHashing1.deleteKeyFromHashTable((int) (byte) 10);
        boolean boolean14 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5213");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(1);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean4 = hashMapCuckooHashing1.checkTableContainsKey(3);
        double double5 = hashMapCuckooHashing1.checkLoadFactor();
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        double double7 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.insertKey2HashTable(9);
        boolean boolean10 = hashMapCuckooHashing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5214");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) -1);
        hashMapCuckooHashing1.insertKey2HashTable(0);
        boolean boolean11 = hashMapCuckooHashing1.isEmpty();
        int int13 = hashMapCuckooHashing1.hashFunction1(0);
        boolean boolean14 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5215");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double4 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        int int8 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean9 = hashMapCuckooHashing1.isEmpty();
        boolean boolean10 = hashMapCuckooHashing1.isFull();
        int int11 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        double double12 = hashMapCuckooHashing1.checkLoadFactor();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
    }

    @Test
    public void test5216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5216");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isEmpty();
        boolean boolean4 = hashMapCuckooHashing1.isEmpty();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        double double7 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean8 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean11 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5217");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) '4');
        int int3 = hashMapCuckooHashing1.hashFunction2(12);
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) 'a');
        int int7 = hashMapCuckooHashing1.hashFunction1((int) (byte) 0);
        int int8 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        double double9 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.insertKey2HashTable((int) ' ');
        boolean boolean13 = hashMapCuckooHashing1.checkTableContainsKey(2);
        hashMapCuckooHashing1.insertKey2HashTable(10);
        boolean boolean17 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) -1);
        java.lang.Class<?> wildcardClass18 = hashMapCuckooHashing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5218");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean4 = hashMapCuckooHashing1.checkTableContainsKey(10);
        int int6 = hashMapCuckooHashing1.hashFunction1(17);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 7 + "'", int6 == 7);
    }

    @Test
    public void test5219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5219");
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
        // The following exception was thrown during execution in test generation
        try {
            int int17 = hashMapCuckooHashing1.findKeyInTable((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Key 10 not found in table");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5220");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean4 = hashMapCuckooHashing1.checkTableContainsKey((int) '4');
        double double5 = hashMapCuckooHashing1.checkLoadFactor();
        int int7 = hashMapCuckooHashing1.hashFunction1(12);
        hashMapCuckooHashing1.displayHashtable();
        int int10 = hashMapCuckooHashing1.hashFunction2((-1));
        int int12 = hashMapCuckooHashing1.hashFunction2(8);
        boolean boolean13 = hashMapCuckooHashing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5221");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean3 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 0);
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        double double7 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean8 = hashMapCuckooHashing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5222");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int3 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int5 = hashMapCuckooHashing1.hashFunction1((int) (short) 10);
        boolean boolean7 = hashMapCuckooHashing1.checkTableContainsKey((-1));
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey(1);
        boolean boolean11 = hashMapCuckooHashing1.checkTableContainsKey((int) ' ');
        boolean boolean12 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5223");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int3 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int5 = hashMapCuckooHashing1.hashFunction1((int) (short) 10);
        boolean boolean7 = hashMapCuckooHashing1.checkTableContainsKey((-1));
        int int9 = hashMapCuckooHashing1.hashFunction2(20);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test5224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5224");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int3 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 0);
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int8 = hashMapCuckooHashing1.hashFunction1((int) (byte) -1);
        hashMapCuckooHashing1.insertKey2HashTable((int) (byte) 10);
        boolean boolean11 = hashMapCuckooHashing1.isFull();
        boolean boolean12 = hashMapCuckooHashing1.isEmpty();
        boolean boolean14 = hashMapCuckooHashing1.checkTableContainsKey((int) '4');
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.insertKey2HashTable((int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5225");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(4);
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Key 97 already inside, no duplicates allowed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5226");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int3 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 0);
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int8 = hashMapCuckooHashing1.hashFunction1((int) (byte) -1);
        hashMapCuckooHashing1.insertKey2HashTable((int) (byte) 10);
        boolean boolean11 = hashMapCuckooHashing1.isFull();
        boolean boolean12 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.insertKey2HashTable((int) (byte) 100);
        hashMapCuckooHashing1.insertKey2HashTable(4);
        hashMapCuckooHashing1.displayHashtable();
        double double19 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.15d + "'", double19 == 0.15d);
    }

    @Test
    public void test5227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5227");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int3 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 1);
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        boolean boolean8 = hashMapCuckooHashing1.isFull();
        int int10 = hashMapCuckooHashing1.hashFunction2((int) '4');
        double double11 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean12 = hashMapCuckooHashing1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5228");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        double double8 = hashMapCuckooHashing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5229");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean6 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 1);
        boolean boolean8 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 1);
        int int9 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.insertKey2HashTable((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5230");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean6 = hashMapCuckooHashing1.checkTableContainsKey(100);
        int int8 = hashMapCuckooHashing1.hashFunction1(3);
        hashMapCuckooHashing1.insertKey2HashTable((int) 'a');
        int int12 = hashMapCuckooHashing1.hashFunction2(39);
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable(36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Key 36 already inside, no duplicates allowed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test5231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5231");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction2((int) '#');
        boolean boolean6 = hashMapCuckooHashing1.checkTableContainsKey(2);
        boolean boolean8 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 0);
        boolean boolean9 = hashMapCuckooHashing1.isEmpty();
        double double10 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean11 = hashMapCuckooHashing1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5232");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction2((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction1((int) (short) 1);
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        int int9 = hashMapCuckooHashing1.hashFunction2((int) (short) 100);
        boolean boolean10 = hashMapCuckooHashing1.isFull();
        boolean boolean12 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) -1);
        hashMapCuckooHashing1.insertKey2HashTable(5);
        boolean boolean16 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 100);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5233");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) '4');
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.insertKey2HashTable((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction1((int) (short) 10);
        int int8 = hashMapCuckooHashing1.hashFunction1(100);
        int int10 = hashMapCuckooHashing1.hashFunction1(100);
        hashMapCuckooHashing1.displayHashtable();
        java.lang.Class<?> wildcardClass12 = hashMapCuckooHashing1.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 48 + "'", int10 == 48);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5234");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction2((int) '#');
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey(0);
        int int11 = hashMapCuckooHashing1.hashFunction1((int) (short) -1);
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean14 = hashMapCuckooHashing1.checkTableContainsKey(2);
        hashMapCuckooHashing1.insertKey2HashTable(16);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5235");
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
        boolean boolean17 = hashMapCuckooHashing1.isFull();
        boolean boolean19 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 0);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5236");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.displayHashtable();
        int int8 = hashMapCuckooHashing1.hashFunction1(5);
        hashMapCuckooHashing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
    }

    @Test
    public void test5237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5237");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        int int8 = hashMapCuckooHashing1.hashFunction2(3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5238");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) '4');
        int int3 = hashMapCuckooHashing1.hashFunction2(12);
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) 'a');
        int int7 = hashMapCuckooHashing1.hashFunction1((int) (byte) 0);
        int int8 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        double double9 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean10 = hashMapCuckooHashing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5239");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(1);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double3 = hashMapCuckooHashing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
    }

    @Test
    public void test5240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5240");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        int int9 = hashMapCuckooHashing1.hashFunction2((int) (short) 1);
        int int10 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean11 = hashMapCuckooHashing1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = hashMapCuckooHashing1.findKeyInTable(69);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5241");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) (short) 1);
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 10);
        double double4 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.insertKey2HashTable(12);
        hashMapCuckooHashing1.insertKey2HashTable(5);
        int int10 = hashMapCuckooHashing1.hashFunction2(9);
        double double11 = hashMapCuckooHashing1.checkLoadFactor();
        int int12 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean13 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double16 = hashMapCuckooHashing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.375d + "'", double11 == 0.375d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.09375d + "'", double16 == 0.09375d);
    }

    @Test
    public void test5242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5242");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction2((int) '#');
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey((int) ' ');
        boolean boolean10 = hashMapCuckooHashing1.isEmpty();
        boolean boolean11 = hashMapCuckooHashing1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5243");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isEmpty();
        boolean boolean4 = hashMapCuckooHashing1.isEmpty();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey(8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5244");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.insertKey2HashTable((int) (byte) 1);
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean12 = hashMapCuckooHashing1.checkTableContainsKey(5);
        int int14 = hashMapCuckooHashing1.hashFunction1(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test5245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5245");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.insertKey2HashTable((int) ' ');
        double double9 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean11 = hashMapCuckooHashing1.checkTableContainsKey(1);
        int int12 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        double double13 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean15 = hashMapCuckooHashing1.checkTableContainsKey(30);
        int int17 = hashMapCuckooHashing1.hashFunction1((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.1d + "'", double9 == 0.1d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.1d + "'", double13 == 0.1d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test5246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5246");
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
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 100);
        hashMapCuckooHashing1.displayHashtable();
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
    }

    @Test
    public void test5247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5247");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        double double4 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        int int7 = hashMapCuckooHashing1.hashFunction1((-1));
        boolean boolean8 = hashMapCuckooHashing1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = hashMapCuckooHashing1.findKeyInTable((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5248");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean7 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 1);
        boolean boolean8 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        int int11 = hashMapCuckooHashing1.hashFunction2((int) (short) 100);
        int int13 = hashMapCuckooHashing1.hashFunction2(9);
        int int14 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5249");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.insertKey2HashTable((int) (byte) 0);
        int int8 = hashMapCuckooHashing1.hashFunction1((int) (byte) -1);
        boolean boolean9 = hashMapCuckooHashing1.isFull();
        java.lang.Class<?> wildcardClass10 = hashMapCuckooHashing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 19 + "'", int8 == 19);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5250");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction2((int) '#');
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean8 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean10 = hashMapCuckooHashing1.isFull();
        int int11 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean13 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 0);
        int int14 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        double double15 = hashMapCuckooHashing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test5251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5251");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 100);
        int int11 = hashMapCuckooHashing1.hashFunction2(19);
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 0);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int15 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean16 = hashMapCuckooHashing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5252");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean4 = hashMapCuckooHashing1.isEmpty();
        int int5 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        double double7 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean8 = hashMapCuckooHashing1.isFull();
        double double9 = hashMapCuckooHashing1.checkLoadFactor();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = hashMapCuckooHashing1.hashFunction1(6);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test5253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5253");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean7 = hashMapCuckooHashing1.isFull();
        int int9 = hashMapCuckooHashing1.hashFunction2(3);
        boolean boolean11 = hashMapCuckooHashing1.checkTableContainsKey(1);
        int int13 = hashMapCuckooHashing1.hashFunction1(30);
        int int15 = hashMapCuckooHashing1.hashFunction1(19);
        int int16 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int18 = hashMapCuckooHashing1.hashFunction2(5);
        int int19 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test5254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5254");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        boolean boolean7 = hashMapCuckooHashing1.checkTableContainsKey((-1));
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable(9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test5255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5255");
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
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test5256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5256");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) '#');
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        int int4 = hashMapCuckooHashing1.hashFunction1(7);
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        boolean boolean6 = hashMapCuckooHashing1.isEmpty();
        int int8 = hashMapCuckooHashing1.hashFunction1(17);
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable(48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 17 + "'", int8 == 17);
    }

    @Test
    public void test5257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5257");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        boolean boolean7 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 10);
        hashMapCuckooHashing1.insertKey2HashTable(100);
        boolean boolean11 = hashMapCuckooHashing1.checkTableContainsKey((int) ' ');
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int14 = hashMapCuckooHashing1.hashFunction1(39);
        int int16 = hashMapCuckooHashing1.hashFunction2(8);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 19 + "'", int14 == 19);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test5258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5258");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean3 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 0);
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        int int9 = hashMapCuckooHashing1.hashFunction1(4);
        boolean boolean10 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.insertKey2HashTable((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test5259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5259");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(1);
        boolean boolean2 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 0);
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean8 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 1);
        int int10 = hashMapCuckooHashing1.hashFunction1((int) (short) 0);
        double double11 = hashMapCuckooHashing1.checkLoadFactor();
        java.lang.Class<?> wildcardClass12 = hashMapCuckooHashing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.5d + "'", double11 == 0.5d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5260");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(19);
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.insertKey2HashTable(4);
        hashMapCuckooHashing1.displayHashtable();
    }

    @Test
    public void test5261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5261");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction2((int) '#');
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        int int8 = hashMapCuckooHashing1.hashFunction1((int) (byte) 10);
        int int9 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        double double10 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean11 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.insertKey2HashTable(30);
        java.lang.Class<?> wildcardClass14 = hashMapCuckooHashing1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5262");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        boolean boolean8 = hashMapCuckooHashing1.isEmpty();
        int int10 = hashMapCuckooHashing1.hashFunction2((int) 'a');
        int int11 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean12 = hashMapCuckooHashing1.isFull();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5263");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(19);
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5264");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey((int) '#');
        boolean boolean10 = hashMapCuckooHashing1.isEmpty();
        boolean boolean12 = hashMapCuckooHashing1.checkTableContainsKey(3);
        boolean boolean13 = hashMapCuckooHashing1.isFull();
        boolean boolean15 = hashMapCuckooHashing1.checkTableContainsKey(0);
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean17 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test5265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5265");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) ' ');
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1(1);
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean6 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.insertKey2HashTable(6);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test5266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5266");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double3 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean4 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.displayHashtable();
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.insertKey2HashTable(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test5267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5267");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction2((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction1((int) (short) 1);
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int10 = hashMapCuckooHashing1.hashFunction1(39);
        boolean boolean12 = hashMapCuckooHashing1.checkTableContainsKey(29);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 19 + "'", int10 == 19);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5268");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction2((int) '#');
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 10);
        boolean boolean10 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5269");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction2((int) '#');
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey(0);
        double double10 = hashMapCuckooHashing1.checkLoadFactor();
        int int11 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int13 = hashMapCuckooHashing1.hashFunction1((int) (short) 100);
        int int14 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5270");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.insertKey2HashTable(2);
        int int10 = hashMapCuckooHashing1.hashFunction2(4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5271");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        hashMapCuckooHashing1.displayHashtable();
        int int8 = hashMapCuckooHashing1.hashFunction2((int) (short) 1);
        hashMapCuckooHashing1.displayHashtable();
        double double10 = hashMapCuckooHashing1.checkLoadFactor();
        int int12 = hashMapCuckooHashing1.hashFunction2((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable((int) (byte) 0);
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
    }

    @Test
    public void test5272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5272");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) (byte) 1);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        int int3 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean6 = hashMapCuckooHashing1.checkTableContainsKey(10);
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        int int8 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5273");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        int int5 = hashMapCuckooHashing1.hashFunction2(100);
        hashMapCuckooHashing1.displayHashtable();
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5274");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean3 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 0);
        double double4 = hashMapCuckooHashing1.checkLoadFactor();
        int int5 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean7 = hashMapCuckooHashing1.isFull();
        int int9 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = hashMapCuckooHashing1.findKeyInTable(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Key 2 not found in table");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
    }

    @Test
    public void test5275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5275");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 0);
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        int int9 = hashMapCuckooHashing1.hashFunction1((int) (byte) 1);
        boolean boolean10 = hashMapCuckooHashing1.isFull();
        int int12 = hashMapCuckooHashing1.findKeyInTable((int) (short) 0);
        int int14 = hashMapCuckooHashing1.hashFunction1(10);
        hashMapCuckooHashing1.displayHashtable();
        int int17 = hashMapCuckooHashing1.hashFunction2(12);
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.insertKey2HashTable(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Key already inside, no duplicates allowed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test5276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5276");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean4 = hashMapCuckooHashing1.checkTableContainsKey((int) '4');
        int int6 = hashMapCuckooHashing1.hashFunction1(1);
        hashMapCuckooHashing1.insertKey2HashTable(5);
        int int10 = hashMapCuckooHashing1.hashFunction1(69);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
    }

    @Test
    public void test5277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5277");
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5278");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.insertKey2HashTable(17);
        boolean boolean9 = hashMapCuckooHashing1.isEmpty();
        boolean boolean10 = hashMapCuckooHashing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5279");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int3 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 0);
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int8 = hashMapCuckooHashing1.hashFunction1((int) (byte) -1);
        hashMapCuckooHashing1.insertKey2HashTable((int) (byte) 10);
        boolean boolean11 = hashMapCuckooHashing1.isFull();
        boolean boolean12 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.insertKey2HashTable((int) (byte) 100);
        boolean boolean16 = hashMapCuckooHashing1.isFull();
        boolean boolean17 = hashMapCuckooHashing1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5280");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(5);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean4 = hashMapCuckooHashing1.isEmpty();
        int int6 = hashMapCuckooHashing1.hashFunction1((int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test5281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5281");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) ' ');
        hashMapCuckooHashing1.insertKey2HashTable(0);
        boolean boolean4 = hashMapCuckooHashing1.isEmpty();
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        boolean boolean6 = hashMapCuckooHashing1.isEmpty();
        boolean boolean7 = hashMapCuckooHashing1.isFull();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 0);
        int int11 = hashMapCuckooHashing1.hashFunction2(12);
        double double12 = hashMapCuckooHashing1.checkLoadFactor();
        int int14 = hashMapCuckooHashing1.hashFunction1((int) 'a');
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.03125d + "'", double12 == 0.03125d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test5282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5282");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        int int4 = hashMapCuckooHashing1.hashFunction2((int) (short) 10);
        int int6 = hashMapCuckooHashing1.hashFunction1(10);
        int int8 = hashMapCuckooHashing1.hashFunction1((int) '4');
        int int10 = hashMapCuckooHashing1.hashFunction2(0);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5283");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) (short) 1);
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 10);
        hashMapCuckooHashing1.insertKey2HashTable((int) (byte) 1);
        int int7 = hashMapCuckooHashing1.hashFunction2(20);
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5284");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean4 = hashMapCuckooHashing1.isFull();
        int int6 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int8 = hashMapCuckooHashing1.hashFunction1((int) (short) 1);
        int int10 = hashMapCuckooHashing1.hashFunction1(5);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
    }

    @Test
    public void test5285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5285");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 0);
        int int8 = hashMapCuckooHashing1.hashFunction2((int) (byte) 1);
        int int10 = hashMapCuckooHashing1.hashFunction1((int) (short) 0);
        int int12 = hashMapCuckooHashing1.hashFunction2(3);
        java.lang.Class<?> wildcardClass13 = hashMapCuckooHashing1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5286");
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
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test5287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5287");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        int int4 = hashMapCuckooHashing1.hashFunction2((int) (short) 10);
        int int6 = hashMapCuckooHashing1.hashFunction1(10);
        hashMapCuckooHashing1.insertKey2HashTable(5);
        boolean boolean9 = hashMapCuckooHashing1.isFull();
        boolean boolean11 = hashMapCuckooHashing1.checkTableContainsKey(2);
        double double12 = hashMapCuckooHashing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.1d + "'", double12 == 0.1d);
    }

    @Test
    public void test5288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5288");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int3 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double5 = hashMapCuckooHashing1.checkLoadFactor();
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean8 = hashMapCuckooHashing1.checkTableContainsKey((-1));
        boolean boolean10 = hashMapCuckooHashing1.checkTableContainsKey(17);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5289");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction1(1);
        int int8 = hashMapCuckooHashing1.hashFunction2((int) '#');
        boolean boolean9 = hashMapCuckooHashing1.isFull();
        boolean boolean10 = hashMapCuckooHashing1.isFull();
        boolean boolean12 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) -1);
        int int14 = hashMapCuckooHashing1.hashFunction1(99);
        boolean boolean15 = hashMapCuckooHashing1.isEmpty();
        double double16 = hashMapCuckooHashing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test5290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5290");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int8 = hashMapCuckooHashing1.hashFunction1((int) (short) 10);
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 1);
        int int12 = hashMapCuckooHashing1.hashFunction1(3);
        double double13 = hashMapCuckooHashing1.checkLoadFactor();
        int int14 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int15 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.05d + "'", double13 == 0.05d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test5291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5291");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) (byte) 0);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        double double3 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5292");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        boolean boolean6 = hashMapCuckooHashing1.isEmpty();
        double double7 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean8 = hashMapCuckooHashing1.isFull();
        java.lang.Class<?> wildcardClass9 = hashMapCuckooHashing1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5293");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) (byte) 0);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean3 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int5 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean7 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double9 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test5294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5294");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        int int5 = hashMapCuckooHashing1.hashFunction2(100);
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean7 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        int int10 = hashMapCuckooHashing1.hashFunction2(9);
        int int11 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        double double12 = hashMapCuckooHashing1.checkLoadFactor();
        int int13 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int15 = hashMapCuckooHashing1.hashFunction2((-1));
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5295");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int3 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int5 = hashMapCuckooHashing1.hashFunction1((int) (short) 10);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test5296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5296");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        boolean boolean8 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.insertKey2HashTable(9);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test5297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5297");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        boolean boolean8 = hashMapCuckooHashing1.isEmpty();
        boolean boolean9 = hashMapCuckooHashing1.isEmpty();
        int int11 = hashMapCuckooHashing1.hashFunction1(3);
        int int13 = hashMapCuckooHashing1.hashFunction2((int) (short) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5298");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction1(1);
        int int8 = hashMapCuckooHashing1.hashFunction2((int) '#');
        boolean boolean9 = hashMapCuckooHashing1.isFull();
        boolean boolean10 = hashMapCuckooHashing1.isFull();
        boolean boolean12 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) -1);
        hashMapCuckooHashing1.insertKey2HashTable((int) ' ');
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = hashMapCuckooHashing1.findKeyInTable(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Key 8 not found in table");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5299");
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
        int int17 = hashMapCuckooHashing1.hashFunction1((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 19 + "'", int17 == 19);
    }

    @Test
    public void test5300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5300");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        double double7 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int10 = hashMapCuckooHashing1.hashFunction1((int) (byte) 100);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.insertKey2HashTable(3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5301");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        int int5 = hashMapCuckooHashing1.hashFunction2(100);
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean7 = hashMapCuckooHashing1.isFull();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        hashMapCuckooHashing1.displayHashtable();
        double double11 = hashMapCuckooHashing1.checkLoadFactor();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = hashMapCuckooHashing1.findKeyInTable((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5302");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) (short) 10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean4 = hashMapCuckooHashing1.isEmpty();
        int int5 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5303");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int3 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 1);
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        boolean boolean8 = hashMapCuckooHashing1.isFull();
        int int10 = hashMapCuckooHashing1.hashFunction2((int) '4');
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int13 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5304");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 0);
        int int8 = hashMapCuckooHashing1.hashFunction2((int) (byte) 1);
        hashMapCuckooHashing1.deleteKeyFromHashTable(0);
        double double11 = hashMapCuckooHashing1.checkLoadFactor();
        double double12 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) -1);
        int int17 = hashMapCuckooHashing1.hashFunction1(7);
        boolean boolean19 = hashMapCuckooHashing1.checkTableContainsKey(69);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 7 + "'", int17 == 7);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5305");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean6 = hashMapCuckooHashing1.checkTableContainsKey(100);
        double double7 = hashMapCuckooHashing1.checkLoadFactor();
        int int9 = hashMapCuckooHashing1.hashFunction1((int) (byte) 100);
        hashMapCuckooHashing1.displayHashtable();
        int int12 = hashMapCuckooHashing1.hashFunction2((int) (short) 0);
        hashMapCuckooHashing1.insertKey2HashTable(30);
        hashMapCuckooHashing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5306");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean7 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 1);
        int int9 = hashMapCuckooHashing1.hashFunction1(12);
        hashMapCuckooHashing1.displayHashtable();
        int int12 = hashMapCuckooHashing1.hashFunction1(6);
        int int14 = hashMapCuckooHashing1.hashFunction2((int) '#');
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 12 + "'", int9 == 12);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test5307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5307");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        int int5 = hashMapCuckooHashing1.hashFunction2(100);
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean7 = hashMapCuckooHashing1.isFull();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        hashMapCuckooHashing1.insertKey2HashTable(12);
        hashMapCuckooHashing1.insertKey2HashTable(3);
        hashMapCuckooHashing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5308");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean4 = hashMapCuckooHashing1.isFull();
        int int6 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        double double8 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean10 = hashMapCuckooHashing1.checkTableContainsKey((int) ' ');
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 10);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.insertKey2HashTable(8);
        int int17 = hashMapCuckooHashing1.hashFunction1(9);
        int int19 = hashMapCuckooHashing1.findKeyInTable(10);
        double double20 = hashMapCuckooHashing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + double20 + "' != '" + 0.1d + "'", double20 == 0.1d);
    }

    @Test
    public void test5309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5309");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean4 = hashMapCuckooHashing1.isFull();
        int int5 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5310");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        int int4 = hashMapCuckooHashing1.hashFunction2((int) (short) 10);
        int int6 = hashMapCuckooHashing1.hashFunction2((int) (short) 10);
        double double7 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test5311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5311");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 0);
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        int int9 = hashMapCuckooHashing1.hashFunction2(12);
        boolean boolean10 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean14 = hashMapCuckooHashing1.isEmpty();
        int int15 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test5312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5312");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction1(1);
        double double7 = hashMapCuckooHashing1.checkLoadFactor();
        int int9 = hashMapCuckooHashing1.hashFunction2((int) '4');
        boolean boolean10 = hashMapCuckooHashing1.isFull();
        int int12 = hashMapCuckooHashing1.hashFunction2(2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5313");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int3 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean6 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test5314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5314");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 0);
        int int8 = hashMapCuckooHashing1.hashFunction2((int) (byte) 1);
        hashMapCuckooHashing1.deleteKeyFromHashTable(0);
        double double11 = hashMapCuckooHashing1.checkLoadFactor();
        int int13 = hashMapCuckooHashing1.hashFunction1((int) (short) -1);
        boolean boolean15 = hashMapCuckooHashing1.checkTableContainsKey(69);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5315");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean3 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 0);
        double double4 = hashMapCuckooHashing1.checkLoadFactor();
        int int6 = hashMapCuckooHashing1.hashFunction1((int) (short) 1);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 10);
        int int11 = hashMapCuckooHashing1.hashFunction2(30);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = hashMapCuckooHashing1.findKeyInTable(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test5316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5316");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean4 = hashMapCuckooHashing1.checkTableContainsKey(10);
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        boolean boolean6 = hashMapCuckooHashing1.isEmpty();
        boolean boolean7 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int9 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        double double10 = hashMapCuckooHashing1.checkLoadFactor();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = hashMapCuckooHashing1.findKeyInTable(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test5317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5317");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = hashMapCuckooHashing1.hashFunction2(7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5318");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean4 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 0);
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        int int7 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int9 = hashMapCuckooHashing1.hashFunction1(2);
        boolean boolean10 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test5319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5319");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) -1);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean11 = hashMapCuckooHashing1.checkTableContainsKey((int) '#');
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int14 = hashMapCuckooHashing1.hashFunction2((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test5320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5320");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean6 = hashMapCuckooHashing1.checkTableContainsKey(100);
        int int8 = hashMapCuckooHashing1.hashFunction1(3);
        hashMapCuckooHashing1.insertKey2HashTable((int) 'a');
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.insertKey2HashTable(0);
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test5321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5321");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 0);
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        int int9 = hashMapCuckooHashing1.hashFunction2(12);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.insertKey2HashTable((int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test5322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5322");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.insertKey2HashTable((int) (byte) 100);
        boolean boolean8 = hashMapCuckooHashing1.checkTableContainsKey(12);
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5323");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) (short) 1);
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 10);
        double double4 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.insertKey2HashTable(12);
        hashMapCuckooHashing1.insertKey2HashTable(5);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int11 = hashMapCuckooHashing1.hashFunction2(7);
        hashMapCuckooHashing1.insertKey2HashTable(17);
        boolean boolean14 = hashMapCuckooHashing1.isFull();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5324");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        int int4 = hashMapCuckooHashing1.hashFunction2((int) (short) 10);
        hashMapCuckooHashing1.insertKey2HashTable((int) ' ');
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey(0);
        int int11 = hashMapCuckooHashing1.hashFunction1(0);
        boolean boolean12 = hashMapCuckooHashing1.isEmpty();
        int int13 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean14 = hashMapCuckooHashing1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable(15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Key 15 already inside, no duplicates allowed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5325");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(100);
        int int3 = hashMapCuckooHashing1.hashFunction1(0);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test5326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5326");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        int int4 = hashMapCuckooHashing1.hashFunction2((int) (short) 10);
        int int5 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        boolean boolean7 = hashMapCuckooHashing1.isFull();
        double double8 = hashMapCuckooHashing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5327");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean4 = hashMapCuckooHashing1.checkTableContainsKey(10);
        int int6 = hashMapCuckooHashing1.hashFunction1((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = hashMapCuckooHashing1.findKeyInTable(20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5328");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double3 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean4 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int8 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = hashMapCuckooHashing1.checkTableContainsKey(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5329");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double3 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int5 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        double double8 = hashMapCuckooHashing1.checkLoadFactor();
        int int9 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = hashMapCuckooHashing1.hashFunction1(19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5330");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean4 = hashMapCuckooHashing1.checkTableContainsKey(10);
        hashMapCuckooHashing1.insertKey2HashTable(5);
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        int int9 = hashMapCuckooHashing1.hashFunction2((int) 'a');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
    }

    @Test
    public void test5331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5331");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double3 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean4 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        java.lang.Class<?> wildcardClass8 = hashMapCuckooHashing1.getClass();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5332");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.insertKey2HashTable((int) ' ');
        int int10 = hashMapCuckooHashing1.hashFunction2(100);
        int int12 = hashMapCuckooHashing1.hashFunction2(7);
        int int14 = hashMapCuckooHashing1.hashFunction2(9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5333");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean4 = hashMapCuckooHashing1.isFull();
        int int6 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int11 = hashMapCuckooHashing1.hashFunction2(48);
        boolean boolean12 = hashMapCuckooHashing1.isEmpty();
        boolean boolean13 = hashMapCuckooHashing1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = hashMapCuckooHashing1.findKeyInTable((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5334");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 0);
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        int int9 = hashMapCuckooHashing1.hashFunction2(12);
        boolean boolean10 = hashMapCuckooHashing1.isEmpty();
        int int12 = hashMapCuckooHashing1.hashFunction1(100);
        boolean boolean13 = hashMapCuckooHashing1.isEmpty();
        int int15 = hashMapCuckooHashing1.hashFunction2(12);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = hashMapCuckooHashing1.findKeyInTable(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Key 3 not found in table");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test5335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5335");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) (byte) 1);
        boolean boolean3 = hashMapCuckooHashing1.checkTableContainsKey((-1));
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey(0);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.insertKey2HashTable((int) ' ');
        hashMapCuckooHashing1.insertKey2HashTable(7);
        int int11 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        java.lang.Class<?> wildcardClass12 = hashMapCuckooHashing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5336");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean4 = hashMapCuckooHashing1.checkTableContainsKey(10);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int8 = hashMapCuckooHashing1.hashFunction1((int) (short) 0);
        boolean boolean9 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean12 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5337");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double3 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        int int5 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double7 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test5338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5338");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int3 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 0);
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int8 = hashMapCuckooHashing1.hashFunction1((int) (byte) -1);
        hashMapCuckooHashing1.insertKey2HashTable((int) (byte) 10);
        boolean boolean11 = hashMapCuckooHashing1.isFull();
        boolean boolean12 = hashMapCuckooHashing1.isEmpty();
        int int14 = hashMapCuckooHashing1.hashFunction1((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int16 = hashMapCuckooHashing1.findKeyInTable((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Key -1 not found in table");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test5339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5339");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean6 = hashMapCuckooHashing1.checkTableContainsKey(100);
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        java.lang.Class<?> wildcardClass8 = hashMapCuckooHashing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5340");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.insertKey2HashTable((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction1(100);
        double double7 = hashMapCuckooHashing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.1d + "'", double7 == 0.1d);
    }

    @Test
    public void test5341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5341");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        hashMapCuckooHashing1.displayHashtable();
        int int8 = hashMapCuckooHashing1.hashFunction2((int) (short) 1);
        hashMapCuckooHashing1.displayHashtable();
        double double10 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean12 = hashMapCuckooHashing1.checkTableContainsKey(12);
        boolean boolean13 = hashMapCuckooHashing1.isEmpty();
        boolean boolean14 = hashMapCuckooHashing1.isFull();
        boolean boolean16 = hashMapCuckooHashing1.checkTableContainsKey(4);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5342");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isEmpty();
        boolean boolean4 = hashMapCuckooHashing1.isEmpty();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        double double7 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean8 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double11 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean12 = hashMapCuckooHashing1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = hashMapCuckooHashing1.hashFunction2(8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double11));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test5343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5343");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(1);
        int int3 = hashMapCuckooHashing1.hashFunction1((int) 'a');
        boolean boolean4 = hashMapCuckooHashing1.isFull();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        java.lang.Class<?> wildcardClass6 = hashMapCuckooHashing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5344");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int3 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 1);
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        boolean boolean8 = hashMapCuckooHashing1.isFull();
        boolean boolean10 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 0);
        hashMapCuckooHashing1.insertKey2HashTable(0);
        int int14 = hashMapCuckooHashing1.hashFunction2(5);
        int int16 = hashMapCuckooHashing1.hashFunction1(12);
        int int18 = hashMapCuckooHashing1.hashFunction2((int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 5 + "'", int18 == 5);
    }

    @Test
    public void test5345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5345");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) ' ');
        hashMapCuckooHashing1.insertKey2HashTable(0);
        boolean boolean4 = hashMapCuckooHashing1.isEmpty();
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        boolean boolean6 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.displayHashtable();
        int int9 = hashMapCuckooHashing1.hashFunction2(69);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test5346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5346");
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
        int int17 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        double double18 = hashMapCuckooHashing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.2d + "'", double18 == 0.2d);
    }

    @Test
    public void test5347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5347");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean4 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.displayHashtable();
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test5348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5348");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) (byte) 1);
        int int3 = hashMapCuckooHashing1.hashFunction2(5);
        boolean boolean4 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.insertKey2HashTable(2);
        int int8 = hashMapCuckooHashing1.hashFunction1(2);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = hashMapCuckooHashing1.findKeyInTable(16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Key 16 not found in table");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5349");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        int int4 = hashMapCuckooHashing1.hashFunction2((int) (short) 10);
        int int6 = hashMapCuckooHashing1.hashFunction1(10);
        hashMapCuckooHashing1.insertKey2HashTable(5);
        boolean boolean9 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.insertKey2HashTable(12);
        boolean boolean15 = hashMapCuckooHashing1.checkTableContainsKey(9);
        boolean boolean17 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        int int18 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        // The following exception was thrown during execution in test generation
        try {
            int int20 = hashMapCuckooHashing1.findKeyInTable((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Key 52 not found in table");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test5350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5350");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction2((int) '#');
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey((int) 'a');
        boolean boolean10 = hashMapCuckooHashing1.isFull();
        double double11 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.insertKey2HashTable(20);
        hashMapCuckooHashing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5351");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        int int4 = hashMapCuckooHashing1.hashFunction2((int) (short) 10);
        int int6 = hashMapCuckooHashing1.hashFunction1(10);
        hashMapCuckooHashing1.insertKey2HashTable(5);
        hashMapCuckooHashing1.displayHashtable();
        int int10 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean12 = hashMapCuckooHashing1.checkTableContainsKey(1);
        hashMapCuckooHashing1.insertKey2HashTable((int) (byte) -1);
        double double15 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean16 = hashMapCuckooHashing1.isFull();
        int int18 = hashMapCuckooHashing1.hashFunction2(1);
        int int20 = hashMapCuckooHashing1.hashFunction2(7);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.2d + "'", double15 == 0.2d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test5352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5352");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.insertKey2HashTable(0);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int12 = hashMapCuckooHashing1.hashFunction2((int) (byte) -1);
        hashMapCuckooHashing1.deleteKeyFromHashTable((int) (byte) 0);
        boolean boolean16 = hashMapCuckooHashing1.checkTableContainsKey(9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5353");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean7 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 1);
        boolean boolean8 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        int int11 = hashMapCuckooHashing1.hashFunction1((int) (short) 1);
        boolean boolean12 = hashMapCuckooHashing1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5354");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey(1);
        hashMapCuckooHashing1.insertKey2HashTable((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Key 10 already inside, no duplicates allowed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5355");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean7 = hashMapCuckooHashing1.isFull();
        int int9 = hashMapCuckooHashing1.hashFunction1(1);
        int int10 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int12 = hashMapCuckooHashing1.hashFunction1((int) (short) 10);
        boolean boolean14 = hashMapCuckooHashing1.checkTableContainsKey((int) '4');
        hashMapCuckooHashing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5356");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean3 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 0);
        double double4 = hashMapCuckooHashing1.checkLoadFactor();
        int int6 = hashMapCuckooHashing1.hashFunction1((int) (short) 1);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 10);
        int int11 = hashMapCuckooHashing1.hashFunction2(30);
        double double12 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.insertKey2HashTable((int) ' ');
        int int15 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.insertKey2HashTable(8);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test5357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5357");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double3 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean4 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = hashMapCuckooHashing1.findKeyInTable(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test5358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5358");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction2((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction1((int) (short) 1);
        int int8 = hashMapCuckooHashing1.hashFunction1(17);
        double double9 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.insertKey2HashTable((-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test5359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5359");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(1);
        boolean boolean2 = hashMapCuckooHashing1.isEmpty();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.insertKey2HashTable((int) (byte) -1);
        boolean boolean6 = hashMapCuckooHashing1.isEmpty();
        boolean boolean7 = hashMapCuckooHashing1.isFull();
        int int8 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable(36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Key 36 already inside, no duplicates allowed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test5360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5360");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean6 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 1);
        boolean boolean8 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 1);
        int int10 = hashMapCuckooHashing1.hashFunction2(10);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test5361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5361");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        boolean boolean7 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 10);
        hashMapCuckooHashing1.insertKey2HashTable(100);
        boolean boolean11 = hashMapCuckooHashing1.checkTableContainsKey((int) ' ');
        boolean boolean13 = hashMapCuckooHashing1.checkTableContainsKey(79);
        boolean boolean15 = hashMapCuckooHashing1.checkTableContainsKey(0);
        hashMapCuckooHashing1.insertKey2HashTable(3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5362");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.insertKey2HashTable(5);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean7 = hashMapCuckooHashing1.isFull();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey((int) ' ');
        int int11 = hashMapCuckooHashing1.hashFunction2(4);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5363");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction2((int) '#');
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean8 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 100);
        int int10 = hashMapCuckooHashing1.hashFunction1(3);
        int int11 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int13 = hashMapCuckooHashing1.hashFunction2(9);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int15 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean17 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        int int19 = hashMapCuckooHashing1.hashFunction2((int) (short) -1);
        int int20 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean22 = hashMapCuckooHashing1.checkTableContainsKey(7);
        int int24 = hashMapCuckooHashing1.hashFunction2(4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test5364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5364");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 0);
        int int8 = hashMapCuckooHashing1.hashFunction2((int) (byte) 1);
        int int10 = hashMapCuckooHashing1.hashFunction1((int) (short) 0);
        int int11 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean13 = hashMapCuckooHashing1.isEmpty();
        int int15 = hashMapCuckooHashing1.hashFunction1((int) (short) 10);
        hashMapCuckooHashing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
    }

    @Test
    public void test5365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5365");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean4 = hashMapCuckooHashing1.checkTableContainsKey(10);
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        int int7 = hashMapCuckooHashing1.hashFunction1(0);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean9 = hashMapCuckooHashing1.isEmpty();
        boolean boolean11 = hashMapCuckooHashing1.checkTableContainsKey(48);
        boolean boolean12 = hashMapCuckooHashing1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = hashMapCuckooHashing1.findKeyInTable(17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5366");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        boolean boolean2 = hashMapCuckooHashing1.isEmpty();
        int int3 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean4 = hashMapCuckooHashing1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = hashMapCuckooHashing1.hashFunction2((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test5367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5367");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean3 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 0);
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        double double7 = hashMapCuckooHashing1.checkLoadFactor();
        int int8 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        double double9 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean10 = hashMapCuckooHashing1.isEmpty();
        int int11 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.insertKey2HashTable((int) (byte) 1);
        boolean boolean14 = hashMapCuckooHashing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5368");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean4 = hashMapCuckooHashing1.isFull();
        int int6 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean8 = hashMapCuckooHashing1.isEmpty();
        int int10 = hashMapCuckooHashing1.hashFunction2((-1));
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean13 = hashMapCuckooHashing1.checkTableContainsKey(12);
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 10);
        boolean boolean16 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5369");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 0);
        int int8 = hashMapCuckooHashing1.hashFunction2((int) (byte) 1);
        hashMapCuckooHashing1.deleteKeyFromHashTable(0);
        double double11 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5370");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction2((int) '#');
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean8 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 100);
        int int10 = hashMapCuckooHashing1.hashFunction1(3);
        int int11 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int13 = hashMapCuckooHashing1.hashFunction2(9);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.insertKey2HashTable(0);
        boolean boolean17 = hashMapCuckooHashing1.isFull();
        int int19 = hashMapCuckooHashing1.hashFunction1(39);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 39 + "'", int19 == 39);
    }

    @Test
    public void test5371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5371");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        int int8 = hashMapCuckooHashing1.hashFunction1(30);
        int int9 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        double double10 = hashMapCuckooHashing1.checkLoadFactor();
        int int12 = hashMapCuckooHashing1.hashFunction2((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5372");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        int int5 = hashMapCuckooHashing1.hashFunction2(100);
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean7 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean9 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = hashMapCuckooHashing1.findKeyInTable(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5373");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) '#');
        int int3 = hashMapCuckooHashing1.hashFunction2(0);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = hashMapCuckooHashing1.findKeyInTable((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5374");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean8 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test5375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5375");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        double double7 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean9 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5376");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        int int4 = hashMapCuckooHashing1.hashFunction2((int) (short) 10);
        int int6 = hashMapCuckooHashing1.hashFunction1(10);
        hashMapCuckooHashing1.insertKey2HashTable(5);
        hashMapCuckooHashing1.displayHashtable();
        int int10 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean12 = hashMapCuckooHashing1.checkTableContainsKey(1);
        hashMapCuckooHashing1.insertKey2HashTable((int) (byte) -1);
        double double15 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean16 = hashMapCuckooHashing1.isFull();
        int int18 = hashMapCuckooHashing1.hashFunction2(1);
        int int20 = hashMapCuckooHashing1.hashFunction2(7);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean22 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.2d + "'", double15 == 0.2d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test5377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5377");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        int int5 = hashMapCuckooHashing1.hashFunction2(100);
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean7 = hashMapCuckooHashing1.isFull();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        boolean boolean11 = hashMapCuckooHashing1.checkTableContainsKey(3);
        int int12 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        double double13 = hashMapCuckooHashing1.checkLoadFactor();
        double double14 = hashMapCuckooHashing1.checkLoadFactor();
        int int15 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean16 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.insertKey2HashTable(8);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test5378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5378");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int3 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 1);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double7 = hashMapCuckooHashing1.checkLoadFactor();
        int int8 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        double double9 = hashMapCuckooHashing1.checkLoadFactor();
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test5379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5379");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction2((int) '#');
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean8 = hashMapCuckooHashing1.isFull();
        double double9 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean10 = hashMapCuckooHashing1.isFull();
        double double11 = hashMapCuckooHashing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5380");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double3 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int5 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        double double8 = hashMapCuckooHashing1.checkLoadFactor();
        double double9 = hashMapCuckooHashing1.checkLoadFactor();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = hashMapCuckooHashing1.checkTableContainsKey(17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test5381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5381");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(1);
        boolean boolean2 = hashMapCuckooHashing1.isEmpty();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.insertKey2HashTable((int) (byte) -1);
        boolean boolean6 = hashMapCuckooHashing1.isEmpty();
        boolean boolean7 = hashMapCuckooHashing1.isFull();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 1);
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.insertKey2HashTable(5);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5382");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        int int4 = hashMapCuckooHashing1.hashFunction2((int) (short) 10);
        hashMapCuckooHashing1.insertKey2HashTable((int) ' ');
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey(0);
        boolean boolean11 = hashMapCuckooHashing1.checkTableContainsKey(100);
        int int12 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.insertKey2HashTable((int) '4');
        int int16 = hashMapCuckooHashing1.hashFunction1(9);
        hashMapCuckooHashing1.insertKey2HashTable(15);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
    }

    @Test
    public void test5383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5383");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean3 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 0);
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.insertKey2HashTable(0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5384");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        double double8 = hashMapCuckooHashing1.checkLoadFactor();
        int int10 = hashMapCuckooHashing1.hashFunction1(9);
        boolean boolean11 = hashMapCuckooHashing1.isEmpty();
        int int13 = hashMapCuckooHashing1.hashFunction1((int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test5385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5385");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        boolean boolean8 = hashMapCuckooHashing1.isEmpty();
        double double9 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean11 = hashMapCuckooHashing1.isFull();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5386");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean6 = hashMapCuckooHashing1.checkTableContainsKey(100);
        int int8 = hashMapCuckooHashing1.hashFunction1((int) '4');
        boolean boolean10 = hashMapCuckooHashing1.checkTableContainsKey(5);
        boolean boolean12 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 0);
        int int14 = hashMapCuckooHashing1.hashFunction2((int) (short) -1);
        int int15 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean16 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 12 + "'", int8 == 12);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test5387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5387");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int3 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double5 = hashMapCuckooHashing1.checkLoadFactor();
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean8 = hashMapCuckooHashing1.checkTableContainsKey((-1));
        int int10 = hashMapCuckooHashing1.hashFunction2((int) (byte) 0);
        hashMapCuckooHashing1.insertKey2HashTable(48);
        int int13 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test5388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5388");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        int int5 = hashMapCuckooHashing1.hashFunction2(100);
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean7 = hashMapCuckooHashing1.isFull();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey(3);
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5389");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 0);
        int int8 = hashMapCuckooHashing1.hashFunction2((int) (byte) 1);
        boolean boolean9 = hashMapCuckooHashing1.isFull();
        boolean boolean11 = hashMapCuckooHashing1.checkTableContainsKey(0);
        int int13 = hashMapCuckooHashing1.hashFunction2((int) (byte) 10);
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean15 = hashMapCuckooHashing1.isFull();
        int int16 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test5390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5390");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean8 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test5391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5391");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int3 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 1);
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        boolean boolean8 = hashMapCuckooHashing1.isFull();
        int int10 = hashMapCuckooHashing1.hashFunction1(10);
        boolean boolean12 = hashMapCuckooHashing1.checkTableContainsKey((-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5392");
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
        int int18 = hashMapCuckooHashing1.hashFunction1(48);
        boolean boolean19 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 12 + "'", int8 == 12);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5393");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) '4');
        int int3 = hashMapCuckooHashing1.hashFunction2(12);
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) 'a');
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int8 = hashMapCuckooHashing1.hashFunction2(4);
        int int9 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        java.lang.Class<?> wildcardClass10 = hashMapCuckooHashing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5394");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.insertKey2HashTable(5);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double7 = hashMapCuckooHashing1.checkLoadFactor();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = hashMapCuckooHashing1.findKeyInTable((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Key 52 not found in table");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.05d + "'", double7 == 0.05d);
    }

    @Test
    public void test5395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5395");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction2((int) '#');
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean8 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 100);
        int int10 = hashMapCuckooHashing1.hashFunction1(3);
        int int11 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int13 = hashMapCuckooHashing1.hashFunction2(9);
        boolean boolean15 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 100);
        java.lang.Class<?> wildcardClass16 = hashMapCuckooHashing1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5396");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) -1);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean11 = hashMapCuckooHashing1.checkTableContainsKey((int) '#');
        int int13 = hashMapCuckooHashing1.hashFunction2((int) (byte) 1);
        int int15 = hashMapCuckooHashing1.findKeyInTable((int) (byte) -1);
        int int17 = hashMapCuckooHashing1.hashFunction2(69);
        int int19 = hashMapCuckooHashing1.hashFunction1(35);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 39 + "'", int15 == 39);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 35 + "'", int19 == 35);
    }

    @Test
    public void test5397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5397");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey(12);
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean12 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5398");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) '4');
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.insertKey2HashTable((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction1((int) (short) 10);
        double double7 = hashMapCuckooHashing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.019230769230769232d + "'", double7 == 0.019230769230769232d);
    }

    @Test
    public void test5399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5399");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 0);
        int int8 = hashMapCuckooHashing1.hashFunction2((int) (byte) 1);
        int int10 = hashMapCuckooHashing1.hashFunction1((int) (short) 0);
        boolean boolean12 = hashMapCuckooHashing1.checkTableContainsKey(10);
        int int14 = hashMapCuckooHashing1.hashFunction1((int) (byte) -1);
        int int16 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.insertKey2HashTable((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Key already inside, no duplicates allowed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 5 + "'", int16 == 5);
    }

    @Test
    public void test5400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5400");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int3 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double5 = hashMapCuckooHashing1.checkLoadFactor();
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean7 = hashMapCuckooHashing1.isFull();
        int int9 = hashMapCuckooHashing1.hashFunction2(2);
        boolean boolean10 = hashMapCuckooHashing1.isFull();
        int int12 = hashMapCuckooHashing1.hashFunction2(1);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean14 = hashMapCuckooHashing1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5401");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction2((int) '#');
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        int int8 = hashMapCuckooHashing1.hashFunction1((int) (byte) 10);
        int int9 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        double double10 = hashMapCuckooHashing1.checkLoadFactor();
        int int12 = hashMapCuckooHashing1.hashFunction1((int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12 + "'", int12 == 12);
    }

    @Test
    public void test5402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5402");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double3 = hashMapCuckooHashing1.checkLoadFactor();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        double double5 = hashMapCuckooHashing1.checkLoadFactor();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
    }

    @Test
    public void test5403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5403");
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
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int17 = hashMapCuckooHashing1.hashFunction2((int) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test5404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5404");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        int int4 = hashMapCuckooHashing1.hashFunction2((int) (short) 10);
        hashMapCuckooHashing1.insertKey2HashTable((int) ' ');
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey(0);
        int int11 = hashMapCuckooHashing1.hashFunction1(0);
        boolean boolean12 = hashMapCuckooHashing1.isEmpty();
        int int13 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.displayHashtable();
        int int16 = hashMapCuckooHashing1.hashFunction2(36);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test5405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5405");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.insertKey2HashTable((int) ' ');
        double double9 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean11 = hashMapCuckooHashing1.checkTableContainsKey(1);
        int int12 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        double double13 = hashMapCuckooHashing1.checkLoadFactor();
        int int14 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        double double15 = hashMapCuckooHashing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.1d + "'", double9 == 0.1d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.1d + "'", double13 == 0.1d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.1d + "'", double15 == 0.1d);
    }

    @Test
    public void test5406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5406");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction2((int) '#');
        int int8 = hashMapCuckooHashing1.hashFunction2((int) (byte) 100);
        hashMapCuckooHashing1.insertKey2HashTable((int) '#');
        int int12 = hashMapCuckooHashing1.hashFunction2((int) (short) -1);
        int int14 = hashMapCuckooHashing1.hashFunction2(10);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int16 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test5407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5407");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction2((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction1((int) (short) 1);
        hashMapCuckooHashing1.displayHashtable();
        int int9 = hashMapCuckooHashing1.hashFunction2((int) (byte) 1);
        hashMapCuckooHashing1.insertKey2HashTable(99);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5408");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.insertKey2HashTable((int) ' ');
        double double9 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean11 = hashMapCuckooHashing1.checkTableContainsKey(1);
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean13 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.1d + "'", double9 == 0.1d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5409");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) (byte) 1);
        int int3 = hashMapCuckooHashing1.hashFunction2(5);
        int int5 = hashMapCuckooHashing1.hashFunction2(3);
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        int int8 = hashMapCuckooHashing1.hashFunction1((int) (short) -1);
        double double9 = hashMapCuckooHashing1.checkLoadFactor();
        double double10 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean12 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5410");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction2((int) '#');
        int int8 = hashMapCuckooHashing1.hashFunction2((int) (byte) 100);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.displayHashtable();
        int int13 = hashMapCuckooHashing1.hashFunction2(7);
        boolean boolean14 = hashMapCuckooHashing1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5411");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int3 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double5 = hashMapCuckooHashing1.checkLoadFactor();
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean8 = hashMapCuckooHashing1.checkTableContainsKey((int) '4');
        int int10 = hashMapCuckooHashing1.hashFunction2(3);
        hashMapCuckooHashing1.displayHashtable();
        int int12 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5412");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double3 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean4 = hashMapCuckooHashing1.isFull();
        int int6 = hashMapCuckooHashing1.hashFunction1(2);
        boolean boolean8 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 100);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double10 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        java.lang.Class<?> wildcardClass12 = hashMapCuckooHashing1.getClass();
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5413");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean4 = hashMapCuckooHashing1.checkTableContainsKey(10);
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        int int7 = hashMapCuckooHashing1.hashFunction1(0);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double9 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean11 = hashMapCuckooHashing1.checkTableContainsKey(99);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5414");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        double double7 = hashMapCuckooHashing1.checkLoadFactor();
        int int9 = hashMapCuckooHashing1.hashFunction2((int) (byte) 1);
        boolean boolean11 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 10);
        int int13 = hashMapCuckooHashing1.hashFunction1(3);
        boolean boolean15 = hashMapCuckooHashing1.checkTableContainsKey(20);
        double double16 = hashMapCuckooHashing1.checkLoadFactor();
        int int18 = hashMapCuckooHashing1.hashFunction1(19);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
    }

    @Test
    public void test5415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5415");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        int int4 = hashMapCuckooHashing1.hashFunction2((int) (short) 10);
        hashMapCuckooHashing1.insertKey2HashTable((int) ' ');
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey(0);
        int int11 = hashMapCuckooHashing1.hashFunction1(0);
        boolean boolean12 = hashMapCuckooHashing1.isEmpty();
        int int13 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable(9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Key 9 already inside, no duplicates allowed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test5416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5416");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 100);
        boolean boolean10 = hashMapCuckooHashing1.isFull();
        int int11 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        double double12 = hashMapCuckooHashing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5417");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean4 = hashMapCuckooHashing1.checkTableContainsKey(10);
        hashMapCuckooHashing1.insertKey2HashTable(5);
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test5418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5418");
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
        int int15 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean17 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5419");
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
        boolean boolean18 = hashMapCuckooHashing1.checkTableContainsKey(79);
        hashMapCuckooHashing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5420");
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
        double double13 = hashMapCuckooHashing1.checkLoadFactor();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = hashMapCuckooHashing1.findKeyInTable(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test5421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5421");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        boolean boolean8 = hashMapCuckooHashing1.isEmpty();
        int int9 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean10 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test5422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5422");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean9 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.insertKey2HashTable(69);
        java.lang.Class<?> wildcardClass12 = hashMapCuckooHashing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5423");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction2((int) '#');
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean8 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        int int11 = hashMapCuckooHashing1.hashFunction2(9);
        hashMapCuckooHashing1.insertKey2HashTable((-1));
        int int15 = hashMapCuckooHashing1.hashFunction1(17);
        int int16 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int18 = hashMapCuckooHashing1.hashFunction1((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = hashMapCuckooHashing1.findKeyInTable(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Key 1 not found in table");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test5424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5424");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        boolean boolean6 = hashMapCuckooHashing1.isEmpty();
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean8 = hashMapCuckooHashing1.isEmpty();
        boolean boolean9 = hashMapCuckooHashing1.isFull();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5425");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) ' ');
        hashMapCuckooHashing1.insertKey2HashTable(0);
        boolean boolean4 = hashMapCuckooHashing1.isEmpty();
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        boolean boolean6 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.insertKey2HashTable((-1));
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int11 = hashMapCuckooHashing1.hashFunction2(30);
        int int13 = hashMapCuckooHashing1.hashFunction1((int) (byte) 1);
        boolean boolean15 = hashMapCuckooHashing1.checkTableContainsKey(19);
        int int17 = hashMapCuckooHashing1.hashFunction1((int) (short) 100);
        hashMapCuckooHashing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 36 + "'", int17 == 36);
    }

    @Test
    public void test5426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5426");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) (short) 10);
        boolean boolean2 = hashMapCuckooHashing1.isEmpty();
        double double3 = hashMapCuckooHashing1.checkLoadFactor();
        int int5 = hashMapCuckooHashing1.hashFunction1(4);
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        boolean boolean8 = hashMapCuckooHashing1.checkTableContainsKey(8);
        int int10 = hashMapCuckooHashing1.hashFunction1(30);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5427");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) '4');
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.insertKey2HashTable((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction1((int) (short) 10);
        int int8 = hashMapCuckooHashing1.hashFunction1(100);
        int int10 = hashMapCuckooHashing1.hashFunction1(100);
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean12 = hashMapCuckooHashing1.isEmpty();
        boolean boolean13 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 48 + "'", int10 == 48);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5428");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        int int7 = hashMapCuckooHashing1.hashFunction2((-1));
        int int9 = hashMapCuckooHashing1.hashFunction2((int) (short) 1);
        int int11 = hashMapCuckooHashing1.hashFunction2((int) (byte) 100);
        hashMapCuckooHashing1.insertKey2HashTable((-1));
        hashMapCuckooHashing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5429");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 0);
        int int8 = hashMapCuckooHashing1.hashFunction2((int) (byte) 1);
        hashMapCuckooHashing1.deleteKeyFromHashTable(0);
        double double11 = hashMapCuckooHashing1.checkLoadFactor();
        int int13 = hashMapCuckooHashing1.hashFunction1((int) (short) -1);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean16 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 100);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable(79);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5430");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction2((int) '#');
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean8 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 100);
        int int10 = hashMapCuckooHashing1.hashFunction1(3);
        int int11 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int13 = hashMapCuckooHashing1.hashFunction2(9);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int15 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean17 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        int int18 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test5431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5431");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        int int9 = hashMapCuckooHashing1.hashFunction2((int) (byte) 100);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int12 = hashMapCuckooHashing1.hashFunction1(1);
        hashMapCuckooHashing1.insertKey2HashTable(1);
        int int15 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test5432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5432");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) ' ');
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        boolean boolean7 = hashMapCuckooHashing1.checkTableContainsKey(5);
        int int9 = hashMapCuckooHashing1.hashFunction1(48);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 12 + "'", int4 == 12);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
    }

    @Test
    public void test5433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5433");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isEmpty();
        boolean boolean4 = hashMapCuckooHashing1.isEmpty();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.displayHashtable();
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        double double8 = hashMapCuckooHashing1.checkLoadFactor();
        double double9 = hashMapCuckooHashing1.checkLoadFactor();
        int int10 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int11 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        double double12 = hashMapCuckooHashing1.checkLoadFactor();
        double double13 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean15 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double12));
        org.junit.Assert.assertTrue(Double.isNaN(double13));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test5434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5434");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean4 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.insertKey2HashTable(29);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test5435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5435");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        int int4 = hashMapCuckooHashing1.hashFunction2((int) (short) 10);
        int int6 = hashMapCuckooHashing1.hashFunction1(10);
        int int8 = hashMapCuckooHashing1.hashFunction1((int) (short) 1);
        int int10 = hashMapCuckooHashing1.hashFunction1(2);
        int int12 = hashMapCuckooHashing1.hashFunction2(1);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int16 = hashMapCuckooHashing1.hashFunction2((int) (byte) 1);
        double double17 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean18 = hashMapCuckooHashing1.isEmpty();
        boolean boolean20 = hashMapCuckooHashing1.checkTableContainsKey(10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5436");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean6 = hashMapCuckooHashing1.checkTableContainsKey(100);
        int int8 = hashMapCuckooHashing1.hashFunction1(3);
        boolean boolean10 = hashMapCuckooHashing1.checkTableContainsKey(5);
        boolean boolean12 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 0);
        hashMapCuckooHashing1.insertKey2HashTable(48);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5437");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 0);
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        int int9 = hashMapCuckooHashing1.hashFunction1((int) (byte) 1);
        boolean boolean10 = hashMapCuckooHashing1.isFull();
        int int12 = hashMapCuckooHashing1.findKeyInTable((int) (short) 0);
        int int14 = hashMapCuckooHashing1.hashFunction1(10);
        hashMapCuckooHashing1.displayHashtable();
        int int16 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test5438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5438");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction2((int) '#');
        int int8 = hashMapCuckooHashing1.hashFunction2((int) (byte) 100);
        hashMapCuckooHashing1.insertKey2HashTable((int) '#');
        int int12 = hashMapCuckooHashing1.hashFunction2((int) (short) -1);
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean14 = hashMapCuckooHashing1.isFull();
        boolean boolean16 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 100);
        boolean boolean18 = hashMapCuckooHashing1.checkTableContainsKey(0);
        int int19 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean20 = hashMapCuckooHashing1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5439");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) '#');
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        int int4 = hashMapCuckooHashing1.hashFunction2(0);
        boolean boolean6 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 10);
        java.lang.Class<?> wildcardClass7 = hashMapCuckooHashing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5440");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) '#');
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        int int4 = hashMapCuckooHashing1.hashFunction1(7);
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean8 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) -1);
        boolean boolean9 = hashMapCuckooHashing1.isFull();
        int int10 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5441");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.insertKey2HashTable((int) ' ');
        int int10 = hashMapCuckooHashing1.hashFunction1(5);
        double double11 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean12 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.insertKey2HashTable(19);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.1d + "'", double11 == 0.1d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5442");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 0);
        int int8 = hashMapCuckooHashing1.hashFunction2((int) (byte) 1);
        int int10 = hashMapCuckooHashing1.hashFunction1((int) (short) 0);
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        double double13 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.insertKey2HashTable(100);
        hashMapCuckooHashing1.insertKey2HashTable((int) '4');
        int int19 = hashMapCuckooHashing1.hashFunction2((int) (byte) 100);
        boolean boolean20 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.1d + "'", double13 == 0.1d);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5443");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) (short) 1);
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 10);
        double double4 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.insertKey2HashTable(12);
        hashMapCuckooHashing1.insertKey2HashTable(5);
        int int10 = hashMapCuckooHashing1.hashFunction2(9);
        int int12 = hashMapCuckooHashing1.hashFunction2((int) (short) -1);
        java.lang.Class<?> wildcardClass13 = hashMapCuckooHashing1.getClass();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5444");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int7 = hashMapCuckooHashing1.hashFunction2((int) (byte) 1);
        hashMapCuckooHashing1.displayHashtable();
        int int9 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int11 = hashMapCuckooHashing1.hashFunction2(7);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean13 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5445");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.insertKey2HashTable((int) ' ');
        double double9 = hashMapCuckooHashing1.checkLoadFactor();
        int int10 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        double double11 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean14 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.insertKey2HashTable(100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.1d + "'", double9 == 0.1d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.1d + "'", double11 == 0.1d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5446");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) (short) 1);
        boolean boolean3 = hashMapCuckooHashing1.checkTableContainsKey(7);
        double double4 = hashMapCuckooHashing1.checkLoadFactor();
        int int6 = hashMapCuckooHashing1.hashFunction2(0);
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey(79);
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.insertKey2HashTable(4);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5447");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean8 = hashMapCuckooHashing1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test5448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5448");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double3 = hashMapCuckooHashing1.checkLoadFactor();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.insertKey2HashTable(7);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test5449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5449");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction2((int) '#');
        int int8 = hashMapCuckooHashing1.hashFunction2((int) (byte) 100);
        hashMapCuckooHashing1.insertKey2HashTable((int) '#');
        int int12 = hashMapCuckooHashing1.hashFunction2((int) (short) -1);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean15 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5450");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) -1);
        hashMapCuckooHashing1.insertKey2HashTable(0);
        int int12 = hashMapCuckooHashing1.hashFunction1(3);
        double double13 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 100);
        double double16 = hashMapCuckooHashing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.1d + "'", double13 == 0.1d);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.075d + "'", double16 == 0.075d);
    }

    @Test
    public void test5451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5451");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        int int9 = hashMapCuckooHashing1.hashFunction2((int) (byte) 100);
        boolean boolean10 = hashMapCuckooHashing1.isFull();
        double double11 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        int int13 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5452");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 100);
        int int11 = hashMapCuckooHashing1.hashFunction2(19);
        boolean boolean12 = hashMapCuckooHashing1.isEmpty();
        double double13 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean14 = hashMapCuckooHashing1.isFull();
        java.lang.Class<?> wildcardClass15 = hashMapCuckooHashing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5453");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double3 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean4 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test5454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5454");
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
        boolean boolean11 = hashMapCuckooHashing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5455");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction2((int) '#');
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey(0);
        int int11 = hashMapCuckooHashing1.hashFunction1((int) (short) -1);
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean13 = hashMapCuckooHashing1.isFull();
        double double14 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean15 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test5456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5456");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        int int5 = hashMapCuckooHashing1.hashFunction2(100);
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean7 = hashMapCuckooHashing1.isFull();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        int int11 = hashMapCuckooHashing1.hashFunction1(4);
        int int13 = hashMapCuckooHashing1.hashFunction1((-1));
        boolean boolean14 = hashMapCuckooHashing1.isEmpty();
        double double15 = hashMapCuckooHashing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test5457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5457");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean4 = hashMapCuckooHashing1.isFull();
        int int6 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean8 = hashMapCuckooHashing1.isEmpty();
        int int10 = hashMapCuckooHashing1.hashFunction2(10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test5458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5458");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean3 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 0);
        double double4 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        java.lang.Class<?> wildcardClass8 = hashMapCuckooHashing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5459");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 0);
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        int int9 = hashMapCuckooHashing1.hashFunction1((int) (byte) 1);
        boolean boolean10 = hashMapCuckooHashing1.isFull();
        int int12 = hashMapCuckooHashing1.findKeyInTable(0);
        int int14 = hashMapCuckooHashing1.hashFunction1((int) (short) 100);
        hashMapCuckooHashing1.insertKey2HashTable((int) '4');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5460");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        boolean boolean7 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        int int9 = hashMapCuckooHashing1.hashFunction2((int) 'a');
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int13 = hashMapCuckooHashing1.hashFunction1((int) (short) 1);
        int int15 = hashMapCuckooHashing1.hashFunction2((int) (short) 0);
        hashMapCuckooHashing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5461");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(9);
        boolean boolean3 = hashMapCuckooHashing1.checkTableContainsKey(12);
        int int5 = hashMapCuckooHashing1.hashFunction2(19);
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable(15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test5462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5462");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        int int4 = hashMapCuckooHashing1.hashFunction2((int) (short) 10);
        int int6 = hashMapCuckooHashing1.hashFunction1(10);
        hashMapCuckooHashing1.insertKey2HashTable(5);
        boolean boolean9 = hashMapCuckooHashing1.isFull();
        boolean boolean11 = hashMapCuckooHashing1.checkTableContainsKey(2);
        hashMapCuckooHashing1.insertKey2HashTable(3);
        hashMapCuckooHashing1.insertKey2HashTable(7);
        boolean boolean17 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 100);
        double double18 = hashMapCuckooHashing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.3d + "'", double18 == 0.3d);
    }

    @Test
    public void test5463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5463");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int3 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 1);
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        boolean boolean8 = hashMapCuckooHashing1.isFull();
        boolean boolean9 = hashMapCuckooHashing1.isFull();
        int int10 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int12 = hashMapCuckooHashing1.hashFunction2(48);
        hashMapCuckooHashing1.insertKey2HashTable(39);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
    }

    @Test
    public void test5464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5464");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        boolean boolean8 = hashMapCuckooHashing1.isEmpty();
        double double9 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test5465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5465");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.displayHashtable();
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        double double7 = hashMapCuckooHashing1.checkLoadFactor();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = hashMapCuckooHashing1.hashFunction1(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test5466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5466");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int8 = hashMapCuckooHashing1.hashFunction1((int) (short) 10);
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 1);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.insertKey2HashTable(19);
        hashMapCuckooHashing1.displayHashtable();
        double double16 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.05d + "'", double16 == 0.05d);
    }

    @Test
    public void test5467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5467");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int7 = hashMapCuckooHashing1.hashFunction2((int) (byte) 1);
        hashMapCuckooHashing1.displayHashtable();
        int int10 = hashMapCuckooHashing1.hashFunction1(10);
        int int11 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean13 = hashMapCuckooHashing1.checkTableContainsKey(7);
        boolean boolean14 = hashMapCuckooHashing1.isFull();
        int int16 = hashMapCuckooHashing1.hashFunction1((int) (byte) -1);
        boolean boolean18 = hashMapCuckooHashing1.checkTableContainsKey(12);
        int int19 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.insertKey2HashTable((int) 'a');
        java.lang.Class<?> wildcardClass22 = hashMapCuckooHashing1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 19 + "'", int16 == 19);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5468");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean4 = hashMapCuckooHashing1.isFull();
        int int6 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int8 = hashMapCuckooHashing1.hashFunction1((int) (short) 1);
        hashMapCuckooHashing1.insertKey2HashTable((int) '#');
        boolean boolean11 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.insertKey2HashTable(3);
        boolean boolean14 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5469");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction2((int) '#');
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean8 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean10 = hashMapCuckooHashing1.isFull();
        int int11 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean13 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5470");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double3 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean4 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int8 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5471");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        int int4 = hashMapCuckooHashing1.hashFunction2((int) (short) 10);
        hashMapCuckooHashing1.insertKey2HashTable((int) ' ');
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey(0);
        int int11 = hashMapCuckooHashing1.hashFunction1(0);
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean14 = hashMapCuckooHashing1.checkTableContainsKey(15);
        int int16 = hashMapCuckooHashing1.hashFunction1(79);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
    }

    @Test
    public void test5472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5472");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) '4');
        int int3 = hashMapCuckooHashing1.hashFunction2(12);
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) 'a');
        int int7 = hashMapCuckooHashing1.hashFunction1((int) (byte) 0);
        int int8 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean10 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int12 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean13 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5473");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean6 = hashMapCuckooHashing1.checkTableContainsKey(100);
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        double double8 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean9 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test5474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5474");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        int int9 = hashMapCuckooHashing1.hashFunction1((int) (byte) 0);
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) -1);
        int int13 = hashMapCuckooHashing1.hashFunction1(17);
        boolean boolean14 = hashMapCuckooHashing1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Key 32 already inside, no duplicates allowed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5475");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) '#');
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey(17);
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5476");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        int int4 = hashMapCuckooHashing1.hashFunction2((int) (short) 10);
        int int6 = hashMapCuckooHashing1.hashFunction1(10);
        hashMapCuckooHashing1.insertKey2HashTable(5);
        hashMapCuckooHashing1.displayHashtable();
        int int10 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable(30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Key 30 already inside, no duplicates allowed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test5477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5477");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean3 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 0);
        int int5 = hashMapCuckooHashing1.hashFunction1(0);
        int int7 = hashMapCuckooHashing1.hashFunction1((int) '#');
        double double8 = hashMapCuckooHashing1.checkLoadFactor();
        double double9 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test5478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5478");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) (byte) 0);
        boolean boolean2 = hashMapCuckooHashing1.isEmpty();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        boolean boolean4 = hashMapCuckooHashing1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = hashMapCuckooHashing1.hashFunction2(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test5479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5479");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        int int7 = hashMapCuckooHashing1.hashFunction2((-1));
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean10 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5480");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        boolean boolean7 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 0);
        int int9 = hashMapCuckooHashing1.hashFunction1(100);
        boolean boolean10 = hashMapCuckooHashing1.isEmpty();
        boolean boolean11 = hashMapCuckooHashing1.isEmpty();
        int int13 = hashMapCuckooHashing1.hashFunction2((int) '#');
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test5481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5481");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) (short) 1);
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 10);
        hashMapCuckooHashing1.insertKey2HashTable((int) (byte) 1);
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        java.lang.Class<?> wildcardClass8 = hashMapCuckooHashing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5482");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) '#');
        hashMapCuckooHashing1.insertKey2HashTable((int) '#');
        boolean boolean4 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 100);
        hashMapCuckooHashing1.insertKey2HashTable(99);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test5483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5483");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        int int4 = hashMapCuckooHashing1.hashFunction2((int) (short) 10);
        int int6 = hashMapCuckooHashing1.hashFunction1(10);
        int int8 = hashMapCuckooHashing1.hashFunction1((int) (short) 1);
        int int10 = hashMapCuckooHashing1.hashFunction1(2);
        int int12 = hashMapCuckooHashing1.hashFunction2(1);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int16 = hashMapCuckooHashing1.hashFunction2((int) (byte) 1);
        double double17 = hashMapCuckooHashing1.checkLoadFactor();
        // The following exception was thrown during execution in test generation
        try {
            int int19 = hashMapCuckooHashing1.findKeyInTable((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test5484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5484");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.insertKey2HashTable((int) ' ');
        double double9 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean12 = hashMapCuckooHashing1.isFull();
        double double13 = hashMapCuckooHashing1.checkLoadFactor();
        int int14 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.1d + "'", double9 == 0.1d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.05d + "'", double13 == 0.05d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test5485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5485");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) ' ');
        hashMapCuckooHashing1.insertKey2HashTable(0);
        boolean boolean4 = hashMapCuckooHashing1.isEmpty();
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        double double8 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean10 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03125d + "'", double6 == 0.03125d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.03125d + "'", double8 == 0.03125d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test5486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5486");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        double double7 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int9 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int10 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5487");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey((int) '#');
        boolean boolean10 = hashMapCuckooHashing1.isEmpty();
        boolean boolean12 = hashMapCuckooHashing1.checkTableContainsKey(3);
        boolean boolean13 = hashMapCuckooHashing1.isFull();
        boolean boolean15 = hashMapCuckooHashing1.checkTableContainsKey(0);
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5488");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction2((int) '#');
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey(0);
        double double10 = hashMapCuckooHashing1.checkLoadFactor();
        int int11 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean13 = hashMapCuckooHashing1.checkTableContainsKey(5);
        double double14 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean16 = hashMapCuckooHashing1.checkTableContainsKey(5);
        double double17 = hashMapCuckooHashing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.0d + "'", double17 == 0.0d);
    }

    @Test
    public void test5489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5489");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        int int4 = hashMapCuckooHashing1.hashFunction2((int) (short) 10);
        int int6 = hashMapCuckooHashing1.hashFunction1(10);
        int int8 = hashMapCuckooHashing1.hashFunction1((int) (short) 1);
        int int10 = hashMapCuckooHashing1.hashFunction1(2);
        int int12 = hashMapCuckooHashing1.hashFunction2(1);
        boolean boolean14 = hashMapCuckooHashing1.checkTableContainsKey(3);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = hashMapCuckooHashing1.findKeyInTable(20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5490");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean7 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 1);
        boolean boolean8 = hashMapCuckooHashing1.isFull();
        int int9 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int12 = hashMapCuckooHashing1.hashFunction2(8);
        int int14 = hashMapCuckooHashing1.hashFunction2((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test5491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5491");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction2((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction1((int) (short) 1);
        int int8 = hashMapCuckooHashing1.hashFunction1(17);
        double double9 = hashMapCuckooHashing1.checkLoadFactor();
        int int11 = hashMapCuckooHashing1.hashFunction1(29);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
    }

    @Test
    public void test5492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5492");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean6 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 1);
        boolean boolean8 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 1);
        int int10 = hashMapCuckooHashing1.hashFunction2(10);
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        double double13 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean14 = hashMapCuckooHashing1.isEmpty();
        boolean boolean15 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test5493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5493");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(7);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int5 = hashMapCuckooHashing1.hashFunction2((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable(20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5494");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction2((int) '#');
        int int8 = hashMapCuckooHashing1.hashFunction2((int) (byte) 100);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.insertKey2HashTable((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5495");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        int int4 = hashMapCuckooHashing1.hashFunction2((int) (short) 10);
        int int6 = hashMapCuckooHashing1.hashFunction1(10);
        int int8 = hashMapCuckooHashing1.hashFunction1((int) (short) 1);
        int int10 = hashMapCuckooHashing1.hashFunction1(2);
        int int12 = hashMapCuckooHashing1.hashFunction2(1);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean14 = hashMapCuckooHashing1.isFull();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5496");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean4 = hashMapCuckooHashing1.isFull();
        int int6 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int8 = hashMapCuckooHashing1.hashFunction1((int) (short) 1);
        int int10 = hashMapCuckooHashing1.hashFunction2(12);
        boolean boolean11 = hashMapCuckooHashing1.isEmpty();
        int int13 = hashMapCuckooHashing1.hashFunction2((int) (byte) 1);
        boolean boolean14 = hashMapCuckooHashing1.isFull();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5497");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int8 = hashMapCuckooHashing1.hashFunction1((int) (short) 10);
        int int10 = hashMapCuckooHashing1.hashFunction1((int) (byte) 100);
        hashMapCuckooHashing1.insertKey2HashTable(0);
        java.lang.Class<?> wildcardClass13 = hashMapCuckooHashing1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5498");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        int int5 = hashMapCuckooHashing1.hashFunction2(100);
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean7 = hashMapCuckooHashing1.isFull();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        hashMapCuckooHashing1.insertKey2HashTable(12);
        hashMapCuckooHashing1.insertKey2HashTable(3);
        int int14 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean16 = hashMapCuckooHashing1.checkTableContainsKey(0);
        int int18 = hashMapCuckooHashing1.hashFunction1((int) ' ');
        int int19 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        // The following exception was thrown during execution in test generation
        try {
            int int21 = hashMapCuckooHashing1.findKeyInTable(39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Key 39 not found in table");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test5499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5499");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = hashMapCuckooHashing1.findKeyInTable(69);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test5500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5500");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int8 = hashMapCuckooHashing1.hashFunction1((int) (short) 10);
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 1);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int14 = hashMapCuckooHashing1.hashFunction1(0);
        hashMapCuckooHashing1.insertKey2HashTable(9);
        int int17 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        // The following exception was thrown during execution in test generation
        try {
            int int19 = hashMapCuckooHashing1.findKeyInTable((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Key 0 not found in table");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }
}

