package hashmap;

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
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        int int4 = hashMapLinearProbing1.hashing(30);
        hashMapLinearProbing1.deleteHash((int) (byte) 100);
        int int8 = hashMapLinearProbing1.findHash((int) '4');
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        int int11 = hashMapLinearProbing1.hashing(1);
        hashMapLinearProbing1.insertHash(2);
        hashMapLinearProbing1.deleteHash(15);
        hashMapLinearProbing1.insertHash((int) '#');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 30 + "'", int4 == 30);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test5002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5002");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(1);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean3 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (byte) 0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5003");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        int int5 = hashMapLinearProbing1.hashing(0);
        int int7 = hashMapLinearProbing1.findHash(9);
        int int9 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.insertHash((int) ' ');
        boolean boolean12 = hashMapLinearProbing1.isEmpty();
        int int14 = hashMapLinearProbing1.hashing(17);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 27 + "'", int9 == 27);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 17 + "'", int14 == 17);
    }

    @Test
    public void test5004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5004");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        int int8 = hashMapLinearProbing1.findHash(10);
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        int int11 = hashMapLinearProbing1.findHash((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test5005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5005");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        java.lang.Class<?> wildcardClass9 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5006");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        int int4 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.deleteHash(0);
        int int8 = hashMapLinearProbing1.findHash(17);
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 45 + "'", int4 == 45);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test5007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5007");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(27);
        int int6 = hashMapLinearProbing1.findHash((int) (short) 1);
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test5008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5008");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.insertHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        int int10 = hashMapLinearProbing1.hashing((int) (short) 10);
        int int12 = hashMapLinearProbing1.hashing(52);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test5009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5009");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        int int7 = hashMapLinearProbing1.findHash((int) (byte) -1);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        int int11 = hashMapLinearProbing1.hashing((int) (short) 1);
        hashMapLinearProbing1.deleteHash(100);
        int int15 = hashMapLinearProbing1.hashing((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
    }

    @Test
    public void test5010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5010");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        hashMapLinearProbing1.deleteHash(100);
        int int11 = hashMapLinearProbing1.hashing(30);
        boolean boolean12 = hashMapLinearProbing1.isFull();
        boolean boolean13 = hashMapLinearProbing1.isFull();
        int int15 = hashMapLinearProbing1.hashing(47);
        boolean boolean16 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 30 + "'", int11 == 30);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5011");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(100);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (byte) 0);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
    }

    @Test
    public void test5012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5012");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(35);
        int int7 = hashMapLinearProbing1.findHash((int) '4');
        hashMapLinearProbing1.insertHash((int) (short) 10);
        int int11 = hashMapLinearProbing1.hashing((int) (byte) -1);
        int int13 = hashMapLinearProbing1.findHash(12);
        boolean boolean14 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 34 + "'", int11 == 34);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5013");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        boolean boolean9 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        boolean boolean12 = hashMapLinearProbing1.isEmpty();
        int int14 = hashMapLinearProbing1.hashing((int) (byte) 10);
        int int16 = hashMapLinearProbing1.findHash(19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test5014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5014");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (short) -1);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5015");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        int int11 = hashMapLinearProbing1.findHash(17);
        int int13 = hashMapLinearProbing1.hashing(13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 13 + "'", int13 == 13);
    }

    @Test
    public void test5016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5016");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        int int5 = hashMapLinearProbing1.findHash(27);
        int int7 = hashMapLinearProbing1.findHash((int) (byte) -1);
        hashMapLinearProbing1.deleteHash(1);
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        boolean boolean11 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        java.lang.Class<?> wildcardClass13 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5017");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(0);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        boolean boolean3 = hashMapLinearProbing1.isEmpty();
        boolean boolean4 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = hashMapLinearProbing1.hashing(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test5018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5018");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        hashMapLinearProbing1.displayHashtable();
        int int8 = hashMapLinearProbing1.findHash((-1));
        hashMapLinearProbing1.insertHash(32);
        hashMapLinearProbing1.deleteHash(27);
        int int14 = hashMapLinearProbing1.hashing((int) (byte) 10);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test5019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5019");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        int int5 = hashMapLinearProbing1.hashing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        java.lang.Class<?> wildcardClass9 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5020");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash(100);
        int int10 = hashMapLinearProbing1.findHash((int) (short) 100);
        hashMapLinearProbing1.insertHash(0);
        boolean boolean13 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 30 + "'", int10 == 30);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5021");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (short) -1);
        boolean boolean8 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(34);
        int int12 = hashMapLinearProbing1.hashing((-1));
        boolean boolean13 = hashMapLinearProbing1.isFull();
        int int15 = hashMapLinearProbing1.hashing(9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
    }

    @Test
    public void test5022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5022");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.insertHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        int int10 = hashMapLinearProbing1.hashing((int) (short) 10);
        int int12 = hashMapLinearProbing1.findHash(29);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test5023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5023");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(34);
        boolean boolean2 = hashMapLinearProbing1.isFull();
        int int4 = hashMapLinearProbing1.findHash(3);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test5024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5024");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        int int8 = hashMapLinearProbing1.findHash((int) '4');
        int int10 = hashMapLinearProbing1.findHash((int) ' ');
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        int int14 = hashMapLinearProbing1.hashing(10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
    }

    @Test
    public void test5025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5025");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(45);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        int int5 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.insertHash((int) (short) -1);
        boolean boolean8 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5026");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        hashMapLinearProbing1.displayHashtable();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        boolean boolean8 = hashMapLinearProbing1.isFull();
        int int10 = hashMapLinearProbing1.hashing((int) '#');
        int int12 = hashMapLinearProbing1.hashing(34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
    }

    @Test
    public void test5027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5027");
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
        hashMapLinearProbing1.deleteHash(32);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 17 + "'", int13 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
    }

    @Test
    public void test5028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5028");
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
        boolean boolean20 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 44 + "'", int14 == 44);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5029");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isFull();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(0);
        boolean boolean10 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(44);
        int int14 = hashMapLinearProbing1.hashing((int) '4');
        hashMapLinearProbing1.deleteHash(7);
        int int18 = hashMapLinearProbing1.hashing(0);
        boolean boolean19 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 17 + "'", int14 == 17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5030");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(34);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) (byte) 10);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test5031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5031");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        boolean boolean9 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean15 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5032");
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
        boolean boolean16 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5033");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash(15);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        int int12 = hashMapLinearProbing1.hashing(15);
        hashMapLinearProbing1.deleteHash(16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
    }

    @Test
    public void test5034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5034");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        int int5 = hashMapLinearProbing1.findHash(27);
        int int7 = hashMapLinearProbing1.findHash((int) (byte) -1);
        hashMapLinearProbing1.deleteHash(1);
        int int11 = hashMapLinearProbing1.findHash(11);
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test5035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5035");
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
        int int18 = hashMapLinearProbing1.hashing(7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 7 + "'", int18 == 7);
    }

    @Test
    public void test5036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5036");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        hashMapLinearProbing1.deleteHash((int) (byte) 1);
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        boolean boolean13 = hashMapLinearProbing1.isFull();
        boolean boolean14 = hashMapLinearProbing1.isEmpty();
        java.lang.Class<?> wildcardClass15 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5037");
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
        boolean boolean18 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5038");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(0);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = hashMapLinearProbing1.hashing(29);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
    }

    @Test
    public void test5039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5039");
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
        int int23 = hashMapLinearProbing1.findHash(52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 17 + "'", int13 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test5040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5040");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.findHash(0);
        int int10 = hashMapLinearProbing1.hashing(1);
        hashMapLinearProbing1.deleteHash(0);
        int int14 = hashMapLinearProbing1.hashing((int) (byte) 1);
        int int16 = hashMapLinearProbing1.findHash((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test5041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5041");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(35);
        boolean boolean2 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5042");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean4 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5043");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(30);
        int int6 = hashMapLinearProbing1.findHash((int) (byte) 0);
        hashMapLinearProbing1.insertHash(17);
        hashMapLinearProbing1.displayHashtable();
        int int11 = hashMapLinearProbing1.findHash((int) (short) 0);
        int int13 = hashMapLinearProbing1.hashing(51);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5044");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(30);
        boolean boolean11 = hashMapLinearProbing1.isFull();
        boolean boolean12 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test5045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5045");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        int int4 = hashMapLinearProbing1.hashing(30);
        hashMapLinearProbing1.deleteHash((int) (byte) 100);
        int int8 = hashMapLinearProbing1.findHash((int) '4');
        hashMapLinearProbing1.checkLoadFactor();
        int int11 = hashMapLinearProbing1.hashing(14);
        int int13 = hashMapLinearProbing1.hashing((int) (short) 100);
        int int15 = hashMapLinearProbing1.findHash((int) '4');
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 30 + "'", int4 == 30);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 14 + "'", int11 == 14);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 30 + "'", int13 == 30);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test5046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5046");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(45);
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        hashMapLinearProbing1.insertHash((-1));
        int int7 = hashMapLinearProbing1.hashing(5);
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
    }

    @Test
    public void test5047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5047");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        int int10 = hashMapLinearProbing1.findHash((int) (short) 10);
        int int12 = hashMapLinearProbing1.findHash(0);
        int int14 = hashMapLinearProbing1.findHash((int) '4');
        hashMapLinearProbing1.insertHash(29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test5048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5048");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash(0);
        hashMapLinearProbing1.checkLoadFactor();
        int int11 = hashMapLinearProbing1.findHash((int) (short) 0);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash((int) ' ');
        java.lang.Class<?> wildcardClass15 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5049");
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
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean18 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 12 + "'", int16 == 12);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5050");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        int int8 = hashMapLinearProbing1.findHash(10);
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test5051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5051");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (byte) 10);
        hashMapLinearProbing1.insertHash(17);
        int int12 = hashMapLinearProbing1.findHash(34);
        boolean boolean13 = hashMapLinearProbing1.isEmpty();
        boolean boolean14 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5052");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(100);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (byte) 0);
        boolean boolean5 = hashMapLinearProbing1.isEmpty();
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        int int9 = hashMapLinearProbing1.findHash((int) '4');
        int int11 = hashMapLinearProbing1.hashing(29);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 29 + "'", int11 == 29);
    }

    @Test
    public void test5053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5053");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        hashMapLinearProbing1.insertHash(17);
        int int8 = hashMapLinearProbing1.findHash((-1));
        boolean boolean9 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5054");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 1);
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        int int11 = hashMapLinearProbing1.findHash((int) (short) 10);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean14 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5055");
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
        hashMapLinearProbing1.deleteHash(45);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 30 + "'", int17 == 30);
    }

    @Test
    public void test5056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5056");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(35);
        int int3 = hashMapLinearProbing1.hashing((int) (short) 0);
        int int5 = hashMapLinearProbing1.hashing(0);
        int int7 = hashMapLinearProbing1.hashing((int) (byte) 1);
        boolean boolean8 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5057");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        int int9 = hashMapLinearProbing1.findHash(34);
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        int int12 = hashMapLinearProbing1.hashing(45);
        boolean boolean13 = hashMapLinearProbing1.isEmpty();
        int int15 = hashMapLinearProbing1.findHash(34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test5058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5058");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(27);
        hashMapLinearProbing1.deleteHash(2);
    }

    @Test
    public void test5059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5059");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        int int9 = hashMapLinearProbing1.hashing((int) (byte) 10);
        hashMapLinearProbing1.deleteHash((int) '#');
        boolean boolean12 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        int int15 = hashMapLinearProbing1.hashing(16);
        hashMapLinearProbing1.insertHash((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
    }

    @Test
    public void test5060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5060");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        hashMapLinearProbing1.insertHash(17);
        int int8 = hashMapLinearProbing1.findHash((-1));
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5061");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        int int10 = hashMapLinearProbing1.hashing((int) (byte) 1);
        boolean boolean11 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean14 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test5062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5062");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(100);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean3 = hashMapLinearProbing1.isFull();
        java.lang.Class<?> wildcardClass4 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test5063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5063");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(100);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (byte) 0);
        boolean boolean5 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(48);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        boolean boolean10 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5064");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        int int10 = hashMapLinearProbing1.findHash((int) (short) 10);
        int int12 = hashMapLinearProbing1.findHash(0);
        boolean boolean13 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash(44);
        int int20 = hashMapLinearProbing1.hashing(3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test5065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5065");
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
        boolean boolean24 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(32);
        java.lang.Class<?> wildcardClass27 = hashMapLinearProbing1.getClass();
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
        org.junit.Assert.assertNotNull(wildcardClass27);
    }

    @Test
    public void test5066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5066");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 0);
        hashMapLinearProbing1.displayHashtable();
        int int8 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        hashMapLinearProbing1.deleteHash((int) '4');
        boolean boolean14 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (short) 0);
        hashMapLinearProbing1.displayHashtable();
        int int19 = hashMapLinearProbing1.findHash(11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 27 + "'", int8 == 27);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test5067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5067");
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
        boolean boolean16 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash((int) (byte) 0);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test5068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5068");
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
        hashMapLinearProbing1.displayHashtable();
        java.lang.Class<?> wildcardClass17 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5069");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        int int5 = hashMapLinearProbing1.hashing(0);
        int int7 = hashMapLinearProbing1.findHash(9);
        int int9 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.insertHash((int) ' ');
        hashMapLinearProbing1.insertHash(30);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean15 = hashMapLinearProbing1.isFull();
        int int17 = hashMapLinearProbing1.findHash(17);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 27 + "'", int9 == 27);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test5070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5070");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        hashMapLinearProbing1.displayHashtable();
        int int8 = hashMapLinearProbing1.hashing((int) (byte) 1);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(17);
        hashMapLinearProbing1.deleteHash(48);
        boolean boolean15 = hashMapLinearProbing1.isEmpty();
        boolean boolean16 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5071");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (short) -1);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(30);
        hashMapLinearProbing1.checkLoadFactor();
        int int14 = hashMapLinearProbing1.findHash((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test5072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5072");
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
        int int21 = hashMapLinearProbing1.findHash((int) (byte) 0);
        java.lang.Class<?> wildcardClass22 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 17 + "'", int13 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5073");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) (short) 10);
        hashMapLinearProbing1.deleteHash(0);
        hashMapLinearProbing1.insertHash(100);
        int int15 = hashMapLinearProbing1.hashing((int) (byte) 0);
        hashMapLinearProbing1.deleteHash(0);
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test5074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5074");
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
        java.lang.Class<?> wildcardClass18 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5075");
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
        int int16 = hashMapLinearProbing1.findHash(5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test5076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5076");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        int int5 = hashMapLinearProbing1.findHash(17);
        hashMapLinearProbing1.insertHash((int) (byte) 1);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(35);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5077");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        hashMapLinearProbing1.insertHash(17);
        int int8 = hashMapLinearProbing1.findHash((int) (byte) 1);
        hashMapLinearProbing1.insertHash(29);
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5078");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        int int9 = hashMapLinearProbing1.hashing((int) (byte) 10);
        hashMapLinearProbing1.deleteHash((int) '#');
        hashMapLinearProbing1.displayHashtable();
        boolean boolean13 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        java.lang.Class<?> wildcardClass16 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5079");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        hashMapLinearProbing1.checkLoadFactor();
        int int6 = hashMapLinearProbing1.findHash((int) (byte) 100);
        hashMapLinearProbing1.insertHash(100);
        boolean boolean9 = hashMapLinearProbing1.isFull();
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5080");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        int int8 = hashMapLinearProbing1.findHash((int) '4');
        hashMapLinearProbing1.checkLoadFactor();
        int int11 = hashMapLinearProbing1.findHash(30);
        int int13 = hashMapLinearProbing1.hashing(35);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (byte) 1);
        hashMapLinearProbing1.deleteHash(15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5081");
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
        hashMapLinearProbing1.insertHash(9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
    }

    @Test
    public void test5082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5082");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        int int12 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 27 + "'", int12 == 27);
    }

    @Test
    public void test5083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5083");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(35);
        int int3 = hashMapLinearProbing1.hashing((int) (short) 0);
        int int5 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash(99);
        hashMapLinearProbing1.deleteHash(30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5084");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        int int5 = hashMapLinearProbing1.hashing(0);
        int int7 = hashMapLinearProbing1.findHash(9);
        int int9 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.insertHash((int) ' ');
        hashMapLinearProbing1.insertHash(30);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 27 + "'", int9 == 27);
    }

    @Test
    public void test5085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5085");
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
        boolean boolean23 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 30 + "'", int22 == 30);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test5086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5086");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.findHash(35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test5087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5087");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        int int5 = hashMapLinearProbing1.hashing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) 'a');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test5088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5088");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        hashMapLinearProbing1.displayHashtable();
        int int8 = hashMapLinearProbing1.hashing((int) (byte) 1);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(26);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test5089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5089");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.insertHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean12 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5090");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 0);
        hashMapLinearProbing1.displayHashtable();
        int int8 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.insertHash((int) (short) 100);
        boolean boolean11 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (short) 100);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean15 = hashMapLinearProbing1.isEmpty();
        int int17 = hashMapLinearProbing1.findHash((int) (byte) 0);
        hashMapLinearProbing1.insertHash(12);
        boolean boolean20 = hashMapLinearProbing1.isFull();
        java.lang.Class<?> wildcardClass21 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 27 + "'", int8 == 27);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test5091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5091");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(30);
        int int12 = hashMapLinearProbing1.findHash(9);
        int int14 = hashMapLinearProbing1.hashing((int) (short) 1);
        java.lang.Class<?> wildcardClass15 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5092");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        int int8 = hashMapLinearProbing1.findHash((int) '4');
        int int10 = hashMapLinearProbing1.findHash((int) ' ');
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(48);
        int int17 = hashMapLinearProbing1.hashing(45);
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test5093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5093");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        int int7 = hashMapLinearProbing1.hashing(1);
        int int9 = hashMapLinearProbing1.hashing((int) (byte) -1);
        boolean boolean10 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        int int13 = hashMapLinearProbing1.findHash(52);
        boolean boolean14 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 34 + "'", int9 == 34);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5094");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (byte) 10);
        hashMapLinearProbing1.insertHash(17);
        hashMapLinearProbing1.deleteHash(35);
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        boolean boolean15 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5095");
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
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test5096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5096");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        int int7 = hashMapLinearProbing1.findHash((int) (byte) -1);
        hashMapLinearProbing1.deleteHash((int) (byte) 0);
        hashMapLinearProbing1.insertHash((int) (short) 100);
        int int13 = hashMapLinearProbing1.findHash(27);
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        boolean boolean16 = hashMapLinearProbing1.isEmpty();
        int int18 = hashMapLinearProbing1.hashing(13);
        boolean boolean19 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 13 + "'", int18 == 13);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5097");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) (short) 10);
        int int11 = hashMapLinearProbing1.findHash(34);
        hashMapLinearProbing1.deleteHash(17);
        int int15 = hashMapLinearProbing1.findHash(44);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test5098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5098");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        boolean boolean8 = hashMapLinearProbing1.isFull();
        int int10 = hashMapLinearProbing1.hashing((-1));
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        boolean boolean13 = hashMapLinearProbing1.isFull();
        int int15 = hashMapLinearProbing1.hashing(99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 29 + "'", int15 == 29);
    }

    @Test
    public void test5099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5099");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((-1));
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean11 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5100");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        hashMapLinearProbing1.displayHashtable();
        int int8 = hashMapLinearProbing1.findHash((-1));
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        java.lang.Class<?> wildcardClass11 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5101");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean4 = hashMapLinearProbing1.isFull();
        int int6 = hashMapLinearProbing1.findHash(27);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        int int11 = hashMapLinearProbing1.hashing((int) ' ');
        hashMapLinearProbing1.displayHashtable();
        boolean boolean13 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5102");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        int int5 = hashMapLinearProbing1.hashing(15);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash((int) (short) 1);
        hashMapLinearProbing1.insertHash(99);
        hashMapLinearProbing1.deleteHash(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test5103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5103");
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
        boolean boolean19 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5104");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(32);
        int int3 = hashMapLinearProbing1.findHash(100);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(2);
        java.lang.Class<?> wildcardClass7 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5105");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((-1));
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean10 = hashMapLinearProbing1.isFull();
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        java.lang.Class<?> wildcardClass12 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5106");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash(0);
        hashMapLinearProbing1.deleteHash(7);
        hashMapLinearProbing1.displayHashtable();
        int int13 = hashMapLinearProbing1.hashing(32);
        int int15 = hashMapLinearProbing1.findHash(29);
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test5107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5107");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) (short) 100);
        hashMapLinearProbing1.deleteHash((int) (byte) 0);
        int int5 = hashMapLinearProbing1.hashing((int) (short) 0);
        hashMapLinearProbing1.insertHash(32);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash(48);
        boolean boolean12 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5108");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        int int5 = hashMapLinearProbing1.hashing((int) '#');
        int int7 = hashMapLinearProbing1.hashing((int) (short) 1);
        hashMapLinearProbing1.insertHash((int) (byte) 100);
        int int11 = hashMapLinearProbing1.hashing((int) (byte) 100);
        int int13 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean14 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 48 + "'", int11 == 48);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 48 + "'", int13 == 48);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5109");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        hashMapLinearProbing1.insertHash(17);
        int int8 = hashMapLinearProbing1.findHash(32);
        hashMapLinearProbing1.deleteHash(32);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test5110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5110");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash(100);
        int int10 = hashMapLinearProbing1.findHash((int) (short) 100);
        hashMapLinearProbing1.insertHash(0);
        int int14 = hashMapLinearProbing1.findHash(100);
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 30 + "'", int10 == 30);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test5111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5111");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (short) 10);
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test5112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5112");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(100);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (byte) 0);
        hashMapLinearProbing1.deleteHash((int) (byte) 1);
        int int8 = hashMapLinearProbing1.findHash(44);
        boolean boolean9 = hashMapLinearProbing1.isFull();
        java.lang.Class<?> wildcardClass10 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5113");
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
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) (byte) 0);
        hashMapLinearProbing1.insertHash((int) (short) -1);
        hashMapLinearProbing1.displayHashtable();
        int int21 = hashMapLinearProbing1.findHash(8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test5114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5114");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        int int5 = hashMapLinearProbing1.findHash(27);
        int int7 = hashMapLinearProbing1.findHash((int) (byte) -1);
        hashMapLinearProbing1.deleteHash(1);
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        int int12 = hashMapLinearProbing1.hashing(35);
        int int14 = hashMapLinearProbing1.hashing((int) (byte) 1);
        boolean boolean15 = hashMapLinearProbing1.isFull();
        int int17 = hashMapLinearProbing1.findHash((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test5115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5115");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(35);
        int int3 = hashMapLinearProbing1.hashing((int) ' ');
        hashMapLinearProbing1.displayHashtable();
        int int6 = hashMapLinearProbing1.hashing(48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 13 + "'", int6 == 13);
    }

    @Test
    public void test5116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5116");
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
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test5117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5117");
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
        int int18 = hashMapLinearProbing1.hashing(13);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 45 + "'", int4 == 45);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 26 + "'", int15 == 26);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 13 + "'", int18 == 13);
    }

    @Test
    public void test5118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5118");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (byte) 10);
        hashMapLinearProbing1.insertHash(17);
        int int12 = hashMapLinearProbing1.findHash(34);
        int int14 = hashMapLinearProbing1.findHash((int) '4');
        boolean boolean15 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        int int19 = hashMapLinearProbing1.hashing(45);
        hashMapLinearProbing1.insertHash(26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
    }

    @Test
    public void test5119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5119");
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
        int int20 = hashMapLinearProbing1.hashing((int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 17 + "'", int13 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 27 + "'", int20 == 27);
    }

    @Test
    public void test5120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5120");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(34);
        hashMapLinearProbing1.insertHash(0);
        boolean boolean11 = hashMapLinearProbing1.isFull();
        boolean boolean12 = hashMapLinearProbing1.isFull();
        int int14 = hashMapLinearProbing1.hashing(12);
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 12 + "'", int14 == 12);
    }

    @Test
    public void test5121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5121");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(30);
        int int6 = hashMapLinearProbing1.findHash((int) (byte) 0);
        hashMapLinearProbing1.insertHash(17);
        int int10 = hashMapLinearProbing1.findHash((int) ' ');
        int int12 = hashMapLinearProbing1.findHash(17);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean14 = hashMapLinearProbing1.isEmpty();
        int int16 = hashMapLinearProbing1.hashing(26);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
    }

    @Test
    public void test5122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5122");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(45);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        int int5 = hashMapLinearProbing1.findHash(100);
        hashMapLinearProbing1.checkLoadFactor();
        int int8 = hashMapLinearProbing1.hashing(52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
    }

    @Test
    public void test5123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5123");
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
        hashMapLinearProbing1.insertHash((int) ' ');
        hashMapLinearProbing1.deleteHash(99);
        hashMapLinearProbing1.insertHash(30);
        boolean boolean24 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 44 + "'", int14 == 44);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5124");
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
        int int19 = hashMapLinearProbing1.hashing((int) 'a');
        java.lang.Class<?> wildcardClass20 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 27 + "'", int19 == 27);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5125");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        hashMapLinearProbing1.deleteHash((int) (byte) 100);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash((int) (short) 100);
        boolean boolean14 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5126");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        int int5 = hashMapLinearProbing1.findHash(27);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        int int9 = hashMapLinearProbing1.hashing(9);
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test5127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5127");
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
        hashMapLinearProbing1.deleteHash(3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test5128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5128");
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
        boolean boolean14 = hashMapLinearProbing1.isFull();
        boolean boolean15 = hashMapLinearProbing1.isEmpty();
        boolean boolean16 = hashMapLinearProbing1.isEmpty();
        int int18 = hashMapLinearProbing1.findHash((int) ' ');
        hashMapLinearProbing1.insertHash(19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test5129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5129");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        int int4 = hashMapLinearProbing1.hashing(30);
        hashMapLinearProbing1.deleteHash((int) (byte) 100);
        hashMapLinearProbing1.insertHash((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 0);
        hashMapLinearProbing1.deleteHash(32);
        java.lang.Class<?> wildcardClass14 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 30 + "'", int4 == 30);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5130");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        int int5 = hashMapLinearProbing1.hashing(1);
        hashMapLinearProbing1.deleteHash(15);
        int int9 = hashMapLinearProbing1.hashing((int) (byte) -1);
        int int11 = hashMapLinearProbing1.findHash(52);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 34 + "'", int9 == 34);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test5131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5131");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        hashMapLinearProbing1.insertHash(17);
        int int8 = hashMapLinearProbing1.findHash(32);
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (short) -1);
        boolean boolean14 = hashMapLinearProbing1.isEmpty();
        boolean boolean15 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5132");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(34);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        boolean boolean3 = hashMapLinearProbing1.isFull();
        boolean boolean4 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test5133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5133");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) (short) 100);
        hashMapLinearProbing1.deleteHash((int) (byte) 0);
        int int5 = hashMapLinearProbing1.hashing((int) (short) 0);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test5134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5134");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        hashMapLinearProbing1.deleteHash((int) (byte) 100);
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash((int) (byte) 1);
        int int15 = hashMapLinearProbing1.findHash((int) (short) 0);
        boolean boolean16 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5135");
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
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test5136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5136");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(45);
        hashMapLinearProbing1.insertHash((int) (byte) 0);
        hashMapLinearProbing1.insertHash(17);
        hashMapLinearProbing1.insertHash((int) (short) 1);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean18 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5137");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(32);
        int int3 = hashMapLinearProbing1.findHash(100);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(2);
        int int8 = hashMapLinearProbing1.findHash(34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test5138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5138");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) (short) 10);
        hashMapLinearProbing1.deleteHash(0);
        hashMapLinearProbing1.insertHash(100);
        int int15 = hashMapLinearProbing1.findHash(0);
        boolean boolean16 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5139");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean4 = hashMapLinearProbing1.isFull();
        int int6 = hashMapLinearProbing1.findHash(27);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(2);
        hashMapLinearProbing1.insertHash(3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test5140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5140");
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
        hashMapLinearProbing1.insertHash(45);
        int int20 = hashMapLinearProbing1.hashing(32);
        hashMapLinearProbing1.displayHashtable();
        int int23 = hashMapLinearProbing1.hashing(1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 17 + "'", int13 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 32 + "'", int20 == 32);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
    }

    @Test
    public void test5141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5141");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        boolean boolean9 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (short) 0);
        hashMapLinearProbing1.insertHash(30);
        int int15 = hashMapLinearProbing1.hashing((int) '#');
        boolean boolean16 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash(10);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5142");
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
        hashMapLinearProbing1.insertHash((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5143");
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
        boolean boolean19 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5144");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 0);
        hashMapLinearProbing1.displayHashtable();
        int int8 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.insertHash((int) (short) 10);
        hashMapLinearProbing1.displayHashtable();
        int int13 = hashMapLinearProbing1.hashing((int) '#');
        boolean boolean14 = hashMapLinearProbing1.isFull();
        int int16 = hashMapLinearProbing1.hashing((-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 27 + "'", int8 == 27);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 34 + "'", int16 == 34);
    }

    @Test
    public void test5145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5145");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.hashing((int) (short) 100);
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        boolean boolean10 = hashMapLinearProbing1.isFull();
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        int int13 = hashMapLinearProbing1.hashing((int) (byte) 100);
        boolean boolean14 = hashMapLinearProbing1.isFull();
        int int16 = hashMapLinearProbing1.hashing(29);
        boolean boolean17 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 30 + "'", int8 == 30);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 30 + "'", int13 == 30);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 29 + "'", int16 == 29);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5146");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        int int9 = hashMapLinearProbing1.findHash(34);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash((int) (short) 0);
        int int14 = hashMapLinearProbing1.findHash(100);
        int int16 = hashMapLinearProbing1.hashing(15);
        hashMapLinearProbing1.deleteHash(29);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 15 + "'", int16 == 15);
    }

    @Test
    public void test5147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5147");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(30);
        boolean boolean5 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        java.lang.Class<?> wildcardClass7 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5148");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (short) -1);
        boolean boolean8 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(34);
        int int12 = hashMapLinearProbing1.hashing((-1));
        hashMapLinearProbing1.insertHash((int) ' ');
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
    }

    @Test
    public void test5149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5149");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean9 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5150");
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
        hashMapLinearProbing1.deleteHash((int) (byte) 1);
        hashMapLinearProbing1.insertHash((int) (byte) 0);
        boolean boolean24 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 30 + "'", int14 == 30);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5151");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        boolean boolean9 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash((int) ' ');
        hashMapLinearProbing1.deleteHash(0);
        hashMapLinearProbing1.checkLoadFactor();
        int int18 = hashMapLinearProbing1.hashing(3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test5152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5152");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        int int4 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.deleteHash(30);
        hashMapLinearProbing1.insertHash(34);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        int int12 = hashMapLinearProbing1.findHash((int) (byte) 100);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 45 + "'", int4 == 45);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test5153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5153");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        boolean boolean3 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean5 = hashMapLinearProbing1.isFull();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.findHash(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test5154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5154");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(30);
        int int6 = hashMapLinearProbing1.findHash((int) (byte) 0);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(9);
        int int12 = hashMapLinearProbing1.hashing(96);
        int int14 = hashMapLinearProbing1.findHash((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test5155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5155");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(17);
        int int12 = hashMapLinearProbing1.findHash((int) (short) 1);
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test5156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5156");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) (byte) 100);
        boolean boolean2 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(9);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5157");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (short) -1);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(30);
        int int13 = hashMapLinearProbing1.findHash(7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test5158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5158");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        int int10 = hashMapLinearProbing1.hashing((int) (byte) 1);
        boolean boolean11 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5159");
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
        boolean boolean17 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5160");
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
        hashMapLinearProbing1.checkLoadFactor();
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
    public void test5161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5161");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.insertHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        int int11 = hashMapLinearProbing1.findHash((-1));
        int int13 = hashMapLinearProbing1.hashing(5);
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 5 + "'", int13 == 5);
    }

    @Test
    public void test5162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5162");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(17);
        hashMapLinearProbing1.deleteHash((int) '4');
        hashMapLinearProbing1.deleteHash((int) '#');
        int int16 = hashMapLinearProbing1.hashing((int) ' ');
        hashMapLinearProbing1.deleteHash(12);
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test5163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5163");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash((int) (short) 100);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(0);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5164");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 10);
        hashMapLinearProbing1.insertHash((int) (byte) 1);
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        int int11 = hashMapLinearProbing1.hashing(35);
        hashMapLinearProbing1.insertHash(9);
        int int15 = hashMapLinearProbing1.findHash(2);
        int int17 = hashMapLinearProbing1.findHash(47);
        boolean boolean18 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5165");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        int int5 = hashMapLinearProbing1.hashing(10);
        hashMapLinearProbing1.deleteHash((int) (short) -1);
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test5166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5166");
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
        hashMapLinearProbing1.deleteHash(51);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean21 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 30 + "'", int15 == 30);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test5167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5167");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(34);
        hashMapLinearProbing1.insertHash(0);
        boolean boolean11 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean13 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5168");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        hashMapLinearProbing1.deleteHash((int) (byte) 100);
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5169");
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
        hashMapLinearProbing1.deleteHash(99);
        hashMapLinearProbing1.deleteHash(34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test5170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5170");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(30);
        int int6 = hashMapLinearProbing1.findHash((int) (byte) 0);
        hashMapLinearProbing1.insertHash(17);
        hashMapLinearProbing1.deleteHash((int) (byte) 10);
        boolean boolean11 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        int int14 = hashMapLinearProbing1.findHash(99);
        int int16 = hashMapLinearProbing1.hashing(11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 11 + "'", int16 == 11);
    }

    @Test
    public void test5171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5171");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) (short) 1);
        hashMapLinearProbing1.deleteHash(17);
        boolean boolean4 = hashMapLinearProbing1.isEmpty();
        int int6 = hashMapLinearProbing1.findHash((int) (short) 100);
        hashMapLinearProbing1.deleteHash(32);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test5172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5172");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 0);
        hashMapLinearProbing1.displayHashtable();
        int int8 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.insertHash((int) (short) 10);
        hashMapLinearProbing1.insertHash((int) (short) 100);
        int int14 = hashMapLinearProbing1.hashing((int) (byte) 0);
        boolean boolean15 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 27 + "'", int8 == 27);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5173");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        int int4 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.deleteHash(30);
        hashMapLinearProbing1.insertHash(34);
        int int10 = hashMapLinearProbing1.findHash(0);
        boolean boolean11 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 45 + "'", int4 == 45);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5174");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        int int10 = hashMapLinearProbing1.findHash((int) (short) 10);
        int int12 = hashMapLinearProbing1.findHash(0);
        int int14 = hashMapLinearProbing1.hashing((int) (short) 100);
        boolean boolean15 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash(51);
        hashMapLinearProbing1.insertHash(32);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 30 + "'", int14 == 30);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5175");
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
        boolean boolean20 = hashMapLinearProbing1.isFull();
        int int22 = hashMapLinearProbing1.findHash(8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 34 + "'", int17 == 34);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test5176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5176");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (byte) 100);
        int int13 = hashMapLinearProbing1.findHash((int) (short) 1);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean15 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(0);
        boolean boolean18 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5177");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) (short) 10);
        int int11 = hashMapLinearProbing1.findHash(34);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test5178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5178");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) ' ');
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (short) 0);
        hashMapLinearProbing1.checkLoadFactor();
        int int13 = hashMapLinearProbing1.findHash((int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test5179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5179");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean12 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5180");
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
        int int24 = hashMapLinearProbing1.hashing(34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 34 + "'", int24 == 34);
    }

    @Test
    public void test5181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5181");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        int int4 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.deleteHash(30);
        hashMapLinearProbing1.insertHash((int) (short) 100);
        int int10 = hashMapLinearProbing1.hashing(34);
        int int12 = hashMapLinearProbing1.findHash((-1));
        boolean boolean13 = hashMapLinearProbing1.isFull();
        int int15 = hashMapLinearProbing1.hashing((int) (byte) 0);
        java.lang.Class<?> wildcardClass16 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 45 + "'", int4 == 45);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5182");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 1);
        hashMapLinearProbing1.insertHash((int) (short) 10);
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        boolean boolean12 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5183");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash((-1));
        hashMapLinearProbing1.insertHash(30);
        hashMapLinearProbing1.insertHash(14);
        java.lang.Class<?> wildcardClass13 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5184");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean4 = hashMapLinearProbing1.isFull();
        int int6 = hashMapLinearProbing1.findHash(27);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean9 = hashMapLinearProbing1.isFull();
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test5185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5185");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        hashMapLinearProbing1.deleteHash((int) (byte) 1);
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        boolean boolean13 = hashMapLinearProbing1.isFull();
        boolean boolean14 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        int int17 = hashMapLinearProbing1.hashing(34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 34 + "'", int17 == 34);
    }

    @Test
    public void test5186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5186");
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
        hashMapLinearProbing1.deleteHash(14);
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
    public void test5187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5187");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(35);
        int int7 = hashMapLinearProbing1.findHash((int) '4');
        int int9 = hashMapLinearProbing1.findHash(10);
        int int11 = hashMapLinearProbing1.findHash(1);
        boolean boolean12 = hashMapLinearProbing1.isFull();
        int int14 = hashMapLinearProbing1.hashing(3);
        int int16 = hashMapLinearProbing1.findHash(48);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test5188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5188");
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
        hashMapLinearProbing1.deleteHash((-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5189");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 0);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(100);
        hashMapLinearProbing1.insertHash(29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5190");
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
        int int19 = hashMapLinearProbing1.findHash(27);
        hashMapLinearProbing1.deleteHash(96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test5191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5191");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 1);
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        int int11 = hashMapLinearProbing1.findHash((int) (short) 100);
        int int13 = hashMapLinearProbing1.hashing(14);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) '#');
        int int18 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 14 + "'", int13 == 14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 27 + "'", int18 == 27);
    }

    @Test
    public void test5192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5192");
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
        hashMapLinearProbing1.insertHash((int) '4');
        boolean boolean19 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 44 + "'", int14 == 44);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5193");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isFull();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        boolean boolean8 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5194");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(34);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        boolean boolean3 = hashMapLinearProbing1.isFull();
        boolean boolean4 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(51);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean8 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(32);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5195");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(45);
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        hashMapLinearProbing1.deleteHash(10);
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test5196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5196");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        int int10 = hashMapLinearProbing1.findHash((int) (short) 10);
        int int12 = hashMapLinearProbing1.findHash(0);
        boolean boolean13 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean17 = hashMapLinearProbing1.isEmpty();
        int int19 = hashMapLinearProbing1.hashing(0);
        int int21 = hashMapLinearProbing1.hashing(9);
        hashMapLinearProbing1.checkLoadFactor();
        int int24 = hashMapLinearProbing1.findHash(99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test5197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5197");
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
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.deleteHash(34);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test5198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5198");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        int int5 = hashMapLinearProbing1.findHash(27);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        int int9 = hashMapLinearProbing1.hashing(9);
        int int11 = hashMapLinearProbing1.findHash((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test5199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5199");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.insertHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        hashMapLinearProbing1.displayHashtable();
        java.lang.Class<?> wildcardClass11 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5200");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(19);
    }

    @Test
    public void test5201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5201");
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
        int int23 = hashMapLinearProbing1.hashing((int) '4');
        int int25 = hashMapLinearProbing1.findHash(1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 17 + "'", int23 == 17);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
    }

    @Test
    public void test5202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5202");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        int int5 = hashMapLinearProbing1.hashing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        int int9 = hashMapLinearProbing1.hashing((int) (short) -1);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 51 + "'", int9 == 51);
    }

    @Test
    public void test5203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5203");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (short) 10);
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        int int12 = hashMapLinearProbing1.findHash(30);
        boolean boolean13 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5204");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(35);
        int int7 = hashMapLinearProbing1.findHash((int) '4');
        int int9 = hashMapLinearProbing1.hashing((int) (byte) 0);
        int int11 = hashMapLinearProbing1.hashing((int) 'a');
        boolean boolean12 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27 + "'", int11 == 27);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5205");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (short) -1);
        boolean boolean8 = hashMapLinearProbing1.isFull();
        boolean boolean9 = hashMapLinearProbing1.isFull();
        int int11 = hashMapLinearProbing1.hashing(29);
        hashMapLinearProbing1.checkLoadFactor();
        int int14 = hashMapLinearProbing1.hashing(16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 29 + "'", int11 == 29);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 16 + "'", int14 == 16);
    }

    @Test
    public void test5206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5206");
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
        int int17 = hashMapLinearProbing1.hashing(3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 47 + "'", int15 == 47);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test5207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5207");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(35);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(48);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        int int8 = hashMapLinearProbing1.findHash((int) (short) -1);
        int int10 = hashMapLinearProbing1.findHash(15);
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        hashMapLinearProbing1.insertHash(30);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5208");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(35);
        int int7 = hashMapLinearProbing1.findHash((int) '4');
        int int9 = hashMapLinearProbing1.hashing((int) (byte) 0);
        int int11 = hashMapLinearProbing1.hashing((int) 'a');
        int int13 = hashMapLinearProbing1.findHash((int) (short) 0);
        boolean boolean14 = hashMapLinearProbing1.isEmpty();
        boolean boolean15 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27 + "'", int11 == 27);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5209");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        int int5 = hashMapLinearProbing1.hashing(15);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash((int) (short) 1);
        hashMapLinearProbing1.insertHash(99);
        boolean boolean12 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5210");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        int int10 = hashMapLinearProbing1.findHash((int) (short) 10);
        int int12 = hashMapLinearProbing1.findHash(0);
        boolean boolean13 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean17 = hashMapLinearProbing1.isEmpty();
        int int19 = hashMapLinearProbing1.hashing(0);
        int int21 = hashMapLinearProbing1.findHash(44);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test5211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5211");
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
        hashMapLinearProbing1.deleteHash(35);
        hashMapLinearProbing1.deleteHash(52);
        hashMapLinearProbing1.insertHash(5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 30 + "'", int15 == 30);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5212");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(100);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (byte) 0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
    }

    @Test
    public void test5213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5213");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(32);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean3 = hashMapLinearProbing1.isFull();
        boolean boolean4 = hashMapLinearProbing1.isEmpty();
        boolean boolean5 = hashMapLinearProbing1.isEmpty();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5214");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        int int4 = hashMapLinearProbing1.hashing((int) 'a');
        int int6 = hashMapLinearProbing1.findHash((int) (short) 100);
        hashMapLinearProbing1.insertHash(48);
        int int10 = hashMapLinearProbing1.hashing((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 45 + "'", int4 == 45);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 48 + "'", int10 == 48);
    }

    @Test
    public void test5215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5215");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (short) -1);
        int int10 = hashMapLinearProbing1.hashing((-1));
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        int int13 = hashMapLinearProbing1.hashing(32);
        boolean boolean14 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5216");
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
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test5217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5217");
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
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int21 = hashMapLinearProbing1.hashing((int) (byte) 100);
        hashMapLinearProbing1.insertHash(0);
        boolean boolean24 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 30 + "'", int21 == 30);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5218");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean3 = hashMapLinearProbing1.isEmpty();
        boolean boolean4 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash(17);
        hashMapLinearProbing1.deleteHash(2);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test5219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5219");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) ' ');
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5220");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (byte) 10);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean10 = hashMapLinearProbing1.isFull();
        int int12 = hashMapLinearProbing1.findHash(47);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test5221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5221");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        boolean boolean4 = hashMapLinearProbing1.isFull();
        int int6 = hashMapLinearProbing1.findHash((int) ' ');
        int int8 = hashMapLinearProbing1.hashing(48);
        hashMapLinearProbing1.insertHash(15);
        java.lang.Class<?> wildcardClass11 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 13 + "'", int8 == 13);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5222");
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
        int int18 = hashMapLinearProbing1.findHash(52);
        boolean boolean19 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 34 + "'", int16 == 34);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test5223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5223");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash((int) ' ');
        hashMapLinearProbing1.deleteHash(10);
        int int13 = hashMapLinearProbing1.hashing((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 34 + "'", int13 == 34);
    }

    @Test
    public void test5224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5224");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(35);
        int int7 = hashMapLinearProbing1.findHash((int) '4');
        int int9 = hashMapLinearProbing1.hashing((int) (byte) 0);
        int int11 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        int int15 = hashMapLinearProbing1.hashing(7);
        boolean boolean16 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27 + "'", int11 == 27);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 7 + "'", int15 == 7);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5225");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(51);
        int int7 = hashMapLinearProbing1.findHash(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test5226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5226");
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
        boolean boolean18 = hashMapLinearProbing1.isEmpty();
        java.lang.Class<?> wildcardClass19 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5227");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash(9);
        boolean boolean5 = hashMapLinearProbing1.isEmpty();
        int int7 = hashMapLinearProbing1.findHash(96);
        hashMapLinearProbing1.insertHash(45);
        int int11 = hashMapLinearProbing1.hashing((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 16 + "'", int11 == 16);
    }

    @Test
    public void test5228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5228");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        int int7 = hashMapLinearProbing1.findHash((int) (byte) -1);
        hashMapLinearProbing1.deleteHash((int) (byte) 0);
        hashMapLinearProbing1.insertHash((int) (short) 100);
        int int13 = hashMapLinearProbing1.findHash(27);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean15 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5229");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 10);
        hashMapLinearProbing1.insertHash((int) (byte) 1);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean9 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (byte) 100);
        boolean boolean12 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash((int) 'a');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5230");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(100);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (byte) 0);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (byte) 100);
        java.lang.Class<?> wildcardClass10 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5231");
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
        java.lang.Class<?> wildcardClass25 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 34 + "'", int22 == 34);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5232");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) (byte) 1);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(45);
        hashMapLinearProbing1.insertHash((int) 'a');
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        java.lang.Class<?> wildcardClass9 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5233");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.findHash(0);
        int int10 = hashMapLinearProbing1.hashing(1);
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(35);
        int int15 = hashMapLinearProbing1.hashing(0);
        java.lang.Class<?> wildcardClass16 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5234");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        hashMapLinearProbing1.insertHash(17);
        int int8 = hashMapLinearProbing1.findHash((-1));
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(15);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5235");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(35);
        int int3 = hashMapLinearProbing1.hashing((int) (short) 0);
        int int5 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash(99);
        int int9 = hashMapLinearProbing1.hashing(44);
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test5236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5236");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(0);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        boolean boolean3 = hashMapLinearProbing1.isEmpty();
        boolean boolean4 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            hashMapLinearProbing1.deleteHash(52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test5237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5237");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (short) 10);
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        boolean boolean10 = hashMapLinearProbing1.isFull();
        int int12 = hashMapLinearProbing1.hashing((int) '4');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean14 = hashMapLinearProbing1.isFull();
        int int16 = hashMapLinearProbing1.hashing((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test5238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5238");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(0);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        int int12 = hashMapLinearProbing1.findHash(35);
        hashMapLinearProbing1.checkLoadFactor();
        int int15 = hashMapLinearProbing1.hashing(5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
    }

    @Test
    public void test5239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5239");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash((-1));
        hashMapLinearProbing1.deleteHash(10);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean12 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(100);
        hashMapLinearProbing1.checkLoadFactor();
        int int17 = hashMapLinearProbing1.findHash(51);
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test5240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5240");
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
        hashMapLinearProbing1.displayHashtable();
        boolean boolean19 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test5241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5241");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.deleteHash((-1));
        hashMapLinearProbing1.insertHash(27);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash(32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
    }

    @Test
    public void test5242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5242");
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
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(99);
        boolean boolean25 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test5243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5243");
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
        boolean boolean17 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5244");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        int int11 = hashMapLinearProbing1.hashing((int) '#');
        hashMapLinearProbing1.insertHash((int) (byte) 0);
        hashMapLinearProbing1.deleteHash(100);
        hashMapLinearProbing1.insertHash((-1));
        hashMapLinearProbing1.insertHash(11);
        boolean boolean20 = hashMapLinearProbing1.isEmpty();
        int int22 = hashMapLinearProbing1.hashing(16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 16 + "'", int22 == 16);
    }

    @Test
    public void test5245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5245");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        hashMapLinearProbing1.checkLoadFactor();
        int int8 = hashMapLinearProbing1.findHash((int) (short) 0);
        boolean boolean9 = hashMapLinearProbing1.isFull();
        int int11 = hashMapLinearProbing1.hashing((int) (byte) -1);
        int int13 = hashMapLinearProbing1.hashing(27);
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 34 + "'", int11 == 34);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 27 + "'", int13 == 27);
    }

    @Test
    public void test5246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5246");
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
        int int22 = hashMapLinearProbing1.findHash((int) (byte) 0);
        hashMapLinearProbing1.deleteHash((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test5247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5247");
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
        int int19 = hashMapLinearProbing1.hashing(12);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 48 + "'", int11 == 48);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 48 + "'", int13 == 48);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 12 + "'", int19 == 12);
    }

    @Test
    public void test5248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5248");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((-1));
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean10 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(12);
        boolean boolean13 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5249");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean4 = hashMapLinearProbing1.isFull();
        java.lang.Class<?> wildcardClass5 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test5250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5250");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(45);
        hashMapLinearProbing1.insertHash((int) (byte) 0);
        hashMapLinearProbing1.deleteHash((int) 'a');
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test5251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5251");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash((int) (byte) 10);
        int int6 = hashMapLinearProbing1.findHash(100);
        int int8 = hashMapLinearProbing1.findHash(13);
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash((-1));
        int int13 = hashMapLinearProbing1.findHash((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test5252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5252");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean4 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test5253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5253");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(15);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int11 = hashMapLinearProbing1.findHash(51);
        hashMapLinearProbing1.checkLoadFactor();
        int int14 = hashMapLinearProbing1.hashing(5);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 5 + "'", int14 == 5);
    }

    @Test
    public void test5254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5254");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        int int5 = hashMapLinearProbing1.findHash(27);
        int int7 = hashMapLinearProbing1.findHash((int) (byte) -1);
        hashMapLinearProbing1.deleteHash(1);
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash((int) (byte) 0);
        int int14 = hashMapLinearProbing1.findHash(3);
        boolean boolean15 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5255");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 0);
        hashMapLinearProbing1.displayHashtable();
        int int8 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.insertHash((int) (short) 100);
        boolean boolean11 = hashMapLinearProbing1.isFull();
        boolean boolean12 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 27 + "'", int8 == 27);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5256");
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
        int int16 = hashMapLinearProbing1.findHash((int) (byte) 10);
        boolean boolean17 = hashMapLinearProbing1.isFull();
        boolean boolean18 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test5257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5257");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        hashMapLinearProbing1.insertHash(17);
        int int8 = hashMapLinearProbing1.findHash((int) (byte) 1);
        int int10 = hashMapLinearProbing1.hashing(27);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean13 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 27 + "'", int10 == 27);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5258");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(100);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (byte) 0);
        hashMapLinearProbing1.insertHash(44);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
    }

    @Test
    public void test5259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5259");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(35);
        int int7 = hashMapLinearProbing1.findHash((int) (byte) 10);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5260");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(44);
        boolean boolean2 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5261");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        hashMapLinearProbing1.insertHash((int) '#');
        boolean boolean4 = hashMapLinearProbing1.isEmpty();
        boolean boolean5 = hashMapLinearProbing1.isEmpty();
        int int7 = hashMapLinearProbing1.findHash(11);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test5262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5262");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (byte) 10);
        hashMapLinearProbing1.insertHash(17);
        int int12 = hashMapLinearProbing1.hashing((int) 'a');
        boolean boolean13 = hashMapLinearProbing1.isEmpty();
        int int15 = hashMapLinearProbing1.hashing(5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 27 + "'", int12 == 27);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
    }

    @Test
    public void test5263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5263");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (short) -1);
        boolean boolean8 = hashMapLinearProbing1.isFull();
        boolean boolean9 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean11 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5264");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        int int7 = hashMapLinearProbing1.findHash((int) (byte) -1);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash((int) (short) 0);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) '#');
        int int16 = hashMapLinearProbing1.hashing(3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
    }

    @Test
    public void test5265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5265");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(35);
        int int7 = hashMapLinearProbing1.findHash((int) '4');
        hashMapLinearProbing1.displayHashtable();
        int int10 = hashMapLinearProbing1.hashing((int) ' ');
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5266");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        int int5 = hashMapLinearProbing1.hashing((int) '#');
        int int7 = hashMapLinearProbing1.hashing((int) (short) 1);
        hashMapLinearProbing1.insertHash((int) (byte) 100);
        int int11 = hashMapLinearProbing1.hashing((int) (byte) 100);
        boolean boolean12 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(100);
        int int16 = hashMapLinearProbing1.hashing(100);
        java.lang.Class<?> wildcardClass17 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 48 + "'", int11 == 48);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 48 + "'", int16 == 48);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5267");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        int int11 = hashMapLinearProbing1.hashing(17);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (byte) 1);
        java.lang.Class<?> wildcardClass15 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 17 + "'", int11 == 17);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5268");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (short) 10);
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        int int13 = hashMapLinearProbing1.findHash(17);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test5269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5269");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        int int9 = hashMapLinearProbing1.findHash(34);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test5270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5270");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        int int5 = hashMapLinearProbing1.hashing(0);
        int int7 = hashMapLinearProbing1.findHash(9);
        int int9 = hashMapLinearProbing1.hashing((int) 'a');
        boolean boolean10 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(16);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 27 + "'", int9 == 27);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5271");
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
        int int16 = hashMapLinearProbing1.hashing(51);
        boolean boolean17 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 16 + "'", int16 == 16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5272");
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
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash(8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5273");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) (byte) 0);
        boolean boolean2 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean5 = hashMapLinearProbing1.isEmpty();
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test5274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5274");
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
        hashMapLinearProbing1.insertHash((int) (byte) -1);
        boolean boolean20 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27 + "'", int11 == 27);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5275");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.findHash(0);
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        int int12 = hashMapLinearProbing1.findHash(99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test5276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5276");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        hashMapLinearProbing1.insertHash(17);
        int int8 = hashMapLinearProbing1.findHash((int) (byte) 1);
        hashMapLinearProbing1.deleteHash(13);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(2);
        hashMapLinearProbing1.insertHash(45);
        hashMapLinearProbing1.deleteHash((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test5277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5277");
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
        hashMapLinearProbing1.displayHashtable();
        int int18 = hashMapLinearProbing1.hashing(99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 29 + "'", int18 == 29);
    }

    @Test
    public void test5278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5278");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.hashing((int) (short) 100);
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        boolean boolean10 = hashMapLinearProbing1.isFull();
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        int int13 = hashMapLinearProbing1.hashing(44);
        boolean boolean14 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean16 = hashMapLinearProbing1.isFull();
        int int18 = hashMapLinearProbing1.hashing((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 30 + "'", int8 == 30);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 30 + "'", int18 == 30);
    }

    @Test
    public void test5279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5279");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        hashMapLinearProbing1.displayHashtable();
        int int8 = hashMapLinearProbing1.findHash((-1));
        hashMapLinearProbing1.deleteHash(48);
        java.lang.Class<?> wildcardClass11 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5280");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((-1));
        hashMapLinearProbing1.displayHashtable();
        int int14 = hashMapLinearProbing1.hashing((int) 'a');
        int int16 = hashMapLinearProbing1.findHash(12);
        hashMapLinearProbing1.displayHashtable();
        java.lang.Class<?> wildcardClass18 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 27 + "'", int14 == 27);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5281");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        int int9 = hashMapLinearProbing1.findHash(27);
        int int11 = hashMapLinearProbing1.findHash(8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test5282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5282");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        boolean boolean9 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        boolean boolean12 = hashMapLinearProbing1.isEmpty();
        int int14 = hashMapLinearProbing1.hashing((int) (byte) 10);
        hashMapLinearProbing1.deleteHash(35);
        java.lang.Class<?> wildcardClass17 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5283");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean9 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5284");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(30);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(17);
        hashMapLinearProbing1.checkLoadFactor();
        int int7 = hashMapLinearProbing1.hashing(26);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 26 + "'", int7 == 26);
    }

    @Test
    public void test5285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5285");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.insertHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(45);
        int int11 = hashMapLinearProbing1.hashing((int) (short) 100);
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 48 + "'", int11 == 48);
    }

    @Test
    public void test5286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5286");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean10 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash(1);
        int int14 = hashMapLinearProbing1.hashing(100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 30 + "'", int14 == 30);
    }

    @Test
    public void test5287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5287");
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
        hashMapLinearProbing1.displayHashtable();
        int int21 = hashMapLinearProbing1.findHash(5);
        int int23 = hashMapLinearProbing1.hashing(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test5288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5288");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.findHash((int) (byte) 1);
        int int10 = hashMapLinearProbing1.hashing(32);
        hashMapLinearProbing1.checkLoadFactor();
        int int13 = hashMapLinearProbing1.hashing(3);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test5289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5289");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        int int4 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.deleteHash(0);
        hashMapLinearProbing1.deleteHash(3);
        java.lang.Class<?> wildcardClass9 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 45 + "'", int4 == 45);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5290");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        hashMapLinearProbing1.checkLoadFactor();
        int int8 = hashMapLinearProbing1.hashing((int) 'a');
        boolean boolean9 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash(16);
        hashMapLinearProbing1.insertHash(99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 27 + "'", int8 == 27);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5291");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        boolean boolean7 = hashMapLinearProbing1.isFull();
        int int9 = hashMapLinearProbing1.findHash((int) (byte) 10);
        hashMapLinearProbing1.checkLoadFactor();
        int int12 = hashMapLinearProbing1.findHash(51);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test5292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5292");
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
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(96);
        boolean boolean18 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test5293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5293");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(32);
        hashMapLinearProbing1.insertHash(34);
        boolean boolean4 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test5294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5294");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(35);
        hashMapLinearProbing1.insertHash(29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5295");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        int int4 = hashMapLinearProbing1.hashing(30);
        hashMapLinearProbing1.deleteHash((int) (byte) 100);
        hashMapLinearProbing1.insertHash((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 0);
        hashMapLinearProbing1.insertHash(15);
        boolean boolean14 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        int int17 = hashMapLinearProbing1.hashing(1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 30 + "'", int4 == 30);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test5296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5296");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        int int3 = hashMapLinearProbing1.findHash(32);
        hashMapLinearProbing1.deleteHash((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5297");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(35);
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash((-1));
        int int10 = hashMapLinearProbing1.findHash(32);
        hashMapLinearProbing1.deleteHash((int) '4');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean14 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5298");
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
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test5299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5299");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        hashMapLinearProbing1.displayHashtable();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(27);
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(100);
        hashMapLinearProbing1.displayHashtable();
        int int17 = hashMapLinearProbing1.hashing((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 30 + "'", int17 == 30);
    }

    @Test
    public void test5300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5300");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(0);
        boolean boolean8 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash(17);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean12 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5301");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isFull();
        boolean boolean3 = hashMapLinearProbing1.isEmpty();
        int int5 = hashMapLinearProbing1.findHash(100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test5302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5302");
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
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean20 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash((int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5303");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (short) -1);
        int int10 = hashMapLinearProbing1.hashing((-1));
        hashMapLinearProbing1.insertHash((int) '#');
        boolean boolean13 = hashMapLinearProbing1.isFull();
        int int15 = hashMapLinearProbing1.findHash(1);
        java.lang.Class<?> wildcardClass16 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test5304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5304");
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
        int int18 = hashMapLinearProbing1.findHash(52);
        int int20 = hashMapLinearProbing1.hashing(7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 34 + "'", int16 == 34);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 7 + "'", int20 == 7);
    }

    @Test
    public void test5305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5305");
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
        int int17 = hashMapLinearProbing1.hashing(15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 30 + "'", int15 == 30);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 15 + "'", int17 == 15);
    }

    @Test
    public void test5306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5306");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        hashMapLinearProbing1.insertHash(17);
        int int8 = hashMapLinearProbing1.findHash(32);
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(9);
        hashMapLinearProbing1.insertHash(51);
        int int17 = hashMapLinearProbing1.findHash((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test5307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5307");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        int int9 = hashMapLinearProbing1.findHash(34);
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        int int12 = hashMapLinearProbing1.hashing(45);
        hashMapLinearProbing1.displayHashtable();
        int int15 = hashMapLinearProbing1.findHash((int) ' ');
        boolean boolean16 = hashMapLinearProbing1.isEmpty();
        boolean boolean17 = hashMapLinearProbing1.isFull();
        boolean boolean18 = hashMapLinearProbing1.isEmpty();
        int int20 = hashMapLinearProbing1.hashing(19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 19 + "'", int20 == 19);
    }

    @Test
    public void test5308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5308");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean4 = hashMapLinearProbing1.isFull();
        int int6 = hashMapLinearProbing1.findHash(27);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        int int11 = hashMapLinearProbing1.hashing((int) '4');
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 17 + "'", int11 == 17);
    }

    @Test
    public void test5309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5309");
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
        boolean boolean18 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((-1));
        boolean boolean22 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 27 + "'", int17 == 27);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test5310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5310");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        int int9 = hashMapLinearProbing1.findHash(34);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean13 = hashMapLinearProbing1.isEmpty();
        int int15 = hashMapLinearProbing1.hashing(99);
        boolean boolean16 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 29 + "'", int15 == 29);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test5311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5311");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean9 = hashMapLinearProbing1.isFull();
        int int11 = hashMapLinearProbing1.hashing((int) ' ');
        hashMapLinearProbing1.deleteHash((int) (byte) 1);
        int int15 = hashMapLinearProbing1.findHash(45);
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test5312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5312");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        hashMapLinearProbing1.insertHash(17);
        int int8 = hashMapLinearProbing1.findHash((int) (byte) 1);
        int int10 = hashMapLinearProbing1.hashing(27);
        hashMapLinearProbing1.insertHash(96);
        boolean boolean13 = hashMapLinearProbing1.isEmpty();
        boolean boolean14 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 27 + "'", int10 == 27);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5313");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 0);
        hashMapLinearProbing1.displayHashtable();
        int int8 = hashMapLinearProbing1.hashing((int) 'a');
        boolean boolean9 = hashMapLinearProbing1.isFull();
        int int11 = hashMapLinearProbing1.findHash((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 27 + "'", int8 == 27);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test5314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5314");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(27);
        int int11 = hashMapLinearProbing1.findHash((int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test5315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5315");
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
        boolean boolean17 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean19 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test5316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5316");
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
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5317");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (short) -1);
        int int10 = hashMapLinearProbing1.hashing((-1));
        hashMapLinearProbing1.insertHash((int) '#');
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
    }

    @Test
    public void test5318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5318");
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
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(99);
        hashMapLinearProbing1.insertHash(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test5319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5319");
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
        int int23 = hashMapLinearProbing1.hashing(0);
        boolean boolean24 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test5320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5320");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        int int4 = hashMapLinearProbing1.hashing(30);
        int int6 = hashMapLinearProbing1.hashing(32);
        hashMapLinearProbing1.insertHash(15);
        hashMapLinearProbing1.insertHash(12);
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean13 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 30 + "'", int4 == 30);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5321");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (byte) 10);
        hashMapLinearProbing1.insertHash(17);
        int int12 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 27 + "'", int12 == 27);
    }

    @Test
    public void test5322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5322");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(35);
        int int3 = hashMapLinearProbing1.hashing((int) (short) 0);
        int int5 = hashMapLinearProbing1.findHash(51);
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        int int8 = hashMapLinearProbing1.hashing((int) (byte) 100);
        hashMapLinearProbing1.insertHash((int) 'a');
        hashMapLinearProbing1.deleteHash((-1));
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 30 + "'", int8 == 30);
    }

    @Test
    public void test5323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5323");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(0);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        boolean boolean3 = hashMapLinearProbing1.isEmpty();
        boolean boolean4 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        // The following exception was thrown during execution in test generation
        try {
            hashMapLinearProbing1.deleteHash((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test5324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5324");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        int int10 = hashMapLinearProbing1.findHash((int) (short) 10);
        int int12 = hashMapLinearProbing1.findHash(0);
        int int14 = hashMapLinearProbing1.findHash((int) ' ');
        boolean boolean15 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test5325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5325");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        hashMapLinearProbing1.insertHash((int) '#');
        int int7 = hashMapLinearProbing1.hashing(52);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 17 + "'", int7 == 17);
    }

    @Test
    public void test5326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5326");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(45);
        hashMapLinearProbing1.deleteHash(32);
        int int5 = hashMapLinearProbing1.hashing(27);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
    }

    @Test
    public void test5327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5327");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(0);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        boolean boolean3 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean8 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean12 = hashMapLinearProbing1.isFull();
        boolean boolean13 = hashMapLinearProbing1.isFull();
        boolean boolean14 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test5328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5328");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        int int4 = hashMapLinearProbing1.hashing(30);
        hashMapLinearProbing1.deleteHash((int) (byte) 100);
        hashMapLinearProbing1.insertHash((int) 'a');
        hashMapLinearProbing1.insertHash(15);
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        boolean boolean12 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 30 + "'", int4 == 30);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5329");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        int int10 = hashMapLinearProbing1.findHash((int) (short) 10);
        int int12 = hashMapLinearProbing1.findHash(0);
        int int14 = hashMapLinearProbing1.hashing((int) (short) 100);
        boolean boolean15 = hashMapLinearProbing1.isEmpty();
        int int17 = hashMapLinearProbing1.findHash((int) (short) 1);
        int int19 = hashMapLinearProbing1.hashing((int) (byte) 0);
        int int21 = hashMapLinearProbing1.findHash(96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 30 + "'", int14 == 30);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test5330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5330");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) (byte) 10);
        int int3 = hashMapLinearProbing1.findHash((int) (short) 100);
        int int5 = hashMapLinearProbing1.hashing((int) (short) 10);
        hashMapLinearProbing1.insertHash(44);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test5331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5331");
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
        int int16 = hashMapLinearProbing1.hashing(27);
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 27 + "'", int16 == 27);
    }

    @Test
    public void test5332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5332");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean4 = hashMapLinearProbing1.isFull();
        int int6 = hashMapLinearProbing1.findHash(27);
        int int8 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test5333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5333");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        int int9 = hashMapLinearProbing1.findHash(34);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(1);
        boolean boolean13 = hashMapLinearProbing1.isFull();
        boolean boolean14 = hashMapLinearProbing1.isEmpty();
        int int16 = hashMapLinearProbing1.findHash((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test5334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5334");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean4 = hashMapLinearProbing1.isEmpty();
        boolean boolean5 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test5335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5335");
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
        int int15 = hashMapLinearProbing1.findHash((int) 'a');
        hashMapLinearProbing1.deleteHash(14);
        java.lang.Class<?> wildcardClass18 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5336");
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
        hashMapLinearProbing1.deleteHash(7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5337");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (short) -1);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(30);
        int int13 = hashMapLinearProbing1.findHash((int) (short) 1);
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test5338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5338");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (short) -1);
        hashMapLinearProbing1.insertHash(10);
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        int int13 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test5339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5339");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(0);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        boolean boolean3 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean8 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean12 = hashMapLinearProbing1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = hashMapLinearProbing1.findHash((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test5340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5340");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((-1));
        hashMapLinearProbing1.deleteHash(27);
        hashMapLinearProbing1.deleteHash(48);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5341");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(10);
        hashMapLinearProbing1.displayHashtable();
        int int4 = hashMapLinearProbing1.hashing(9);
        hashMapLinearProbing1.insertHash(3);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 9 + "'", int4 == 9);
    }

    @Test
    public void test5342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5342");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(35);
        int int3 = hashMapLinearProbing1.hashing((int) (short) 0);
        int int5 = hashMapLinearProbing1.hashing(0);
        int int7 = hashMapLinearProbing1.hashing((int) (byte) 1);
        hashMapLinearProbing1.insertHash(1);
        int int11 = hashMapLinearProbing1.findHash(10);
        hashMapLinearProbing1.deleteHash(11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test5343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5343");
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
        int int19 = hashMapLinearProbing1.hashing(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test5344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5344");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(10);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash((int) '4');
        int int6 = hashMapLinearProbing1.findHash((int) '#');
        java.lang.Class<?> wildcardClass7 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5345");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        int int11 = hashMapLinearProbing1.findHash(48);
        hashMapLinearProbing1.insertHash((int) (byte) 0);
        java.lang.Class<?> wildcardClass14 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5346");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        int int11 = hashMapLinearProbing1.hashing((int) (short) -1);
        int int13 = hashMapLinearProbing1.findHash((int) (byte) 100);
        int int15 = hashMapLinearProbing1.hashing(29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 34 + "'", int11 == 34);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 29 + "'", int15 == 29);
    }

    @Test
    public void test5347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5347");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (byte) 10);
        hashMapLinearProbing1.insertHash(17);
        int int12 = hashMapLinearProbing1.findHash(34);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(51);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(51);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test5348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5348");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 0);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test5349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5349");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.insertHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) '4');
        boolean boolean11 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5350");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        int int9 = hashMapLinearProbing1.findHash(34);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash((int) (short) 0);
        int int14 = hashMapLinearProbing1.findHash(100);
        hashMapLinearProbing1.deleteHash(100);
        java.lang.Class<?> wildcardClass17 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5351");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(35);
        hashMapLinearProbing1.deleteHash(17);
        hashMapLinearProbing1.insertHash(35);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5352");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 0);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(17);
        boolean boolean9 = hashMapLinearProbing1.isFull();
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5353");
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
        int int18 = hashMapLinearProbing1.hashing(35);
        int int20 = hashMapLinearProbing1.hashing(35);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test5354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5354");
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
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27 + "'", int11 == 27);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test5355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5355");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash((-1));
        hashMapLinearProbing1.deleteHash(10);
        int int12 = hashMapLinearProbing1.hashing(35);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(27);
        hashMapLinearProbing1.checkLoadFactor();
        int int19 = hashMapLinearProbing1.findHash((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test5356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5356");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        int int5 = hashMapLinearProbing1.hashing((int) (short) -1);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 51 + "'", int5 == 51);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5357");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(100);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (byte) 0);
        boolean boolean5 = hashMapLinearProbing1.isEmpty();
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        java.lang.Class<?> wildcardClass7 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test5358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5358");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        int int11 = hashMapLinearProbing1.findHash((int) '4');
        hashMapLinearProbing1.insertHash(13);
        boolean boolean14 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5359");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(17);
        int int12 = hashMapLinearProbing1.findHash((int) (short) 1);
        hashMapLinearProbing1.insertHash(2);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test5360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5360");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        int int8 = hashMapLinearProbing1.findHash((int) '4');
        int int10 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean12 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(7);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test5361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5361");
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
        hashMapLinearProbing1.insertHash(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5362");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isFull();
        boolean boolean3 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test5363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5363");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (short) -1);
        int int10 = hashMapLinearProbing1.hashing((-1));
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        java.lang.Class<?> wildcardClass12 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test5364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5364");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        hashMapLinearProbing1.deleteHash(100);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean11 = hashMapLinearProbing1.isFull();
        int int13 = hashMapLinearProbing1.hashing(17);
        hashMapLinearProbing1.insertHash(17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 17 + "'", int13 == 17);
    }

    @Test
    public void test5365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5365");
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
        boolean boolean15 = hashMapLinearProbing1.isFull();
        boolean boolean16 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 30 + "'", int8 == 30);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test5366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5366");
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
        boolean boolean23 = hashMapLinearProbing1.isFull();
        int int25 = hashMapLinearProbing1.findHash(5);
        java.lang.Class<?> wildcardClass26 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + (-1) + "'", int25 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test5367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5367");
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
        boolean boolean23 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test5368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5368");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        int int5 = hashMapLinearProbing1.hashing((int) '#');
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        int int10 = hashMapLinearProbing1.hashing((int) (short) 10);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 10 + "'", int10 == 10);
    }

    @Test
    public void test5369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5369");
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
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5370");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (short) -1);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean10 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5371");
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
        boolean boolean23 = hashMapLinearProbing1.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test5372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5372");
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
        hashMapLinearProbing1.deleteHash(100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test5373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5373");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        int int4 = hashMapLinearProbing1.hashing(30);
        hashMapLinearProbing1.deleteHash((int) (byte) 100);
        hashMapLinearProbing1.insertHash((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        hashMapLinearProbing1.deleteHash((int) (byte) 1);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 30 + "'", int4 == 30);
    }

    @Test
    public void test5374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5374");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        int int10 = hashMapLinearProbing1.findHash((int) (short) 10);
        int int12 = hashMapLinearProbing1.findHash(0);
        boolean boolean13 = hashMapLinearProbing1.isFull();
        boolean boolean14 = hashMapLinearProbing1.isEmpty();
        boolean boolean15 = hashMapLinearProbing1.isFull();
        int int17 = hashMapLinearProbing1.findHash(15);
        int int19 = hashMapLinearProbing1.findHash(44);
        int int21 = hashMapLinearProbing1.hashing((-1));
        java.lang.Class<?> wildcardClass22 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 34 + "'", int21 == 34);
        org.junit.Assert.assertNotNull(wildcardClass22);
    }

    @Test
    public void test5375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5375");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        int int4 = hashMapLinearProbing1.hashing(30);
        int int6 = hashMapLinearProbing1.hashing(32);
        hashMapLinearProbing1.deleteHash((int) (byte) 1);
        int int10 = hashMapLinearProbing1.hashing((int) (short) 100);
        boolean boolean11 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 30 + "'", int4 == 30);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 30 + "'", int10 == 30);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5376");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) (short) 100);
        hashMapLinearProbing1.deleteHash((int) (byte) 0);
        int int5 = hashMapLinearProbing1.hashing((int) (short) 0);
        int int7 = hashMapLinearProbing1.findHash((-1));
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test5377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5377");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean8 = hashMapLinearProbing1.isFull();
        java.lang.Class<?> wildcardClass9 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5378");
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
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 30 + "'", int4 == 30);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5379");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 0);
        hashMapLinearProbing1.displayHashtable();
        int int8 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        int int13 = hashMapLinearProbing1.findHash((int) ' ');
        hashMapLinearProbing1.deleteHash(35);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 27 + "'", int8 == 27);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test5380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5380");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(14);
        int int3 = hashMapLinearProbing1.findHash(10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
    }

    @Test
    public void test5381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5381");
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
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5382");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.findHash(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test5383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5383");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        boolean boolean3 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash(9);
        java.lang.Class<?> wildcardClass6 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test5384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5384");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean4 = hashMapLinearProbing1.isFull();
        int int6 = hashMapLinearProbing1.hashing(27);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        int int10 = hashMapLinearProbing1.hashing(44);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27 + "'", int6 == 27);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 44 + "'", int10 == 44);
    }

    @Test
    public void test5385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5385");
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
        java.lang.Class<?> wildcardClass17 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 7 + "'", int16 == 7);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test5386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5386");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(45);
        int int3 = hashMapLinearProbing1.hashing(1);
        hashMapLinearProbing1.deleteHash((int) 'a');
        hashMapLinearProbing1.deleteHash(10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test5387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5387");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        int int5 = hashMapLinearProbing1.findHash(27);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
    }

    @Test
    public void test5388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5388");
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
        int int20 = hashMapLinearProbing1.findHash((int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test5389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5389");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(30);
        int int6 = hashMapLinearProbing1.findHash((int) (byte) 0);
        hashMapLinearProbing1.insertHash(17);
        hashMapLinearProbing1.deleteHash((int) (byte) 10);
        boolean boolean11 = hashMapLinearProbing1.isFull();
        int int13 = hashMapLinearProbing1.hashing(45);
        boolean boolean14 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 11 + "'", int13 == 11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5390");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) 'a');
        hashMapLinearProbing1.deleteHash(30);
        hashMapLinearProbing1.displayHashtable();
        int int6 = hashMapLinearProbing1.hashing((int) ' ');
        hashMapLinearProbing1.insertHash(34);
        hashMapLinearProbing1.checkLoadFactor();
        int int11 = hashMapLinearProbing1.findHash(44);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test5391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5391");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        int int10 = hashMapLinearProbing1.findHash((int) (byte) 0);
        java.lang.Class<?> wildcardClass11 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test5392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5392");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) (byte) 0);
        boolean boolean2 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = hashMapLinearProbing1.findHash(44);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5393");
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
        hashMapLinearProbing1.deleteHash(32);
        boolean boolean21 = hashMapLinearProbing1.isFull();
        boolean boolean22 = hashMapLinearProbing1.isFull();
        int int24 = hashMapLinearProbing1.hashing(5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 5 + "'", int24 == 5);
    }

    @Test
    public void test5394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5394");
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
        hashMapLinearProbing1.deleteHash(48);
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
    public void test5395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5395");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(100);
        hashMapLinearProbing1.deleteHash((int) (byte) 10);
        hashMapLinearProbing1.checkLoadFactor();
    }

    @Test
    public void test5396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5396");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int12 = hashMapLinearProbing1.findHash(14);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test5397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5397");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(15);
        hashMapLinearProbing1.insertHash((int) (short) 10);
        boolean boolean4 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5398");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((-1));
        hashMapLinearProbing1.deleteHash(27);
        hashMapLinearProbing1.deleteHash(48);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash(5);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test5399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5399");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 1);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(17);
        int int10 = hashMapLinearProbing1.hashing((int) 'a');
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 12 + "'", int10 == 12);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5400");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        hashMapLinearProbing1.insertHash(17);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        int int11 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.insertHash(13);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test5401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5401");
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
        boolean boolean17 = hashMapLinearProbing1.isEmpty();
        java.lang.Class<?> wildcardClass18 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test5402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5402");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        hashMapLinearProbing1.insertHash(17);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(14);
    }

    @Test
    public void test5403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5403");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 10);
        hashMapLinearProbing1.insertHash((int) (byte) 1);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean9 = hashMapLinearProbing1.isFull();
        int int11 = hashMapLinearProbing1.hashing((int) '4');
        hashMapLinearProbing1.insertHash(51);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 17 + "'", int11 == 17);
    }

    @Test
    public void test5404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5404");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        int int4 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.deleteHash(30);
        hashMapLinearProbing1.insertHash(34);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        int int12 = hashMapLinearProbing1.findHash(13);
        boolean boolean13 = hashMapLinearProbing1.isFull();
        int int15 = hashMapLinearProbing1.findHash(30);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 45 + "'", int4 == 45);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test5405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5405");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(0);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        boolean boolean3 = hashMapLinearProbing1.isEmpty();
        boolean boolean4 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = hashMapLinearProbing1.hashing(29);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test5406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5406");
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
        hashMapLinearProbing1.insertHash(34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test5407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5407");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        int int5 = hashMapLinearProbing1.findHash(27);
        int int7 = hashMapLinearProbing1.findHash((int) (byte) -1);
        hashMapLinearProbing1.deleteHash(1);
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash((int) (byte) 0);
        java.lang.Class<?> wildcardClass13 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test5408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5408");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) (short) 10);
        hashMapLinearProbing1.deleteHash(0);
        hashMapLinearProbing1.insertHash(100);
        int int15 = hashMapLinearProbing1.hashing((int) (byte) 0);
        hashMapLinearProbing1.deleteHash(0);
        hashMapLinearProbing1.insertHash(99);
        int int21 = hashMapLinearProbing1.findHash((int) '4');
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test5409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5409");
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
        int int15 = hashMapLinearProbing1.findHash(99);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test5410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5410");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash(13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test5411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5411");
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
        hashMapLinearProbing1.deleteHash(27);
        int int21 = hashMapLinearProbing1.findHash((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 27 + "'", int16 == 27);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test5412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5412");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean9 = hashMapLinearProbing1.isFull();
        int int11 = hashMapLinearProbing1.hashing((int) ' ');
        int int13 = hashMapLinearProbing1.hashing((int) '4');
        boolean boolean14 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 17 + "'", int13 == 17);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5413");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        int int8 = hashMapLinearProbing1.findHash((int) '4');
        int int10 = hashMapLinearProbing1.hashing(0);
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5414");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(30);
        boolean boolean5 = hashMapLinearProbing1.isFull();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash((int) '4');
        hashMapLinearProbing1.insertHash(51);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5415");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash((int) (byte) 10);
        int int6 = hashMapLinearProbing1.findHash(100);
        hashMapLinearProbing1.checkLoadFactor();
        int int9 = hashMapLinearProbing1.hashing(10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test5416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5416");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        hashMapLinearProbing1.insertHash((int) '#');
        boolean boolean4 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5417");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        int int11 = hashMapLinearProbing1.findHash(96);
        hashMapLinearProbing1.deleteHash((int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test5418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5418");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        int int9 = hashMapLinearProbing1.findHash(34);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test5419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5419");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(9);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(48);
        hashMapLinearProbing1.insertHash(1);
        hashMapLinearProbing1.insertHash(52);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test5420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5420");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(32);
        hashMapLinearProbing1.insertHash(34);
        hashMapLinearProbing1.insertHash((-1));
        boolean boolean6 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test5421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5421");
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
        boolean boolean21 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test5422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5422");
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
        hashMapLinearProbing1.insertHash((int) '#');
        boolean boolean18 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 17 + "'", int15 == 17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5423");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (byte) 10);
        hashMapLinearProbing1.insertHash(17);
        int int12 = hashMapLinearProbing1.findHash(34);
        hashMapLinearProbing1.displayHashtable();
        int int15 = hashMapLinearProbing1.hashing(48);
        boolean boolean16 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash(26);
        hashMapLinearProbing1.deleteHash(27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 13 + "'", int15 == 13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5424");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (short) -1);
        int int10 = hashMapLinearProbing1.hashing((-1));
        hashMapLinearProbing1.insertHash((int) '#');
        int int14 = hashMapLinearProbing1.findHash((int) (byte) 10);
        boolean boolean15 = hashMapLinearProbing1.isFull();
        int int17 = hashMapLinearProbing1.hashing((int) (short) 10);
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 10 + "'", int17 == 10);
    }

    @Test
    public void test5425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5425");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        int int3 = hashMapLinearProbing1.findHash(9);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean5 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test5426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5426");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        boolean boolean9 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        int int16 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.insertHash(19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test5427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5427");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        int int4 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.deleteHash(30);
        hashMapLinearProbing1.insertHash(34);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) 'a');
        boolean boolean12 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 45 + "'", int4 == 45);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5428");
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
        int int16 = hashMapLinearProbing1.hashing(48);
        hashMapLinearProbing1.insertHash((int) 'a');
        boolean boolean19 = hashMapLinearProbing1.isEmpty();
        boolean boolean20 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 45 + "'", int4 == 45);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 48 + "'", int16 == 48);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test5429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5429");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(35);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        int int9 = hashMapLinearProbing1.findHash(27);
        hashMapLinearProbing1.checkLoadFactor();
        int int12 = hashMapLinearProbing1.findHash((-1));
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test5430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5430");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        int int5 = hashMapLinearProbing1.findHash((int) (short) 100);
        int int7 = hashMapLinearProbing1.hashing(44);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 44 + "'", int7 == 44);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test5431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5431");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) (byte) 10);
        hashMapLinearProbing1.deleteHash(30);
        hashMapLinearProbing1.deleteHash((-1));
        hashMapLinearProbing1.checkLoadFactor();
        int int8 = hashMapLinearProbing1.findHash(0);
        boolean boolean9 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5432");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) (byte) 1);
        hashMapLinearProbing1.insertHash((int) (short) 0);
        boolean boolean4 = hashMapLinearProbing1.isFull();
        int int6 = hashMapLinearProbing1.hashing(3);
        hashMapLinearProbing1.checkLoadFactor();
        java.lang.Class<?> wildcardClass8 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5433");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        hashMapLinearProbing1.deleteHash((int) (byte) 1);
        int int11 = hashMapLinearProbing1.findHash((int) ' ');
        boolean boolean12 = hashMapLinearProbing1.isFull();
        int int14 = hashMapLinearProbing1.findHash((int) (byte) -1);
        java.lang.Class<?> wildcardClass15 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test5434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5434");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(45);
        hashMapLinearProbing1.checkLoadFactor();
        int int4 = hashMapLinearProbing1.findHash((int) '4');
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        int int9 = hashMapLinearProbing1.hashing(27);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 27 + "'", int9 == 27);
    }

    @Test
    public void test5435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5435");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        int int11 = hashMapLinearProbing1.findHash(17);
        hashMapLinearProbing1.insertHash((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test5436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5436");
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
        int int24 = hashMapLinearProbing1.findHash(15);
        boolean boolean25 = hashMapLinearProbing1.isEmpty();
        java.lang.Class<?> wildcardClass26 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 27 + "'", int20 == 27);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(wildcardClass26);
    }

    @Test
    public void test5437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5437");
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
        boolean boolean23 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test5438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5438");
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
        hashMapLinearProbing1.deleteHash((int) (byte) 1);
        hashMapLinearProbing1.deleteHash(32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test5439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5439");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        hashMapLinearProbing1.deleteHash(100);
        int int11 = hashMapLinearProbing1.findHash((int) (byte) -1);
        int int13 = hashMapLinearProbing1.findHash((int) (short) 10);
        boolean boolean14 = hashMapLinearProbing1.isEmpty();
        int int16 = hashMapLinearProbing1.findHash(27);
        hashMapLinearProbing1.insertHash(100);
        hashMapLinearProbing1.deleteHash((int) (byte) 0);
        int int22 = hashMapLinearProbing1.findHash(16);
        boolean boolean23 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test5440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5440");
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
        int int21 = hashMapLinearProbing1.hashing((int) (byte) 100);
        hashMapLinearProbing1.deleteHash(48);
        hashMapLinearProbing1.insertHash(3);
        hashMapLinearProbing1.insertHash(26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 30 + "'", int14 == 30);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 30 + "'", int21 == 30);
    }

    @Test
    public void test5441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5441");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        int int4 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.deleteHash(0);
        boolean boolean7 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean9 = hashMapLinearProbing1.isFull();
        int int11 = hashMapLinearProbing1.hashing(35);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 45 + "'", int4 == 45);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 35 + "'", int11 == 35);
    }

    @Test
    public void test5442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5442");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        int int11 = hashMapLinearProbing1.findHash((int) '4');
        hashMapLinearProbing1.insertHash((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test5443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5443");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 0);
        hashMapLinearProbing1.displayHashtable();
        int int8 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.insertHash((int) (short) 100);
        boolean boolean11 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (short) 100);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean15 = hashMapLinearProbing1.isEmpty();
        int int17 = hashMapLinearProbing1.findHash((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 27 + "'", int8 == 27);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test5444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5444");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((-1));
        hashMapLinearProbing1.deleteHash(27);
        int int8 = hashMapLinearProbing1.findHash(99);
        java.lang.Class<?> wildcardClass9 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test5445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5445");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        boolean boolean10 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash(2);
        boolean boolean13 = hashMapLinearProbing1.isFull();
        java.lang.Class<?> wildcardClass14 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test5446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5446");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 0);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) 'a');
        boolean boolean10 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash(26);
        int int16 = hashMapLinearProbing1.findHash((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test5447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5447");
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
        int int19 = hashMapLinearProbing1.findHash(34);
        int int21 = hashMapLinearProbing1.findHash((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test5448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5448");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        boolean boolean12 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(11);
        boolean boolean15 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5449");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (short) -1);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        int int10 = hashMapLinearProbing1.hashing((-1));
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test5450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5450");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        int int9 = hashMapLinearProbing1.findHash(34);
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        int int12 = hashMapLinearProbing1.hashing(45);
        boolean boolean13 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(51);
        hashMapLinearProbing1.insertHash(47);
        hashMapLinearProbing1.insertHash((int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5451");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(44);
        int int3 = hashMapLinearProbing1.hashing((int) (byte) 10);
        boolean boolean4 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 10 + "'", int3 == 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test5452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5452");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(0);
        boolean boolean8 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash(17);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash(0);
        hashMapLinearProbing1.insertHash(100);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test5453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5453");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash(100);
        int int10 = hashMapLinearProbing1.findHash((int) (short) 100);
        hashMapLinearProbing1.deleteHash(100);
        hashMapLinearProbing1.deleteHash(96);
        boolean boolean15 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 30 + "'", int10 == 30);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test5454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5454");
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
        hashMapLinearProbing1.deleteHash((int) 'a');
        boolean boolean20 = hashMapLinearProbing1.isFull();
        int int22 = hashMapLinearProbing1.findHash(10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test5455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5455");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) (short) 100);
        hashMapLinearProbing1.deleteHash((int) (byte) 0);
        int int5 = hashMapLinearProbing1.hashing((int) (short) 0);
        hashMapLinearProbing1.insertHash(32);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        int int10 = hashMapLinearProbing1.hashing(5);
        boolean boolean11 = hashMapLinearProbing1.isFull();
        boolean boolean12 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash(7);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test5456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5456");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        int int7 = hashMapLinearProbing1.findHash((int) (byte) -1);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash((int) (short) 0);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test5457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5457");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.insertHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        hashMapLinearProbing1.displayHashtable();
        int int12 = hashMapLinearProbing1.hashing((int) (short) 100);
        boolean boolean13 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 48 + "'", int12 == 48);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test5458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5458");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.insertHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash(30);
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        boolean boolean11 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        hashMapLinearProbing1.insertHash(44);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test5459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5459");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) (byte) 100);
        boolean boolean2 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(9);
        hashMapLinearProbing1.displayHashtable();
        int int7 = hashMapLinearProbing1.findHash(34);
        java.lang.Class<?> wildcardClass8 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test5460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5460");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 1);
        hashMapLinearProbing1.deleteHash((int) (short) 0);
        hashMapLinearProbing1.deleteHash(35);
        boolean boolean13 = hashMapLinearProbing1.isFull();
        boolean boolean14 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5461");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 1);
        int int10 = hashMapLinearProbing1.findHash(0);
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        int int13 = hashMapLinearProbing1.findHash(16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test5462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5462");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 10);
        hashMapLinearProbing1.insertHash((int) (byte) 1);
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        boolean boolean10 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (short) 1);
        boolean boolean13 = hashMapLinearProbing1.isFull();
        boolean boolean14 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test5463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5463");
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
        boolean boolean17 = hashMapLinearProbing1.isFull();
        boolean boolean18 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test5464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5464");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        hashMapLinearProbing1.deleteHash((int) (byte) 100);
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean12 = hashMapLinearProbing1.isFull();
        int int14 = hashMapLinearProbing1.findHash(5);
        int int16 = hashMapLinearProbing1.findHash((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test5465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5465");
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
        hashMapLinearProbing1.insertHash(16);
        hashMapLinearProbing1.deleteHash((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test5466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5466");
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
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int21 = hashMapLinearProbing1.hashing((int) (byte) 100);
        hashMapLinearProbing1.displayHashtable();
        int int24 = hashMapLinearProbing1.findHash(10);
        boolean boolean25 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 30 + "'", int21 == 30);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test5467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5467");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        int int10 = hashMapLinearProbing1.findHash((int) (short) 10);
        int int12 = hashMapLinearProbing1.findHash(0);
        int int14 = hashMapLinearProbing1.findHash((int) ' ');
        hashMapLinearProbing1.insertHash(100);
        boolean boolean17 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test5468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5468");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(9);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(48);
        hashMapLinearProbing1.insertHash(1);
        boolean boolean7 = hashMapLinearProbing1.isFull();
        int int9 = hashMapLinearProbing1.hashing(14);
        java.lang.Class<?> wildcardClass10 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 5 + "'", int9 == 5);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test5469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5469");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.hashing((int) (short) 100);
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        boolean boolean10 = hashMapLinearProbing1.isFull();
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        int int13 = hashMapLinearProbing1.findHash(34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 30 + "'", int8 == 30);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test5470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5470");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(48);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean3 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test5471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5471");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        int int5 = hashMapLinearProbing1.hashing(0);
        int int7 = hashMapLinearProbing1.findHash(9);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        int int10 = hashMapLinearProbing1.hashing(13);
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 13 + "'", int10 == 13);
    }

    @Test
    public void test5472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5472");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        hashMapLinearProbing1.insertHash(17);
        int int8 = hashMapLinearProbing1.findHash(32);
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash((int) (short) 100);
        int int15 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        int int18 = hashMapLinearProbing1.findHash(17);
        java.lang.Class<?> wildcardClass19 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 17 + "'", int18 == 17);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test5473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5473");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        int int8 = hashMapLinearProbing1.findHash(34);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(17);
        boolean boolean12 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash((int) (short) -1);
        int int16 = hashMapLinearProbing1.findHash(47);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test5474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5474");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) (byte) 100);
        boolean boolean2 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(9);
        hashMapLinearProbing1.deleteHash((int) (byte) 1);
        hashMapLinearProbing1.deleteHash(0);
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5475");
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
        int int17 = hashMapLinearProbing1.hashing((int) (short) -1);
        hashMapLinearProbing1.deleteHash(29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 34 + "'", int17 == 34);
    }

    @Test
    public void test5476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5476");
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
        hashMapLinearProbing1.deleteHash((int) 'a');
        boolean boolean16 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test5477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5477");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 0);
        hashMapLinearProbing1.displayHashtable();
        int int8 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (byte) 100);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 27 + "'", int8 == 27);
    }

    @Test
    public void test5478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5478");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(51);
        hashMapLinearProbing1.deleteHash(15);
        boolean boolean4 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test5479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5479");
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
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
    }

    @Test
    public void test5480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5480");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 0);
        int int7 = hashMapLinearProbing1.hashing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash(17);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test5481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5481");
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
        hashMapLinearProbing1.deleteHash(13);
        hashMapLinearProbing1.insertHash(99);
        java.lang.Class<?> wildcardClass20 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 30 + "'", int15 == 30);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test5482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5482");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        hashMapLinearProbing1.checkLoadFactor();
        int int8 = hashMapLinearProbing1.hashing((int) 'a');
        boolean boolean9 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash(16);
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 27 + "'", int8 == 27);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5483");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        int int4 = hashMapLinearProbing1.hashing(30);
        int int6 = hashMapLinearProbing1.hashing(32);
        hashMapLinearProbing1.deleteHash((int) (short) 10);
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean13 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 30 + "'", int4 == 30);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test5484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5484");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        int int10 = hashMapLinearProbing1.hashing((int) (byte) 1);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean12 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test5485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5485");
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
        int int22 = hashMapLinearProbing1.hashing(2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test5486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5486");
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
        hashMapLinearProbing1.insertHash((int) (short) 10);
        hashMapLinearProbing1.insertHash(35);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 15 + "'", int16 == 15);
    }

    @Test
    public void test5487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5487");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        int int7 = hashMapLinearProbing1.hashing(1);
        int int9 = hashMapLinearProbing1.hashing((int) (byte) -1);
        boolean boolean10 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        int int13 = hashMapLinearProbing1.findHash(52);
        hashMapLinearProbing1.insertHash((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 34 + "'", int9 == 34);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test5488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5488");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(51);
        hashMapLinearProbing1.insertHash((int) (short) -1);
        int int14 = hashMapLinearProbing1.hashing((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test5489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5489");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        int int9 = hashMapLinearProbing1.findHash(34);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash((-1));
        int int15 = hashMapLinearProbing1.hashing(19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
    }

    @Test
    public void test5490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5490");
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
        java.lang.Class<?> wildcardClass25 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 44 + "'", int14 == 44);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 48 + "'", int19 == 48);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 32 + "'", int21 == 32);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test5491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5491");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        int int11 = hashMapLinearProbing1.hashing(45);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash(0);
        hashMapLinearProbing1.checkLoadFactor();
        int int17 = hashMapLinearProbing1.hashing(11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 11 + "'", int17 == 11);
    }

    @Test
    public void test5492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5492");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) (byte) 1);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        int int6 = hashMapLinearProbing1.hashing((int) (byte) 100);
        int int8 = hashMapLinearProbing1.findHash(1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test5493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5493");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        boolean boolean9 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (short) 0);
        hashMapLinearProbing1.insertHash(30);
        int int15 = hashMapLinearProbing1.hashing((int) '#');
        hashMapLinearProbing1.insertHash(44);
        int int19 = hashMapLinearProbing1.hashing(3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test5494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5494");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        int int4 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.deleteHash(0);
        int int8 = hashMapLinearProbing1.findHash(17);
        int int10 = hashMapLinearProbing1.hashing((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 45 + "'", int4 == 45);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test5495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5495");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean3 = hashMapLinearProbing1.isEmpty();
        boolean boolean4 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(0);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean9 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) 'a');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test5496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5496");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isFull();
        boolean boolean3 = hashMapLinearProbing1.isEmpty();
        boolean boolean4 = hashMapLinearProbing1.isEmpty();
        int int6 = hashMapLinearProbing1.hashing(19);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test5497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5497");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        int int5 = hashMapLinearProbing1.findHash(27);
        int int7 = hashMapLinearProbing1.findHash((int) (byte) -1);
        hashMapLinearProbing1.deleteHash(0);
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        int int13 = hashMapLinearProbing1.findHash((int) ' ');
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test5498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5498");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 0);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (byte) 100);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test5499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5499");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        hashMapLinearProbing1.insertHash(17);
        int int8 = hashMapLinearProbing1.findHash((int) (byte) 1);
        hashMapLinearProbing1.deleteHash(0);
        int int12 = hashMapLinearProbing1.findHash(0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test5500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest10.test5500");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        boolean boolean9 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        boolean boolean12 = hashMapLinearProbing1.isEmpty();
        int int14 = hashMapLinearProbing1.hashing((int) (byte) 10);
        hashMapLinearProbing1.deleteHash(35);
        boolean boolean17 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }
}

