package hashmap;

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
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.insertHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(30);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4502");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        int int4 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.deleteHash(30);
        hashMapLinearProbing1.insertHash(34);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) 'a');
        int int13 = hashMapLinearProbing1.findHash((int) (short) -1);
        boolean boolean14 = hashMapLinearProbing1.isFull();
        int int16 = hashMapLinearProbing1.findHash(34);
        int int18 = hashMapLinearProbing1.findHash(9);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 45 + "'", int4 == 45);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 34 + "'", int16 == 34);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test4503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4503");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (byte) 10);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) (byte) 10);
        int int13 = hashMapLinearProbing1.findHash((int) (short) 10);
        hashMapLinearProbing1.deleteHash(15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test4504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4504");
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
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4505");
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
        boolean boolean19 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4506");
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
        int int16 = hashMapLinearProbing1.hashing((int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 34 + "'", int16 == 34);
    }

    @Test
    public void test4507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4507");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.insertHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        int int9 = hashMapLinearProbing1.findHash(30);
        hashMapLinearProbing1.deleteHash(45);
        int int13 = hashMapLinearProbing1.hashing(96);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 44 + "'", int13 == 44);
    }

    @Test
    public void test4508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4508");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) ' ');
        hashMapLinearProbing1.insertHash(100);
        hashMapLinearProbing1.deleteHash(0);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean12 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(16);
        hashMapLinearProbing1.displayHashtable();
        int int17 = hashMapLinearProbing1.hashing(12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 12 + "'", int17 == 12);
    }

    @Test
    public void test4509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4509");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        int int10 = hashMapLinearProbing1.findHash((int) (short) 10);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) (byte) 100);
        hashMapLinearProbing1.insertHash((int) 'a');
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash((int) '4');
        boolean boolean19 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4510");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        int int4 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.deleteHash(30);
        hashMapLinearProbing1.insertHash(34);
        hashMapLinearProbing1.displayHashtable();
        int int11 = hashMapLinearProbing1.hashing((int) (short) 100);
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        int int15 = hashMapLinearProbing1.hashing((int) (byte) 0);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash((int) (byte) 0);
        hashMapLinearProbing1.insertHash(2);
        int int22 = hashMapLinearProbing1.findHash(10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 45 + "'", int4 == 45);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 48 + "'", int11 == 48);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test4511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4511");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        int int8 = hashMapLinearProbing1.findHash(34);
        hashMapLinearProbing1.insertHash(51);
        hashMapLinearProbing1.deleteHash(12);
        boolean boolean13 = hashMapLinearProbing1.isFull();
        int int15 = hashMapLinearProbing1.findHash(10);
        int int17 = hashMapLinearProbing1.findHash(15);
        hashMapLinearProbing1.checkLoadFactor();
        int int20 = hashMapLinearProbing1.hashing(35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test4512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4512");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        hashMapLinearProbing1.displayHashtable();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(27);
        boolean boolean10 = hashMapLinearProbing1.isFull();
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        boolean boolean12 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4513");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        int int9 = hashMapLinearProbing1.hashing((int) (byte) 10);
        boolean boolean10 = hashMapLinearProbing1.isFull();
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash((int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4514");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(27);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean12 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4515");
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
        int int18 = hashMapLinearProbing1.findHash((-1));
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test4516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4516");
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
        int int16 = hashMapLinearProbing1.hashing(1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test4517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4517");
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
        hashMapLinearProbing1.insertHash(17);
        boolean boolean18 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 13 + "'", int15 == 13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4518");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        hashMapLinearProbing1.insertHash(17);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        hashMapLinearProbing1.displayHashtable();
        int int13 = hashMapLinearProbing1.findHash((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test4519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4519");
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
        int int19 = hashMapLinearProbing1.findHash(27);
        boolean boolean20 = hashMapLinearProbing1.isEmpty();
        boolean boolean21 = hashMapLinearProbing1.isFull();
        int int23 = hashMapLinearProbing1.hashing(11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 11 + "'", int23 == 11);
    }

    @Test
    public void test4520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4520");
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
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean26 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 7 + "'", int22 == 7);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test4521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4521");
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
        boolean boolean21 = hashMapLinearProbing1.isFull();
        int int23 = hashMapLinearProbing1.hashing((-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 30 + "'", int14 == 30);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 34 + "'", int23 == 34);
    }

    @Test
    public void test4522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4522");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        int int4 = hashMapLinearProbing1.hashing(30);
        int int6 = hashMapLinearProbing1.hashing(32);
        hashMapLinearProbing1.deleteHash((int) (byte) 1);
        boolean boolean9 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 30 + "'", int4 == 30);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4523");
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
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test4524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4524");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.hashing((int) (short) 100);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 30 + "'", int8 == 30);
    }

    @Test
    public void test4525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4525");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (short) -1);
        boolean boolean8 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(34);
        int int12 = hashMapLinearProbing1.hashing((-1));
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
    }

    @Test
    public void test4526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4526");
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
        int int18 = hashMapLinearProbing1.findHash(15);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 30 + "'", int8 == 30);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test4527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4527");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        hashMapLinearProbing1.insertHash((int) (byte) -1);
        java.lang.Class<?> wildcardClass11 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4528");
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
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test4529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4529");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        int int4 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.deleteHash(0);
        int int8 = hashMapLinearProbing1.hashing(17);
        boolean boolean9 = hashMapLinearProbing1.isFull();
        boolean boolean10 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (byte) 10);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 45 + "'", int4 == 45);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 17 + "'", int8 == 17);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4530");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        int int9 = hashMapLinearProbing1.findHash(34);
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        int int12 = hashMapLinearProbing1.findHash((int) (byte) -1);
        hashMapLinearProbing1.displayHashtable();
        int int15 = hashMapLinearProbing1.hashing(29);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 29 + "'", int15 == 29);
    }

    @Test
    public void test4531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4531");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        int int4 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.deleteHash(30);
        hashMapLinearProbing1.insertHash(34);
        boolean boolean9 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 45 + "'", int4 == 45);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4532");
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
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4533");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(27);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int8 = hashMapLinearProbing1.hashing(12);
        hashMapLinearProbing1.insertHash(5);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 12 + "'", int8 == 12);
    }

    @Test
    public void test4534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4534");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(35);
        int int3 = hashMapLinearProbing1.hashing((int) (short) 0);
        hashMapLinearProbing1.deleteHash(100);
        hashMapLinearProbing1.deleteHash(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test4535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4535");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean10 = hashMapLinearProbing1.isFull();
        boolean boolean11 = hashMapLinearProbing1.isFull();
        int int13 = hashMapLinearProbing1.hashing(14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 14 + "'", int13 == 14);
    }

    @Test
    public void test4536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4536");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        hashMapLinearProbing1.insertHash(45);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean13 = hashMapLinearProbing1.isFull();
        java.lang.Class<?> wildcardClass14 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test4537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4537");
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
        int int17 = hashMapLinearProbing1.hashing(0);
        int int19 = hashMapLinearProbing1.findHash(34);
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test4538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4538");
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
        int int24 = hashMapLinearProbing1.hashing(27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 27 + "'", int24 == 27);
    }

    @Test
    public void test4539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4539");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        int int7 = hashMapLinearProbing1.findHash((int) (byte) -1);
        hashMapLinearProbing1.deleteHash((int) (byte) 0);
        hashMapLinearProbing1.insertHash((int) (short) 100);
        int int13 = hashMapLinearProbing1.findHash(27);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test4540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4540");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        int int8 = hashMapLinearProbing1.findHash(34);
        hashMapLinearProbing1.insertHash(51);
        hashMapLinearProbing1.deleteHash(12);
        boolean boolean13 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4541");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (short) -1);
        boolean boolean8 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(34);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean12 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash(35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4542");
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
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4543");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        int int5 = hashMapLinearProbing1.findHash(27);
        int int7 = hashMapLinearProbing1.findHash((int) (byte) -1);
        hashMapLinearProbing1.deleteHash(0);
        hashMapLinearProbing1.deleteHash((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test4544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4544");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((-1));
        hashMapLinearProbing1.deleteHash(27);
        hashMapLinearProbing1.deleteHash(48);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash(0);
        boolean boolean12 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4545");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean4 = hashMapLinearProbing1.isFull();
        int int6 = hashMapLinearProbing1.hashing(27);
        boolean boolean7 = hashMapLinearProbing1.isFull();
        int int9 = hashMapLinearProbing1.findHash(0);
        java.lang.Class<?> wildcardClass10 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27 + "'", int6 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4546");
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
        hashMapLinearProbing1.insertHash(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 10 + "'", int22 == 10);
    }

    @Test
    public void test4547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4547");
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
        hashMapLinearProbing1.insertHash((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test4548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4548");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        int int5 = hashMapLinearProbing1.hashing(15);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
    }

    @Test
    public void test4549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4549");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        int int4 = hashMapLinearProbing1.hashing(30);
        hashMapLinearProbing1.deleteHash((int) (byte) 100);
        hashMapLinearProbing1.insertHash((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        hashMapLinearProbing1.deleteHash((int) (byte) 1);
        hashMapLinearProbing1.insertHash(16);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 30 + "'", int4 == 30);
    }

    @Test
    public void test4550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4550");
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
        hashMapLinearProbing1.insertHash(47);
        int int21 = hashMapLinearProbing1.findHash(30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test4551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4551");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(100);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (byte) 0);
        hashMapLinearProbing1.checkLoadFactor();
        int int7 = hashMapLinearProbing1.hashing(0);
        java.lang.Class<?> wildcardClass8 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4552");
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
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 17 + "'", int15 == 17);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test4553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4553");
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
        hashMapLinearProbing1.checkLoadFactor();
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
    public void test4554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4554");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        int int8 = hashMapLinearProbing1.findHash((int) '4');
        int int10 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean12 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(0);
        hashMapLinearProbing1.deleteHash(29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4555");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) '4');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4556");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(0);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        int int12 = hashMapLinearProbing1.hashing((int) '#');
        hashMapLinearProbing1.displayHashtable();
        int int15 = hashMapLinearProbing1.hashing(96);
        hashMapLinearProbing1.insertHash(27);
        java.lang.Class<?> wildcardClass18 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 26 + "'", int15 == 26);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4557");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        int int10 = hashMapLinearProbing1.findHash((int) (short) 10);
        hashMapLinearProbing1.insertHash((int) (short) 100);
        boolean boolean13 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4558");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        int int5 = hashMapLinearProbing1.findHash(27);
        int int7 = hashMapLinearProbing1.findHash((int) (byte) -1);
        hashMapLinearProbing1.deleteHash(0);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean11 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(0);
        hashMapLinearProbing1.insertHash(15);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4559");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        hashMapLinearProbing1.insertHash(17);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash(99);
        hashMapLinearProbing1.insertHash(7);
    }

    @Test
    public void test4560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4560");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        int int11 = hashMapLinearProbing1.hashing((int) '#');
        hashMapLinearProbing1.insertHash((int) (byte) 0);
        int int15 = hashMapLinearProbing1.findHash(35);
        hashMapLinearProbing1.deleteHash(0);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test4561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4561");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        int int11 = hashMapLinearProbing1.findHash(96);
        hashMapLinearProbing1.insertHash(99);
        int int15 = hashMapLinearProbing1.hashing(99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 29 + "'", int15 == 29);
    }

    @Test
    public void test4562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4562");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.findHash(0);
        int int10 = hashMapLinearProbing1.hashing((int) '#');
        int int12 = hashMapLinearProbing1.hashing((int) (byte) 0);
        hashMapLinearProbing1.deleteHash(27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4563");
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
        hashMapLinearProbing1.displayHashtable();
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
    public void test4564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4564");
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
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(51);
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
    public void test4565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4565");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        hashMapLinearProbing1.deleteHash(100);
        int int11 = hashMapLinearProbing1.findHash((int) (byte) -1);
        int int13 = hashMapLinearProbing1.findHash((int) (short) 10);
        boolean boolean14 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(27);
        int int18 = hashMapLinearProbing1.hashing((int) (byte) 1);
        hashMapLinearProbing1.deleteHash(47);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test4566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4566");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        int int4 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.deleteHash(30);
        hashMapLinearProbing1.displayHashtable();
        int int9 = hashMapLinearProbing1.findHash((int) (byte) 1);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean11 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 45 + "'", int4 == 45);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4567");
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
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean23 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4568");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(30);
        boolean boolean5 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (short) -1);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(11);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4569");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean11 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4570");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash((-1));
        hashMapLinearProbing1.deleteHash(10);
        hashMapLinearProbing1.deleteHash(29);
        int int14 = hashMapLinearProbing1.findHash((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test4571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4571");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(30);
        int int12 = hashMapLinearProbing1.findHash(9);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean14 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test4572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4572");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        int int9 = hashMapLinearProbing1.hashing((int) (byte) 10);
        hashMapLinearProbing1.deleteHash((int) '#');
        hashMapLinearProbing1.displayHashtable();
        boolean boolean13 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        int int16 = hashMapLinearProbing1.findHash(51);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test4573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4573");
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
        hashMapLinearProbing1.displayHashtable();
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
    public void test4574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4574");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(45);
        hashMapLinearProbing1.checkLoadFactor();
        int int4 = hashMapLinearProbing1.findHash((int) '4');
        hashMapLinearProbing1.displayHashtable();
        int int7 = hashMapLinearProbing1.hashing((int) (byte) -1);
        boolean boolean8 = hashMapLinearProbing1.isFull();
        int int10 = hashMapLinearProbing1.hashing(3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 44 + "'", int7 == 44);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test4575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4575");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.insertHash((int) (byte) -1);
        java.lang.Class<?> wildcardClass6 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test4576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4576");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(35);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        int int9 = hashMapLinearProbing1.findHash(27);
        int int11 = hashMapLinearProbing1.findHash(30);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test4577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4577");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash((-1));
        hashMapLinearProbing1.deleteHash(10);
        hashMapLinearProbing1.checkLoadFactor();
        int int13 = hashMapLinearProbing1.hashing(45);
        hashMapLinearProbing1.insertHash(32);
        java.lang.Class<?> wildcardClass16 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4578");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(34);
        int int10 = hashMapLinearProbing1.hashing(1);
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test4579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4579");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.insertHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        hashMapLinearProbing1.deleteHash(15);
        int int13 = hashMapLinearProbing1.findHash((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test4580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4580");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        hashMapLinearProbing1.insertHash(17);
        int int8 = hashMapLinearProbing1.findHash((int) (byte) 1);
        hashMapLinearProbing1.deleteHash(0);
        boolean boolean11 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(9);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4581");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(35);
        int int3 = hashMapLinearProbing1.hashing((int) (short) 0);
        boolean boolean4 = hashMapLinearProbing1.isEmpty();
        int int6 = hashMapLinearProbing1.hashing(0);
        int int8 = hashMapLinearProbing1.findHash((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test4582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4582");
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
        java.lang.Class<?> wildcardClass16 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4583");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash(100);
        int int10 = hashMapLinearProbing1.findHash((int) (short) 100);
        hashMapLinearProbing1.deleteHash(100);
        int int14 = hashMapLinearProbing1.hashing(32);
        int int16 = hashMapLinearProbing1.findHash((-1));
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 30 + "'", int10 == 30);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 32 + "'", int14 == 32);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test4584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4584");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(9);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash((-1));
        hashMapLinearProbing1.checkLoadFactor();
        int int7 = hashMapLinearProbing1.hashing(26);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
    }

    @Test
    public void test4585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4585");
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
        int int17 = hashMapLinearProbing1.findHash(96);
        int int19 = hashMapLinearProbing1.findHash(47);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test4586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4586");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(15);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4587");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.hashing((int) (short) 100);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        boolean boolean11 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 30 + "'", int8 == 30);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4588");
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
        int int24 = hashMapLinearProbing1.findHash(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test4589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4589");
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
        hashMapLinearProbing1.deleteHash((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 45 + "'", int4 == 45);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 48 + "'", int19 == 48);
    }

    @Test
    public void test4590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4590");
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
        hashMapLinearProbing1.insertHash(96);
        java.lang.Class<?> wildcardClass17 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4591");
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
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean20 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4592");
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
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4593");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        hashMapLinearProbing1.insertHash(17);
        int int8 = hashMapLinearProbing1.findHash((-1));
        hashMapLinearProbing1.insertHash((int) (byte) 1);
        hashMapLinearProbing1.insertHash(96);
        hashMapLinearProbing1.deleteHash(5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test4594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4594");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        hashMapLinearProbing1.insertHash(96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
    }

    @Test
    public void test4595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4595");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(35);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(10);
        boolean boolean5 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        java.lang.Class<?> wildcardClass7 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4596");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.findHash(0);
        int int10 = hashMapLinearProbing1.hashing(1);
        hashMapLinearProbing1.deleteHash(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) (byte) 0);
        int int17 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) '#');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test4597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4597");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean9 = hashMapLinearProbing1.isFull();
        boolean boolean10 = hashMapLinearProbing1.isFull();
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(2);
        boolean boolean14 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4598");
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
        hashMapLinearProbing1.insertHash(13);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test4599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4599");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(0);
        boolean boolean8 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        int int11 = hashMapLinearProbing1.hashing((int) (byte) 100);
        boolean boolean12 = hashMapLinearProbing1.isEmpty();
        boolean boolean13 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean15 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 30 + "'", int11 == 30);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test4600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4600");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(0);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(27);
        hashMapLinearProbing1.deleteHash(27);
        int int15 = hashMapLinearProbing1.hashing(13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 13 + "'", int15 == 13);
    }

    @Test
    public void test4601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4601");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        hashMapLinearProbing1.insertHash(17);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean12 = hashMapLinearProbing1.isEmpty();
        int int14 = hashMapLinearProbing1.hashing(2);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test4602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4602");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(34);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash(9);
        int int6 = hashMapLinearProbing1.hashing((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
    }

    @Test
    public void test4603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4603");
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
        boolean boolean21 = hashMapLinearProbing1.isEmpty();
        boolean boolean22 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test4604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4604");
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
        hashMapLinearProbing1.insertHash(0);
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 27 + "'", int11 == 27);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 30 + "'", int13 == 30);
    }

    @Test
    public void test4605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4605");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.findHash(0);
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.checkLoadFactor();
        int int13 = hashMapLinearProbing1.hashing(35);
        int int15 = hashMapLinearProbing1.hashing(30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 30 + "'", int15 == 30);
    }

    @Test
    public void test4606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4606");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.insertHash((int) (byte) -1);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        java.lang.Class<?> wildcardClass8 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4607");
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
        boolean boolean18 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 45 + "'", int4 == 45);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4608");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash(9);
        boolean boolean5 = hashMapLinearProbing1.isEmpty();
        int int7 = hashMapLinearProbing1.findHash(96);
        hashMapLinearProbing1.insertHash(45);
        boolean boolean10 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4609");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash(9);
        boolean boolean5 = hashMapLinearProbing1.isEmpty();
        int int7 = hashMapLinearProbing1.findHash(96);
        hashMapLinearProbing1.insertHash(45);
        boolean boolean10 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4610");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(45);
        boolean boolean11 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        int int14 = hashMapLinearProbing1.findHash(1);
        int int16 = hashMapLinearProbing1.hashing((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test4611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4611");
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
        boolean boolean17 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4612");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (byte) 10);
        hashMapLinearProbing1.insertHash(17);
        java.lang.Class<?> wildcardClass11 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4613");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        int int10 = hashMapLinearProbing1.findHash((int) (short) 10);
        hashMapLinearProbing1.insertHash((int) (short) 100);
        boolean boolean13 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(51);
        boolean boolean18 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4614");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        int int5 = hashMapLinearProbing1.hashing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean8 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(9);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4615");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) 'a');
        hashMapLinearProbing1.deleteHash(30);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean5 = hashMapLinearProbing1.isEmpty();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.hashing(52);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test4616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4616");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        int int4 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.deleteHash(30);
        hashMapLinearProbing1.insertHash((int) (short) 100);
        int int10 = hashMapLinearProbing1.hashing(34);
        int int12 = hashMapLinearProbing1.findHash((int) '4');
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 45 + "'", int4 == 45);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test4617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4617");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash((int) (short) 100);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        int int9 = hashMapLinearProbing1.findHash(29);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test4618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4618");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        hashMapLinearProbing1.displayHashtable();
        int int8 = hashMapLinearProbing1.hashing((int) (byte) 1);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (short) 0);
        hashMapLinearProbing1.insertHash(17);
        boolean boolean14 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4619");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        hashMapLinearProbing1.displayHashtable();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) ' ');
        boolean boolean10 = hashMapLinearProbing1.isFull();
        boolean boolean11 = hashMapLinearProbing1.isFull();
        int int13 = hashMapLinearProbing1.findHash((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test4620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4620");
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
        hashMapLinearProbing1.deleteHash(100);
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
    public void test4621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4621");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        int int5 = hashMapLinearProbing1.hashing(15);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        int int9 = hashMapLinearProbing1.hashing(14);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean12 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 14 + "'", int9 == 14);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4622");
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
        hashMapLinearProbing1.insertHash(96);
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
    public void test4623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4623");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash((int) (short) 100);
        int int6 = hashMapLinearProbing1.findHash(0);
        int int8 = hashMapLinearProbing1.hashing((-1));
        int int10 = hashMapLinearProbing1.findHash((int) (short) 10);
        java.lang.Class<?> wildcardClass11 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 34 + "'", int8 == 34);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4624");
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
        int int21 = hashMapLinearProbing1.hashing(12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 30 + "'", int17 == 30);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 12 + "'", int21 == 12);
    }

    @Test
    public void test4625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4625");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash((int) ' ');
        hashMapLinearProbing1.checkLoadFactor();
        int int8 = hashMapLinearProbing1.hashing((int) (byte) 10);
        int int10 = hashMapLinearProbing1.findHash((int) (byte) 1);
        java.lang.Class<?> wildcardClass11 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4626");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.deleteHash((-1));
        hashMapLinearProbing1.insertHash(27);
        hashMapLinearProbing1.deleteHash(52);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
    }

    @Test
    public void test4627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4627");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        hashMapLinearProbing1.displayHashtable();
        int int8 = hashMapLinearProbing1.findHash((-1));
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean10 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4628");
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
        int int18 = hashMapLinearProbing1.hashing((int) '#');
        boolean boolean19 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        int int22 = hashMapLinearProbing1.hashing(11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 30 + "'", int14 == 30);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 11 + "'", int22 == 11);
    }

    @Test
    public void test4629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4629");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        hashMapLinearProbing1.displayHashtable();
        int int8 = hashMapLinearProbing1.hashing((int) (byte) 1);
        int int10 = hashMapLinearProbing1.findHash((int) (short) 10);
        int int12 = hashMapLinearProbing1.findHash((int) '#');
        int int14 = hashMapLinearProbing1.findHash(30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test4630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4630");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        int int8 = hashMapLinearProbing1.findHash(2);
        java.lang.Class<?> wildcardClass9 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4631");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 0);
        hashMapLinearProbing1.displayHashtable();
        int int8 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.insertHash((int) (short) 10);
        hashMapLinearProbing1.displayHashtable();
        int int13 = hashMapLinearProbing1.hashing((int) '#');
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 27 + "'", int8 == 27);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4632");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(45);
        boolean boolean11 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        int int15 = hashMapLinearProbing1.hashing((int) (short) -1);
        hashMapLinearProbing1.deleteHash((int) '#');
        int int19 = hashMapLinearProbing1.hashing((int) (byte) 10);
        int int21 = hashMapLinearProbing1.hashing(8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 10 + "'", int19 == 10);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 8 + "'", int21 == 8);
    }

    @Test
    public void test4633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4633");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) (short) 100);
        hashMapLinearProbing1.deleteHash((int) (byte) 0);
        int int5 = hashMapLinearProbing1.hashing((int) (short) 0);
        hashMapLinearProbing1.insertHash(32);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        int int10 = hashMapLinearProbing1.hashing(5);
        boolean boolean11 = hashMapLinearProbing1.isFull();
        boolean boolean12 = hashMapLinearProbing1.isFull();
        java.lang.Class<?> wildcardClass13 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4634");
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
        hashMapLinearProbing1.insertHash((int) (short) 0);
        hashMapLinearProbing1.checkLoadFactor();
        int int18 = hashMapLinearProbing1.hashing(27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 27 + "'", int18 == 27);
    }

    @Test
    public void test4635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4635");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) (short) 0);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean3 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean5 = hashMapLinearProbing1.isEmpty();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test4636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4636");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash((int) ' ');
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) '4');
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4637");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.hashing((int) (short) 100);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        int int12 = hashMapLinearProbing1.hashing(44);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 30 + "'", int8 == 30);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
    }

    @Test
    public void test4638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4638");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(13);
        hashMapLinearProbing1.displayHashtable();
        int int7 = hashMapLinearProbing1.findHash(1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test4639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4639");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        int int10 = hashMapLinearProbing1.findHash((int) (short) 10);
        int int12 = hashMapLinearProbing1.findHash(0);
        int int14 = hashMapLinearProbing1.hashing((int) (short) 100);
        hashMapLinearProbing1.checkLoadFactor();
        int int17 = hashMapLinearProbing1.hashing(5);
        boolean boolean18 = hashMapLinearProbing1.isEmpty();
        boolean boolean19 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 30 + "'", int14 == 30);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test4640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4640");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean3 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        int int6 = hashMapLinearProbing1.findHash(13);
        int int8 = hashMapLinearProbing1.findHash(0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test4641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4641");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) (short) 0);
        int int10 = hashMapLinearProbing1.hashing(0);
        int int12 = hashMapLinearProbing1.findHash(52);
        java.lang.Class<?> wildcardClass13 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4642");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (byte) 100);
        int int13 = hashMapLinearProbing1.findHash((int) (short) 1);
        int int15 = hashMapLinearProbing1.hashing((int) ' ');
        int int17 = hashMapLinearProbing1.hashing((-1));
        java.lang.Class<?> wildcardClass18 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 32 + "'", int15 == 32);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 34 + "'", int17 == 34);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4643");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        int int5 = hashMapLinearProbing1.hashing((int) '#');
        int int7 = hashMapLinearProbing1.hashing((int) (short) 1);
        int int9 = hashMapLinearProbing1.findHash((int) '#');
        int int11 = hashMapLinearProbing1.hashing(30);
        boolean boolean12 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean14 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 30 + "'", int11 == 30);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4644");
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
        boolean boolean16 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        boolean boolean19 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4645");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        int int14 = hashMapLinearProbing1.findHash(2);
        boolean boolean15 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test4646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4646");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        boolean boolean9 = hashMapLinearProbing1.isFull();
        int int11 = hashMapLinearProbing1.hashing(7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
    }

    @Test
    public void test4647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4647");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(45);
        hashMapLinearProbing1.checkLoadFactor();
        int int4 = hashMapLinearProbing1.findHash((int) '4');
        hashMapLinearProbing1.deleteHash(7);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
    }

    @Test
    public void test4648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4648");
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
        hashMapLinearProbing1.insertHash(44);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4649");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) (byte) 1);
        hashMapLinearProbing1.insertHash((int) (short) 0);
        boolean boolean4 = hashMapLinearProbing1.isFull();
        boolean boolean5 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        int int8 = hashMapLinearProbing1.hashing(13);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test4650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4650");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(0);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        int int11 = hashMapLinearProbing1.findHash(15);
        int int13 = hashMapLinearProbing1.hashing(34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 34 + "'", int13 == 34);
    }

    @Test
    public void test4651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4651");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        hashMapLinearProbing1.insertHash(17);
        int int8 = hashMapLinearProbing1.findHash(32);
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test4652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4652");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 0);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        int int9 = hashMapLinearProbing1.hashing((int) '4');
        hashMapLinearProbing1.displayHashtable();
        boolean boolean11 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 17 + "'", int9 == 17);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4653");
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
        hashMapLinearProbing1.deleteHash(32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 34 + "'", int22 == 34);
    }

    @Test
    public void test4654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4654");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean3 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        int int6 = hashMapLinearProbing1.findHash(13);
        int int8 = hashMapLinearProbing1.findHash(30);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test4655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4655");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        hashMapLinearProbing1.deleteHash((int) (byte) 100);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash((-1));
        int int15 = hashMapLinearProbing1.findHash(0);
        hashMapLinearProbing1.insertHash(44);
        java.lang.Class<?> wildcardClass18 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4656");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.insertHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash(30);
        boolean boolean10 = hashMapLinearProbing1.isFull();
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4657");
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
        int int18 = hashMapLinearProbing1.hashing(15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
    }

    @Test
    public void test4658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4658");
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
        hashMapLinearProbing1.insertHash(27);
        boolean boolean16 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4659");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.displayHashtable();
        boolean boolean3 = hashMapLinearProbing1.isEmpty();
        boolean boolean4 = hashMapLinearProbing1.isFull();
        boolean boolean5 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(15);
        hashMapLinearProbing1.insertHash(99);
        hashMapLinearProbing1.checkLoadFactor();
        int int12 = hashMapLinearProbing1.hashing((int) ' ');
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
    }

    @Test
    public void test4660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4660");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.insertHash((int) (byte) 100);
        hashMapLinearProbing1.checkLoadFactor();
        int int8 = hashMapLinearProbing1.hashing((int) 'a');
        int int10 = hashMapLinearProbing1.findHash(12);
        boolean boolean11 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 45 + "'", int8 == 45);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4661");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.deleteHash((-1));
        int int9 = hashMapLinearProbing1.hashing((int) (byte) 1);
        hashMapLinearProbing1.checkLoadFactor();
        int int12 = hashMapLinearProbing1.hashing((int) '#');
        hashMapLinearProbing1.insertHash(0);
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4662");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (short) -1);
        boolean boolean8 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(34);
        boolean boolean11 = hashMapLinearProbing1.isFull();
        boolean boolean12 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4663");
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
        boolean boolean18 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 30 + "'", int4 == 30);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 14 + "'", int11 == 14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4664");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) (short) 100);
        hashMapLinearProbing1.deleteHash((int) (byte) 0);
        int int5 = hashMapLinearProbing1.hashing((int) (short) 0);
        hashMapLinearProbing1.insertHash(32);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4665");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        int int4 = hashMapLinearProbing1.hashing(30);
        int int6 = hashMapLinearProbing1.hashing(32);
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        int int9 = hashMapLinearProbing1.findHash((-1));
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 30 + "'", int4 == 30);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test4666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4666");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 1);
        hashMapLinearProbing1.deleteHash((int) (short) 0);
        hashMapLinearProbing1.deleteHash(35);
        int int14 = hashMapLinearProbing1.hashing((int) (short) 10);
        int int16 = hashMapLinearProbing1.hashing(14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 10 + "'", int14 == 10);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 14 + "'", int16 == 14);
    }

    @Test
    public void test4667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4667");
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
        int int16 = hashMapLinearProbing1.findHash(44);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test4668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4668");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) (byte) 10);
        hashMapLinearProbing1.deleteHash(30);
        hashMapLinearProbing1.deleteHash((-1));
        int int7 = hashMapLinearProbing1.hashing(27);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean9 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash(7);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 7 + "'", int7 == 7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4669");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        int int5 = hashMapLinearProbing1.findHash(17);
        int int7 = hashMapLinearProbing1.hashing(5);
        int int9 = hashMapLinearProbing1.findHash(30);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 5 + "'", int7 == 5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test4670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4670");
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
    public void test4671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4671");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (short) -1);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(2);
        int int12 = hashMapLinearProbing1.findHash(14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test4672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4672");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        int int4 = hashMapLinearProbing1.hashing(30);
        int int6 = hashMapLinearProbing1.hashing(32);
        hashMapLinearProbing1.deleteHash((int) (short) 10);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(34);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 30 + "'", int4 == 30);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test4673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4673");
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
        hashMapLinearProbing1.checkLoadFactor();
        int int19 = hashMapLinearProbing1.hashing(44);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean21 = hashMapLinearProbing1.isFull();
        boolean boolean22 = hashMapLinearProbing1.isEmpty();
        int int24 = hashMapLinearProbing1.findHash((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 9 + "'", int19 == 9);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test4674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4674");
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
        int int19 = hashMapLinearProbing1.findHash((int) (byte) 1);
        int int21 = hashMapLinearProbing1.hashing(16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 16 + "'", int21 == 16);
    }

    @Test
    public void test4675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4675");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        hashMapLinearProbing1.insertHash(17);
        int int8 = hashMapLinearProbing1.findHash((int) (byte) 1);
        hashMapLinearProbing1.deleteHash(13);
        int int12 = hashMapLinearProbing1.findHash((int) (byte) 1);
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        hashMapLinearProbing1.deleteHash((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test4676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4676");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        int int7 = hashMapLinearProbing1.findHash((int) (byte) -1);
        hashMapLinearProbing1.insertHash((int) (short) 10);
        int int11 = hashMapLinearProbing1.findHash(51);
        int int13 = hashMapLinearProbing1.hashing(44);
        boolean boolean14 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4677");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        int int5 = hashMapLinearProbing1.hashing((int) '#');
        int int7 = hashMapLinearProbing1.hashing((int) (short) 1);
        hashMapLinearProbing1.insertHash((int) (byte) 100);
        int int11 = hashMapLinearProbing1.hashing((int) (byte) 100);
        boolean boolean12 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(100);
        hashMapLinearProbing1.deleteHash((int) (short) 0);
        boolean boolean17 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 48 + "'", int11 == 48);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4678");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4679");
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
        hashMapLinearProbing1.displayHashtable();
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
    public void test4680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4680");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        int int5 = hashMapLinearProbing1.hashing((int) '#');
        boolean boolean6 = hashMapLinearProbing1.isFull();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test4681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4681");
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
        boolean boolean19 = hashMapLinearProbing1.isEmpty();
        boolean boolean20 = hashMapLinearProbing1.isFull();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4682");
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
        hashMapLinearProbing1.insertHash(48);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4683");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(15);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
    }

    @Test
    public void test4684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4684");
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
        boolean boolean17 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 27 + "'", int8 == 27);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4685");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 0);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(17);
        boolean boolean9 = hashMapLinearProbing1.isFull();
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(7);
        hashMapLinearProbing1.deleteHash((int) (byte) 100);
        boolean boolean15 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4686");
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
        hashMapLinearProbing1.checkLoadFactor();
        int int18 = hashMapLinearProbing1.findHash(96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test4687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4687");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(35);
        hashMapLinearProbing1.deleteHash(96);
    }

    @Test
    public void test4688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4688");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        hashMapLinearProbing1.insertHash(0);
        hashMapLinearProbing1.insertHash(15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4689");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (short) -1);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean10 = hashMapLinearProbing1.isFull();
        int int12 = hashMapLinearProbing1.findHash((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test4690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4690");
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
        hashMapLinearProbing1.insertHash((int) (short) -1);
        hashMapLinearProbing1.insertHash((int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 27 + "'", int20 == 27);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test4691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4691");
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
        int int16 = hashMapLinearProbing1.hashing((int) '#');
        java.lang.Class<?> wildcardClass17 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 30 + "'", int8 == 30);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4692");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.hashing((int) (short) 100);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        hashMapLinearProbing1.insertHash(34);
        hashMapLinearProbing1.insertHash((-1));
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 30 + "'", int8 == 30);
    }

    @Test
    public void test4693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4693");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        int int4 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.deleteHash(30);
        hashMapLinearProbing1.insertHash(34);
        hashMapLinearProbing1.checkLoadFactor();
        java.lang.Class<?> wildcardClass10 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 45 + "'", int4 == 45);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4694");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (short) -1);
        hashMapLinearProbing1.deleteHash((-1));
        boolean boolean11 = hashMapLinearProbing1.isFull();
        int int13 = hashMapLinearProbing1.hashing(30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 30 + "'", int13 == 30);
    }

    @Test
    public void test4695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4695");
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
        int int20 = hashMapLinearProbing1.hashing(1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
    }

    @Test
    public void test4696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4696");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean9 = hashMapLinearProbing1.isFull();
        boolean boolean10 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4697");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.findHash(0);
        int int10 = hashMapLinearProbing1.hashing(1);
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(100);
        int int15 = hashMapLinearProbing1.hashing(35);
        hashMapLinearProbing1.displayHashtable();
        java.lang.Class<?> wildcardClass17 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4698");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        int int7 = hashMapLinearProbing1.findHash((int) (byte) -1);
        hashMapLinearProbing1.insertHash((int) (short) 10);
        int int11 = hashMapLinearProbing1.findHash(51);
        boolean boolean12 = hashMapLinearProbing1.isEmpty();
        java.lang.Class<?> wildcardClass13 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4699");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        boolean boolean4 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash(35);
        int int9 = hashMapLinearProbing1.hashing((int) (byte) 1);
        boolean boolean10 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4700");
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
        int int17 = hashMapLinearProbing1.hashing(26);
        java.lang.Class<?> wildcardClass18 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 16 + "'", int15 == 16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 26 + "'", int17 == 26);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4701");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(30);
        int int6 = hashMapLinearProbing1.findHash((int) (byte) 0);
        int int8 = hashMapLinearProbing1.hashing(1);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test4702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4702");
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
        hashMapLinearProbing1.insertHash(7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 15 + "'", int22 == 15);
    }

    @Test
    public void test4703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4703");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (byte) 10);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(13);
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4704");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        int int8 = hashMapLinearProbing1.findHash((int) '4');
        int int10 = hashMapLinearProbing1.findHash((int) ' ');
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash(13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test4705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4705");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        int int8 = hashMapLinearProbing1.findHash((int) '4');
        hashMapLinearProbing1.checkLoadFactor();
        int int11 = hashMapLinearProbing1.findHash(30);
        int int13 = hashMapLinearProbing1.hashing(35);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(3);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4706");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 1);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        int int9 = hashMapLinearProbing1.findHash(47);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test4707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4707");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) (byte) 1);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(17);
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(51);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test4708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4708");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 1);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(17);
        int int10 = hashMapLinearProbing1.hashing((int) 'a');
        boolean boolean11 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 12 + "'", int10 == 12);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4709");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (short) 10);
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        boolean boolean10 = hashMapLinearProbing1.isFull();
        int int12 = hashMapLinearProbing1.hashing((int) '4');
        int int14 = hashMapLinearProbing1.findHash(11);
        hashMapLinearProbing1.insertHash(44);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 17 + "'", int12 == 17);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test4710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4710");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(27);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        int int13 = hashMapLinearProbing1.findHash(27);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 27 + "'", int13 == 27);
    }

    @Test
    public void test4711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4711");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        int int4 = hashMapLinearProbing1.hashing(30);
        hashMapLinearProbing1.deleteHash((int) (byte) 100);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        int int10 = hashMapLinearProbing1.findHash((int) (short) 1);
        hashMapLinearProbing1.insertHash((int) (short) -1);
        hashMapLinearProbing1.deleteHash(17);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 30 + "'", int4 == 30);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test4712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4712");
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
        java.lang.Class<?> wildcardClass17 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4713");
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
        boolean boolean17 = hashMapLinearProbing1.isFull();
        boolean boolean18 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4714");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        hashMapLinearProbing1.displayHashtable();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(27);
        boolean boolean10 = hashMapLinearProbing1.isFull();
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(13);
        hashMapLinearProbing1.insertHash((int) 'a');
        boolean boolean16 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4715");
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
        hashMapLinearProbing1.insertHash(2);
        boolean boolean23 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test4716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4716");
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
        java.lang.Class<?> wildcardClass17 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 34 + "'", int14 == 34);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4717");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        hashMapLinearProbing1.deleteHash((int) (byte) 1);
        boolean boolean10 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4718");
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
        hashMapLinearProbing1.deleteHash(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
    }

    @Test
    public void test4719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4719");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(7);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(16);
        int int10 = hashMapLinearProbing1.hashing(30);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 30 + "'", int10 == 30);
    }

    @Test
    public void test4720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4720");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (byte) 100);
        hashMapLinearProbing1.insertHash((int) (byte) 1);
        hashMapLinearProbing1.deleteHash((int) '#');
        hashMapLinearProbing1.insertHash(0);
        hashMapLinearProbing1.insertHash(7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4721");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.insertHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(45);
        hashMapLinearProbing1.insertHash(0);
        hashMapLinearProbing1.deleteHash(5);
        hashMapLinearProbing1.insertHash((int) (short) 100);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test4722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4722");
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
        hashMapLinearProbing1.insertHash(16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4723");
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
        hashMapLinearProbing1.checkLoadFactor();
        int int27 = hashMapLinearProbing1.findHash((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 7 + "'", int22 == 7);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
    }

    @Test
    public void test4724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4724");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.findHash(0);
        int int10 = hashMapLinearProbing1.hashing(1);
        hashMapLinearProbing1.deleteHash(0);
        int int14 = hashMapLinearProbing1.hashing(30);
        boolean boolean15 = hashMapLinearProbing1.isEmpty();
        int int17 = hashMapLinearProbing1.findHash(96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 30 + "'", int14 == 30);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test4725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4725");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(0);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        boolean boolean3 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean9 = hashMapLinearProbing1.isFull();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = hashMapLinearProbing1.hashing(35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4726");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        boolean boolean4 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test4727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4727");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        hashMapLinearProbing1.displayHashtable();
        int int8 = hashMapLinearProbing1.findHash((-1));
        int int10 = hashMapLinearProbing1.findHash(16);
        int int12 = hashMapLinearProbing1.findHash(45);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test4728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4728");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash(100);
        int int10 = hashMapLinearProbing1.findHash((int) (short) 100);
        hashMapLinearProbing1.insertHash(0);
        int int14 = hashMapLinearProbing1.findHash(100);
        boolean boolean15 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 30 + "'", int10 == 30);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4729");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        int int4 = hashMapLinearProbing1.hashing(30);
        hashMapLinearProbing1.deleteHash((int) (byte) 100);
        int int8 = hashMapLinearProbing1.findHash((int) '4');
        hashMapLinearProbing1.checkLoadFactor();
        int int11 = hashMapLinearProbing1.hashing(14);
        hashMapLinearProbing1.deleteHash(100);
        hashMapLinearProbing1.deleteHash(0);
        hashMapLinearProbing1.insertHash(2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 30 + "'", int4 == 30);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 14 + "'", int11 == 14);
    }

    @Test
    public void test4730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4730");
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
        hashMapLinearProbing1.displayHashtable();
        int int18 = hashMapLinearProbing1.findHash(96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test4731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4731");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        int int4 = hashMapLinearProbing1.hashing(30);
        hashMapLinearProbing1.deleteHash((int) (byte) 100);
        hashMapLinearProbing1.insertHash((int) 'a');
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        boolean boolean10 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(10);
        int int15 = hashMapLinearProbing1.findHash(0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 30 + "'", int4 == 30);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test4732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4732");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        int int11 = hashMapLinearProbing1.hashing((int) (byte) 100);
        int int13 = hashMapLinearProbing1.hashing(9);
        hashMapLinearProbing1.deleteHash((int) (short) 10);
        java.lang.Class<?> wildcardClass16 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 30 + "'", int11 == 30);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 9 + "'", int13 == 9);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4733");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        int int9 = hashMapLinearProbing1.findHash(34);
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        int int12 = hashMapLinearProbing1.findHash((int) (byte) -1);
        boolean boolean13 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4734");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (short) -1);
        int int10 = hashMapLinearProbing1.hashing((int) ' ');
        hashMapLinearProbing1.insertHash((int) (byte) -1);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
    }

    @Test
    public void test4735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4735");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(8);
    }

    @Test
    public void test4736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4736");
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
        hashMapLinearProbing1.insertHash((int) ' ');
        java.lang.Class<?> wildcardClass18 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 30 + "'", int4 == 30);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test4737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4737");
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
        int int22 = hashMapLinearProbing1.findHash(35);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test4738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4738");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean4 = hashMapLinearProbing1.isFull();
        int int6 = hashMapLinearProbing1.hashing(27);
        boolean boolean7 = hashMapLinearProbing1.isFull();
        int int9 = hashMapLinearProbing1.findHash(3);
        int int11 = hashMapLinearProbing1.findHash(12);
        boolean boolean12 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 27 + "'", int6 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4739");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(10);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash((int) '4');
        int int6 = hashMapLinearProbing1.findHash((int) '#');
        int int8 = hashMapLinearProbing1.findHash(35);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test4740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4740");
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
        int int17 = hashMapLinearProbing1.findHash(14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test4741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4741");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean4 = hashMapLinearProbing1.isFull();
        int int6 = hashMapLinearProbing1.findHash(27);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        int int11 = hashMapLinearProbing1.hashing((int) ' ');
        boolean boolean12 = hashMapLinearProbing1.isEmpty();
        java.lang.Class<?> wildcardClass13 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4742");
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
        hashMapLinearProbing1.deleteHash(13);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 30 + "'", int15 == 30);
    }

    @Test
    public void test4743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4743");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int10 = hashMapLinearProbing1.findHash((int) 'a');
        int int12 = hashMapLinearProbing1.hashing(45);
        hashMapLinearProbing1.insertHash(12);
        hashMapLinearProbing1.checkLoadFactor();
        java.lang.Class<?> wildcardClass16 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4744");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        hashMapLinearProbing1.displayHashtable();
        int int8 = hashMapLinearProbing1.findHash((-1));
        hashMapLinearProbing1.insertHash(32);
        hashMapLinearProbing1.deleteHash(27);
        hashMapLinearProbing1.insertHash(5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test4745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4745");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((-1));
        hashMapLinearProbing1.deleteHash(27);
        hashMapLinearProbing1.insertHash((int) ' ');
        int int10 = hashMapLinearProbing1.hashing(12);
        boolean boolean11 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(7);
        hashMapLinearProbing1.checkLoadFactor();
        java.lang.Class<?> wildcardClass15 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 12 + "'", int10 == 12);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test4746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4746");
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
        hashMapLinearProbing1.insertHash(26);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 13 + "'", int16 == 13);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 9 + "'", int18 == 9);
    }

    @Test
    public void test4747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4747");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        int int9 = hashMapLinearProbing1.findHash(34);
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        int int12 = hashMapLinearProbing1.findHash((int) (byte) -1);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean14 = hashMapLinearProbing1.isFull();
        boolean boolean15 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test4748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4748");
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
        hashMapLinearProbing1.deleteHash(51);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4749");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash((int) (byte) 10);
        hashMapLinearProbing1.insertHash(32);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean8 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(14);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4750");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(35);
        int int3 = hashMapLinearProbing1.hashing((int) ' ');
        hashMapLinearProbing1.displayHashtable();
        int int6 = hashMapLinearProbing1.findHash((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 32 + "'", int3 == 32);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test4751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4751");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (short) -1);
        boolean boolean8 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(34);
        int int12 = hashMapLinearProbing1.hashing((-1));
        hashMapLinearProbing1.insertHash((int) ' ');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean16 = hashMapLinearProbing1.isFull();
        boolean boolean17 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4752");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(10);
        boolean boolean13 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4753");
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
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 30 + "'", int14 == 30);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
    }

    @Test
    public void test4754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4754");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        int int5 = hashMapLinearProbing1.hashing((int) '#');
        int int7 = hashMapLinearProbing1.hashing((int) (short) 1);
        int int9 = hashMapLinearProbing1.findHash((int) '#');
        int int11 = hashMapLinearProbing1.hashing(30);
        hashMapLinearProbing1.insertHash(1);
        hashMapLinearProbing1.deleteHash(5);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 30 + "'", int11 == 30);
    }

    @Test
    public void test4755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4755");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 1);
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        boolean boolean10 = hashMapLinearProbing1.isFull();
        boolean boolean11 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash(5);
        hashMapLinearProbing1.deleteHash(0);
        boolean boolean16 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4756");
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
        boolean boolean14 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test4757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4757");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(30);
        int int6 = hashMapLinearProbing1.findHash((int) (byte) 0);
        hashMapLinearProbing1.insertHash(17);
        int int10 = hashMapLinearProbing1.findHash((int) ' ');
        int int12 = hashMapLinearProbing1.findHash(17);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test4758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4758");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.findHash((int) (byte) 1);
        int int10 = hashMapLinearProbing1.hashing(32);
        hashMapLinearProbing1.checkLoadFactor();
        int int13 = hashMapLinearProbing1.hashing(3);
        boolean boolean14 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test4759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4759");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 1);
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        int int11 = hashMapLinearProbing1.findHash((int) (short) 10);
        hashMapLinearProbing1.checkLoadFactor();
        int int14 = hashMapLinearProbing1.findHash(5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test4760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4760");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.findHash(0);
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.displayHashtable();
        java.lang.Class<?> wildcardClass12 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test4761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4761");
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
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 30 + "'", int14 == 30);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 30 + "'", int17 == 30);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4762");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        boolean boolean8 = hashMapLinearProbing1.isFull();
        int int10 = hashMapLinearProbing1.hashing((-1));
        int int12 = hashMapLinearProbing1.hashing(0);
        boolean boolean13 = hashMapLinearProbing1.isFull();
        boolean boolean14 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4763");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        int int4 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.deleteHash(30);
        hashMapLinearProbing1.insertHash(34);
        int int10 = hashMapLinearProbing1.findHash(0);
        int int12 = hashMapLinearProbing1.hashing(8);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 45 + "'", int4 == 45);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 8 + "'", int12 == 8);
    }

    @Test
    public void test4764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4764");
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
        hashMapLinearProbing1.deleteHash(16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 27 + "'", int20 == 27);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test4765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4765");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        int int11 = hashMapLinearProbing1.hashing((int) '#');
        hashMapLinearProbing1.insertHash((int) (byte) 0);
        int int15 = hashMapLinearProbing1.hashing(29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 29 + "'", int15 == 29);
    }

    @Test
    public void test4766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4766");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        boolean boolean4 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(99);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4767");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(10);
        hashMapLinearProbing1.checkLoadFactor();
        int int4 = hashMapLinearProbing1.findHash(14);
        int int6 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test4768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4768");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 1);
        int int10 = hashMapLinearProbing1.hashing((int) (byte) -1);
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4769");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(26);
        int int3 = hashMapLinearProbing1.hashing((int) 'a');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 19 + "'", int3 == 19);
    }

    @Test
    public void test4770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4770");
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
        hashMapLinearProbing1.insertHash((int) (byte) 1);
        boolean boolean19 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4771");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean5 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test4772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4772");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        int int9 = hashMapLinearProbing1.findHash(34);
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        int int12 = hashMapLinearProbing1.findHash((int) (byte) -1);
        hashMapLinearProbing1.displayHashtable();
        int int15 = hashMapLinearProbing1.hashing(29);
        hashMapLinearProbing1.deleteHash(19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 29 + "'", int15 == 29);
    }

    @Test
    public void test4773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4773");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) (byte) 10);
        int int3 = hashMapLinearProbing1.findHash((int) (short) 10);
        int int5 = hashMapLinearProbing1.hashing(9);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) ' ');
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4774");
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
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean19 = hashMapLinearProbing1.isEmpty();
        int int21 = hashMapLinearProbing1.findHash(99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test4775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4775");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        int int9 = hashMapLinearProbing1.findHash(34);
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        int int12 = hashMapLinearProbing1.hashing(45);
        boolean boolean13 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(0);
        hashMapLinearProbing1.deleteHash(7);
        boolean boolean18 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(7);
        hashMapLinearProbing1.insertHash((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test4776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4776");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(9);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(45);
        hashMapLinearProbing1.insertHash(0);
        int int8 = hashMapLinearProbing1.findHash(13);
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4777");
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
        boolean boolean17 = hashMapLinearProbing1.isFull();
        int int19 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.deleteHash(14);
        int int23 = hashMapLinearProbing1.findHash((int) (short) 0);
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 30 + "'", int14 == 30);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 27 + "'", int19 == 27);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test4778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4778");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        int int11 = hashMapLinearProbing1.hashing((int) '#');
        boolean boolean12 = hashMapLinearProbing1.isFull();
        int int14 = hashMapLinearProbing1.hashing((int) (short) 100);
        boolean boolean15 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 30 + "'", int14 == 30);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test4779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4779");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        int int4 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.deleteHash(30);
        int int8 = hashMapLinearProbing1.findHash(10);
        int int10 = hashMapLinearProbing1.findHash(100);
        boolean boolean11 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 45 + "'", int4 == 45);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4780");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(45);
        hashMapLinearProbing1.deleteHash(32);
        boolean boolean4 = hashMapLinearProbing1.isEmpty();
        int int6 = hashMapLinearProbing1.findHash(26);
        boolean boolean7 = hashMapLinearProbing1.isFull();
        boolean boolean8 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4781");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        int int9 = hashMapLinearProbing1.hashing((int) (byte) 10);
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4782");
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
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4783");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (byte) 10);
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        int int11 = hashMapLinearProbing1.hashing(14);
        hashMapLinearProbing1.insertHash(100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 14 + "'", int11 == 14);
    }

    @Test
    public void test4784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4784");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.hashing((int) (short) 100);
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        boolean boolean10 = hashMapLinearProbing1.isFull();
        int int12 = hashMapLinearProbing1.hashing((int) (byte) 1);
        boolean boolean13 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(100);
        hashMapLinearProbing1.checkLoadFactor();
        int int18 = hashMapLinearProbing1.hashing(8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 30 + "'", int8 == 30);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 8 + "'", int18 == 8);
    }

    @Test
    public void test4785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4785");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        int int8 = hashMapLinearProbing1.findHash(10);
        int int10 = hashMapLinearProbing1.hashing((int) ' ');
        int int12 = hashMapLinearProbing1.hashing((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 32 + "'", int10 == 32);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 30 + "'", int12 == 30);
    }

    @Test
    public void test4786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4786");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) 'a');
        hashMapLinearProbing1.deleteHash(30);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean5 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash(7);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4787");
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
        int int20 = hashMapLinearProbing1.findHash((int) '4');
        int int22 = hashMapLinearProbing1.hashing(100);
        java.lang.Class<?> wildcardClass23 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 30 + "'", int22 == 30);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4788");
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
        int int19 = hashMapLinearProbing1.findHash(34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test4789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4789");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        int int5 = hashMapLinearProbing1.hashing(15);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        int int9 = hashMapLinearProbing1.hashing(48);
        java.lang.Class<?> wildcardClass10 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 13 + "'", int9 == 13);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4790");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(10);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash((int) '4');
        boolean boolean5 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4791");
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
        boolean boolean20 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 27 + "'", int8 == 27);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test4792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4792");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        hashMapLinearProbing1.insertHash(17);
        int int8 = hashMapLinearProbing1.findHash((int) (byte) -1);
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        int int11 = hashMapLinearProbing1.hashing(34);
        int int13 = hashMapLinearProbing1.hashing(14);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean16 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 34 + "'", int11 == 34);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 14 + "'", int13 == 14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4793");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) (short) 100);
        hashMapLinearProbing1.deleteHash((int) (byte) 0);
        int int5 = hashMapLinearProbing1.hashing((int) (short) 0);
        int int7 = hashMapLinearProbing1.findHash((-1));
        int int9 = hashMapLinearProbing1.hashing((int) (short) -1);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 99 + "'", int9 == 99);
    }

    @Test
    public void test4794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4794");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        int int4 = hashMapLinearProbing1.hashing(30);
        hashMapLinearProbing1.deleteHash((int) (byte) 100);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        int int10 = hashMapLinearProbing1.findHash((int) (short) 1);
        boolean boolean11 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 30 + "'", int4 == 30);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4795");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean13 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4796");
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
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 30 + "'", int4 == 30);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4797");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (short) -1);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        int int10 = hashMapLinearProbing1.findHash((int) (byte) 100);
        hashMapLinearProbing1.insertHash((-1));
        hashMapLinearProbing1.insertHash(12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test4798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4798");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
    }

    @Test
    public void test4799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4799");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash((int) ' ');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        int int9 = hashMapLinearProbing1.findHash((int) (byte) -1);
        int int11 = hashMapLinearProbing1.hashing(34);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 34 + "'", int11 == 34);
    }

    @Test
    public void test4800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4800");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(35);
        int int3 = hashMapLinearProbing1.hashing((int) (short) 0);
        int int5 = hashMapLinearProbing1.hashing(0);
        int int7 = hashMapLinearProbing1.hashing((int) (byte) 1);
        hashMapLinearProbing1.insertHash(1);
        int int11 = hashMapLinearProbing1.findHash(10);
        int int13 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test4801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4801");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((-1));
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash((int) (short) 0);
        boolean boolean12 = hashMapLinearProbing1.isFull();
        int int14 = hashMapLinearProbing1.findHash(7);
        hashMapLinearProbing1.deleteHash(32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test4802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4802");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(30);
        boolean boolean5 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        int int9 = hashMapLinearProbing1.hashing(15);
        java.lang.Class<?> wildcardClass10 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4803");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (byte) 10);
        int int10 = hashMapLinearProbing1.findHash((-1));
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean12 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4804");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash(17);
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        int int11 = hashMapLinearProbing1.hashing(0);
        boolean boolean12 = hashMapLinearProbing1.isFull();
        boolean boolean13 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (short) 1);
        hashMapLinearProbing1.insertHash(32);
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4805");
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
        boolean boolean19 = hashMapLinearProbing1.isEmpty();
        int int21 = hashMapLinearProbing1.hashing(7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 17 + "'", int13 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 7 + "'", int21 == 7);
    }

    @Test
    public void test4806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4806");
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
        int int21 = hashMapLinearProbing1.findHash((int) (short) 0);
        int int23 = hashMapLinearProbing1.hashing(14);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 17 + "'", int16 == 17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 14 + "'", int23 == 14);
    }

    @Test
    public void test4807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4807");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(0);
        boolean boolean8 = hashMapLinearProbing1.isFull();
        int int10 = hashMapLinearProbing1.findHash(100);
        int int12 = hashMapLinearProbing1.findHash(48);
        boolean boolean13 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4808");
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
        int int21 = hashMapLinearProbing1.findHash((int) (short) 10);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 44 + "'", int14 == 44);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 48 + "'", int19 == 48);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test4809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4809");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) (byte) 0);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean3 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        // The following exception was thrown during execution in test generation
        try {
            hashMapLinearProbing1.deleteHash(8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: null");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test4810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4810");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.findHash(0);
        int int10 = hashMapLinearProbing1.hashing(48);
        int int12 = hashMapLinearProbing1.hashing(45);
        hashMapLinearProbing1.insertHash((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 13 + "'", int10 == 13);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test4811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4811");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        hashMapLinearProbing1.deleteHash((int) (byte) 100);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash((-1));
        int int15 = hashMapLinearProbing1.findHash(0);
        hashMapLinearProbing1.insertHash(32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test4812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4812");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash(100);
        int int10 = hashMapLinearProbing1.findHash((int) (short) 100);
        int int12 = hashMapLinearProbing1.hashing(15);
        int int14 = hashMapLinearProbing1.findHash(34);
        hashMapLinearProbing1.deleteHash((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 30 + "'", int10 == 30);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test4813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4813");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        int int11 = hashMapLinearProbing1.findHash(17);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test4814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4814");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        int int4 = hashMapLinearProbing1.hashing(30);
        int int6 = hashMapLinearProbing1.hashing(32);
        hashMapLinearProbing1.deleteHash((int) (short) 10);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(35);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 30 + "'", int4 == 30);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test4815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4815");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        int int10 = hashMapLinearProbing1.findHash((int) (short) 10);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean14 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4816");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        int int8 = hashMapLinearProbing1.findHash((int) '4');
        int int10 = hashMapLinearProbing1.hashing(0);
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(29);
        int int16 = hashMapLinearProbing1.hashing(32);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 32 + "'", int16 == 32);
    }

    @Test
    public void test4817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4817");
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
        hashMapLinearProbing1.deleteHash(16);
        hashMapLinearProbing1.deleteHash((int) (short) -1);
        hashMapLinearProbing1.displayHashtable();
        java.lang.Class<?> wildcardClass23 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 32 + "'", int17 == 32);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test4818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4818");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        int int4 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.deleteHash(30);
        hashMapLinearProbing1.insertHash((int) (short) 100);
        int int10 = hashMapLinearProbing1.hashing(34);
        int int12 = hashMapLinearProbing1.findHash((-1));
        hashMapLinearProbing1.deleteHash(26);
        boolean boolean15 = hashMapLinearProbing1.isEmpty();
        int int17 = hashMapLinearProbing1.findHash(1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 45 + "'", int4 == 45);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test4819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4819");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(34);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash(9);
        int int6 = hashMapLinearProbing1.hashing(48);
        hashMapLinearProbing1.checkLoadFactor();
        int int9 = hashMapLinearProbing1.hashing(15);
        int int11 = hashMapLinearProbing1.findHash(14);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 14 + "'", int6 == 14);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test4820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4820");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        int int10 = hashMapLinearProbing1.findHash((int) (short) 10);
        int int12 = hashMapLinearProbing1.findHash(0);
        boolean boolean13 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash(35);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4821");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean11 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4822");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.findHash(0);
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        int int11 = hashMapLinearProbing1.findHash(48);
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test4823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4823");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(0);
        boolean boolean8 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        int int11 = hashMapLinearProbing1.findHash(0);
        hashMapLinearProbing1.deleteHash(15);
        hashMapLinearProbing1.insertHash(99);
        java.lang.Class<?> wildcardClass16 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4824");
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
        int int15 = hashMapLinearProbing1.findHash(99);
        boolean boolean16 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test4825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4825");
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
        java.lang.Class<?> wildcardClass17 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4826");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(45);
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test4827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4827");
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
        hashMapLinearProbing1.checkLoadFactor();
        int int17 = hashMapLinearProbing1.findHash((-1));
        int int19 = hashMapLinearProbing1.hashing((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 34 + "'", int19 == 34);
    }

    @Test
    public void test4828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4828");
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
        hashMapLinearProbing1.deleteHash(32);
        int int24 = hashMapLinearProbing1.hashing(11);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 14 + "'", int20 == 14);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 11 + "'", int24 == 11);
    }

    @Test
    public void test4829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4829");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(30);
        boolean boolean5 = hashMapLinearProbing1.isFull();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash((int) '4');
        java.lang.Class<?> wildcardClass11 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4830");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        hashMapLinearProbing1.insertHash(17);
        int int8 = hashMapLinearProbing1.findHash((int) (byte) -1);
        int int10 = hashMapLinearProbing1.hashing(17);
        hashMapLinearProbing1.deleteHash(9);
        boolean boolean13 = hashMapLinearProbing1.isEmpty();
        int int15 = hashMapLinearProbing1.hashing((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 17 + "'", int10 == 17);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test4831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4831");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean4 = hashMapLinearProbing1.isFull();
        int int6 = hashMapLinearProbing1.findHash(27);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(2);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test4832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4832");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) (short) 100);
        hashMapLinearProbing1.deleteHash((int) (byte) 0);
        int int5 = hashMapLinearProbing1.hashing((int) (short) 0);
        hashMapLinearProbing1.insertHash(32);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        int int10 = hashMapLinearProbing1.hashing(5);
        boolean boolean11 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean13 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 5 + "'", int10 == 5);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4833");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        int int10 = hashMapLinearProbing1.findHash((int) (short) 10);
        int int12 = hashMapLinearProbing1.findHash(0);
        int int14 = hashMapLinearProbing1.hashing((int) (byte) 100);
        int int16 = hashMapLinearProbing1.findHash((int) (byte) 1);
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 30 + "'", int14 == 30);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test4834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4834");
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
        hashMapLinearProbing1.insertHash(14);
        hashMapLinearProbing1.displayHashtable();
        int int20 = hashMapLinearProbing1.findHash(2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test4835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4835");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.insertHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        int int8 = hashMapLinearProbing1.findHash((int) (byte) 1);
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        int int11 = hashMapLinearProbing1.findHash((-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test4836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4836");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        boolean boolean10 = hashMapLinearProbing1.isFull();
        int int12 = hashMapLinearProbing1.hashing(3);
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        int int16 = hashMapLinearProbing1.findHash((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test4837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4837");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) 'a');
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash((int) '4');
        hashMapLinearProbing1.insertHash(35);
        hashMapLinearProbing1.displayHashtable();
        java.lang.Class<?> wildcardClass8 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4838");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        int int5 = hashMapLinearProbing1.hashing((int) '#');
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        int int10 = hashMapLinearProbing1.hashing(15);
        int int12 = hashMapLinearProbing1.hashing(10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 35 + "'", int5 == 35);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 15 + "'", int10 == 15);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test4839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4839");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.insertHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        int int9 = hashMapLinearProbing1.findHash(30);
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        java.lang.Class<?> wildcardClass11 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test4840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4840");
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
        hashMapLinearProbing1.insertHash((int) '4');
        hashMapLinearProbing1.displayHashtable();
        int int19 = hashMapLinearProbing1.hashing(2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 32 + "'", int13 == 32);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
    }

    @Test
    public void test4841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4841");
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
        java.lang.Class<?> wildcardClass16 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4842");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.insertHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) '4');
        int int12 = hashMapLinearProbing1.findHash((int) (short) 1);
        boolean boolean13 = hashMapLinearProbing1.isEmpty();
        boolean boolean14 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4843");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(45);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        int int5 = hashMapLinearProbing1.findHash(32);
        int int7 = hashMapLinearProbing1.hashing(0);
        boolean boolean8 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(10);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4844");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        hashMapLinearProbing1.displayHashtable();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        int int9 = hashMapLinearProbing1.hashing((int) (byte) 0);
        boolean boolean10 = hashMapLinearProbing1.isFull();
        int int12 = hashMapLinearProbing1.hashing((int) (short) 0);
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        boolean boolean15 = hashMapLinearProbing1.isEmpty();
        int int17 = hashMapLinearProbing1.findHash(30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test4845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4845");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        int int8 = hashMapLinearProbing1.findHash(13);
        int int10 = hashMapLinearProbing1.findHash(7);
        hashMapLinearProbing1.insertHash(3);
        int int14 = hashMapLinearProbing1.hashing((int) (short) 100);
        int int16 = hashMapLinearProbing1.findHash(45);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 30 + "'", int14 == 30);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test4846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4846");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(10);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(44);
        int int6 = hashMapLinearProbing1.findHash(34);
        int int8 = hashMapLinearProbing1.hashing(27);
        boolean boolean9 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(30);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 7 + "'", int8 == 7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4847");
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
        int int20 = hashMapLinearProbing1.findHash((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 14 + "'", int13 == 14);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 27 + "'", int18 == 27);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test4848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4848");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.insertHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        int int8 = hashMapLinearProbing1.findHash((int) (byte) 1);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash(0);
        hashMapLinearProbing1.checkLoadFactor();
        int int14 = hashMapLinearProbing1.findHash(10);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test4849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4849");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        int int9 = hashMapLinearProbing1.findHash((int) ' ');
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test4850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4850");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean3 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        int int6 = hashMapLinearProbing1.findHash(17);
        hashMapLinearProbing1.deleteHash(26);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
    }

    @Test
    public void test4851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4851");
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
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        int int20 = hashMapLinearProbing1.findHash((int) '4');
        int int22 = hashMapLinearProbing1.hashing(12);
        int int24 = hashMapLinearProbing1.hashing((int) (short) -1);
        java.lang.Class<?> wildcardClass25 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 27 + "'", int16 == 27);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 12 + "'", int22 == 12);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 34 + "'", int24 == 34);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4852");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean4 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        int int7 = hashMapLinearProbing1.hashing((int) '#');
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(17);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test4853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4853");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash(27);
        hashMapLinearProbing1.deleteHash(0);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test4854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4854");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 10);
        hashMapLinearProbing1.insertHash((int) (byte) 1);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean9 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (byte) 100);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4855");
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
        int int17 = hashMapLinearProbing1.hashing(14);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 14 + "'", int17 == 14);
    }

    @Test
    public void test4856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4856");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4857");
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
        int int15 = hashMapLinearProbing1.hashing((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test4858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4858");
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
        hashMapLinearProbing1.insertHash(7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test4859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4859");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 0);
        hashMapLinearProbing1.displayHashtable();
        int int8 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        int int13 = hashMapLinearProbing1.findHash(16);
        hashMapLinearProbing1.displayHashtable();
        int int16 = hashMapLinearProbing1.hashing(9);
        boolean boolean17 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 27 + "'", int8 == 27);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4860");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        int int4 = hashMapLinearProbing1.hashing((int) ' ');
        hashMapLinearProbing1.deleteHash((int) ' ');
        hashMapLinearProbing1.insertHash(45);
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        java.lang.Class<?> wildcardClass10 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 15 + "'", int4 == 15);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4861");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) ' ');
        hashMapLinearProbing1.insertHash(100);
        hashMapLinearProbing1.deleteHash(0);
        hashMapLinearProbing1.checkLoadFactor();
        int int13 = hashMapLinearProbing1.hashing(45);
        boolean boolean14 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4862");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(0);
        boolean boolean8 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash(17);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash(0);
        hashMapLinearProbing1.insertHash((int) '#');
        boolean boolean16 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test4863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4863");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.findHash(0);
        int int10 = hashMapLinearProbing1.hashing(0);
        int int12 = hashMapLinearProbing1.findHash(51);
        boolean boolean13 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(44);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4864");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        int int11 = hashMapLinearProbing1.hashing(45);
        int int13 = hashMapLinearProbing1.hashing(48);
        int int15 = hashMapLinearProbing1.findHash(7);
        int int17 = hashMapLinearProbing1.hashing((int) '#');
        hashMapLinearProbing1.deleteHash(0);
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 10 + "'", int11 == 10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 13 + "'", int13 == 13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test4865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4865");
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
        hashMapLinearProbing1.deleteHash((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4866");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        hashMapLinearProbing1.deleteHash(27);
        boolean boolean4 = hashMapLinearProbing1.isEmpty();
        int int6 = hashMapLinearProbing1.hashing(51);
        boolean boolean7 = hashMapLinearProbing1.isFull();
        java.lang.Class<?> wildcardClass8 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4867");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        int int4 = hashMapLinearProbing1.hashing(30);
        hashMapLinearProbing1.deleteHash((int) (byte) 100);
        hashMapLinearProbing1.insertHash((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 0);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(5);
        int int16 = hashMapLinearProbing1.hashing(14);
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 30 + "'", int4 == 30);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 14 + "'", int16 == 14);
    }

    @Test
    public void test4868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4868");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        hashMapLinearProbing1.displayHashtable();
        int int8 = hashMapLinearProbing1.hashing((int) (byte) 1);
        int int10 = hashMapLinearProbing1.findHash((int) (short) 10);
        int int12 = hashMapLinearProbing1.findHash((int) (byte) 0);
        int int14 = hashMapLinearProbing1.findHash((int) (byte) 10);
        hashMapLinearProbing1.deleteHash(96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test4869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4869");
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
        hashMapLinearProbing1.deleteHash(32);
        int int18 = hashMapLinearProbing1.findHash((int) (short) 100);
        boolean boolean19 = hashMapLinearProbing1.isFull();
        boolean boolean20 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test4870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4870");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean9 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4871");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        int int4 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.deleteHash(30);
        hashMapLinearProbing1.insertHash(34);
        hashMapLinearProbing1.displayHashtable();
        int int11 = hashMapLinearProbing1.hashing((int) (short) 100);
        hashMapLinearProbing1.insertHash((int) (short) 100);
        boolean boolean14 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 45 + "'", int4 == 45);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 48 + "'", int11 == 48);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4872");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        int int4 = hashMapLinearProbing1.hashing(30);
        int int6 = hashMapLinearProbing1.hashing(32);
        hashMapLinearProbing1.deleteHash((int) (short) 10);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash(0);
        boolean boolean13 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 30 + "'", int4 == 30);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4873");
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
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test4874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4874");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (short) -1);
        hashMapLinearProbing1.deleteHash((-1));
        hashMapLinearProbing1.displayHashtable();
        boolean boolean12 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4875");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        int int10 = hashMapLinearProbing1.findHash((int) (short) 10);
        hashMapLinearProbing1.insertHash((int) (short) 100);
        int int14 = hashMapLinearProbing1.hashing(27);
        int int16 = hashMapLinearProbing1.hashing((int) '#');
        int int18 = hashMapLinearProbing1.findHash(2);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 27 + "'", int14 == 27);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test4876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4876");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(30);
        int int12 = hashMapLinearProbing1.findHash(9);
        int int14 = hashMapLinearProbing1.hashing((int) (short) 1);
        hashMapLinearProbing1.insertHash(14);
        hashMapLinearProbing1.insertHash(34);
        int int20 = hashMapLinearProbing1.hashing(45);
        boolean boolean21 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 10 + "'", int20 == 10);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4877");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (short) -1);
        int int10 = hashMapLinearProbing1.hashing((-1));
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(35);
        int int15 = hashMapLinearProbing1.hashing(15);
        hashMapLinearProbing1.displayHashtable();
        int int18 = hashMapLinearProbing1.hashing(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 15 + "'", int15 == 15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test4878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4878");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean4 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(32);
        int int8 = hashMapLinearProbing1.findHash(16);
        int int10 = hashMapLinearProbing1.hashing(52);
        hashMapLinearProbing1.deleteHash((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 17 + "'", int10 == 17);
    }

    @Test
    public void test4879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4879");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 10);
        hashMapLinearProbing1.insertHash((int) (byte) 1);
        hashMapLinearProbing1.checkLoadFactor();
        int int10 = hashMapLinearProbing1.findHash(44);
        int int12 = hashMapLinearProbing1.hashing(0);
        int int14 = hashMapLinearProbing1.findHash(0);
        hashMapLinearProbing1.deleteHash(11);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test4880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4880");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        hashMapLinearProbing1.insertHash(17);
        int int8 = hashMapLinearProbing1.findHash((int) (byte) 1);
        int int10 = hashMapLinearProbing1.hashing(27);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean14 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 27 + "'", int10 == 27);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4881");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        hashMapLinearProbing1.displayHashtable();
        int int8 = hashMapLinearProbing1.findHash((-1));
        hashMapLinearProbing1.displayHashtable();
        java.lang.Class<?> wildcardClass10 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4882");
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
        int int19 = hashMapLinearProbing1.findHash(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test4883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4883");
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
        int int21 = hashMapLinearProbing1.findHash(5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test4884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4884");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(45);
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        hashMapLinearProbing1.deleteHash(10);
        hashMapLinearProbing1.displayHashtable();
    }

    @Test
    public void test4885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4885");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        int int7 = hashMapLinearProbing1.hashing(1);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(29);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test4886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4886");
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
        java.lang.Class<?> wildcardClass19 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4887");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) (short) 100);
        hashMapLinearProbing1.deleteHash((int) (byte) 0);
        int int5 = hashMapLinearProbing1.hashing((int) (short) 0);
        hashMapLinearProbing1.insertHash((int) (byte) -1);
        hashMapLinearProbing1.deleteHash(100);
        hashMapLinearProbing1.insertHash(32);
        hashMapLinearProbing1.deleteHash((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test4888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4888");
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
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4889");
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
        java.lang.Class<?> wildcardClass21 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test4890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4890");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(17);
        hashMapLinearProbing1.deleteHash((int) '4');
        hashMapLinearProbing1.deleteHash((int) '#');
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        boolean boolean18 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test4891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4891");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) ' ');
        hashMapLinearProbing1.insertHash(100);
        hashMapLinearProbing1.insertHash(0);
        int int12 = hashMapLinearProbing1.findHash((int) (short) 0);
        boolean boolean13 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4892");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 0);
        hashMapLinearProbing1.displayHashtable();
        int int8 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.insertHash((int) (short) 10);
        hashMapLinearProbing1.insertHash((int) (short) 100);
        boolean boolean13 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 27 + "'", int8 == 27);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4893");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        int int9 = hashMapLinearProbing1.hashing((int) (byte) -1);
        int int11 = hashMapLinearProbing1.findHash(0);
        hashMapLinearProbing1.insertHash((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 34 + "'", int9 == 34);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test4894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4894");
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
        int int16 = hashMapLinearProbing1.hashing((int) (byte) 0);
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test4895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4895");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) (byte) 1);
        hashMapLinearProbing1.deleteHash((int) '#');
        int int5 = hashMapLinearProbing1.hashing(30);
        int int7 = hashMapLinearProbing1.findHash(52);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
    }

    @Test
    public void test4896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4896");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 0);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(17);
        boolean boolean9 = hashMapLinearProbing1.isFull();
        boolean boolean10 = hashMapLinearProbing1.isEmpty();
        int int12 = hashMapLinearProbing1.hashing(0);
        boolean boolean13 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(45);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4897");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(27);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        int int13 = hashMapLinearProbing1.hashing((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test4898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4898");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(10);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean4 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test4899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4899");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) ' ');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash(29);
        boolean boolean5 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4900");
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
        int int20 = hashMapLinearProbing1.findHash((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test4901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4901");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.hashing((int) (short) 100);
        int int10 = hashMapLinearProbing1.hashing(30);
        hashMapLinearProbing1.deleteHash(32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 30 + "'", int8 == 30);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 30 + "'", int10 == 30);
    }

    @Test
    public void test4902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4902");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) (byte) 1);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(45);
        hashMapLinearProbing1.insertHash((int) (byte) 0);
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        int int9 = hashMapLinearProbing1.findHash(51);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test4903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4903");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(30);
        int int6 = hashMapLinearProbing1.findHash((int) (byte) 0);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash((int) (byte) 100);
        hashMapLinearProbing1.deleteHash(0);
        int int13 = hashMapLinearProbing1.hashing((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 10 + "'", int13 == 10);
    }

    @Test
    public void test4904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4904");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) (short) 100);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash((int) '4');
        boolean boolean5 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4905");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(30);
        boolean boolean5 = hashMapLinearProbing1.isEmpty();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.findHash(0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
    }

    @Test
    public void test4906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4906");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        int int4 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.deleteHash(30);
        int int8 = hashMapLinearProbing1.findHash(10);
        int int10 = hashMapLinearProbing1.findHash(32);
        boolean boolean11 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 45 + "'", int4 == 45);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4907");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        int int4 = hashMapLinearProbing1.hashing(30);
        boolean boolean5 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(34);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(100);
        hashMapLinearProbing1.deleteHash((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 30 + "'", int4 == 30);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test4908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4908");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(30);
        boolean boolean5 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4909");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        hashMapLinearProbing1.checkLoadFactor();
        int int6 = hashMapLinearProbing1.findHash((int) (byte) 100);
        hashMapLinearProbing1.insertHash(100);
        boolean boolean9 = hashMapLinearProbing1.isFull();
        boolean boolean10 = hashMapLinearProbing1.isFull();
        int int12 = hashMapLinearProbing1.findHash((-1));
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test4910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4910");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
    }

    @Test
    public void test4911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4911");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        hashMapLinearProbing1.deleteHash(100);
        int int11 = hashMapLinearProbing1.hashing(30);
        hashMapLinearProbing1.displayHashtable();
        java.lang.Class<?> wildcardClass13 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 30 + "'", int11 == 30);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4912");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 10);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(2);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean10 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test4913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4913");
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
        hashMapLinearProbing1.displayHashtable();
        int int18 = hashMapLinearProbing1.findHash(7);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test4914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4914");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash(9);
        boolean boolean5 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash((int) (short) -1);
        boolean boolean8 = hashMapLinearProbing1.isFull();
        java.lang.Class<?> wildcardClass9 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test4915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4915");
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
        int int24 = hashMapLinearProbing1.findHash((int) (short) 1);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 34 + "'", int16 == 34);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test4916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4916");
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
        java.lang.Class<?> wildcardClass16 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4917");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.deleteHash((int) (byte) -1);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        boolean boolean7 = hashMapLinearProbing1.isFull();
        int int9 = hashMapLinearProbing1.findHash((int) (byte) 10);
        hashMapLinearProbing1.insertHash((int) '#');
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test4918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4918");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(30);
        int int6 = hashMapLinearProbing1.findHash((int) (byte) 0);
        int int8 = hashMapLinearProbing1.hashing(1);
        hashMapLinearProbing1.displayHashtable();
        int int11 = hashMapLinearProbing1.findHash((int) 'a');
        boolean boolean12 = hashMapLinearProbing1.isFull();
        java.lang.Class<?> wildcardClass13 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test4919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4919");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        int int9 = hashMapLinearProbing1.findHash(34);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) (short) 0);
        hashMapLinearProbing1.deleteHash(34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test4920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4920");
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
        hashMapLinearProbing1.displayHashtable();
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
    public void test4921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4921");
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
        int int16 = hashMapLinearProbing1.hashing((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 34 + "'", int12 == 34);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 10 + "'", int16 == 10);
    }

    @Test
    public void test4922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4922");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) (short) 100);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash((int) '4');
        hashMapLinearProbing1.deleteHash(1);
        int int8 = hashMapLinearProbing1.hashing(10);
        int int10 = hashMapLinearProbing1.findHash(16);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test4923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4923");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.hashing((int) (short) 100);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        hashMapLinearProbing1.displayHashtable();
        int int14 = hashMapLinearProbing1.findHash(5);
        hashMapLinearProbing1.deleteHash((int) (short) -1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 30 + "'", int8 == 30);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test4924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4924");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean3 = hashMapLinearProbing1.isEmpty();
        boolean boolean4 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test4925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4925");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.insertHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        int int9 = hashMapLinearProbing1.findHash(30);
        boolean boolean10 = hashMapLinearProbing1.isFull();
        int int12 = hashMapLinearProbing1.hashing(32);
        int int14 = hashMapLinearProbing1.findHash((int) '4');
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32 + "'", int12 == 32);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test4926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4926");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.hashing((int) (short) 100);
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        boolean boolean10 = hashMapLinearProbing1.isFull();
        int int12 = hashMapLinearProbing1.hashing((int) (byte) 1);
        boolean boolean13 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(100);
        int int17 = hashMapLinearProbing1.findHash(30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 30 + "'", int8 == 30);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test4927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4927");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        int int10 = hashMapLinearProbing1.findHash((int) (short) 10);
        int int12 = hashMapLinearProbing1.findHash(0);
        boolean boolean13 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        int int16 = hashMapLinearProbing1.findHash((int) (byte) 0);
        int int18 = hashMapLinearProbing1.findHash((int) (short) 100);
        boolean boolean19 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4928");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.insertHash((int) (byte) 10);
        hashMapLinearProbing1.deleteHash((int) (byte) 1);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash(13);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean14 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4929");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.insertHash((int) (byte) 100);
        hashMapLinearProbing1.deleteHash((int) '#');
        java.lang.Class<?> wildcardClass8 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4930");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(0);
        boolean boolean8 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        int int11 = hashMapLinearProbing1.findHash(0);
        hashMapLinearProbing1.deleteHash(15);
        hashMapLinearProbing1.insertHash(99);
        hashMapLinearProbing1.displayHashtable();
        int int18 = hashMapLinearProbing1.hashing(34);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 34 + "'", int18 == 34);
    }

    @Test
    public void test4931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4931");
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
        hashMapLinearProbing1.insertHash((int) (byte) -1);
        hashMapLinearProbing1.checkLoadFactor();
        java.lang.Class<?> wildcardClass25 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 17 + "'", int13 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 34 + "'", int21 == 34);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test4932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4932");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        boolean boolean9 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((int) (short) 0);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(15);
        boolean boolean15 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test4933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4933");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        int int8 = hashMapLinearProbing1.findHash((int) '4');
        int int10 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        int int13 = hashMapLinearProbing1.hashing((int) (byte) 100);
        hashMapLinearProbing1.deleteHash(0);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 30 + "'", int13 == 30);
    }

    @Test
    public void test4934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4934");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(0);
        boolean boolean8 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        int int11 = hashMapLinearProbing1.findHash(0);
        hashMapLinearProbing1.deleteHash(15);
        int int15 = hashMapLinearProbing1.findHash(0);
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test4935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4935");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        java.lang.Class<?> wildcardClass8 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test4936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4936");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        hashMapLinearProbing1.insertHash(17);
        int int8 = hashMapLinearProbing1.findHash(32);
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash((int) (short) 100);
        int int15 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) 'a');
        boolean boolean18 = hashMapLinearProbing1.isEmpty();
        boolean boolean19 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test4937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4937");
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
        int int23 = hashMapLinearProbing1.findHash((int) (short) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test4938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4938");
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
        int int19 = hashMapLinearProbing1.findHash(8);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + (-1) + "'", int19 == (-1));
    }

    @Test
    public void test4939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4939");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '4');
        boolean boolean2 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((-1));
        hashMapLinearProbing1.deleteHash(27);
        hashMapLinearProbing1.insertHash((int) ' ');
        int int10 = hashMapLinearProbing1.hashing(12);
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 12 + "'", int10 == 12);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4940");
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
        boolean boolean17 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash((int) '#');
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 45 + "'", int4 == 45);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 48 + "'", int16 == 48);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4941");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash((int) ' ');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(16);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4942");
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
        int int19 = hashMapLinearProbing1.hashing((int) ' ');
        hashMapLinearProbing1.displayHashtable();
        boolean boolean21 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 30 + "'", int15 == 30);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 32 + "'", int19 == 32);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test4943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4943");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(48);
        int int3 = hashMapLinearProbing1.findHash(27);
        boolean boolean4 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + (-1) + "'", int3 == (-1));
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test4944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4944");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(0);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(32);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test4945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4945");
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
        int int17 = hashMapLinearProbing1.hashing(12);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 12 + "'", int17 == 12);
    }

    @Test
    public void test4946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4946");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(0);
        int int9 = hashMapLinearProbing1.hashing((-1));
        hashMapLinearProbing1.insertHash(1);
        boolean boolean12 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 34 + "'", int9 == 34);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4947");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) '4');
        int int7 = hashMapLinearProbing1.findHash((int) (byte) -1);
        hashMapLinearProbing1.deleteHash((int) (byte) 0);
        hashMapLinearProbing1.insertHash((int) (short) 100);
        int int13 = hashMapLinearProbing1.findHash(27);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(2);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
    }

    @Test
    public void test4948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4948");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) (short) 10);
        hashMapLinearProbing1.deleteHash(0);
        hashMapLinearProbing1.insertHash(100);
        int int15 = hashMapLinearProbing1.findHash((-1));
        java.lang.Class<?> wildcardClass16 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test4949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4949");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(45);
        hashMapLinearProbing1.insertHash(30);
        boolean boolean13 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4950");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) (short) 100);
        hashMapLinearProbing1.deleteHash((int) (byte) 0);
        int int5 = hashMapLinearProbing1.hashing((int) (short) 0);
        int int7 = hashMapLinearProbing1.findHash((-1));
        hashMapLinearProbing1.checkLoadFactor();
        int int10 = hashMapLinearProbing1.hashing((int) '#');
        boolean boolean11 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 35 + "'", int10 == 35);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4951");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.findHash(0);
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean14 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4952");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        boolean boolean8 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        int int11 = hashMapLinearProbing1.hashing((int) '#');
        boolean boolean12 = hashMapLinearProbing1.isFull();
        int int14 = hashMapLinearProbing1.hashing((int) (short) 100);
        int int16 = hashMapLinearProbing1.findHash(35);
        hashMapLinearProbing1.deleteHash(48);
        hashMapLinearProbing1.deleteHash(51);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 30 + "'", int14 == 30);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test4953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4953");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) 'a');
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash((int) '4');
        hashMapLinearProbing1.insertHash((int) (short) 10);
        int int8 = hashMapLinearProbing1.findHash((int) '4');
        hashMapLinearProbing1.deleteHash(5);
        boolean boolean11 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (short) 1);
        hashMapLinearProbing1.insertHash(27);
        hashMapLinearProbing1.deleteHash(35);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4954");
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
        int int14 = hashMapLinearProbing1.findHash(96);
        int int16 = hashMapLinearProbing1.hashing(13);
        boolean boolean17 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 13 + "'", int16 == 13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test4955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4955");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(0);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        boolean boolean3 = hashMapLinearProbing1.isEmpty();
        boolean boolean4 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test4956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4956");
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
        java.lang.Class<?> wildcardClass20 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test4957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4957");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        int int9 = hashMapLinearProbing1.findHash(10);
        int int11 = hashMapLinearProbing1.findHash((int) (byte) 0);
        boolean boolean12 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(11);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test4958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4958");
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
        hashMapLinearProbing1.displayHashtable();
        boolean boolean17 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4959");
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
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 14 + "'", int13 == 14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test4960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4960");
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
        boolean boolean21 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 27 + "'", int8 == 27);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4961");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.deleteHash((-1));
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean10 = hashMapLinearProbing1.isFull();
        boolean boolean11 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (short) -1);
        hashMapLinearProbing1.deleteHash((int) (short) 0);
        hashMapLinearProbing1.insertHash(30);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4962");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(30);
        boolean boolean5 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(35);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(1);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test4963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4963");
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
        hashMapLinearProbing1.deleteHash(47);
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
    public void test4964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4964");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        int int5 = hashMapLinearProbing1.hashing(15);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        boolean boolean11 = hashMapLinearProbing1.isFull();
        boolean boolean12 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 15 + "'", int5 == 15);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4965");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(0);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        boolean boolean3 = hashMapLinearProbing1.isEmpty();
        boolean boolean4 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        boolean boolean8 = hashMapLinearProbing1.isFull();
        boolean boolean9 = hashMapLinearProbing1.isFull();
        java.lang.Class<?> wildcardClass10 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test4966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4966");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) (short) 10);
        int int11 = hashMapLinearProbing1.findHash((int) (short) 0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash(35);
        int int16 = hashMapLinearProbing1.hashing(0);
        java.lang.Class<?> wildcardClass17 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test4967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4967");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean5 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.checkLoadFactor();
        java.lang.Class<?> wildcardClass7 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test4968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4968");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash((int) ' ');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test4969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4969");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.findHash((int) (byte) 100);
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.findHash(0);
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash(27);
        int int15 = hashMapLinearProbing1.hashing((int) (byte) 10);
        int int17 = hashMapLinearProbing1.findHash(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test4970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4970");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.insertHash(27);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4971");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isEmpty();
        int int8 = hashMapLinearProbing1.findHash((int) (short) 0);
        int int10 = hashMapLinearProbing1.findHash((int) (byte) 0);
        boolean boolean11 = hashMapLinearProbing1.isFull();
        int int13 = hashMapLinearProbing1.findHash(7);
        boolean boolean14 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-1) + "'", int13 == (-1));
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test4972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4972");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        int int7 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        int int10 = hashMapLinearProbing1.findHash((int) (short) 10);
        int int12 = hashMapLinearProbing1.findHash(0);
        int int14 = hashMapLinearProbing1.hashing((int) (byte) 100);
        hashMapLinearProbing1.deleteHash((int) '#');
        hashMapLinearProbing1.deleteHash((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 30 + "'", int14 == 30);
    }

    @Test
    public void test4973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4973");
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
        hashMapLinearProbing1.displayHashtable();
        int int24 = hashMapLinearProbing1.hashing(10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 32 + "'", int11 == 32);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 17 + "'", int13 == 17);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 10 + "'", int24 == 10);
    }

    @Test
    public void test4974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4974");
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
        int int22 = hashMapLinearProbing1.hashing((int) (byte) 1);
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test4975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4975");
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
        boolean boolean18 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 5 + "'", int17 == 5);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test4976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4976");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(30);
        int int6 = hashMapLinearProbing1.findHash((int) (byte) 0);
        int int8 = hashMapLinearProbing1.hashing(1);
        hashMapLinearProbing1.displayHashtable();
        int int11 = hashMapLinearProbing1.findHash((int) 'a');
        hashMapLinearProbing1.deleteHash((int) (short) 10);
        hashMapLinearProbing1.insertHash((int) '#');
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test4977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4977");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) 'a');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 1);
        int int10 = hashMapLinearProbing1.findHash(0);
        boolean boolean11 = hashMapLinearProbing1.isEmpty();
        boolean boolean12 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test4978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4978");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        hashMapLinearProbing1.displayHashtable();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash(27);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test4979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4979");
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
        boolean boolean16 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (byte) 1);
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        boolean boolean21 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test4980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4980");
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
        boolean boolean17 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 27 + "'", int16 == 27);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test4981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4981");
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
        hashMapLinearProbing1.displayHashtable();
        boolean boolean14 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4982");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        hashMapLinearProbing1.insertHash(17);
        int int8 = hashMapLinearProbing1.findHash((int) (byte) -1);
        boolean boolean9 = hashMapLinearProbing1.isEmpty();
        int int11 = hashMapLinearProbing1.hashing(34);
        int int13 = hashMapLinearProbing1.hashing(14);
        boolean boolean14 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 34 + "'", int11 == 34);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 14 + "'", int13 == 14);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4983");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash(9);
        java.lang.Class<?> wildcardClass5 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test4984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4984");
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
        hashMapLinearProbing1.deleteHash(51);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 27 + "'", int8 == 27);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test4985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4985");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing(17);
        boolean boolean2 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(30);
        int int6 = hashMapLinearProbing1.findHash((int) (byte) 0);
        hashMapLinearProbing1.insertHash(17);
        hashMapLinearProbing1.deleteHash((int) (byte) 10);
        boolean boolean11 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test4986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4986");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean4 = hashMapLinearProbing1.isFull();
        int int6 = hashMapLinearProbing1.findHash(1);
        int int8 = hashMapLinearProbing1.hashing((int) (byte) 10);
        boolean boolean9 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test4987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4987");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        boolean boolean6 = hashMapLinearProbing1.isFull();
        int int8 = hashMapLinearProbing1.hashing((int) (short) 100);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash(17);
        hashMapLinearProbing1.insertHash((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 30 + "'", int8 == 30);
    }

    @Test
    public void test4988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4988");
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
        boolean boolean16 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.insertHash(5);
        java.lang.Class<?> wildcardClass19 = hashMapLinearProbing1.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 34 + "'", int15 == 34);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test4989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4989");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.deleteHash((int) (short) 100);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean7 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash((int) ' ');
        hashMapLinearProbing1.deleteHash(10);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean13 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test4990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4990");
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
        boolean boolean17 = hashMapLinearProbing1.isFull();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 27 + "'", int5 == 27);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 14 + "'", int13 == 14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test4991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4991");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.insertHash((int) (short) 10);
        hashMapLinearProbing1.insertHash(17);
        int int8 = hashMapLinearProbing1.findHash(32);
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.deleteHash(0);
        hashMapLinearProbing1.displayHashtable();
        int int15 = hashMapLinearProbing1.findHash((int) (short) 10);
        int int17 = hashMapLinearProbing1.findHash(16);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 10 + "'", int15 == 10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
    }

    @Test
    public void test4992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4992");
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
        boolean boolean20 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        boolean boolean22 = hashMapLinearProbing1.isEmpty();
        hashMapLinearProbing1.deleteHash(96);
        int int26 = hashMapLinearProbing1.findHash(32);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 30 + "'", int14 == 30);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 30 + "'", int17 == 30);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + (-1) + "'", int26 == (-1));
    }

    @Test
    public void test4993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4993");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.deleteHash(0);
        boolean boolean8 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        int int11 = hashMapLinearProbing1.findHash(0);
        hashMapLinearProbing1.insertHash((int) ' ');
        int int15 = hashMapLinearProbing1.hashing(96);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 26 + "'", int15 == 26);
    }

    @Test
    public void test4994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4994");
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
        hashMapLinearProbing1.deleteHash(15);
        int int20 = hashMapLinearProbing1.hashing(44);
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
    }

    @Test
    public void test4995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4995");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) (byte) 1);
        hashMapLinearProbing1.insertHash((int) (short) 0);
        int int5 = hashMapLinearProbing1.findHash(15);
        hashMapLinearProbing1.displayHashtable();
        boolean boolean7 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.checkLoadFactor();
        hashMapLinearProbing1.displayHashtable();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + (-1) + "'", int5 == (-1));
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test4996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4996");
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
        boolean boolean16 = hashMapLinearProbing1.isFull();
        hashMapLinearProbing1.insertHash((int) (byte) 1);
        hashMapLinearProbing1.deleteHash((int) (short) 1);
        hashMapLinearProbing1.deleteHash(5);
        int int24 = hashMapLinearProbing1.hashing(100);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 30 + "'", int24 == 30);
    }

    @Test
    public void test4997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4997");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        hashMapLinearProbing1.deleteHash((int) ' ');
        hashMapLinearProbing1.displayHashtable();
        int int8 = hashMapLinearProbing1.hashing((int) (byte) 1);
        int int10 = hashMapLinearProbing1.findHash((int) (short) 10);
        int int12 = hashMapLinearProbing1.hashing((int) (byte) 0);
        boolean boolean13 = hashMapLinearProbing1.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test4998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4998");
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
        int int24 = hashMapLinearProbing1.findHash(99);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 34 + "'", int10 == 34);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + (-1) + "'", int24 == (-1));
    }

    @Test
    public void test4999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test4999");
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
        int int18 = hashMapLinearProbing1.findHash(1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 30 + "'", int14 == 30);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test5000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest9.test5000");
        com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing hashMapLinearProbing1 = new com.thealgorithms.datastructures.hashmap.hashing.HashMapLinearProbing((int) '#');
        int int3 = hashMapLinearProbing1.hashing(0);
        int int5 = hashMapLinearProbing1.hashing((int) (byte) 0);
        hashMapLinearProbing1.displayHashtable();
        hashMapLinearProbing1.checkLoadFactor();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }
}

