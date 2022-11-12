package datastructures.hashmap;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest11 {

    public static boolean debug = false;

    @Test
    public void test5501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5501");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 0);
        boolean boolean10 = hashMapCuckooHashing1.checkTableContainsKey(5);
        int int12 = hashMapCuckooHashing1.hashFunction2(5);
        double double13 = hashMapCuckooHashing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.05d + "'", double13 == 0.05d);
    }

    @Test
    public void test5502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5502");
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
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean17 = hashMapCuckooHashing1.checkTableContainsKey(69);
        int int19 = hashMapCuckooHashing1.hashFunction2(1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test5503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5503");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean4 = hashMapCuckooHashing1.isFull();
        int int6 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int8 = hashMapCuckooHashing1.hashFunction1((int) (short) 1);
        boolean boolean10 = hashMapCuckooHashing1.checkTableContainsKey(0);
        boolean boolean11 = hashMapCuckooHashing1.isFull();
        boolean boolean12 = hashMapCuckooHashing1.isFull();
        boolean boolean13 = hashMapCuckooHashing1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = hashMapCuckooHashing1.findKeyInTable(30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5504");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction2((int) '#');
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test5505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5505");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean3 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 0);
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean7 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 10);
        boolean boolean8 = hashMapCuckooHashing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5506");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction1(1);
        int int8 = hashMapCuckooHashing1.hashFunction2((int) '#');
        boolean boolean9 = hashMapCuckooHashing1.isFull();
        boolean boolean10 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
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
    public void test5507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5507");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.displayHashtable();
        int int8 = hashMapCuckooHashing1.hashFunction1(5);
        double double9 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean12 = hashMapCuckooHashing1.checkTableContainsKey(9);
        double double13 = hashMapCuckooHashing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test5508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5508");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) 'a');
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        java.lang.Class<?> wildcardClass3 = hashMapCuckooHashing1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test5509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5509");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean7 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 1);
        boolean boolean8 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        int int11 = hashMapCuckooHashing1.hashFunction2((int) (short) 100);
        int int13 = hashMapCuckooHashing1.hashFunction2(9);
        int int15 = hashMapCuckooHashing1.hashFunction1((int) (short) -1);
        boolean boolean16 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test5510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5510");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int3 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean4 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.insertKey2HashTable(39);
        java.lang.Class<?> wildcardClass9 = hashMapCuckooHashing1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5511");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) '4');
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.insertKey2HashTable((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction1((int) (short) 10);
        int int8 = hashMapCuckooHashing1.hashFunction1(100);
        int int10 = hashMapCuckooHashing1.hashFunction2(7);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 48 + "'", int8 == 48);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5512");
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
        int int13 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5513");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        int int9 = hashMapCuckooHashing1.hashFunction1((int) (byte) 0);
        hashMapCuckooHashing1.insertKey2HashTable(9);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5514");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean3 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 0);
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean8 = hashMapCuckooHashing1.isFull();
        boolean boolean9 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test5515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5515");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean4 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean8 = hashMapCuckooHashing1.isEmpty();
        int int10 = hashMapCuckooHashing1.hashFunction2((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5516");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(1);
        int int3 = hashMapCuckooHashing1.hashFunction1((int) 'a');
        boolean boolean4 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int8 = hashMapCuckooHashing1.hashFunction1((int) ' ');
        hashMapCuckooHashing1.insertKey2HashTable(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5517");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 0);
        int int8 = hashMapCuckooHashing1.hashFunction2((int) (byte) 1);
        int int10 = hashMapCuckooHashing1.hashFunction1((int) (short) 0);
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.deleteKeyFromHashTable((int) (byte) 0);
        double double14 = hashMapCuckooHashing1.checkLoadFactor();
        int int15 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int16 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test5518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5518");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        int int9 = hashMapCuckooHashing1.hashFunction2((int) (byte) 100);
        hashMapCuckooHashing1.insertKey2HashTable((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5519");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean3 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 0);
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        double double7 = hashMapCuckooHashing1.checkLoadFactor();
        int int8 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        double double9 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean10 = hashMapCuckooHashing1.isEmpty();
        boolean boolean11 = hashMapCuckooHashing1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5520");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double3 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean4 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        double double8 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean10 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test5521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5521");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction2((int) '#');
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey((int) ' ');
        int int11 = hashMapCuckooHashing1.hashFunction2((int) (short) 10);
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean13 = hashMapCuckooHashing1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5522");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        int int4 = hashMapCuckooHashing1.hashFunction2((int) (short) 10);
        int int6 = hashMapCuckooHashing1.hashFunction1(10);
        int int8 = hashMapCuckooHashing1.hashFunction1((int) (short) 1);
        int int10 = hashMapCuckooHashing1.hashFunction1(2);
        double double11 = hashMapCuckooHashing1.checkLoadFactor();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = hashMapCuckooHashing1.findKeyInTable(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
    }

    @Test
    public void test5523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5523");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction2((int) '#');
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey((int) 'a');
        boolean boolean10 = hashMapCuckooHashing1.isFull();
        double double11 = hashMapCuckooHashing1.checkLoadFactor();
        int int12 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean13 = hashMapCuckooHashing1.isFull();
        int int15 = hashMapCuckooHashing1.hashFunction2(8);
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable(79);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5524");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int8 = hashMapCuckooHashing1.hashFunction1((int) (short) 10);
        int int10 = hashMapCuckooHashing1.hashFunction1((int) (byte) 100);
        hashMapCuckooHashing1.insertKey2HashTable(0);
        int int14 = hashMapCuckooHashing1.hashFunction2(10);
        boolean boolean15 = hashMapCuckooHashing1.isFull();
        double double16 = hashMapCuckooHashing1.checkLoadFactor();
        int int18 = hashMapCuckooHashing1.hashFunction1(16);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.05d + "'", double16 == 0.05d);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 16 + "'", int18 == 16);
    }

    @Test
    public void test5525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5525");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        int int7 = hashMapCuckooHashing1.hashFunction2(3);
        int int8 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int10 = hashMapCuckooHashing1.hashFunction1(10);
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 10);
        boolean boolean13 = hashMapCuckooHashing1.isFull();
        boolean boolean15 = hashMapCuckooHashing1.checkTableContainsKey(100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5526");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction2((int) '#');
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey((int) 'a');
        boolean boolean10 = hashMapCuckooHashing1.isFull();
        double double11 = hashMapCuckooHashing1.checkLoadFactor();
        int int12 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int13 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int15 = hashMapCuckooHashing1.hashFunction1((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
    }

    @Test
    public void test5527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5527");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(19);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5528");
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
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5529");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean4 = hashMapCuckooHashing1.isFull();
        int int5 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5530");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double3 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int5 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        double double8 = hashMapCuckooHashing1.checkLoadFactor();
        int int9 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = hashMapCuckooHashing1.hashFunction1((int) 'a');
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
    public void test5531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5531");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double3 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int5 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test5532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5532");
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
        boolean boolean14 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = hashMapCuckooHashing1.findKeyInTable(35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Key 35 not found in table");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5533");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) (short) 1);
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 10);
        double double4 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.insertKey2HashTable(12);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double8 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean10 = hashMapCuckooHashing1.checkTableContainsKey(79);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.25d + "'", double8 == 0.25d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5534");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 0);
        boolean boolean7 = hashMapCuckooHashing1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = hashMapCuckooHashing1.findKeyInTable(29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Key 29 not found in table");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test5535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5535");
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
        int int21 = hashMapCuckooHashing1.hashFunction2((int) (short) 10);
        boolean boolean22 = hashMapCuckooHashing1.isFull();
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test5536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5536");
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
        boolean boolean16 = hashMapCuckooHashing1.isFull();
        int int17 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        java.lang.Class<?> wildcardClass18 = hashMapCuckooHashing1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5537");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        int int4 = hashMapCuckooHashing1.hashFunction2((int) (short) 10);
        int int6 = hashMapCuckooHashing1.hashFunction1(10);
        int int8 = hashMapCuckooHashing1.hashFunction1((int) (short) 1);
        int int10 = hashMapCuckooHashing1.hashFunction1(2);
        int int12 = hashMapCuckooHashing1.hashFunction2(1);
        boolean boolean14 = hashMapCuckooHashing1.checkTableContainsKey(3);
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) -1);
        boolean boolean18 = hashMapCuckooHashing1.checkTableContainsKey(0);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5538");
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
        double double17 = hashMapCuckooHashing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.2d + "'", double15 == 0.2d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.2d + "'", double17 == 0.2d);
    }

    @Test
    public void test5539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5539");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) -1);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean11 = hashMapCuckooHashing1.checkTableContainsKey((int) '#');
        int int12 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int14 = hashMapCuckooHashing1.hashFunction2(7);
        int int16 = hashMapCuckooHashing1.hashFunction2(15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test5540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5540");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.insertKey2HashTable(10);
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
    }

    @Test
    public void test5541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5541");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey(0);
        int int7 = hashMapCuckooHashing1.hashFunction1(3);
        double double8 = hashMapCuckooHashing1.checkLoadFactor();
        int int10 = hashMapCuckooHashing1.hashFunction2(17);
        boolean boolean11 = hashMapCuckooHashing1.isEmpty();
        java.lang.Class<?> wildcardClass12 = hashMapCuckooHashing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5542");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        int int7 = hashMapCuckooHashing1.hashFunction2((-1));
        hashMapCuckooHashing1.insertKey2HashTable((int) (byte) -1);
        boolean boolean11 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 10);
        boolean boolean13 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5543");
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
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5544");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) ' ');
        hashMapCuckooHashing1.insertKey2HashTable(0);
        boolean boolean4 = hashMapCuckooHashing1.isEmpty();
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        double double8 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03125d + "'", double6 == 0.03125d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.03125d + "'", double8 == 0.03125d);
    }

    @Test
    public void test5545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5545");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int7 = hashMapCuckooHashing1.hashFunction2((int) (byte) 1);
        hashMapCuckooHashing1.displayHashtable();
        double double9 = hashMapCuckooHashing1.checkLoadFactor();
        int int10 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5546");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction2((int) '#');
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey(0);
        int int11 = hashMapCuckooHashing1.hashFunction2(0);
        int int13 = hashMapCuckooHashing1.hashFunction1((int) 'a');
        boolean boolean15 = hashMapCuckooHashing1.checkTableContainsKey(30);
        int int17 = hashMapCuckooHashing1.hashFunction1((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int19 = hashMapCuckooHashing1.findKeyInTable(69);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
    }

    @Test
    public void test5547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5547");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        int int10 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5548");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        int int5 = hashMapCuckooHashing1.hashFunction2(100);
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int8 = hashMapCuckooHashing1.hashFunction2((int) (short) 1);
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 100);
        int int12 = hashMapCuckooHashing1.hashFunction1(10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5549");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean4 = hashMapCuckooHashing1.isFull();
        int int6 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean9 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.insertKey2HashTable(0);
        int int12 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.insertKey2HashTable(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Key already inside, no duplicates allowed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test5550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5550");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        int int4 = hashMapCuckooHashing1.hashFunction2((int) (short) 10);
        int int6 = hashMapCuckooHashing1.hashFunction2((int) (short) 10);
        boolean boolean7 = hashMapCuckooHashing1.isFull();
        int int9 = hashMapCuckooHashing1.hashFunction2(2);
        int int10 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) -1);
        int int14 = hashMapCuckooHashing1.hashFunction2(7);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5551");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int3 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int5 = hashMapCuckooHashing1.hashFunction1((-1));
        int int7 = hashMapCuckooHashing1.hashFunction1((int) (short) 1);
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean9 = hashMapCuckooHashing1.isEmpty();
        boolean boolean11 = hashMapCuckooHashing1.checkTableContainsKey(17);
        double double12 = hashMapCuckooHashing1.checkLoadFactor();
        double double13 = hashMapCuckooHashing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test5552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5552");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        hashMapCuckooHashing1.displayHashtable();
        int int8 = hashMapCuckooHashing1.hashFunction2((int) (short) 1);
        boolean boolean9 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        double double11 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean12 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test5553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5553");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean4 = hashMapCuckooHashing1.isFull();
        int int6 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean8 = hashMapCuckooHashing1.isEmpty();
        int int9 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean10 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int12 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean13 = hashMapCuckooHashing1.isFull();
        double double14 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.0d + "'", double14 == 0.0d);
    }

    @Test
    public void test5554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5554");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isEmpty();
        boolean boolean4 = hashMapCuckooHashing1.isEmpty();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.displayHashtable();
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        double double8 = hashMapCuckooHashing1.checkLoadFactor();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = hashMapCuckooHashing1.hashFunction2(20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
    }

    @Test
    public void test5555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5555");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int8 = hashMapCuckooHashing1.hashFunction1((int) (short) 10);
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 1);
        boolean boolean11 = hashMapCuckooHashing1.isFull();
        int int13 = hashMapCuckooHashing1.hashFunction1((int) (byte) 1);
        int int15 = hashMapCuckooHashing1.hashFunction2((int) ' ');
        int int17 = hashMapCuckooHashing1.hashFunction2(79);
        hashMapCuckooHashing1.insertKey2HashTable((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Key 6 already inside, no duplicates allowed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test5556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5556");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int8 = hashMapCuckooHashing1.hashFunction1((int) (short) 10);
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 1);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double13 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.insertKey2HashTable(0);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0125d + "'", double13 == 0.0125d);
    }

    @Test
    public void test5557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5557");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 0);
        int int8 = hashMapCuckooHashing1.hashFunction2((int) (byte) 1);
        hashMapCuckooHashing1.deleteKeyFromHashTable(0);
        boolean boolean11 = hashMapCuckooHashing1.isFull();
        int int13 = hashMapCuckooHashing1.hashFunction2(29);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test5558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5558");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction2((int) '#');
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey(0);
        int int11 = hashMapCuckooHashing1.hashFunction1((int) (short) -1);
        int int13 = hashMapCuckooHashing1.hashFunction1(2);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.displayHashtable();
        int int17 = hashMapCuckooHashing1.hashFunction2(4);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test5559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5559");
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
        boolean boolean18 = hashMapCuckooHashing1.checkTableContainsKey(1);
        double double19 = hashMapCuckooHashing1.checkLoadFactor();
        int int21 = hashMapCuckooHashing1.hashFunction2(10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + double19 + "' != '" + 0.2d + "'", double19 == 0.2d);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test5560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5560");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean7 = hashMapCuckooHashing1.isFull();
        int int9 = hashMapCuckooHashing1.hashFunction1(100);
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean12 = hashMapCuckooHashing1.checkTableContainsKey(17);
        boolean boolean13 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5561");
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
        boolean boolean12 = hashMapCuckooHashing1.isEmpty();
        boolean boolean13 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.1d + "'", double9 == 0.1d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.1d + "'", double11 == 0.1d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5562");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(1);
        int int3 = hashMapCuckooHashing1.hashFunction1((int) 'a');
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5563");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean4 = hashMapCuckooHashing1.checkTableContainsKey((int) '4');
        int int5 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.insertKey2HashTable(4);
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey(10);
        int int11 = hashMapCuckooHashing1.hashFunction1((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test5564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5564");
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
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean16 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 10);
        int int18 = hashMapCuckooHashing1.hashFunction2((int) (byte) 1);
        boolean boolean20 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.1d + "'", double9 == 0.1d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.1d + "'", double11 == 0.1d);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5565");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int3 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 0);
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int8 = hashMapCuckooHashing1.hashFunction1((int) (byte) -1);
        hashMapCuckooHashing1.insertKey2HashTable((int) (byte) 10);
        int int12 = hashMapCuckooHashing1.hashFunction2((int) '#');
        boolean boolean13 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 0);
        hashMapCuckooHashing1.insertKey2HashTable(8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5566");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean8 = hashMapCuckooHashing1.isFull();
        boolean boolean9 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test5567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5567");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 0);
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        int int9 = hashMapCuckooHashing1.hashFunction2(12);
        boolean boolean10 = hashMapCuckooHashing1.isEmpty();
        int int12 = hashMapCuckooHashing1.hashFunction1(100);
        boolean boolean13 = hashMapCuckooHashing1.isEmpty();
        boolean boolean14 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5568");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean3 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 0);
        double double4 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.insertKey2HashTable(7);
        boolean boolean10 = hashMapCuckooHashing1.checkTableContainsKey(48);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5569");
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
        boolean boolean17 = hashMapCuckooHashing1.isFull();
        boolean boolean19 = hashMapCuckooHashing1.checkTableContainsKey(79);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = hashMapCuckooHashing1.findKeyInTable(79);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Key 79 not found in table");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5570");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 100);
        boolean boolean10 = hashMapCuckooHashing1.isFull();
        boolean boolean11 = hashMapCuckooHashing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5571");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey(0);
        int int7 = hashMapCuckooHashing1.hashFunction1(3);
        boolean boolean8 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.insertKey2HashTable(39);
        java.lang.Class<?> wildcardClass11 = hashMapCuckooHashing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 3 + "'", int7 == 3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5572");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction2((int) '#');
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean8 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        int int11 = hashMapCuckooHashing1.hashFunction2(12);
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 100);
        int int15 = hashMapCuckooHashing1.hashFunction1(35);
        hashMapCuckooHashing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
    }

    @Test
    public void test5573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5573");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        boolean boolean8 = hashMapCuckooHashing1.isEmpty();
        boolean boolean9 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test5574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5574");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) ' ');
        hashMapCuckooHashing1.insertKey2HashTable(0);
        boolean boolean4 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5575");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean3 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 0);
        double double4 = hashMapCuckooHashing1.checkLoadFactor();
        int int6 = hashMapCuckooHashing1.hashFunction1((int) (short) 1);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 10);
        int int11 = hashMapCuckooHashing1.hashFunction2(30);
        double double12 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.insertKey2HashTable(15);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5576");
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
        int int16 = hashMapCuckooHashing1.hashFunction1(16);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 6 + "'", int16 == 6);
    }

    @Test
    public void test5577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5577");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) (byte) 1);
        int int3 = hashMapCuckooHashing1.hashFunction2(5);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int6 = hashMapCuckooHashing1.hashFunction2(1);
        boolean boolean7 = hashMapCuckooHashing1.isFull();
        int int9 = hashMapCuckooHashing1.hashFunction2(39);
        double double10 = hashMapCuckooHashing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test5578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5578");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        boolean boolean2 = hashMapCuckooHashing1.isEmpty();
        int int3 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean4 = hashMapCuckooHashing1.isEmpty();
        java.lang.Class<?> wildcardClass5 = hashMapCuckooHashing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5579");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        int int9 = hashMapCuckooHashing1.hashFunction2((int) (short) -1);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int12 = hashMapCuckooHashing1.hashFunction1((int) (byte) -1);
        int int13 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 19 + "'", int12 == 19);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5580");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) '4');
        int int3 = hashMapCuckooHashing1.hashFunction2(12);
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) 'a');
        int int7 = hashMapCuckooHashing1.hashFunction1((int) (byte) 0);
        boolean boolean8 = hashMapCuckooHashing1.isEmpty();
        java.lang.Class<?> wildcardClass9 = hashMapCuckooHashing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5581");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isEmpty();
        boolean boolean4 = hashMapCuckooHashing1.isEmpty();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        double double7 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean8 = hashMapCuckooHashing1.isEmpty();
        boolean boolean9 = hashMapCuckooHashing1.isEmpty();
        double double10 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean11 = hashMapCuckooHashing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5582");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int3 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 0);
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int8 = hashMapCuckooHashing1.hashFunction1((int) (byte) -1);
        hashMapCuckooHashing1.insertKey2HashTable((int) (byte) 10);
        boolean boolean11 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.insertKey2HashTable(30);
        int int15 = hashMapCuckooHashing1.hashFunction1((int) (short) 1);
        int int16 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        double double17 = hashMapCuckooHashing1.checkLoadFactor();
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Key 0 already inside, no duplicates allowed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.2d + "'", double17 == 0.2d);
    }

    @Test
    public void test5583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5583");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        boolean boolean7 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 10);
        hashMapCuckooHashing1.insertKey2HashTable(100);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean12 = hashMapCuckooHashing1.checkTableContainsKey(19);
        java.lang.Class<?> wildcardClass13 = hashMapCuckooHashing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5584");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        int int9 = hashMapCuckooHashing1.hashFunction2((int) (short) -1);
        boolean boolean10 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.insertKey2HashTable(3);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5585");
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
        hashMapCuckooHashing1.displayHashtable();
        int int20 = hashMapCuckooHashing1.hashFunction2((-1));
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int23 = hashMapCuckooHashing1.hashFunction1(100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.1d + "'", double13 == 0.1d);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 20 + "'", int23 == 20);
    }

    @Test
    public void test5586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5586");
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
        boolean boolean16 = hashMapCuckooHashing1.isFull();
        boolean boolean17 = hashMapCuckooHashing1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5587");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        int int7 = hashMapCuckooHashing1.hashFunction2((-1));
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean9 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean11 = hashMapCuckooHashing1.isFull();
        int int12 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5588");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        double double8 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.insertKey2HashTable(99);
        double double11 = hashMapCuckooHashing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.1d + "'", double11 == 0.1d);
    }

    @Test
    public void test5589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5589");
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
        hashMapCuckooHashing1.displayHashtable();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5590");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean6 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 1);
        boolean boolean8 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 1);
        int int10 = hashMapCuckooHashing1.hashFunction2(10);
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        int int14 = hashMapCuckooHashing1.hashFunction1((int) (short) 1);
        boolean boolean16 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5591");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 0);
        int int8 = hashMapCuckooHashing1.hashFunction2((int) (byte) 1);
        int int10 = hashMapCuckooHashing1.hashFunction1((int) (short) 0);
        double double11 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.insertKey2HashTable(16);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.1d + "'", double11 == 0.1d);
    }

    @Test
    public void test5592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5592");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean6 = hashMapCuckooHashing1.checkTableContainsKey(100);
        boolean boolean8 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) -1);
        int int10 = hashMapCuckooHashing1.hashFunction2(4);
        boolean boolean12 = hashMapCuckooHashing1.checkTableContainsKey(100);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5593");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int3 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 1);
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 10);
        boolean boolean11 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 100);
        boolean boolean12 = hashMapCuckooHashing1.isFull();
        int int13 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5594");
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
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.displayHashtable();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = hashMapCuckooHashing1.hashFunction1(2);
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
    }

    @Test
    public void test5595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5595");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean7 = hashMapCuckooHashing1.isFull();
        int int9 = hashMapCuckooHashing1.hashFunction2(19);
        int int11 = hashMapCuckooHashing1.hashFunction2(3);
        boolean boolean13 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5596");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        boolean boolean7 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 10);
        hashMapCuckooHashing1.insertKey2HashTable(100);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean11 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean13 = hashMapCuckooHashing1.isEmpty();
        boolean boolean14 = hashMapCuckooHashing1.isFull();
        boolean boolean16 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 0);
        int int18 = hashMapCuckooHashing1.hashFunction1((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20 + "'", int18 == 20);
    }

    @Test
    public void test5597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5597");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int3 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 1);
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        int int8 = hashMapCuckooHashing1.hashFunction2((int) (short) 0);
        boolean boolean9 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 1);
        boolean boolean12 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5598");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        boolean boolean2 = hashMapCuckooHashing1.isEmpty();
        int int3 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean6 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test5599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5599");
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
        hashMapCuckooHashing1.displayHashtable();
        int int15 = hashMapCuckooHashing1.hashFunction1((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = hashMapCuckooHashing1.findKeyInTable((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Key 35 not found in table");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.1d + "'", double9 == 0.1d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.1d + "'", double11 == 0.1d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5600");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean6 = hashMapCuckooHashing1.checkTableContainsKey(100);
        boolean boolean8 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) -1);
        int int9 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean10 = hashMapCuckooHashing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5601");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.insertKey2HashTable((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int10 = hashMapCuckooHashing1.findKeyInTable((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Key 100 not found in table");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test5602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5602");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction2((int) '#');
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey(0);
        int int11 = hashMapCuckooHashing1.hashFunction2(0);
        int int13 = hashMapCuckooHashing1.hashFunction1((int) 'a');
        boolean boolean15 = hashMapCuckooHashing1.checkTableContainsKey(30);
        int int17 = hashMapCuckooHashing1.hashFunction1((int) '#');
        double double18 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
    }

    @Test
    public void test5603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5603");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.displayHashtable();
        double double4 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = hashMapCuckooHashing1.findKeyInTable((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5604");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        int int9 = hashMapCuckooHashing1.hashFunction2(79);
        double double10 = hashMapCuckooHashing1.checkLoadFactor();
        int int12 = hashMapCuckooHashing1.hashFunction1(17);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 7 + "'", int12 == 7);
    }

    @Test
    public void test5605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5605");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(1);
        boolean boolean2 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 0);
        double double5 = hashMapCuckooHashing1.checkLoadFactor();
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        double double7 = hashMapCuckooHashing1.checkLoadFactor();
        int int9 = hashMapCuckooHashing1.hashFunction1(15);
        hashMapCuckooHashing1.displayHashtable();
        int int12 = hashMapCuckooHashing1.hashFunction2((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.5d + "'", double5 == 0.5d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.5d + "'", double6 == 0.5d);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.5d + "'", double7 == 0.5d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test5606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5606");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction2((int) '#');
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey(0);
        double double10 = hashMapCuckooHashing1.checkLoadFactor();
        int int11 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean12 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean14 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean17 = hashMapCuckooHashing1.checkTableContainsKey(35);
        boolean boolean19 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) -1);
        boolean boolean21 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test5607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5607");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int7 = hashMapCuckooHashing1.hashFunction2((int) (byte) 1);
        hashMapCuckooHashing1.displayHashtable();
        int int10 = hashMapCuckooHashing1.hashFunction1(0);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean12 = hashMapCuckooHashing1.isFull();
        int int14 = hashMapCuckooHashing1.hashFunction1(5);
        hashMapCuckooHashing1.insertKey2HashTable((-1));
        int int18 = hashMapCuckooHashing1.hashFunction2(5);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test5608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5608");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        int int7 = hashMapCuckooHashing1.hashFunction2(3);
        int int8 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int10 = hashMapCuckooHashing1.hashFunction1(10);
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 10);
        boolean boolean13 = hashMapCuckooHashing1.isFull();
        boolean boolean15 = hashMapCuckooHashing1.checkTableContainsKey(15);
        java.lang.Class<?> wildcardClass16 = hashMapCuckooHashing1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5609");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction2((int) '#');
        int int8 = hashMapCuckooHashing1.hashFunction1((int) (byte) -1);
        hashMapCuckooHashing1.insertKey2HashTable(10);
        hashMapCuckooHashing1.displayHashtable();
        int int13 = hashMapCuckooHashing1.hashFunction2(0);
        double double14 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean15 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.1d + "'", double14 == 0.1d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5610");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean8 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean11 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5611");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(1);
        boolean boolean2 = hashMapCuckooHashing1.isEmpty();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.insertKey2HashTable((int) (byte) -1);
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 10);
        int int9 = hashMapCuckooHashing1.findKeyInTable((int) (short) 10);
        double double10 = hashMapCuckooHashing1.checkLoadFactor();
        int int11 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.5d + "'", double10 == 0.5d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test5612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5612");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.displayHashtable();
        int int8 = hashMapCuckooHashing1.hashFunction1((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
    }

    @Test
    public void test5613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5613");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int3 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int5 = hashMapCuckooHashing1.hashFunction1((int) (short) 10);
        boolean boolean7 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 1);
        boolean boolean8 = hashMapCuckooHashing1.isFull();
        boolean boolean9 = hashMapCuckooHashing1.isFull();
        boolean boolean11 = hashMapCuckooHashing1.checkTableContainsKey(100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5614");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int3 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 1);
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        boolean boolean8 = hashMapCuckooHashing1.isFull();
        boolean boolean9 = hashMapCuckooHashing1.isFull();
        int int10 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean11 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.insertKey2HashTable((int) (byte) -1);
        int int14 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test5615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5615");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(1);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        double double7 = hashMapCuckooHashing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.0d + "'", double7 == 0.0d);
    }

    @Test
    public void test5616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5616");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) (short) 10);
        boolean boolean2 = hashMapCuckooHashing1.isEmpty();
        double double3 = hashMapCuckooHashing1.checkLoadFactor();
        int int5 = hashMapCuckooHashing1.hashFunction1(4);
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        boolean boolean7 = hashMapCuckooHashing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test5617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5617");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        int int7 = hashMapCuckooHashing1.hashFunction2((int) 'a');
        int int8 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int10 = hashMapCuckooHashing1.hashFunction2(2);
        int int12 = hashMapCuckooHashing1.hashFunction2(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5618");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.insertKey2HashTable((int) ' ');
        int int9 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean11 = hashMapCuckooHashing1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Key -1 already inside, no duplicates allowed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5619");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        int int4 = hashMapCuckooHashing1.hashFunction2((int) (short) 10);
        int int6 = hashMapCuckooHashing1.hashFunction1(10);
        int int8 = hashMapCuckooHashing1.hashFunction1((int) (short) 1);
        int int10 = hashMapCuckooHashing1.hashFunction2(0);
        double double11 = hashMapCuckooHashing1.checkLoadFactor();
        int int13 = hashMapCuckooHashing1.hashFunction1((int) (byte) 1);
        boolean boolean14 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test5620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5620");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean3 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 0);
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.insertKey2HashTable(79);
        boolean boolean8 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.insertKey2HashTable((int) (byte) -1);
        hashMapCuckooHashing1.insertKey2HashTable(29);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5621");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int8 = hashMapCuckooHashing1.hashFunction1((int) (short) 10);
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 1);
        boolean boolean11 = hashMapCuckooHashing1.isFull();
        int int13 = hashMapCuckooHashing1.hashFunction1(19);
        double double14 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean15 = hashMapCuckooHashing1.isFull();
        int int17 = hashMapCuckooHashing1.hashFunction1(2);
        double double18 = hashMapCuckooHashing1.checkLoadFactor();
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable(29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Key 29 already inside, no duplicates allowed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 19 + "'", int13 == 19);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.05d + "'", double14 == 0.05d);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.05d + "'", double18 == 0.05d);
    }

    @Test
    public void test5622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5622");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        int int4 = hashMapCuckooHashing1.hashFunction2((int) (short) 10);
        int int6 = hashMapCuckooHashing1.hashFunction1(10);
        hashMapCuckooHashing1.insertKey2HashTable(5);
        boolean boolean9 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.insertKey2HashTable(12);
        hashMapCuckooHashing1.displayHashtable();
        int int16 = hashMapCuckooHashing1.hashFunction2((-1));
        hashMapCuckooHashing1.insertKey2HashTable(10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test5623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5623");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int3 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double5 = hashMapCuckooHashing1.checkLoadFactor();
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean7 = hashMapCuckooHashing1.isFull();
        int int9 = hashMapCuckooHashing1.hashFunction2(2);
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean12 = hashMapCuckooHashing1.checkTableContainsKey(5);
        boolean boolean14 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) -1);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5624");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        int int4 = hashMapCuckooHashing1.hashFunction2((int) (short) 10);
        int int6 = hashMapCuckooHashing1.hashFunction1(10);
        hashMapCuckooHashing1.insertKey2HashTable(5);
        boolean boolean9 = hashMapCuckooHashing1.isFull();
        int int11 = hashMapCuckooHashing1.hashFunction1((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
    }

    @Test
    public void test5625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5625");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(1);
        int int3 = hashMapCuckooHashing1.hashFunction1((int) 'a');
        boolean boolean4 = hashMapCuckooHashing1.isEmpty();
        int int6 = hashMapCuckooHashing1.hashFunction2(15);
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5626");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        int int5 = hashMapCuckooHashing1.hashFunction1((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test5627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5627");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean4 = hashMapCuckooHashing1.isFull();
        int int6 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean8 = hashMapCuckooHashing1.isEmpty();
        int int9 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.insertKey2HashTable((int) (byte) 1);
        hashMapCuckooHashing1.insertKey2HashTable((int) (byte) 100);
        int int15 = hashMapCuckooHashing1.hashFunction2(0);
        java.lang.Class<?> wildcardClass16 = hashMapCuckooHashing1.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5628");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean4 = hashMapCuckooHashing1.isEmpty();
        int int5 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int11 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5629");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean4 = hashMapCuckooHashing1.checkTableContainsKey(10);
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        int int7 = hashMapCuckooHashing1.hashFunction1(0);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable(0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5630");
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
        int int15 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int16 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.insertKey2HashTable(30);
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable(48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Key 48 already inside, no duplicates allowed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test5631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5631");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) (byte) 1);
        boolean boolean3 = hashMapCuckooHashing1.checkTableContainsKey((-1));
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey(0);
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5632");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double4 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        double double7 = hashMapCuckooHashing1.checkLoadFactor();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = hashMapCuckooHashing1.findKeyInTable(15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test5633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5633");
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
        int int17 = hashMapCuckooHashing1.hashFunction2(20);
        hashMapCuckooHashing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test5634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5634");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.insertKey2HashTable((int) ' ');
        int int9 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean11 = hashMapCuckooHashing1.isEmpty();
        int int13 = hashMapCuckooHashing1.hashFunction1(19);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 19 + "'", int13 == 19);
    }

    @Test
    public void test5635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5635");
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
        boolean boolean20 = hashMapCuckooHashing1.checkTableContainsKey(69);
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
    public void test5636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5636");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) (byte) 1);
        int int3 = hashMapCuckooHashing1.hashFunction2(5);
        hashMapCuckooHashing1.displayHashtable();
        int int6 = hashMapCuckooHashing1.hashFunction1((int) (short) 100);
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test5637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5637");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.insertKey2HashTable((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int7 = hashMapCuckooHashing1.findKeyInTable(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Key 3 not found in table");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test5638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5638");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        int int7 = hashMapCuckooHashing1.hashFunction2((-1));
        int int9 = hashMapCuckooHashing1.hashFunction2((int) (short) 1);
        int int11 = hashMapCuckooHashing1.hashFunction2((int) (byte) 100);
        int int12 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        double double13 = hashMapCuckooHashing1.checkLoadFactor();
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
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
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test5639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5639");
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
        // The following exception was thrown during execution in test generation
        try {
            int int14 = hashMapCuckooHashing1.findKeyInTable((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Key 0 not found in table");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.1d + "'", double9 == 0.1d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5640");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean4 = hashMapCuckooHashing1.checkTableContainsKey(10);
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        int int7 = hashMapCuckooHashing1.hashFunction1(0);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean9 = hashMapCuckooHashing1.isEmpty();
        boolean boolean11 = hashMapCuckooHashing1.checkTableContainsKey(48);
        int int13 = hashMapCuckooHashing1.hashFunction2(10);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = hashMapCuckooHashing1.findKeyInTable(9);
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
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5641");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean4 = hashMapCuckooHashing1.isFull();
        int int6 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int8 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean10 = hashMapCuckooHashing1.isEmpty();
        int int11 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5642");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction1(1);
        int int8 = hashMapCuckooHashing1.hashFunction2((int) '#');
        hashMapCuckooHashing1.displayHashtable();
        double double10 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean11 = hashMapCuckooHashing1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5643");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(12);
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5644");
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
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int14 = hashMapCuckooHashing1.hashFunction1((int) (short) 0);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5645");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean4 = hashMapCuckooHashing1.isEmpty();
        int int5 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean7 = hashMapCuckooHashing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test5646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5646");
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
        int int16 = hashMapCuckooHashing1.hashFunction1(0);
        int int18 = hashMapCuckooHashing1.hashFunction2(8);
        boolean boolean19 = hashMapCuckooHashing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.1d + "'", double9 == 0.1d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5647");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int3 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double5 = hashMapCuckooHashing1.checkLoadFactor();
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean8 = hashMapCuckooHashing1.checkTableContainsKey((-1));
        // The following exception was thrown during execution in test generation
        try {
            int int10 = hashMapCuckooHashing1.findKeyInTable(8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5648");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean4 = hashMapCuckooHashing1.checkTableContainsKey(10);
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        boolean boolean6 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.insertKey2HashTable(1);
        boolean boolean10 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5649");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean4 = hashMapCuckooHashing1.isFull();
        int int6 = hashMapCuckooHashing1.hashFunction1((int) '#');
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        double double8 = hashMapCuckooHashing1.checkLoadFactor();
        int int9 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        double double10 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean12 = hashMapCuckooHashing1.checkTableContainsKey(79);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5650");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.insertKey2HashTable(12);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean6 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5651");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean4 = hashMapCuckooHashing1.isFull();
        int int6 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.displayHashtable();
        int int9 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean10 = hashMapCuckooHashing1.isFull();
        int int12 = hashMapCuckooHashing1.hashFunction2(19);
        hashMapCuckooHashing1.insertKey2HashTable(9);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test5652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5652");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction2((int) '#');
        int int8 = hashMapCuckooHashing1.hashFunction2((int) (byte) 100);
        hashMapCuckooHashing1.insertKey2HashTable((int) '#');
        int int12 = hashMapCuckooHashing1.hashFunction2((int) (short) -1);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.insertKey2HashTable(48);
        boolean boolean17 = hashMapCuckooHashing1.checkTableContainsKey((int) ' ');
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5653");
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
        hashMapCuckooHashing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test5654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5654");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean7 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 1);
        boolean boolean8 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        int int11 = hashMapCuckooHashing1.hashFunction2((int) (short) 100);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = hashMapCuckooHashing1.findKeyInTable(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 5 + "'", int11 == 5);
    }

    @Test
    public void test5655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5655");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int3 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 0);
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int8 = hashMapCuckooHashing1.hashFunction1((int) (byte) -1);
        hashMapCuckooHashing1.insertKey2HashTable((int) (byte) 10);
        boolean boolean11 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.insertKey2HashTable(30);
        int int15 = hashMapCuckooHashing1.hashFunction1((int) (short) 1);
        boolean boolean16 = hashMapCuckooHashing1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5656");
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
        int int15 = hashMapCuckooHashing1.hashFunction2((int) (byte) 0);
        int int17 = hashMapCuckooHashing1.hashFunction1((int) ' ');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test5657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5657");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(1);
        boolean boolean2 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 0);
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int9 = hashMapCuckooHashing1.hashFunction1((int) (byte) 0);
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double12 = hashMapCuckooHashing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.25d + "'", double12 == 0.25d);
    }

    @Test
    public void test5658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5658");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction2((int) '#');
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey(0);
        int int11 = hashMapCuckooHashing1.hashFunction2(0);
        int int13 = hashMapCuckooHashing1.hashFunction1((int) 'a');
        boolean boolean15 = hashMapCuckooHashing1.checkTableContainsKey(30);
        int int17 = hashMapCuckooHashing1.hashFunction1((int) '#');
        double double18 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean20 = hashMapCuckooHashing1.isEmpty();
        java.lang.Class<?> wildcardClass21 = hashMapCuckooHashing1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.0d + "'", double18 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5659");
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
    }

    @Test
    public void test5660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5660");
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
        // The following exception was thrown during execution in test generation
        try {
            int int17 = hashMapCuckooHashing1.findKeyInTable((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
    public void test5661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5661");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        boolean boolean6 = hashMapCuckooHashing1.isEmpty();
        double double7 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean8 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean10 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test5662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5662");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean6 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 1);
        boolean boolean8 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 1);
        int int9 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5663");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) (byte) 1);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        int int3 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean6 = hashMapCuckooHashing1.checkTableContainsKey(10);
        hashMapCuckooHashing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5664");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction2((int) '#');
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey((int) 'a');
        boolean boolean10 = hashMapCuckooHashing1.isFull();
        double double11 = hashMapCuckooHashing1.checkLoadFactor();
        double double12 = hashMapCuckooHashing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5665");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double3 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean4 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean7 = hashMapCuckooHashing1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.insertKey2HashTable(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test5666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5666");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        int int5 = hashMapCuckooHashing1.hashFunction2(100);
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        int int8 = hashMapCuckooHashing1.hashFunction1((-1));
        int int9 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5667");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean6 = hashMapCuckooHashing1.checkTableContainsKey(9);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean8 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5668");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        boolean boolean7 = hashMapCuckooHashing1.isFull();
        double double8 = hashMapCuckooHashing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5669");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction2((int) '#');
        int int8 = hashMapCuckooHashing1.hashFunction2((int) (byte) 100);
        hashMapCuckooHashing1.insertKey2HashTable((int) '#');
        boolean boolean11 = hashMapCuckooHashing1.isFull();
        double double12 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean14 = hashMapCuckooHashing1.checkTableContainsKey(10);
        boolean boolean15 = hashMapCuckooHashing1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = hashMapCuckooHashing1.findKeyInTable((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Key 100 not found in table");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.1d + "'", double12 == 0.1d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5670");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey(10);
        boolean boolean10 = hashMapCuckooHashing1.isFull();
        boolean boolean12 = hashMapCuckooHashing1.checkTableContainsKey((-1));
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5671");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean3 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 0);
        double double4 = hashMapCuckooHashing1.checkLoadFactor();
        int int5 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.insertKey2HashTable(19);
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 0);
        boolean boolean12 = hashMapCuckooHashing1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable(1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Key 1 already inside, no duplicates allowed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5672");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey(10);
        boolean boolean10 = hashMapCuckooHashing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5673");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean7 = hashMapCuckooHashing1.isFull();
        int int9 = hashMapCuckooHashing1.hashFunction2(19);
        double double10 = hashMapCuckooHashing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test5674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5674");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double3 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int5 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.displayHashtable();
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean8 = hashMapCuckooHashing1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable(20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test5675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5675");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 0);
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        boolean boolean8 = hashMapCuckooHashing1.isFull();
        double double9 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean11 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.1d + "'", double9 == 0.1d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5676");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) (byte) 0);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean3 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int5 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean7 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = hashMapCuckooHashing1.findKeyInTable(48);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test5677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5677");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction2((int) '#');
        int int8 = hashMapCuckooHashing1.hashFunction2((int) (byte) 100);
        hashMapCuckooHashing1.insertKey2HashTable((int) '#');
        int int12 = hashMapCuckooHashing1.hashFunction2((int) (short) -1);
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean14 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        int int17 = hashMapCuckooHashing1.hashFunction2(4);
        int int19 = hashMapCuckooHashing1.hashFunction1(9);
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Key 52 already inside, no duplicates allowed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 9 + "'", int19 == 9);
    }

    @Test
    public void test5678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5678");
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5679");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int3 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int5 = hashMapCuckooHashing1.hashFunction1((-1));
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = hashMapCuckooHashing1.findKeyInTable(3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test5680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5680");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction2((int) '#');
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean8 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 100);
        boolean boolean10 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 0);
        boolean boolean11 = hashMapCuckooHashing1.isFull();
        double double12 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean13 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5681");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) ' ');
        hashMapCuckooHashing1.insertKey2HashTable(0);
        boolean boolean4 = hashMapCuckooHashing1.isEmpty();
        double double5 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.03125d + "'", double5 == 0.03125d);
    }

    @Test
    public void test5682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5682");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        boolean boolean6 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test5683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5683");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean4 = hashMapCuckooHashing1.checkTableContainsKey((int) '4');
        double double5 = hashMapCuckooHashing1.checkLoadFactor();
        int int7 = hashMapCuckooHashing1.hashFunction1(12);
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean10 = hashMapCuckooHashing1.checkTableContainsKey(39);
        int int12 = hashMapCuckooHashing1.hashFunction1(48);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
    }

    @Test
    public void test5684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5684");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean4 = hashMapCuckooHashing1.isFull();
        int int6 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int8 = hashMapCuckooHashing1.hashFunction1((int) (short) 1);
        hashMapCuckooHashing1.insertKey2HashTable((int) '#');
        int int12 = hashMapCuckooHashing1.hashFunction2((int) (byte) 10);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test5685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5685");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.insertKey2HashTable(5);
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean8 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 1);
        hashMapCuckooHashing1.insertKey2HashTable(12);
        hashMapCuckooHashing1.insertKey2HashTable(39);
        boolean boolean13 = hashMapCuckooHashing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5686");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction2((int) '#');
        int int8 = hashMapCuckooHashing1.hashFunction2((int) (byte) 100);
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) -1);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int13 = hashMapCuckooHashing1.hashFunction2((int) (short) 1);
        int int15 = hashMapCuckooHashing1.hashFunction2((int) (byte) 0);
        boolean boolean16 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5687");
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
        hashMapCuckooHashing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test5688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5688");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isEmpty();
        boolean boolean4 = hashMapCuckooHashing1.isEmpty();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double9 = hashMapCuckooHashing1.checkLoadFactor();
        double double10 = hashMapCuckooHashing1.checkLoadFactor();
        double double11 = hashMapCuckooHashing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue(Double.isNaN(double9));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
        org.junit.Assert.assertTrue(Double.isNaN(double11));
    }

    @Test
    public void test5689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5689");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean6 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 1);
        boolean boolean8 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 1);
        int int9 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean10 = hashMapCuckooHashing1.isFull();
        boolean boolean12 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 0);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean14 = hashMapCuckooHashing1.isFull();
        boolean boolean15 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test5690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5690");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean3 = hashMapCuckooHashing1.isEmpty();
        boolean boolean4 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test5691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5691");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) '4');
        int int3 = hashMapCuckooHashing1.hashFunction2(12);
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) 'a');
        int int7 = hashMapCuckooHashing1.hashFunction1((int) (byte) 0);
        java.lang.Class<?> wildcardClass8 = hashMapCuckooHashing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5692");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey((int) '#');
        boolean boolean10 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean13 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5693");
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
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test5694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5694");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 100);
        double double10 = hashMapCuckooHashing1.checkLoadFactor();
        int int12 = hashMapCuckooHashing1.hashFunction1(20);
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5695");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) '4');
        int int3 = hashMapCuckooHashing1.hashFunction2(12);
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) 'a');
        int int7 = hashMapCuckooHashing1.hashFunction1((int) (byte) 0);
        int int8 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        double double9 = hashMapCuckooHashing1.checkLoadFactor();
        int int10 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5696");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) '#');
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey(17);
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        double double8 = hashMapCuckooHashing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5697");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int7 = hashMapCuckooHashing1.hashFunction2((int) (byte) 1);
        hashMapCuckooHashing1.displayHashtable();
        int int10 = hashMapCuckooHashing1.hashFunction1(10);
        int int12 = hashMapCuckooHashing1.hashFunction2(9);
        int int14 = hashMapCuckooHashing1.hashFunction1((int) ' ');
        int int15 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 12 + "'", int14 == 12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5698");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        int int9 = hashMapCuckooHashing1.hashFunction2((int) (short) -1);
        boolean boolean10 = hashMapCuckooHashing1.isFull();
        boolean boolean11 = hashMapCuckooHashing1.isFull();
        int int13 = hashMapCuckooHashing1.hashFunction2(35);
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable(30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test5699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5699");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        int int5 = hashMapCuckooHashing1.hashFunction2(100);
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5700");
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
        int int21 = hashMapCuckooHashing1.hashFunction1((-1));
        int int23 = hashMapCuckooHashing1.hashFunction1((int) (short) 0);
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
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 39 + "'", int21 == 39);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test5701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5701");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean4 = hashMapCuckooHashing1.isFull();
        int int6 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean9 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.insertKey2HashTable((int) 'a');
        boolean boolean13 = hashMapCuckooHashing1.checkTableContainsKey(19);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5702");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) '#');
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey(17);
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.insertKey2HashTable(7);
        boolean boolean10 = hashMapCuckooHashing1.isEmpty();
        int int12 = hashMapCuckooHashing1.hashFunction1(5);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
    }

    @Test
    public void test5703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5703");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        int int4 = hashMapCuckooHashing1.hashFunction2((int) (short) 10);
        int int5 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        boolean boolean7 = hashMapCuckooHashing1.isFull();
        int int9 = hashMapCuckooHashing1.hashFunction1(7);
        int int11 = hashMapCuckooHashing1.hashFunction1(30);
        int int12 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 7 + "'", int9 == 7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5704");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        int int5 = hashMapCuckooHashing1.hashFunction2(100);
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean8 = hashMapCuckooHashing1.checkTableContainsKey(10);
        boolean boolean9 = hashMapCuckooHashing1.isFull();
        java.lang.Class<?> wildcardClass10 = hashMapCuckooHashing1.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5705");
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
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean20 = hashMapCuckooHashing1.checkTableContainsKey(5);
        int int22 = hashMapCuckooHashing1.hashFunction2((int) (short) -1);
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
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test5706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5706");
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
        hashMapCuckooHashing1.insertKey2HashTable(10);
        hashMapCuckooHashing1.insertKey2HashTable(0);
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
    public void test5707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5707");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) '4');
        int int3 = hashMapCuckooHashing1.hashFunction2(12);
        int int5 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5708");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        double double4 = hashMapCuckooHashing1.checkLoadFactor();
        int int5 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean8 = hashMapCuckooHashing1.isFull();
        boolean boolean10 = hashMapCuckooHashing1.checkTableContainsKey(30);
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable(99);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5709");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 0);
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        int int9 = hashMapCuckooHashing1.hashFunction1((int) (byte) 1);
        boolean boolean10 = hashMapCuckooHashing1.isFull();
        boolean boolean12 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 1);
        boolean boolean13 = hashMapCuckooHashing1.isEmpty();
        boolean boolean14 = hashMapCuckooHashing1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = hashMapCuckooHashing1.findKeyInTable(36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Key 36 not found in table");
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
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5710");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean3 = hashMapCuckooHashing1.isEmpty();
        boolean boolean4 = hashMapCuckooHashing1.isFull();
        double double5 = hashMapCuckooHashing1.checkLoadFactor();
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        double double7 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean8 = hashMapCuckooHashing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test5711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5711");
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
        hashMapCuckooHashing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5712");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction2((int) '#');
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey(0);
        int int11 = hashMapCuckooHashing1.hashFunction1((int) (short) -1);
        hashMapCuckooHashing1.insertKey2HashTable((int) 'a');
        hashMapCuckooHashing1.insertKey2HashTable(10);
        int int17 = hashMapCuckooHashing1.hashFunction1(15);
        int int18 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test5713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5713");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int3 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 0);
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.insertKey2HashTable(5);
        int int11 = hashMapCuckooHashing1.hashFunction2(7);
        double double12 = hashMapCuckooHashing1.checkLoadFactor();
        java.lang.Class<?> wildcardClass13 = hashMapCuckooHashing1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.05d + "'", double12 == 0.05d);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5714");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.insertKey2HashTable((int) ' ');
        int int10 = hashMapCuckooHashing1.hashFunction1(5);
        double double11 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean13 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.1d + "'", double11 == 0.1d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5715");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        hashMapCuckooHashing1.displayHashtable();
        int int8 = hashMapCuckooHashing1.hashFunction2(0);
        boolean boolean9 = hashMapCuckooHashing1.isEmpty();
        boolean boolean10 = hashMapCuckooHashing1.isEmpty();
        boolean boolean12 = hashMapCuckooHashing1.checkTableContainsKey(17);
        int int14 = hashMapCuckooHashing1.hashFunction1(99);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
    }

    @Test
    public void test5716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5716");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean7 = hashMapCuckooHashing1.isFull();
        double double8 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean10 = hashMapCuckooHashing1.checkTableContainsKey((int) ' ');
        boolean boolean11 = hashMapCuckooHashing1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5717");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) (byte) 1);
        int int3 = hashMapCuckooHashing1.hashFunction2(5);
        hashMapCuckooHashing1.displayHashtable();
        int int6 = hashMapCuckooHashing1.hashFunction1((int) (short) 100);
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5718");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean6 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 1);
        boolean boolean8 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 1);
        int int9 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean11 = hashMapCuckooHashing1.checkTableContainsKey(19);
        int int13 = hashMapCuckooHashing1.hashFunction2(0);
        hashMapCuckooHashing1.insertKey2HashTable(69);
        int int16 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test5719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5719");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean4 = hashMapCuckooHashing1.isFull();
        int int6 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int8 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.insertKey2HashTable(0);
        int int11 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test5720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5720");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double4 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        int int8 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double6));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5721");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int3 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test5722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5722");
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
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 12 + "'", int9 == 12);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5723");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double3 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean4 = hashMapCuckooHashing1.isFull();
        double double5 = hashMapCuckooHashing1.checkLoadFactor();
        int int7 = hashMapCuckooHashing1.hashFunction2((int) (short) 1);
        org.junit.Assert.assertTrue("'" + double3 + "' != '" + 0.0d + "'", double3 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5724");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(17);
        hashMapCuckooHashing1.insertKey2HashTable((int) (byte) 0);
    }

    @Test
    public void test5725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5725");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.insertKey2HashTable((-1));
        boolean boolean9 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5726");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(1);
        boolean boolean2 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 0);
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.insertKey2HashTable(10);
        int int8 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean9 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.deleteKeyFromHashTable(0);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = hashMapCuckooHashing1.findKeyInTable((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Key -1 not found in table");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5727");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(15);
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 10);
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean6 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5728");
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
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
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
    }

    @Test
    public void test5729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5729");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.insertKey2HashTable((int) (byte) 0);
        int int8 = hashMapCuckooHashing1.hashFunction1((int) (byte) -1);
        int int10 = hashMapCuckooHashing1.hashFunction1((int) (short) 1);
        boolean boolean11 = hashMapCuckooHashing1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Key -1 already inside, no duplicates allowed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 19 + "'", int8 == 19);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5730");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.insertKey2HashTable((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test5731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5731");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean3 = hashMapCuckooHashing1.isEmpty();
        boolean boolean4 = hashMapCuckooHashing1.isFull();
        double double5 = hashMapCuckooHashing1.checkLoadFactor();
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = hashMapCuckooHashing1.hashFunction2(1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double5));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5732");
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
        double double18 = hashMapCuckooHashing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + double18 + "' != '" + 0.025d + "'", double18 == 0.025d);
    }

    @Test
    public void test5733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5733");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(1);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int5 = hashMapCuckooHashing1.hashFunction2(19);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5734");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) '#');
        hashMapCuckooHashing1.insertKey2HashTable((int) '#');
        boolean boolean4 = hashMapCuckooHashing1.isFull();
        int int5 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean6 = hashMapCuckooHashing1.isEmpty();
        int int8 = hashMapCuckooHashing1.hashFunction2((int) ' ');
        double double9 = hashMapCuckooHashing1.checkLoadFactor();
        double double10 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int13 = hashMapCuckooHashing1.hashFunction2(20);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.02857142857142857d + "'", double9 == 0.02857142857142857d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.02857142857142857d + "'", double10 == 0.02857142857142857d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5735");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.insertKey2HashTable((int) ' ');
        int int9 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        double double10 = hashMapCuckooHashing1.checkLoadFactor();
        double double11 = hashMapCuckooHashing1.checkLoadFactor();
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable(20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Key 20 already inside, no duplicates allowed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.1d + "'", double10 == 0.1d);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.1d + "'", double11 == 0.1d);
    }

    @Test
    public void test5736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5736");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction2((int) '#');
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey(0);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double11 = hashMapCuckooHashing1.checkLoadFactor();
        int int13 = hashMapCuckooHashing1.hashFunction1((int) (short) 1);
        int int14 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5737");
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
    public void test5738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5738");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.insertKey2HashTable(5);
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean8 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 1);
        hashMapCuckooHashing1.insertKey2HashTable((int) (byte) 0);
        int int11 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int13 = hashMapCuckooHashing1.findKeyInTable((int) (byte) 0);
        hashMapCuckooHashing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5739");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean6 = hashMapCuckooHashing1.checkTableContainsKey(100);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = hashMapCuckooHashing1.findKeyInTable(16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5740");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        hashMapCuckooHashing1.displayHashtable();
        int int8 = hashMapCuckooHashing1.hashFunction2((int) (short) 1);
        int int10 = hashMapCuckooHashing1.hashFunction2((int) '4');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
    }

    @Test
    public void test5741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5741");
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
        // The following exception was thrown during execution in test generation
        try {
            int int19 = hashMapCuckooHashing1.findKeyInTable(35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Key 35 not found in table");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
    }

    @Test
    public void test5742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5742");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double3 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean4 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int8 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        double double9 = hashMapCuckooHashing1.checkLoadFactor();
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test5743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5743");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        boolean boolean8 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.insertKey2HashTable((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable(2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Key 2 already inside, no duplicates allowed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test5744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5744");
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
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5745");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) ' ');
        hashMapCuckooHashing1.insertKey2HashTable(0);
        double double4 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        int int7 = hashMapCuckooHashing1.hashFunction1((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.03125d + "'", double4 == 0.03125d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 10 + "'", int7 == 10);
    }

    @Test
    public void test5746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5746");
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
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double15 = hashMapCuckooHashing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
        org.junit.Assert.assertTrue("'" + double15 + "' != '" + 0.0d + "'", double15 == 0.0d);
    }

    @Test
    public void test5747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5747");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        int int5 = hashMapCuckooHashing1.hashFunction2(100);
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        boolean boolean8 = hashMapCuckooHashing1.checkTableContainsKey((int) ' ');
        hashMapCuckooHashing1.insertKey2HashTable(3);
        int int12 = hashMapCuckooHashing1.hashFunction2(8);
        hashMapCuckooHashing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5748");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        int int4 = hashMapCuckooHashing1.hashFunction2((int) (short) 10);
        int int6 = hashMapCuckooHashing1.hashFunction1(10);
        int int8 = hashMapCuckooHashing1.hashFunction1((int) (short) 1);
        int int10 = hashMapCuckooHashing1.hashFunction1(2);
        int int12 = hashMapCuckooHashing1.hashFunction2(1);
        boolean boolean13 = hashMapCuckooHashing1.isFull();
        int int15 = hashMapCuckooHashing1.hashFunction1(7);
        double double16 = hashMapCuckooHashing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0d + "'", double16 == 0.0d);
    }

    @Test
    public void test5749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5749");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        boolean boolean8 = hashMapCuckooHashing1.isEmpty();
        int int9 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        double double10 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.insertKey2HashTable((int) ' ');
        int int14 = hashMapCuckooHashing1.hashFunction1(7);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 7 + "'", int14 == 7);
    }

    @Test
    public void test5750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5750");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        double double4 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test5751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5751");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean4 = hashMapCuckooHashing1.checkTableContainsKey(10);
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        int int7 = hashMapCuckooHashing1.hashFunction1(0);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean9 = hashMapCuckooHashing1.isEmpty();
        int int11 = hashMapCuckooHashing1.hashFunction2(5);
        boolean boolean12 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test5752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5752");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(1);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5753");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        boolean boolean7 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 10);
        hashMapCuckooHashing1.insertKey2HashTable(100);
        boolean boolean11 = hashMapCuckooHashing1.checkTableContainsKey((int) ' ');
        boolean boolean13 = hashMapCuckooHashing1.checkTableContainsKey(79);
        int int14 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test5754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5754");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        double double4 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test5755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5755");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        int int4 = hashMapCuckooHashing1.hashFunction2((int) (short) 10);
        int int6 = hashMapCuckooHashing1.hashFunction2((int) (short) 10);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.insertKey2HashTable((int) '#');
        int int11 = hashMapCuckooHashing1.hashFunction2((int) '#');
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 0);
        boolean boolean15 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 10);
        boolean boolean17 = hashMapCuckooHashing1.checkTableContainsKey(9);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5756");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int3 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 0);
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int8 = hashMapCuckooHashing1.hashFunction1((int) (byte) -1);
        hashMapCuckooHashing1.insertKey2HashTable((int) (byte) 10);
        hashMapCuckooHashing1.displayHashtable();
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Key 97 already inside, no duplicates allowed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
    }

    @Test
    public void test5757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5757");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) '#');
        hashMapCuckooHashing1.insertKey2HashTable((int) '#');
        boolean boolean4 = hashMapCuckooHashing1.isFull();
        int int5 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        boolean boolean8 = hashMapCuckooHashing1.checkTableContainsKey(35);
        int int10 = hashMapCuckooHashing1.hashFunction2((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5758");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) ' ');
        int int6 = hashMapCuckooHashing1.hashFunction2(2);
        hashMapCuckooHashing1.insertKey2HashTable((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable(12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Key 12 already inside, no duplicates allowed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 12 + "'", int4 == 12);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5759");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int3 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 1);
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 10);
        double double10 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean11 = hashMapCuckooHashing1.isFull();
        boolean boolean12 = hashMapCuckooHashing1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5760");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) (byte) 0);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean3 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.displayHashtable();
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test5761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5761");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction2((int) '#');
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey(0);
        double double10 = hashMapCuckooHashing1.checkLoadFactor();
        int int11 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean12 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean15 = hashMapCuckooHashing1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5762");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(1);
        boolean boolean2 = hashMapCuckooHashing1.isEmpty();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        int int5 = hashMapCuckooHashing1.hashFunction1((int) (byte) 100);
        boolean boolean6 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test5763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5763");
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
        hashMapCuckooHashing1.insertKey2HashTable(1);
        hashMapCuckooHashing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.1d + "'", double13 == 0.1d);
    }

    @Test
    public void test5764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5764");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        int int4 = hashMapCuckooHashing1.hashFunction2((int) (short) 10);
        int int6 = hashMapCuckooHashing1.hashFunction1(10);
        int int8 = hashMapCuckooHashing1.hashFunction1((int) (short) 1);
        int int10 = hashMapCuckooHashing1.hashFunction1(2);
        int int12 = hashMapCuckooHashing1.hashFunction2(1);
        int int13 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.insertKey2HashTable(4);
        hashMapCuckooHashing1.displayHashtable();
        double double17 = hashMapCuckooHashing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double17 + "' != '" + 0.1d + "'", double17 == 0.1d);
    }

    @Test
    public void test5765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5765");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isEmpty();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean6 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey((-1));
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
    public void test5766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5766");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        int int7 = hashMapCuckooHashing1.hashFunction2((-1));
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.insertKey2HashTable(5);
        boolean boolean11 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5767");
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
        boolean boolean15 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.insertKey2HashTable((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5768");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        boolean boolean6 = hashMapCuckooHashing1.isEmpty();
        double double7 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean8 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = hashMapCuckooHashing1.hashFunction1(29);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test5769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5769");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction2((int) '#');
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey(0);
        int int11 = hashMapCuckooHashing1.hashFunction1((int) (short) -1);
        hashMapCuckooHashing1.displayHashtable();
        int int14 = hashMapCuckooHashing1.hashFunction1(4);
        int int15 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean17 = hashMapCuckooHashing1.checkTableContainsKey(79);
        boolean boolean19 = hashMapCuckooHashing1.checkTableContainsKey(69);
        boolean boolean20 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test5770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5770");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        int int4 = hashMapCuckooHashing1.hashFunction2((int) (short) 10);
        int int6 = hashMapCuckooHashing1.hashFunction2((int) (short) 10);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.insertKey2HashTable((int) '#');
        boolean boolean10 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.insertKey2HashTable(9);
        hashMapCuckooHashing1.insertKey2HashTable(3);
        boolean boolean15 = hashMapCuckooHashing1.isFull();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5771");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.insertKey2HashTable(5);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean7 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.insertKey2HashTable(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test5772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5772");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) ' ');
        hashMapCuckooHashing1.insertKey2HashTable(0);
        boolean boolean4 = hashMapCuckooHashing1.isEmpty();
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.03125d + "'", double6 == 0.03125d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test5773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5773");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) (byte) 1);
        int int3 = hashMapCuckooHashing1.hashFunction2(5);
        int int5 = hashMapCuckooHashing1.hashFunction2(3);
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test5774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5774");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) (byte) 0);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean3 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int5 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean7 = hashMapCuckooHashing1.isFull();
        boolean boolean8 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        org.junit.Assert.assertTrue(Double.isNaN(double2));
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test5775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5775");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) (byte) 1);
        int int3 = hashMapCuckooHashing1.hashFunction2(5);
        boolean boolean4 = hashMapCuckooHashing1.isFull();
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        int int7 = hashMapCuckooHashing1.hashFunction1(7);
        double double8 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.insertKey2HashTable(100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
    }

    @Test
    public void test5776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5776");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction2((int) '#');
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean8 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 100);
        int int10 = hashMapCuckooHashing1.hashFunction1(3);
        int int11 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean12 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.insertKey2HashTable((int) '#');
        boolean boolean15 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5777");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 0);
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        int int9 = hashMapCuckooHashing1.hashFunction2(12);
        boolean boolean10 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean14 = hashMapCuckooHashing1.checkTableContainsKey(20);
        hashMapCuckooHashing1.displayHashtable();
        int int17 = hashMapCuckooHashing1.hashFunction2(39);
        int int19 = hashMapCuckooHashing1.hashFunction2((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test5778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5778");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        int int8 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int11 = hashMapCuckooHashing1.hashFunction2(79);
        int int13 = hashMapCuckooHashing1.hashFunction2((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5779");
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
        boolean boolean13 = hashMapCuckooHashing1.checkTableContainsKey(8);
        hashMapCuckooHashing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.1d + "'", double9 == 0.1d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5780");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction2((int) '#');
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        int int8 = hashMapCuckooHashing1.hashFunction1((int) (byte) 10);
        int int9 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        double double10 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean11 = hashMapCuckooHashing1.isFull();
        boolean boolean12 = hashMapCuckooHashing1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5781");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) '#');
        hashMapCuckooHashing1.insertKey2HashTable((int) '#');
        boolean boolean4 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.insertKey2HashTable(2);
        int int8 = hashMapCuckooHashing1.hashFunction1(100);
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean10 = hashMapCuckooHashing1.isFull();
        int int11 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 30 + "'", int8 == 30);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test5782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5782");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean6 = hashMapCuckooHashing1.checkTableContainsKey(100);
        int int8 = hashMapCuckooHashing1.hashFunction1(3);
        hashMapCuckooHashing1.displayHashtable();
        int int11 = hashMapCuckooHashing1.hashFunction1((int) ' ');
        int int12 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5783");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        boolean boolean7 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 0);
        int int9 = hashMapCuckooHashing1.hashFunction1(100);
        boolean boolean10 = hashMapCuckooHashing1.isEmpty();
        boolean boolean11 = hashMapCuckooHashing1.isEmpty();
        int int13 = hashMapCuckooHashing1.hashFunction2(1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5784");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double3 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean4 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        double double8 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        double double10 = hashMapCuckooHashing1.checkLoadFactor();
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: / by zero");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double3));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double8));
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test5785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5785");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) -1);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean11 = hashMapCuckooHashing1.checkTableContainsKey((int) '#');
        double double12 = hashMapCuckooHashing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.025d + "'", double12 == 0.025d);
    }

    @Test
    public void test5786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5786");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test5787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5787");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean6 = hashMapCuckooHashing1.checkTableContainsKey(100);
        int int8 = hashMapCuckooHashing1.hashFunction1((int) '4');
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = hashMapCuckooHashing1.findKeyInTable(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 12 + "'", int8 == 12);
    }

    @Test
    public void test5788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5788");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 0);
        int int8 = hashMapCuckooHashing1.hashFunction2((int) (byte) 1);
        hashMapCuckooHashing1.deleteKeyFromHashTable(0);
        double double11 = hashMapCuckooHashing1.checkLoadFactor();
        int int13 = hashMapCuckooHashing1.hashFunction1((int) (short) -1);
        hashMapCuckooHashing1.displayHashtable();
        java.lang.Class<?> wildcardClass15 = hashMapCuckooHashing1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5789");
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
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test5790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5790");
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
        int int16 = hashMapCuckooHashing1.hashFunction2(0);
        hashMapCuckooHashing1.insertKey2HashTable(79);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test5791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5791");
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
        // The following exception was thrown during execution in test generation
        try {
            int int17 = hashMapCuckooHashing1.findKeyInTable((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Key 1 not found in table");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 19 + "'", int8 == 19);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.025d + "'", double14 == 0.025d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test5792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5792");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean4 = hashMapCuckooHashing1.isEmpty();
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        boolean boolean6 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test5793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5793");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test5794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5794");
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
        int int19 = hashMapCuckooHashing1.hashFunction1(100);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = hashMapCuckooHashing1.findKeyInTable(15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Key 15 not found in table");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test5795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5795");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        boolean boolean7 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 10);
        double double8 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean9 = hashMapCuckooHashing1.isFull();
        boolean boolean11 = hashMapCuckooHashing1.checkTableContainsKey((int) '#');
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5796");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) '#');
        hashMapCuckooHashing1.insertKey2HashTable((int) '#');
        boolean boolean4 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.insertKey2HashTable(2);
        int int8 = hashMapCuckooHashing1.hashFunction1(100);
        boolean boolean10 = hashMapCuckooHashing1.checkTableContainsKey((int) '#');
        boolean boolean11 = hashMapCuckooHashing1.isEmpty();
        boolean boolean12 = hashMapCuckooHashing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 30 + "'", int8 == 30);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5797");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double4 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = hashMapCuckooHashing1.hashFunction2((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
    }

    @Test
    public void test5798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5798");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        int int6 = hashMapCuckooHashing1.hashFunction2((int) (short) 1);
        boolean boolean8 = hashMapCuckooHashing1.checkTableContainsKey(2);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean11 = hashMapCuckooHashing1.checkTableContainsKey((int) ' ');
        double double12 = hashMapCuckooHashing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + double12 + "' != '" + 0.0d + "'", double12 == 0.0d);
    }

    @Test
    public void test5799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5799");
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
            int int13 = hashMapCuckooHashing1.findKeyInTable((int) (short) 10);
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
    public void test5800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5800");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        boolean boolean8 = hashMapCuckooHashing1.isEmpty();
        int int9 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        double double10 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.insertKey2HashTable(17);
        int int14 = hashMapCuckooHashing1.hashFunction1(39);
        int int15 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test5801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5801");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        boolean boolean6 = hashMapCuckooHashing1.isEmpty();
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int9 = hashMapCuckooHashing1.hashFunction1(0);
        int int11 = hashMapCuckooHashing1.hashFunction1(30);
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5802");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.insertKey2HashTable((-1));
        boolean boolean9 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 1);
        boolean boolean13 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5803");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean6 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 1);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.displayHashtable();
        int int9 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test5804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5804");
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
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int15 = hashMapCuckooHashing1.hashFunction2(39);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5805");
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
        hashMapCuckooHashing1.insertKey2HashTable(29);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
    }

    @Test
    public void test5806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5806");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isEmpty();
        boolean boolean4 = hashMapCuckooHashing1.isEmpty();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        boolean boolean6 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double10 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = hashMapCuckooHashing1.hashFunction1(8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double10));
    }

    @Test
    public void test5807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5807");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        int int9 = hashMapCuckooHashing1.hashFunction2((int) (short) 1);
        int int10 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        java.lang.Class<?> wildcardClass11 = hashMapCuckooHashing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5808");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean7 = hashMapCuckooHashing1.isFull();
        boolean boolean8 = hashMapCuckooHashing1.isEmpty();
        double double9 = hashMapCuckooHashing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double9));
    }

    @Test
    public void test5809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5809");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction2((int) '#');
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey(0);
        int int11 = hashMapCuckooHashing1.hashFunction2(0);
        int int13 = hashMapCuckooHashing1.hashFunction1((int) 'a');
        hashMapCuckooHashing1.insertKey2HashTable(12);
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean17 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5810");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean7 = hashMapCuckooHashing1.isFull();
        boolean boolean8 = hashMapCuckooHashing1.isEmpty();
        boolean boolean9 = hashMapCuckooHashing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5811");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        int int7 = hashMapCuckooHashing1.hashFunction2((-1));
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.insertKey2HashTable(5);
        boolean boolean11 = hashMapCuckooHashing1.isEmpty();
        java.lang.Class<?> wildcardClass12 = hashMapCuckooHashing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5812");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        int int5 = hashMapCuckooHashing1.hashFunction2(100);
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int8 = hashMapCuckooHashing1.hashFunction2((int) (short) 1);
        int int9 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        double double10 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
    }

    @Test
    public void test5813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5813");
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
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5814");
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
        int int15 = hashMapCuckooHashing1.hashFunction1(48);
        double double16 = hashMapCuckooHashing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 48 + "'", int15 == 48);
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 0.0125d + "'", double16 == 0.0125d);
    }

    @Test
    public void test5815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5815");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) (short) 10);
        int int3 = hashMapCuckooHashing1.hashFunction1((int) 'a');
        java.lang.Class<?> wildcardClass4 = hashMapCuckooHashing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 7 + "'", int3 == 7);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5816");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean4 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        java.lang.Class<?> wildcardClass7 = hashMapCuckooHashing1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5817");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        int int5 = hashMapCuckooHashing1.hashFunction2(100);
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean7 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        int int10 = hashMapCuckooHashing1.hashFunction2(9);
        int int11 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int13 = hashMapCuckooHashing1.hashFunction1((int) (byte) 100);
        boolean boolean14 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.insertKey2HashTable((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test5818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5818");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean6 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 1);
        boolean boolean8 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 1);
        hashMapCuckooHashing1.insertKey2HashTable(10);
        boolean boolean12 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 0);
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean15 = hashMapCuckooHashing1.checkTableContainsKey(100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5819");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        int int7 = hashMapCuckooHashing1.hashFunction1(19);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.insertKey2HashTable(8);
        boolean boolean11 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5820");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean6 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean8 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.insertKey2HashTable(30);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5821");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.insertKey2HashTable(0);
        int int8 = hashMapCuckooHashing1.hashFunction1(100);
        hashMapCuckooHashing1.insertKey2HashTable(100);
        boolean boolean11 = hashMapCuckooHashing1.isFull();
        int int13 = hashMapCuckooHashing1.hashFunction1(19);
        double double14 = hashMapCuckooHashing1.checkLoadFactor();
        int int16 = hashMapCuckooHashing1.hashFunction1(2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 19 + "'", int13 == 19);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.05d + "'", double14 == 0.05d);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test5822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5822");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 0);
        int int8 = hashMapCuckooHashing1.hashFunction2((int) (byte) 1);
        int int10 = hashMapCuckooHashing1.hashFunction1((int) (short) 0);
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        double double13 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.1d + "'", double13 == 0.1d);
    }

    @Test
    public void test5823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5823");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction2((int) '#');
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        int int8 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean9 = hashMapCuckooHashing1.isFull();
        boolean boolean10 = hashMapCuckooHashing1.isFull();
        java.lang.Class<?> wildcardClass11 = hashMapCuckooHashing1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5824");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey(3);
        boolean boolean10 = hashMapCuckooHashing1.isEmpty();
        boolean boolean11 = hashMapCuckooHashing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5825");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) (short) 1);
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 10);
        double double4 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.insertKey2HashTable(12);
        hashMapCuckooHashing1.insertKey2HashTable(5);
        int int10 = hashMapCuckooHashing1.hashFunction2(9);
        double double11 = hashMapCuckooHashing1.checkLoadFactor();
        int int12 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.displayHashtable();
        int int14 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.5d + "'", double4 == 0.5d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.375d + "'", double11 == 0.375d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test5826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5826");
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
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5827");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int3 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 0);
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int8 = hashMapCuckooHashing1.hashFunction1((int) (byte) -1);
        hashMapCuckooHashing1.insertKey2HashTable((int) (byte) 10);
        boolean boolean11 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.deleteKeyFromHashTable((int) (short) 10);
        boolean boolean14 = hashMapCuckooHashing1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5828");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) '4');
        int int3 = hashMapCuckooHashing1.hashFunction1((int) (short) 10);
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey(5);
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.insertKey2HashTable(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
    }

    @Test
    public void test5829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5829");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.insertKey2HashTable((int) '#');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
    }

    @Test
    public void test5830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5830");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean3 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 0);
        double double4 = hashMapCuckooHashing1.checkLoadFactor();
        int int5 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.insertKey2HashTable(19);
        int int10 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test5831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5831");
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
        int int17 = hashMapCuckooHashing1.hashFunction2(9);
        boolean boolean18 = hashMapCuckooHashing1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5832");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction2((int) '#');
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey(0);
        double double10 = hashMapCuckooHashing1.checkLoadFactor();
        int int11 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.insertKey2HashTable((int) '#');
        int int15 = hashMapCuckooHashing1.hashFunction2((int) '4');
        int int16 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        java.lang.Class<?> wildcardClass17 = hashMapCuckooHashing1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5833");
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
        int int12 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = hashMapCuckooHashing1.findKeyInTable(16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5834");
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
        int int18 = hashMapCuckooHashing1.hashFunction1(9);
        boolean boolean19 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5835");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.displayHashtable();
        int int8 = hashMapCuckooHashing1.hashFunction2(100);
        int int10 = hashMapCuckooHashing1.hashFunction2(10);
        int int11 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5836");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean6 = hashMapCuckooHashing1.checkTableContainsKey(100);
        int int8 = hashMapCuckooHashing1.hashFunction1(3);
        boolean boolean10 = hashMapCuckooHashing1.checkTableContainsKey(5);
        double double11 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean13 = hashMapCuckooHashing1.checkTableContainsKey(30);
        hashMapCuckooHashing1.insertKey2HashTable((int) (byte) -1);
        int int16 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.0d + "'", double11 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test5837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5837");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        int int4 = hashMapCuckooHashing1.hashFunction2((int) (short) 10);
        int int6 = hashMapCuckooHashing1.hashFunction2((int) (short) 10);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.insertKey2HashTable((int) '#');
        boolean boolean10 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.insertKey2HashTable(9);
        hashMapCuckooHashing1.displayHashtable();
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable(30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Key 30 already inside, no duplicates allowed");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5838");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        int int4 = hashMapCuckooHashing1.hashFunction2((int) (short) 10);
        int int6 = hashMapCuckooHashing1.hashFunction1(10);
        hashMapCuckooHashing1.insertKey2HashTable(5);
        hashMapCuckooHashing1.displayHashtable();
        int int10 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        double double11 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.insertKey2HashTable(1);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.1d + "'", double11 == 0.1d);
    }

    @Test
    public void test5839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5839");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean7 = hashMapCuckooHashing1.isFull();
        int int9 = hashMapCuckooHashing1.hashFunction2(19);
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 1);
        int int13 = hashMapCuckooHashing1.hashFunction2(6);
        double double14 = hashMapCuckooHashing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + double14 + "' != '" + 0.05d + "'", double14 == 0.05d);
    }

    @Test
    public void test5840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5840");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey(3);
        boolean boolean10 = hashMapCuckooHashing1.isEmpty();
        int int12 = hashMapCuckooHashing1.hashFunction2(7);
        int int14 = hashMapCuckooHashing1.hashFunction1((int) (byte) 0);
        int int16 = hashMapCuckooHashing1.hashFunction2(12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test5841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5841");
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
        boolean boolean14 = hashMapCuckooHashing1.checkTableContainsKey(0);
        hashMapCuckooHashing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.1d + "'", double9 == 0.1d);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + double11 + "' != '" + 0.1d + "'", double11 == 0.1d);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5842");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(1);
        boolean boolean2 = hashMapCuckooHashing1.isEmpty();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.insertKey2HashTable((int) (byte) -1);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean8 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5843");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double4 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean6 = hashMapCuckooHashing1.checkTableContainsKey(30);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + double4 + "' != '" + 0.0d + "'", double4 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5844");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction2((int) '#');
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        int int8 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = hashMapCuckooHashing1.findKeyInTable(7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5845");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean4 = hashMapCuckooHashing1.checkTableContainsKey(10);
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        boolean boolean6 = hashMapCuckooHashing1.isEmpty();
        boolean boolean7 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int9 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        java.lang.Class<?> wildcardClass10 = hashMapCuckooHashing1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5846");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isEmpty();
        boolean boolean4 = hashMapCuckooHashing1.isEmpty();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.displayHashtable();
        double double7 = hashMapCuckooHashing1.checkLoadFactor();
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.insertKey2HashTable(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
    }

    @Test
    public void test5847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5847");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.insertKey2HashTable((int) (byte) 1);
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean11 = hashMapCuckooHashing1.isFull();
        boolean boolean12 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5848");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 0);
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        boolean boolean8 = hashMapCuckooHashing1.isFull();
        double double9 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean11 = hashMapCuckooHashing1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.1d + "'", double9 == 0.1d);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5849");
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
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
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
    public void test5850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5850");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean4 = hashMapCuckooHashing1.isFull();
        int int6 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        double double8 = hashMapCuckooHashing1.checkLoadFactor();
        double double9 = hashMapCuckooHashing1.checkLoadFactor();
        java.lang.Class<?> wildcardClass10 = hashMapCuckooHashing1.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5851");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.insertKey2HashTable(5);
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.insertKey2HashTable((int) (byte) -1);
        hashMapCuckooHashing1.insertKey2HashTable(12);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test5852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5852");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int7 = hashMapCuckooHashing1.hashFunction2((int) (byte) 1);
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey(1);
        int int10 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean12 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test5853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5853");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean3 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 0);
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        int int9 = hashMapCuckooHashing1.hashFunction1(4);
        boolean boolean10 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean12 = hashMapCuckooHashing1.isFull();
        boolean boolean13 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5854");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.insertKey2HashTable(2);
        boolean boolean9 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.insertKey2HashTable(30);
        hashMapCuckooHashing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5855");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction2((int) '#');
        int int7 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey(0);
        int int11 = hashMapCuckooHashing1.hashFunction1((int) (short) -1);
        hashMapCuckooHashing1.displayHashtable();
        int int14 = hashMapCuckooHashing1.hashFunction1(4);
        int int15 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean17 = hashMapCuckooHashing1.checkTableContainsKey(79);
        int int18 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test5856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5856");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.insertKey2HashTable((int) ' ');
        int int9 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int10 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int12 = hashMapCuckooHashing1.hashFunction1((int) (short) 100);
        hashMapCuckooHashing1.insertKey2HashTable((int) 'a');
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean16 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5857");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int4 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.isFull();
        boolean boolean6 = hashMapCuckooHashing1.isEmpty();
        double double7 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean8 = hashMapCuckooHashing1.isFull();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = hashMapCuckooHashing1.hashFunction2(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue(Double.isNaN(double7));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test5858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5858");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        int int7 = hashMapCuckooHashing1.hashFunction2((int) (byte) 1);
        hashMapCuckooHashing1.displayHashtable();
        int int10 = hashMapCuckooHashing1.hashFunction1(10);
        hashMapCuckooHashing1.insertKey2HashTable(7);
        int int14 = hashMapCuckooHashing1.hashFunction1(20);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5859");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean3 = hashMapCuckooHashing1.isFull();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 1);
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        hashMapCuckooHashing1.displayHashtable();
        int int10 = hashMapCuckooHashing1.hashFunction1(30);
        boolean boolean11 = hashMapCuckooHashing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5860");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int3 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double5 = hashMapCuckooHashing1.checkLoadFactor();
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean8 = hashMapCuckooHashing1.checkTableContainsKey((int) '4');
        hashMapCuckooHashing1.displayHashtable();
        int int11 = hashMapCuckooHashing1.hashFunction1(10);
        boolean boolean12 = hashMapCuckooHashing1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5861");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int3 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double5 = hashMapCuckooHashing1.checkLoadFactor();
        double double6 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean8 = hashMapCuckooHashing1.checkTableContainsKey((int) '4');
        int int10 = hashMapCuckooHashing1.hashFunction2(3);
        boolean boolean11 = hashMapCuckooHashing1.isEmpty();
        int int12 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + double5 + "' != '" + 0.0d + "'", double5 == 0.0d);
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 0.0d + "'", double6 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5862");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(0);
        hashMapCuckooHashing1.displayHashtable();
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        double double4 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        boolean boolean7 = hashMapCuckooHashing1.isEmpty();
        int int8 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean9 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.displayHashtable();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = hashMapCuckooHashing1.hashFunction2(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue(Double.isNaN(double4));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test5863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5863");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) (byte) 1);
        boolean boolean3 = hashMapCuckooHashing1.checkTableContainsKey((-1));
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey(0);
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        boolean boolean7 = hashMapCuckooHashing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test5864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5864");
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
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable(35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test5865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5865");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int6 = hashMapCuckooHashing1.hashFunction2((int) '#');
        int int8 = hashMapCuckooHashing1.hashFunction2((int) (byte) 100);
        hashMapCuckooHashing1.insertKey2HashTable((int) '#');
        int int12 = hashMapCuckooHashing1.hashFunction2((int) (short) -1);
        int int14 = hashMapCuckooHashing1.hashFunction2(10);
        boolean boolean16 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 10);
        boolean boolean17 = hashMapCuckooHashing1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5866");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) (byte) 1);
        int int3 = hashMapCuckooHashing1.hashFunction1(0);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test5867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5867");
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
        hashMapCuckooHashing1.displayHashtable();
        int int15 = hashMapCuckooHashing1.hashFunction2(8);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        boolean boolean17 = hashMapCuckooHashing1.isFull();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5868");
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
        // The following exception was thrown during execution in test generation
        try {
            hashMapCuckooHashing1.deleteKeyFromHashTable(36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Table is empty");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5869");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        boolean boolean2 = hashMapCuckooHashing1.isFull();
        boolean boolean4 = hashMapCuckooHashing1.checkTableContainsKey(10);
        int int6 = hashMapCuckooHashing1.hashFunction1((int) (short) 0);
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 0);
        boolean boolean10 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test5870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5870");
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
        int int16 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int18 = hashMapCuckooHashing1.hashFunction1(8);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.05d + "'", double13 == 0.05d);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
    }

    @Test
    public void test5871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5871");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(1);
        boolean boolean2 = hashMapCuckooHashing1.isEmpty();
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 0);
        boolean boolean5 = hashMapCuckooHashing1.isEmpty();
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean8 = hashMapCuckooHashing1.checkTableContainsKey((int) (short) 1);
        hashMapCuckooHashing1.reHashTableIncreasesTableSize();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5872");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        double double2 = hashMapCuckooHashing1.checkLoadFactor();
        hashMapCuckooHashing1.displayHashtable();
        boolean boolean4 = hashMapCuckooHashing1.isFull();
        int int6 = hashMapCuckooHashing1.hashFunction1((int) '#');
        int int8 = hashMapCuckooHashing1.hashFunction1((int) (short) 1);
        double double9 = hashMapCuckooHashing1.checkLoadFactor();
        double double10 = hashMapCuckooHashing1.checkLoadFactor();
        int int12 = hashMapCuckooHashing1.hashFunction2((int) '4');
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 5 + "'", int6 == 5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 0.0d + "'", double10 == 0.0d);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 5 + "'", int12 == 5);
    }

    @Test
    public void test5873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5873");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int3 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) (byte) 0);
        int int6 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        hashMapCuckooHashing1.insertKey2HashTable((int) ' ');
        double double9 = hashMapCuckooHashing1.checkLoadFactor();
        int int11 = hashMapCuckooHashing1.hashFunction2((int) (byte) 0);
        int int12 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.1d + "'", double9 == 0.1d);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test5874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5874");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing(10);
        int int2 = hashMapCuckooHashing1.getNumberOfKeysInTable();
        int int4 = hashMapCuckooHashing1.hashFunction1((int) '#');
        hashMapCuckooHashing1.insertKey2HashTable((int) (short) 0);
        boolean boolean7 = hashMapCuckooHashing1.isFull();
        java.lang.Class<?> wildcardClass8 = hashMapCuckooHashing1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 5 + "'", int4 == 5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5875");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing hashMapCuckooHashing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapCuckooHashing((int) '#');
        hashMapCuckooHashing1.insertKey2HashTable((int) '#');
        boolean boolean5 = hashMapCuckooHashing1.checkTableContainsKey((int) '#');
        boolean boolean6 = hashMapCuckooHashing1.isFull();
        double double7 = hashMapCuckooHashing1.checkLoadFactor();
        boolean boolean9 = hashMapCuckooHashing1.checkTableContainsKey(17);
        boolean boolean11 = hashMapCuckooHashing1.checkTableContainsKey((-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + double7 + "' != '" + 0.02857142857142857d + "'", double7 == 0.02857142857142857d);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest11.test5876");
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
        boolean boolean15 = hashMapCuckooHashing1.isEmpty();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }
}

