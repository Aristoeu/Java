package bags;

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
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean3 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableBag0.spliterator();
        boolean boolean5 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        java.lang.Class<?> wildcardClass7 = strComparableBag0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test6502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6502");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor2 = strComparableBag0.iterator();
        int int3 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor4 = strComparableBag0.iterator();
        int int5 = strComparableBag0.size();
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = strComparableBag0.iterator();
        int int9 = strComparableBag0.size();
        boolean boolean11 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean15 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(strComparableItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strComparableItor4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strComparableItor8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test6503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6503");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        int int4 = strComparableBag0.size();
        boolean boolean6 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor10 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor11 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableBag0.iterator();
        int int13 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor14 = strComparableBag0.iterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertNotNull(strComparableItor10);
        org.junit.Assert.assertNotNull(strComparableItor11);
        org.junit.Assert.assertNotNull(strComparableItor12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strComparableItor14);
    }

    @Test
    public void test6504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6504");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        boolean boolean7 = strComparableBag0.isEmpty();
        boolean boolean8 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableBag0.spliterator();
        int int12 = strComparableBag0.size();
        int int13 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        int int16 = strComparableBag0.size();
        boolean boolean18 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test6505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6505");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        int int2 = strComparableBag0.size();
        int int3 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor7 = strComparableBag0.iterator();
        boolean boolean9 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableBag0.spliterator();
        boolean boolean12 = strComparableBag0.isEmpty();
        boolean boolean13 = strComparableBag0.isEmpty();
        boolean boolean14 = strComparableBag0.isEmpty();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertNotNull(strComparableItor7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6506");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        int int7 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableBag0.iterator();
        boolean boolean10 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean15 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator18 = strComparableBag0.spliterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strComparableItor8);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator18);
    }

    @Test
    public void test6507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6507");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        int int7 = strComparableBag0.size();
        boolean boolean8 = strComparableBag0.isEmpty();
        int int9 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor10 = strComparableBag0.iterator();
        boolean boolean11 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(strComparableItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test6508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6508");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        int int4 = strComparableBag0.size();
        int int5 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
    }

    @Test
    public void test6509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6509");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableBag0.size();
        boolean boolean11 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator15 = strComparableBag0.spliterator();
        java.lang.Class<?> wildcardClass16 = strComparableSpliterator15.getClass();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strComparableItor12);
        org.junit.Assert.assertNotNull(strComparableSpliterator15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6510");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        boolean boolean4 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableBag0.isEmpty();
        boolean boolean10 = strComparableBag0.isEmpty();
        boolean boolean12 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean14 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test6511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6511");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        boolean boolean7 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean14 = strComparableBag0.isEmpty();
        boolean boolean16 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean18 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean19 = strComparableBag0.isEmpty();
        int int20 = strComparableBag0.size();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test6512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6512");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable4 = null;
        boolean boolean5 = strComparableBag0.contains(strComparable4);
        int int6 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor7 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(strComparableItor7);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test6513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6513");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        boolean boolean7 = strComparableBag0.isEmpty();
        boolean boolean8 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
    }

    @Test
    public void test6514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6514");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        boolean boolean4 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableBag0.isEmpty();
        boolean boolean11 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test6515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6515");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean3 = strComparableBag0.isEmpty();
        int int4 = strComparableBag0.size();
        int int5 = strComparableBag0.size();
        java.lang.Class<?> wildcardClass6 = strComparableBag0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test6516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6516");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        int int4 = strComparableBag0.size();
        boolean boolean6 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableBag0.isEmpty();
        boolean boolean13 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test6517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6517");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor13 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor14 = strComparableBag0.iterator();
        int int15 = strComparableBag0.size();
        boolean boolean17 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(strComparableItor13);
        org.junit.Assert.assertNotNull(strComparableItor14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test6518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6518");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor7 = strComparableBag0.iterator();
        int int8 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableBag0.iterator();
        int int10 = strComparableBag0.size();
        int int11 = strComparableBag0.size();
        boolean boolean13 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass18 = strComparableBag0.getClass();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertNotNull(strComparableItor7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6519");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor3 = strComparableBag0.iterator();
        boolean boolean5 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableBag0.isEmpty();
        boolean boolean11 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(strComparableItor3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test6520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6520");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        int int4 = strComparableBag0.size();
        int int5 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableBag0.spliterator();
        boolean boolean8 = strComparableBag0.isEmpty();
        int int9 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor10 = strComparableBag0.iterator();
        java.lang.Class<?> wildcardClass11 = strComparableItor10.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(strComparableItor10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test6521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6521");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor11 = strComparableBag0.iterator();
        boolean boolean13 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableBag0.size();
        boolean boolean16 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strComparableItor8);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertNotNull(strComparableItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test6522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6522");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        strComparableBag0.add(strComparable9);
        boolean boolean11 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean15 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator16 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor17 = strComparableBag0.iterator();
        boolean boolean18 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator16);
        org.junit.Assert.assertNotNull(strComparableItor17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6523");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean3 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor4 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableBag0.spliterator();
        int int8 = strComparableBag0.size();
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableBag0.spliterator();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableItor4);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
    }

    @Test
    public void test6524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6524");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        boolean boolean7 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean14 = strComparableBag0.isEmpty();
        boolean boolean16 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int19 = strComparableBag0.size();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test6525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6525");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor2 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableBag0.spliterator();
        boolean boolean12 = strComparableBag0.isEmpty();
        boolean boolean14 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor15 = strComparableBag0.iterator();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(strComparableItor2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strComparableItor15);
    }

    @Test
    public void test6526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6526");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        boolean boolean7 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor13 = strComparableBag0.iterator();
        boolean boolean14 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator15 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator16 = strComparableBag0.spliterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strComparableItor8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strComparableItor12);
        org.junit.Assert.assertNotNull(strComparableItor13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator15);
        org.junit.Assert.assertNotNull(strComparableSpliterator16);
    }

    @Test
    public void test6527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6527");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        strComparableBag0.add(strComparable9);
        boolean boolean11 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean15 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator16 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor17 = strComparableBag0.iterator();
        boolean boolean18 = strComparableBag0.isEmpty();
        int int19 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean23 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator16);
        org.junit.Assert.assertNotNull(strComparableItor17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test6528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6528");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableBag0.spliterator();
        int int5 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableBag0.spliterator();
        boolean boolean8 = strComparableBag0.isEmpty();
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableBag0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test6529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6529");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor7 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = strComparableBag0.iterator();
        boolean boolean9 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean15 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator16 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor17 = strComparableBag0.iterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertNotNull(strComparableItor7);
        org.junit.Assert.assertNotNull(strComparableItor8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator16);
        org.junit.Assert.assertNotNull(strComparableItor17);
    }

    @Test
    public void test6530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6530");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableBag0.size();
        boolean boolean9 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor10 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator13 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor14 = strComparableBag0.iterator();
        int int15 = strComparableBag0.size();
        boolean boolean16 = strComparableBag0.isEmpty();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strComparableItor10);
        org.junit.Assert.assertNotNull(strComparableSpliterator13);
        org.junit.Assert.assertNotNull(strComparableItor14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6531");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableBag0.spliterator();
        int int5 = strComparableBag0.size();
        int int6 = strComparableBag0.size();
        boolean boolean8 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test6532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6532");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        boolean boolean8 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor14 = strComparableBag0.iterator();
        boolean boolean16 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        int int17 = strComparableBag0.size();
        int int18 = strComparableBag0.size();
        boolean boolean20 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean22 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator23 = strComparableBag0.spliterator();
        java.lang.Class<?> wildcardClass24 = strComparableBag0.getClass();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNotNull(strComparableItor14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator23);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test6533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6533");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor2 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableBag0.spliterator();
        int int13 = strComparableBag0.size();
        boolean boolean15 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(strComparableItor2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test6534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6534");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        boolean boolean4 = strComparableBag0.isEmpty();
        boolean boolean5 = strComparableBag0.isEmpty();
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        int int9 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean15 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable16 = null;
        boolean boolean17 = strComparableBag0.contains(strComparable16);
        boolean boolean18 = strComparableBag0.isEmpty();
        boolean boolean19 = strComparableBag0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test6535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6535");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = strComparableBag0.iterator();
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor13 = strComparableBag0.iterator();
        int int14 = strComparableBag0.size();
        java.lang.Comparable<java.lang.String> strComparable15 = null;
        boolean boolean16 = strComparableBag0.contains(strComparable15);
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertNotNull(strComparableItor8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(strComparableItor12);
        org.junit.Assert.assertNotNull(strComparableItor13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6536");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        boolean boolean4 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableBag0.iterator();
        int int6 = strComparableBag0.size();
        boolean boolean8 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        int int12 = strComparableBag0.size();
        boolean boolean14 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test6537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6537");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        int int7 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor10 = strComparableBag0.iterator();
        java.lang.Comparable<java.lang.String> strComparable11 = null;
        boolean boolean12 = strComparableBag0.contains(strComparable11);
        boolean boolean14 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean15 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor16 = strComparableBag0.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strComparableItor8);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertNotNull(strComparableItor10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strComparableItor16);
    }

    @Test
    public void test6538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6538");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        boolean boolean4 = strComparableBag0.isEmpty();
        int int5 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        boolean boolean7 = strComparableBag0.isEmpty();
        int int8 = strComparableBag0.size();
        int int9 = strComparableBag0.size();
        boolean boolean11 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableBag0.size();
        boolean boolean14 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean15 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator18 = strComparableBag0.spliterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator18);
    }

    @Test
    public void test6539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6539");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean3 = strComparableBag0.isEmpty();
        boolean boolean5 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableBag0.isEmpty();
        int int9 = strComparableBag0.size();
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableBag0.add(strComparable10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test6540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6540");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        int int7 = strComparableBag0.size();
        boolean boolean8 = strComparableBag0.isEmpty();
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean15 = strComparableBag0.isEmpty();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test6541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6541");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor2 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableBag0.spliterator();
        int int11 = strComparableBag0.size();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(strComparableItor2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test6542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6542");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor10 = strComparableBag0.iterator();
        int int11 = strComparableBag0.size();
        boolean boolean12 = strComparableBag0.isEmpty();
        int int13 = strComparableBag0.size();
        boolean boolean14 = strComparableBag0.isEmpty();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strComparableItor8);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertNotNull(strComparableItor10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6543");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor4 = strComparableBag0.iterator();
        boolean boolean6 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean7 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableBag0.iterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertNotNull(strComparableItor4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strComparableItor8);
        org.junit.Assert.assertNotNull(strComparableItor9);
    }

    @Test
    public void test6544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6544");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        boolean boolean4 = strComparableBag0.isEmpty();
        boolean boolean5 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableBag0.spliterator();
        boolean boolean10 = strComparableBag0.isEmpty();
        java.lang.Class<?> wildcardClass11 = strComparableBag0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test6545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6545");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor2 = strComparableBag0.iterator();
        int int3 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableBag0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable7 = null;
        strComparableBag0.add(strComparable7);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(strComparableItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test6546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6546");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        int int2 = strComparableBag0.size();
        int int3 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor7 = strComparableBag0.iterator();
        boolean boolean9 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableBag0.spliterator();
        boolean boolean12 = strComparableBag0.isEmpty();
        boolean boolean13 = strComparableBag0.isEmpty();
        boolean boolean15 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertNotNull(strComparableItor7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test6547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6547");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor2 = strComparableBag0.iterator();
        int int3 = strComparableBag0.size();
        boolean boolean4 = strComparableBag0.isEmpty();
        boolean boolean6 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(strComparableItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test6548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6548");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor2 = strComparableBag0.iterator();
        int int3 = strComparableBag0.size();
        boolean boolean4 = strComparableBag0.isEmpty();
        boolean boolean6 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = strComparableBag0.iterator();
        java.lang.Class<?> wildcardClass9 = strComparableItor8.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(strComparableItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strComparableItor8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test6549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6549");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor7 = strComparableBag0.iterator();
        boolean boolean9 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable12 = null;
        boolean boolean13 = strComparableBag0.contains(strComparable12);
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertNotNull(strComparableItor7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test6550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6550");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        boolean boolean7 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor11 = strComparableBag0.iterator();
        int int12 = strComparableBag0.size();
        int int13 = strComparableBag0.size();
        int int14 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator15 = strComparableBag0.spliterator();
        int int16 = strComparableBag0.size();
        boolean boolean17 = strComparableBag0.isEmpty();
        boolean boolean19 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strComparableItor8);
        org.junit.Assert.assertNotNull(strComparableItor11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test6551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6551");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        boolean boolean7 = strComparableBag0.isEmpty();
        boolean boolean9 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableBag0.iterator();
        java.lang.Class<?> wildcardClass13 = strComparableItor12.getClass();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strComparableItor12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6552");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        int int4 = strComparableBag0.size();
        boolean boolean6 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableBag0.size();
        int int13 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor14 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int17 = strComparableBag0.size();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(strComparableItor14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test6553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6553");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        int int7 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int15 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor16 = strComparableBag0.iterator();
        boolean boolean17 = strComparableBag0.isEmpty();
        boolean boolean18 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor19 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertNotNull(strComparableItor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strComparableItor19);
    }

    @Test
    public void test6554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6554");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor11 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableBag0.iterator();
        int int13 = strComparableBag0.size();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strComparableItor11);
        org.junit.Assert.assertNotNull(strComparableItor12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test6555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6555");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean5 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor7 = strComparableBag0.iterator();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strComparableItor7);
    }

    @Test
    public void test6556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6556");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        int int7 = strComparableBag0.size();
        boolean boolean8 = strComparableBag0.isEmpty();
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableBag0.isEmpty();
        boolean boolean13 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableBag0.spliterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
    }

    @Test
    public void test6557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6557");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        boolean boolean4 = strComparableBag0.isEmpty();
        int int5 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        boolean boolean7 = strComparableBag0.isEmpty();
        boolean boolean8 = strComparableBag0.isEmpty();
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean12 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean14 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean16 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor17 = strComparableBag0.iterator();
        java.lang.Class<?> wildcardClass18 = strComparableBag0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strComparableItor17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6558");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        boolean boolean7 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableBag0.size();
        int int11 = strComparableBag0.size();
        boolean boolean13 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableBag0.spliterator();
        boolean boolean15 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor16 = strComparableBag0.iterator();
        boolean boolean18 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean19 = strComparableBag0.isEmpty();
        int int20 = strComparableBag0.size();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strComparableItor16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test6559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6559");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean15 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor16 = strComparableBag0.iterator();
        int int17 = strComparableBag0.size();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strComparableItor16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test6560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6560");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        int int2 = strComparableBag0.size();
        int int3 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableBag0.isEmpty();
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableBag0.isEmpty();
        boolean boolean13 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test6561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6561");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        int int7 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableBag0.iterator();
        int int10 = strComparableBag0.size();
        boolean boolean12 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator13 = strComparableBag0.spliterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strComparableItor8);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator13);
    }

    @Test
    public void test6562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6562");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        boolean boolean7 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor13 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator16 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator17 = strComparableBag0.spliterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strComparableItor8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strComparableItor12);
        org.junit.Assert.assertNotNull(strComparableItor13);
        org.junit.Assert.assertNotNull(strComparableSpliterator16);
        org.junit.Assert.assertNotNull(strComparableSpliterator17);
    }

    @Test
    public void test6563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6563");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        boolean boolean4 = strComparableBag0.isEmpty();
        int int5 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        boolean boolean7 = strComparableBag0.isEmpty();
        boolean boolean8 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableBag0.spliterator();
        boolean boolean10 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableBag0.spliterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
    }

    @Test
    public void test6564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6564");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableBag0.isEmpty();
        boolean boolean8 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor10 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertNotNull(strComparableItor10);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
    }

    @Test
    public void test6565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6565");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableBag0.spliterator();
        boolean boolean11 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableBag0.spliterator();
        java.lang.Class<?> wildcardClass13 = strComparableBag0.getClass();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strComparableItor8);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6566");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        int int2 = strComparableBag0.size();
        boolean boolean4 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableBag0.iterator();
        boolean boolean10 = strComparableBag0.isEmpty();
        boolean boolean11 = strComparableBag0.isEmpty();
        int int12 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean16 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6567");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        int int7 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableBag0.iterator();
        int int10 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor11 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableBag0.spliterator();
        boolean boolean16 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean18 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strComparableItor8);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(strComparableItor11);
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6568");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        boolean boolean7 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableBag0.size();
        boolean boolean11 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableBag0.iterator();
        int int13 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor14 = strComparableBag0.iterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strComparableItor12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(strComparableItor14);
    }

    @Test
    public void test6569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6569");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableBag0.spliterator();
        int int5 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableBag0.spliterator();
        boolean boolean8 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor10 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean14 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertNotNull(strComparableItor10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test6570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6570");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean15 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean17 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean19 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor20 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strComparableItor20);
    }

    @Test
    public void test6571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6571");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableBag0.iterator();
        int int10 = strComparableBag0.size();
        boolean boolean11 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableBag0.spliterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertNotNull(strComparableItor8);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
    }

    @Test
    public void test6572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6572");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        int int4 = strComparableBag0.size();
        boolean boolean6 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableBag0.spliterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
    }

    @Test
    public void test6573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6573");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableBag0.spliterator();
        boolean boolean9 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean14 = strComparableBag0.isEmpty();
        boolean boolean16 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator17 = strComparableBag0.spliterator();
        boolean boolean18 = strComparableBag0.isEmpty();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6574");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        boolean boolean4 = strComparableBag0.isEmpty();
        boolean boolean5 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableBag0.spliterator();
        boolean boolean13 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableBag0.spliterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
    }

    @Test
    public void test6575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6575");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableBag0.isEmpty();
        boolean boolean9 = strComparableBag0.isEmpty();
        int int10 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor11 = strComparableBag0.iterator();
        int int12 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator13 = strComparableBag0.spliterator();
        boolean boolean15 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strComparableItor11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test6576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6576");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableBag0.size();
        boolean boolean8 = strComparableBag0.isEmpty();
        int int9 = strComparableBag0.size();
        int int10 = strComparableBag0.size();
        boolean boolean11 = strComparableBag0.isEmpty();
        boolean boolean12 = strComparableBag0.isEmpty();
        boolean boolean13 = strComparableBag0.isEmpty();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test6577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6577");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        boolean boolean4 = strComparableBag0.isEmpty();
        int int5 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor7 = strComparableBag0.iterator();
        boolean boolean8 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor14 = strComparableBag0.iterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertNotNull(strComparableItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(strComparableItor14);
    }

    @Test
    public void test6578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6578");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor2 = strComparableBag0.iterator();
        int int3 = strComparableBag0.size();
        int int4 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(strComparableItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
    }

    @Test
    public void test6579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6579");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        boolean boolean8 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableBag0.iterator();
        int int10 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean14 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean15 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int18 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test6580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6580");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable4 = null;
        boolean boolean5 = strComparableBag0.contains(strComparable4);
        int int6 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor7 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableBag0.spliterator();
        boolean boolean12 = strComparableBag0.isEmpty();
        int int13 = strComparableBag0.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(strComparableItor7);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test6581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6581");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean3 = strComparableBag0.isEmpty();
        boolean boolean5 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor13 = strComparableBag0.iterator();
        java.lang.Class<?> wildcardClass14 = strComparableBag0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertNotNull(strComparableItor13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6582");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        int int2 = strComparableBag0.size();
        int int3 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableBag0.isEmpty();
        boolean boolean10 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableBag0.iterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNotNull(strComparableItor12);
    }

    @Test
    public void test6583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6583");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        boolean boolean7 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableBag0.size();
        boolean boolean11 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableBag0.iterator();
        boolean boolean13 = strComparableBag0.isEmpty();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strComparableItor12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test6584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6584");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor7 = strComparableBag0.iterator();
        int int8 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableBag0.iterator();
        int int10 = strComparableBag0.size();
        int int11 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableBag0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable13 = null;
        boolean boolean14 = strComparableBag0.contains(strComparable13);
        boolean boolean15 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertNotNull(strComparableItor7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test6585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6585");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        int int2 = strComparableBag0.size();
        boolean boolean4 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor10 = strComparableBag0.iterator();
        boolean boolean11 = strComparableBag0.isEmpty();
        boolean boolean12 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator13 = strComparableBag0.spliterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertNotNull(strComparableItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator13);
    }

    @Test
    public void test6586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6586");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        int int7 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean14 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean15 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator16 = strComparableBag0.spliterator();
        boolean boolean17 = strComparableBag0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test6587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6587");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        int int2 = strComparableBag0.size();
        int int3 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor7 = strComparableBag0.iterator();
        int int8 = strComparableBag0.size();
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor13 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor14 = strComparableBag0.iterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertNotNull(strComparableItor7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strComparableItor13);
        org.junit.Assert.assertNotNull(strComparableItor14);
    }

    @Test
    public void test6588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6588");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        strComparableBag0.add(strComparable9);
        boolean boolean11 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean15 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator16 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor17 = strComparableBag0.iterator();
        boolean boolean18 = strComparableBag0.isEmpty();
        int int19 = strComparableBag0.size();
        boolean boolean20 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator16);
        org.junit.Assert.assertNotNull(strComparableItor17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6589");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        boolean boolean7 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor11 = strComparableBag0.iterator();
        int int12 = strComparableBag0.size();
        int int13 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean16 = strComparableBag0.isEmpty();
        java.lang.Class<?> wildcardClass17 = strComparableBag0.getClass();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strComparableItor8);
        org.junit.Assert.assertNotNull(strComparableItor11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6590");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        int int4 = strComparableBag0.size();
        boolean boolean6 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableBag0.spliterator();
        boolean boolean11 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor13 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor14 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator15 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor16 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertNotNull(strComparableItor13);
        org.junit.Assert.assertNotNull(strComparableItor14);
        org.junit.Assert.assertNotNull(strComparableSpliterator15);
        org.junit.Assert.assertNotNull(strComparableItor16);
    }

    @Test
    public void test6591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6591");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        int int7 = strComparableBag0.size();
        boolean boolean9 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator13 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean17 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor20 = strComparableBag0.iterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator13);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strComparableItor20);
    }

    @Test
    public void test6592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6592");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableBag0.size();
        java.lang.Class<?> wildcardClass8 = strComparableBag0.getClass();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test6593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6593");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        int int7 = strComparableBag0.size();
        boolean boolean9 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        boolean boolean11 = strComparableBag0.contains(strComparable10);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableBag0.spliterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
    }

    @Test
    public void test6594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6594");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        boolean boolean4 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor7 = strComparableBag0.iterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertNotNull(strComparableItor7);
    }

    @Test
    public void test6595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6595");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator16 = strComparableBag0.spliterator();
        boolean boolean17 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor18 = strComparableBag0.iterator();
        boolean boolean19 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean24 = strComparableBag0.isEmpty();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strComparableItor18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test6596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6596");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        int int4 = strComparableBag0.size();
        boolean boolean6 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableBag0.spliterator();
        int int12 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator13 = strComparableBag0.spliterator();
        boolean boolean15 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean16 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator17 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator18 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator21 = strComparableBag0.spliterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator17);
        org.junit.Assert.assertNotNull(strComparableSpliterator18);
        org.junit.Assert.assertNotNull(strComparableSpliterator21);
    }

    @Test
    public void test6597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6597");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean3 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor4 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableBag0.size();
        int int8 = strComparableBag0.size();
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableBag0.iterator();
        boolean boolean14 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor15 = strComparableBag0.iterator();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableItor4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strComparableItor12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strComparableItor15);
    }

    @Test
    public void test6598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6598");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        int int15 = strComparableBag0.size();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 5 + "'", int15 == 5);
    }

    @Test
    public void test6599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6599");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        boolean boolean7 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableBag0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableBag0.add(strComparable10);
        boolean boolean12 = strComparableBag0.isEmpty();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strComparableItor8);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6600");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        int int2 = strComparableBag0.size();
        int int3 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableBag0.isEmpty();
        boolean boolean11 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test6601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6601");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        boolean boolean8 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test6602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6602");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        boolean boolean7 = strComparableBag0.isEmpty();
        boolean boolean8 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableBag0.spliterator();
        boolean boolean14 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6603");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        boolean boolean8 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableBag0.spliterator();
        int int10 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test6604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6604");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator13 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor14 = strComparableBag0.iterator();
        int int15 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor16 = strComparableBag0.iterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertNotNull(strComparableSpliterator13);
        org.junit.Assert.assertNotNull(strComparableItor14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(strComparableItor16);
    }

    @Test
    public void test6605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6605");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor13 = strComparableBag0.iterator();
        int int14 = strComparableBag0.size();
        int int15 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean19 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(strComparableItor13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test6606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6606");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean14 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean18 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator19 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor20 = strComparableBag0.iterator();
        boolean boolean22 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator19);
        org.junit.Assert.assertNotNull(strComparableItor20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test6607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6607");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        boolean boolean7 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableBag0.size();
        int int11 = strComparableBag0.size();
        boolean boolean13 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableBag0.spliterator();
        boolean boolean15 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor16 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strComparableItor16);
    }

    @Test
    public void test6608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6608");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableBag0.size();
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableBag0.spliterator();
        boolean boolean14 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean17 = strComparableBag0.isEmpty();
        boolean boolean18 = strComparableBag0.isEmpty();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6609");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        int int7 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        int int12 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor13 = strComparableBag0.iterator();
        boolean boolean14 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean18 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        int int19 = strComparableBag0.size();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strComparableItor8);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(strComparableItor13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test6610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6610");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        boolean boolean4 = strComparableBag0.isEmpty();
        int int5 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        boolean boolean7 = strComparableBag0.isEmpty();
        boolean boolean8 = strComparableBag0.isEmpty();
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableBag0.spliterator();
        java.lang.Class<?> wildcardClass13 = strComparableBag0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6611");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean15 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean17 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean19 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int22 = strComparableBag0.size();
        boolean boolean23 = strComparableBag0.isEmpty();
        boolean boolean24 = strComparableBag0.isEmpty();
        int int25 = strComparableBag0.size();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 4 + "'", int25 == 4);
    }

    @Test
    public void test6612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6612");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        boolean boolean7 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableBag0.size();
        int int11 = strComparableBag0.size();
        boolean boolean13 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean15 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        int int16 = strComparableBag0.size();
        boolean boolean18 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator19 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean23 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean24 = strComparableBag0.isEmpty();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test6613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6613");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        int int3 = strComparableBag0.size();
        int int4 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableBag0.iterator();
        boolean boolean6 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableBag0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable8 = null;
        strComparableBag0.add(strComparable8);
        int int10 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator13 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor14 = strComparableBag0.iterator();
        int int15 = strComparableBag0.size();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator13);
        org.junit.Assert.assertNotNull(strComparableItor14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
    }

    @Test
    public void test6614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6614");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        int int2 = strComparableBag0.size();
        int int3 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor7 = strComparableBag0.iterator();
        boolean boolean8 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean12 = strComparableBag0.isEmpty();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertNotNull(strComparableItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6615");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass10 = strComparableBag0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test6616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6616");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        boolean boolean8 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor14 = strComparableBag0.iterator();
        boolean boolean16 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator17 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor18 = strComparableBag0.iterator();
        int int19 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator20 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass23 = strComparableBag0.getClass();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNotNull(strComparableItor14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator17);
        org.junit.Assert.assertNotNull(strComparableItor18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator20);
        org.junit.Assert.assertNotNull(wildcardClass23);
    }

    @Test
    public void test6617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6617");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        int int4 = strComparableBag0.size();
        boolean boolean6 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableBag0.spliterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
    }

    @Test
    public void test6618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6618");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        int int2 = strComparableBag0.size();
        int int3 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor7 = strComparableBag0.iterator();
        boolean boolean9 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableBag0.isEmpty();
        boolean boolean12 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        int int13 = strComparableBag0.size();
        boolean boolean15 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        int int16 = strComparableBag0.size();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertNotNull(strComparableItor7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test6619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6619");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        int int7 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableBag0.iterator();
        int int10 = strComparableBag0.size();
        boolean boolean12 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean14 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean15 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor16 = strComparableBag0.iterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strComparableItor8);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strComparableItor16);
    }

    @Test
    public void test6620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6620");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        int int7 = strComparableBag0.size();
        boolean boolean9 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor10 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean14 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strComparableItor10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6621");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        boolean boolean7 = strComparableBag0.isEmpty();
        boolean boolean8 = strComparableBag0.isEmpty();
        boolean boolean9 = strComparableBag0.isEmpty();
        boolean boolean11 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable12 = null;
        strComparableBag0.add(strComparable12);
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test6622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6622");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        int int7 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        int int12 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor13 = strComparableBag0.iterator();
        boolean boolean14 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean17 = strComparableBag0.isEmpty();
        int int18 = strComparableBag0.size();
        boolean boolean20 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor21 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor22 = strComparableBag0.iterator();
        boolean boolean24 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strComparableItor8);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(strComparableItor13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(strComparableItor21);
        org.junit.Assert.assertNotNull(strComparableItor22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test6623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6623");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        boolean boolean8 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableBag0.size();
        boolean boolean11 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator13 = strComparableBag0.spliterator();
        boolean boolean14 = strComparableBag0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable15 = null;
        strComparableBag0.add(strComparable15);
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strComparableItor12);
        org.junit.Assert.assertNotNull(strComparableSpliterator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6624");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor11 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator13 = strComparableBag0.spliterator();
        int int14 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator15 = strComparableBag0.spliterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertNotNull(strComparableItor11);
        org.junit.Assert.assertNotNull(strComparableItor12);
        org.junit.Assert.assertNotNull(strComparableSpliterator13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator15);
    }

    @Test
    public void test6625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6625");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableBag0.size();
        boolean boolean9 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor11 = strComparableBag0.iterator();
        boolean boolean12 = strComparableBag0.isEmpty();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strComparableItor11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6626");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean3 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableBag0.spliterator();
        boolean boolean5 = strComparableBag0.isEmpty();
        int int6 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableBag0.spliterator();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
    }

    @Test
    public void test6627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6627");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        boolean boolean4 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor10 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strComparableItor10);
    }

    @Test
    public void test6628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6628");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        boolean boolean4 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor7 = strComparableBag0.iterator();
        boolean boolean8 = strComparableBag0.isEmpty();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertNotNull(strComparableItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test6629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6629");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        int int7 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = strComparableBag0.iterator();
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableBag0.isEmpty();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strComparableItor8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test6630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6630");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableBag0.isEmpty();
        boolean boolean11 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean15 = strComparableBag0.isEmpty();
        boolean boolean16 = strComparableBag0.isEmpty();
        boolean boolean17 = strComparableBag0.isEmpty();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test6631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6631");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable2 = null;
        boolean boolean3 = strComparableBag0.contains(strComparable2);
        boolean boolean5 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableBag0.spliterator();
        boolean boolean12 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6632");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        boolean boolean8 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean15 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        int int16 = strComparableBag0.size();
        int int17 = strComparableBag0.size();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test6633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6633");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        int int4 = strComparableBag0.size();
        boolean boolean6 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        boolean boolean10 = strComparableBag0.contains(strComparable9);
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor11 = strComparableBag0.iterator();
        int int12 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean16 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor19 = strComparableBag0.iterator();
        boolean boolean21 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator22 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean26 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator27 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strComparableItor11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strComparableItor19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator27);
    }

    @Test
    public void test6634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6634");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableBag0.spliterator();
        int int6 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor10 = strComparableBag0.iterator();
        boolean boolean11 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean15 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass16 = strComparableBag0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strComparableItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6635");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableBag0.size();
        boolean boolean9 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor15 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator16 = strComparableBag0.spliterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
        org.junit.Assert.assertNotNull(strComparableItor15);
        org.junit.Assert.assertNotNull(strComparableSpliterator16);
    }

    @Test
    public void test6636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6636");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean3 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor4 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableBag0.spliterator();
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableBag0.size();
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        strComparableBag0.add(strComparable9);
        boolean boolean11 = strComparableBag0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableItor4);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test6637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6637");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        boolean boolean4 = strComparableBag0.isEmpty();
        int int5 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        boolean boolean7 = strComparableBag0.isEmpty();
        int int8 = strComparableBag0.size();
        int int9 = strComparableBag0.size();
        boolean boolean11 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableBag0.size();
        boolean boolean14 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean16 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        int int17 = strComparableBag0.size();
        int int18 = strComparableBag0.size();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test6638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6638");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        boolean boolean7 = strComparableBag0.isEmpty();
        boolean boolean8 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableBag0.iterator();
        int int10 = strComparableBag0.size();
        boolean boolean12 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        int int13 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean16 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator17 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator17);
    }

    @Test
    public void test6639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6639");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        int int7 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableBag0.iterator();
        int int10 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor11 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor16 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator17 = strComparableBag0.spliterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strComparableItor8);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(strComparableItor11);
        org.junit.Assert.assertNotNull(strComparableItor16);
        org.junit.Assert.assertNotNull(strComparableSpliterator17);
    }

    @Test
    public void test6640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6640");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        boolean boolean7 = strComparableBag0.isEmpty();
        boolean boolean9 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor18 = strComparableBag0.iterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strComparableItor18);
    }

    @Test
    public void test6641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6641");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        boolean boolean8 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator13 = strComparableBag0.spliterator();
        boolean boolean14 = strComparableBag0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable15 = null;
        boolean boolean16 = strComparableBag0.contains(strComparable15);
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertNotNull(strComparableSpliterator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6642");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        boolean boolean8 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        int int11 = strComparableBag0.size();
        boolean boolean12 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor13 = strComparableBag0.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strComparableItor13);
    }

    @Test
    public void test6643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6643");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableBag0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        strComparableBag0.add(strComparable5);
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableBag0.isEmpty();
        boolean boolean11 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableBag0.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strComparableItor12);
    }

    @Test
    public void test6644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6644");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        boolean boolean7 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableBag0.size();
        boolean boolean12 = strComparableBag0.isEmpty();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strComparableItor8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6645");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableBag0.spliterator();
        boolean boolean8 = strComparableBag0.isEmpty();
        boolean boolean9 = strComparableBag0.isEmpty();
        int int10 = strComparableBag0.size();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test6646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6646");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableBag0.isEmpty();
        int int14 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor15 = strComparableBag0.iterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(strComparableItor15);
    }

    @Test
    public void test6647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6647");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        boolean boolean7 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableBag0.isEmpty();
        boolean boolean15 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator16 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator17 = strComparableBag0.spliterator();
        int int18 = strComparableBag0.size();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strComparableItor8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator16);
        org.junit.Assert.assertNotNull(strComparableSpliterator17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
    }

    @Test
    public void test6648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6648");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.lang.Class<?> wildcardClass3 = strComparableBag0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test6649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6649");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor15 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean18 = strComparableBag0.isEmpty();
        boolean boolean20 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean22 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean23 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator24 = strComparableBag0.spliterator();
        java.lang.Class<?> wildcardClass25 = strComparableSpliterator24.getClass();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(strComparableItor15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator24);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6650");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        int int4 = strComparableBag0.size();
        int int5 = strComparableBag0.size();
        int int6 = strComparableBag0.size();
        boolean boolean7 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = strComparableBag0.iterator();
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableBag0.isEmpty();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strComparableItor8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test6651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6651");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        boolean boolean4 = strComparableBag0.isEmpty();
        int int5 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        boolean boolean7 = strComparableBag0.isEmpty();
        int int8 = strComparableBag0.size();
        int int9 = strComparableBag0.size();
        boolean boolean11 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableBag0.size();
        boolean boolean14 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean16 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean18 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean20 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        int int21 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test6652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6652");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = strComparableBag0.iterator();
        java.lang.Class<?> wildcardClass9 = strComparableBag0.getClass();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strComparableItor8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test6653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6653");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableBag0.isEmpty();
        int int9 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor11 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean14 = strComparableBag0.isEmpty();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertNotNull(strComparableItor11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6654");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableBag0.size();
        boolean boolean2 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        boolean boolean5 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
    }

    @Test
    public void test6655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6655");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor2 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableBag0.iterator();
        int int6 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableBag0.spliterator();
        boolean boolean9 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean15 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean16 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator17 = strComparableBag0.spliterator();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(strComparableItor2);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator17);
    }

    @Test
    public void test6656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6656");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        int int7 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        int int9 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor10 = strComparableBag0.iterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(strComparableItor10);
    }

    @Test
    public void test6657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6657");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        boolean boolean8 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableBag0.iterator();
        int int10 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator13 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator13);
    }

    @Test
    public void test6658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6658");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        int int2 = strComparableBag0.size();
        boolean boolean4 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableBag0.size();
        boolean boolean6 = strComparableBag0.isEmpty();
        int int7 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = strComparableBag0.iterator();
        int int9 = strComparableBag0.size();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strComparableItor8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test6659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6659");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        int int2 = strComparableBag0.size();
        int int3 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor7 = strComparableBag0.iterator();
        boolean boolean9 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableBag0.spliterator();
        int int12 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor13 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertNotNull(strComparableItor7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(strComparableItor13);
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
    }

    @Test
    public void test6660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6660");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        int int4 = strComparableBag0.size();
        int int5 = strComparableBag0.size();
        boolean boolean6 = strComparableBag0.isEmpty();
        boolean boolean8 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor10 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strComparableItor10);
    }

    @Test
    public void test6661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6661");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableBag0.size();
        boolean boolean8 = strComparableBag0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        boolean boolean10 = strComparableBag0.contains(strComparable9);
        boolean boolean11 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableBag0.spliterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
    }

    @Test
    public void test6662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6662");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        boolean boolean8 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean12 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = null;
        strComparableBag0.add(strComparable13);
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor15 = strComparableBag0.iterator();
        int int16 = strComparableBag0.size();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strComparableItor15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test6663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6663");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        int int4 = strComparableBag0.size();
        boolean boolean6 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableBag0.size();
        boolean boolean16 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test6664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6664");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean3 = strComparableBag0.isEmpty();
        boolean boolean5 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableBag0.isEmpty();
        boolean boolean9 = strComparableBag0.isEmpty();
        int int10 = strComparableBag0.size();
        int int11 = strComparableBag0.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test6665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6665");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        boolean boolean4 = strComparableBag0.isEmpty();
        int int5 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        boolean boolean7 = strComparableBag0.isEmpty();
        boolean boolean8 = strComparableBag0.isEmpty();
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableBag0.iterator();
        boolean boolean14 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator15 = strComparableBag0.spliterator();
        int int16 = strComparableBag0.size();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNotNull(strComparableItor12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test6666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6666");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        boolean boolean8 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableBag0.size();
        boolean boolean11 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator13 = strComparableBag0.spliterator();
        java.lang.Class<?> wildcardClass14 = strComparableSpliterator13.getClass();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strComparableItor12);
        org.junit.Assert.assertNotNull(strComparableSpliterator13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6667");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor11 = strComparableBag0.iterator();
        int int12 = strComparableBag0.size();
        boolean boolean13 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor14 = strComparableBag0.iterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(strComparableItor11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strComparableItor14);
    }

    @Test
    public void test6668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6668");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        int int7 = strComparableBag0.size();
        boolean boolean8 = strComparableBag0.isEmpty();
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableBag0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable12 = null;
        boolean boolean13 = strComparableBag0.contains(strComparable12);
        boolean boolean15 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test6669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6669");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        int int6 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        int int9 = strComparableBag0.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test6670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6670");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        int int4 = strComparableBag0.size();
        boolean boolean6 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor10 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor11 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableBag0.iterator();
        boolean boolean13 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor15 = strComparableBag0.iterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertNotNull(strComparableItor10);
        org.junit.Assert.assertNotNull(strComparableItor11);
        org.junit.Assert.assertNotNull(strComparableItor12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
        org.junit.Assert.assertNotNull(strComparableItor15);
    }

    @Test
    public void test6671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6671");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor11 = strComparableBag0.iterator();
        boolean boolean13 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor14 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor15 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator18 = strComparableBag0.spliterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strComparableItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strComparableItor14);
        org.junit.Assert.assertNotNull(strComparableItor15);
        org.junit.Assert.assertNotNull(strComparableSpliterator18);
    }

    @Test
    public void test6672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6672");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        boolean boolean4 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableBag0.iterator();
        boolean boolean6 = strComparableBag0.isEmpty();
        boolean boolean8 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableBag0.iterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strComparableItor9);
    }

    @Test
    public void test6673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6673");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableBag0.spliterator();
        int int12 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator15 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator16 = strComparableBag0.spliterator();
        boolean boolean18 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator19 = strComparableBag0.spliterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strComparableItor8);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator15);
        org.junit.Assert.assertNotNull(strComparableSpliterator16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator19);
    }

    @Test
    public void test6674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6674");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean3 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor4 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor7 = strComparableBag0.iterator();
        java.lang.Comparable<java.lang.String> strComparable8 = null;
        strComparableBag0.add(strComparable8);
        int int10 = strComparableBag0.size();
        java.lang.Comparable<java.lang.String> strComparable11 = null;
        strComparableBag0.add(strComparable11);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableItor4);
        org.junit.Assert.assertNotNull(strComparableItor7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
    }

    @Test
    public void test6675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6675");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable2 = null;
        boolean boolean3 = strComparableBag0.contains(strComparable2);
        boolean boolean5 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        int int6 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor7 = strComparableBag0.iterator();
        boolean boolean8 = strComparableBag0.isEmpty();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(strComparableItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test6676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6676");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor2 = strComparableBag0.iterator();
        int int3 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor4 = strComparableBag0.iterator();
        int int5 = strComparableBag0.size();
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableBag0.spliterator();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(strComparableItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strComparableItor4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strComparableItor8);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
    }

    @Test
    public void test6677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6677");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        boolean boolean7 = strComparableBag0.isEmpty();
        boolean boolean8 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor10 = strComparableBag0.iterator();
        boolean boolean12 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        int int13 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableBag0.spliterator();
        java.lang.Class<?> wildcardClass15 = strComparableSpliterator14.getClass();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertNotNull(strComparableItor10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6678");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean14 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6679");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableBag0.size();
        boolean boolean2 = strComparableBag0.isEmpty();
        boolean boolean4 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor10 = strComparableBag0.iterator();
        boolean boolean12 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertNotNull(strComparableItor10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6680");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        boolean boolean4 = strComparableBag0.isEmpty();
        int int5 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor7 = strComparableBag0.iterator();
        boolean boolean8 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableBag0.iterator();
        boolean boolean14 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertNotNull(strComparableItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(strComparableItor12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test6681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6681");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean3 = strComparableBag0.isEmpty();
        boolean boolean4 = strComparableBag0.isEmpty();
        boolean boolean6 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableBag0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test6682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6682");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        boolean boolean4 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor11 = strComparableBag0.iterator();
        int int12 = strComparableBag0.size();
        boolean boolean13 = strComparableBag0.isEmpty();
        boolean boolean15 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertNotNull(strComparableItor11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test6683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6683");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator13 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator16 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int19 = strComparableBag0.size();
        boolean boolean20 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator21 = strComparableBag0.spliterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertNotNull(strComparableSpliterator13);
        org.junit.Assert.assertNotNull(strComparableSpliterator16);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator21);
    }

    @Test
    public void test6684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6684");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor7 = strComparableBag0.iterator();
        boolean boolean9 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean10 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableBag0.iterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableItor7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNotNull(strComparableItor12);
    }

    @Test
    public void test6685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6685");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        boolean boolean4 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableBag0.iterator();
        int int6 = strComparableBag0.size();
        boolean boolean8 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor11 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableBag0.spliterator();
        boolean boolean14 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertNotNull(strComparableItor11);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6686");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        boolean boolean7 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableBag0.isEmpty();
        boolean boolean12 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor15 = strComparableBag0.iterator();
        java.lang.Comparable<java.lang.String> strComparable16 = null;
        strComparableBag0.add(strComparable16);
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor18 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor19 = strComparableBag0.iterator();
        java.lang.Class<?> wildcardClass20 = strComparableItor19.getClass();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strComparableItor15);
        org.junit.Assert.assertNotNull(strComparableItor18);
        org.junit.Assert.assertNotNull(strComparableItor19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test6687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6687");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        boolean boolean8 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor15 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor16 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator17 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator20 = strComparableBag0.spliterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertNotNull(strComparableItor15);
        org.junit.Assert.assertNotNull(strComparableItor16);
        org.junit.Assert.assertNotNull(strComparableSpliterator17);
        org.junit.Assert.assertNotNull(strComparableSpliterator20);
    }

    @Test
    public void test6688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6688");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        int int3 = strComparableBag0.size();
        int int4 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableBag0.iterator();
        boolean boolean6 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableBag0.spliterator();
        boolean boolean9 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor10 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor11 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator13 = strComparableBag0.spliterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strComparableItor10);
        org.junit.Assert.assertNotNull(strComparableItor11);
        org.junit.Assert.assertNotNull(strComparableItor12);
        org.junit.Assert.assertNotNull(strComparableSpliterator13);
    }

    @Test
    public void test6689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6689");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        boolean boolean4 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableBag0.iterator();
        int int6 = strComparableBag0.size();
        boolean boolean8 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor10 = strComparableBag0.iterator();
        int int11 = strComparableBag0.size();
        int int12 = strComparableBag0.size();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertNotNull(strComparableItor10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test6690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6690");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor7 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator13 = strComparableBag0.spliterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertNotNull(strComparableItor7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator13);
    }

    @Test
    public void test6691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6691");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        int int7 = strComparableBag0.size();
        boolean boolean8 = strComparableBag0.isEmpty();
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableBag0.spliterator();
        boolean boolean12 = strComparableBag0.isEmpty();
        boolean boolean14 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass15 = strComparableBag0.getClass();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6692");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable4 = null;
        boolean boolean5 = strComparableBag0.contains(strComparable4);
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test6693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6693");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable4 = null;
        boolean boolean5 = strComparableBag0.contains(strComparable4);
        int int6 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor7 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableBag0.spliterator();
        boolean boolean10 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor11 = strComparableBag0.iterator();
        boolean boolean13 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean14 = strComparableBag0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(strComparableItor7);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strComparableItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test6694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6694");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        boolean boolean4 = strComparableBag0.isEmpty();
        boolean boolean6 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = strComparableBag0.iterator();
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableBag0.spliterator();
        int int12 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor13 = strComparableBag0.iterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertNotNull(strComparableItor8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strComparableItor13);
    }

    @Test
    public void test6695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6695");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableBag0.spliterator();
        boolean boolean8 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator13 = strComparableBag0.spliterator();
        boolean boolean14 = strComparableBag0.isEmpty();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6696");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean14 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean18 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean19 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test6697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6697");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        int int2 = strComparableBag0.size();
        boolean boolean4 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean7 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        int int9 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor13 = strComparableBag0.iterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(strComparableItor12);
        org.junit.Assert.assertNotNull(strComparableItor13);
    }

    @Test
    public void test6698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6698");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        int int4 = strComparableBag0.size();
        boolean boolean6 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableBag0.spliterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strComparableItor8);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
    }

    @Test
    public void test6699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6699");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        int int2 = strComparableBag0.size();
        int int3 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableBag0.spliterator();
        boolean boolean10 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor11 = strComparableBag0.iterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strComparableItor11);
    }

    @Test
    public void test6700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6700");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        boolean boolean7 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableBag0.size();
        boolean boolean11 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableBag0.iterator();
        int int13 = strComparableBag0.size();
        boolean boolean15 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean18 = strComparableBag0.isEmpty();
        int int19 = strComparableBag0.size();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strComparableItor12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test6701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6701");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        int int7 = strComparableBag0.size();
        boolean boolean9 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableBag0.spliterator();
        int int13 = strComparableBag0.size();
        int int14 = strComparableBag0.size();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test6702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6702");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        boolean boolean8 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor10 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor11 = strComparableBag0.iterator();
        boolean boolean12 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor13 = strComparableBag0.iterator();
        java.lang.Class<?> wildcardClass14 = strComparableBag0.getClass();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strComparableItor10);
        org.junit.Assert.assertNotNull(strComparableItor11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strComparableItor13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6703");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor13 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor14 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator15 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(strComparableItor13);
        org.junit.Assert.assertNotNull(strComparableItor14);
        org.junit.Assert.assertNotNull(strComparableSpliterator15);
    }

    @Test
    public void test6704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6704");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        int int4 = strComparableBag0.size();
        boolean boolean6 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor13 = strComparableBag0.iterator();
        boolean boolean15 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        int int16 = strComparableBag0.size();
        boolean boolean17 = strComparableBag0.isEmpty();
        boolean boolean19 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor20 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator21 = strComparableBag0.spliterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strComparableItor13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(strComparableItor20);
        org.junit.Assert.assertNotNull(strComparableSpliterator21);
    }

    @Test
    public void test6705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6705");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        boolean boolean8 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean17 = strComparableBag0.isEmpty();
        int int18 = strComparableBag0.size();
        int int19 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        int int22 = strComparableBag0.size();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
    }

    @Test
    public void test6706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6706");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        int int4 = strComparableBag0.size();
        boolean boolean6 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableBag0.iterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNotNull(strComparableItor12);
    }

    @Test
    public void test6707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6707");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        int int4 = strComparableBag0.size();
        boolean boolean6 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableBag0.iterator();
        boolean boolean14 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNotNull(strComparableItor12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6708");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableBag0.spliterator();
        boolean boolean8 = strComparableBag0.isEmpty();
        boolean boolean9 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableBag0.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test6709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6709");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor13 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableBag0.spliterator();
        int int15 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor16 = strComparableBag0.iterator();
        boolean boolean18 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strComparableItor13);
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(strComparableItor16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test6710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6710");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        boolean boolean7 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean10 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor11 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator15 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor16 = strComparableBag0.iterator();
        boolean boolean17 = strComparableBag0.isEmpty();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strComparableItor11);
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
        org.junit.Assert.assertNotNull(strComparableSpliterator15);
        org.junit.Assert.assertNotNull(strComparableItor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test6711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6711");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        int int7 = strComparableBag0.size();
        boolean boolean8 = strComparableBag0.isEmpty();
        boolean boolean9 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass13 = strComparableBag0.getClass();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6712");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor4 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableBag0.spliterator();
        int int10 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor11 = strComparableBag0.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertNotNull(strComparableItor4);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(strComparableItor11);
    }

    @Test
    public void test6713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6713");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        int int4 = strComparableBag0.size();
        boolean boolean6 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        boolean boolean10 = strComparableBag0.contains(strComparable9);
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor11 = strComparableBag0.iterator();
        int int12 = strComparableBag0.size();
        boolean boolean14 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator17 = strComparableBag0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable18 = null;
        boolean boolean19 = strComparableBag0.contains(strComparable18);
        boolean boolean21 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean23 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean25 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        int int26 = strComparableBag0.size();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strComparableItor11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1 + "'", int26 == 1);
    }

    @Test
    public void test6714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6714");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        int int4 = strComparableBag0.size();
        int int5 = strComparableBag0.size();
        boolean boolean6 = strComparableBag0.isEmpty();
        int int7 = strComparableBag0.size();
        int int8 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableBag0.spliterator();
        boolean boolean10 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor11 = strComparableBag0.iterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strComparableItor11);
    }

    @Test
    public void test6715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6715");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor4 = strComparableBag0.iterator();
        int int5 = strComparableBag0.size();
        int int6 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor7 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = strComparableBag0.iterator();
        boolean boolean9 = strComparableBag0.isEmpty();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertNotNull(strComparableItor4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(strComparableItor7);
        org.junit.Assert.assertNotNull(strComparableItor8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test6716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6716");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        boolean boolean8 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableBag0.iterator();
        int int10 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean14 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean15 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator18 = strComparableBag0.spliterator();
        boolean boolean19 = strComparableBag0.isEmpty();
        boolean boolean20 = strComparableBag0.isEmpty();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6717");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        boolean boolean7 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableBag0.isEmpty();
        boolean boolean12 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor15 = strComparableBag0.iterator();
        java.lang.Comparable<java.lang.String> strComparable16 = null;
        strComparableBag0.add(strComparable16);
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor18 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor19 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor20 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strComparableItor15);
        org.junit.Assert.assertNotNull(strComparableItor18);
        org.junit.Assert.assertNotNull(strComparableItor19);
        org.junit.Assert.assertNotNull(strComparableItor20);
    }

    @Test
    public void test6718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6718");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean3 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableBag0.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
    }

    @Test
    public void test6719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6719");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable2 = null;
        strComparableBag0.add(strComparable2);
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor4 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableBag0.iterator();
        boolean boolean6 = strComparableBag0.isEmpty();
        boolean boolean7 = strComparableBag0.isEmpty();
        int int8 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableBag0.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean11 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableItor4);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
    }

    @Test
    public void test6720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6720");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        int int2 = strComparableBag0.size();
        boolean boolean4 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableBag0.size();
        boolean boolean6 = strComparableBag0.isEmpty();
        boolean boolean8 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableBag0.isEmpty();
        boolean boolean10 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
    }

    @Test
    public void test6721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6721");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        int int4 = strComparableBag0.size();
        boolean boolean6 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean12 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        int int13 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor14 = strComparableBag0.iterator();
        java.lang.Class<?> wildcardClass15 = strComparableItor14.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(strComparableItor14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6722");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        boolean boolean4 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableBag0.iterator();
        int int6 = strComparableBag0.size();
        boolean boolean7 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        java.lang.Class<?> wildcardClass9 = strComparableBag0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test6723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6723");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor10 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor11 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean15 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator16 = strComparableBag0.spliterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strComparableItor8);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertNotNull(strComparableItor10);
        org.junit.Assert.assertNotNull(strComparableItor11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator16);
    }

    @Test
    public void test6724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6724");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        int int4 = strComparableBag0.size();
        boolean boolean6 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor10 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableBag0.spliterator();
        java.lang.Class<?> wildcardClass12 = strComparableSpliterator11.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertNotNull(strComparableItor10);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6725");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        int int6 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = strComparableBag0.iterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertNotNull(strComparableItor8);
    }

    @Test
    public void test6726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6726");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        int int2 = strComparableBag0.size();
        int int3 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor7 = strComparableBag0.iterator();
        boolean boolean8 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor10 = strComparableBag0.iterator();
        int int11 = strComparableBag0.size();
        java.lang.Comparable<java.lang.String> strComparable12 = null;
        boolean boolean13 = strComparableBag0.contains(strComparable12);
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertNotNull(strComparableItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertNotNull(strComparableItor10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test6727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6727");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor14 = strComparableBag0.iterator();
        boolean boolean16 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor17 = strComparableBag0.iterator();
        java.lang.Class<?> wildcardClass18 = strComparableItor17.getClass();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(strComparableItor14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strComparableItor17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6728");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        int int2 = strComparableBag0.size();
        int int3 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableBag0.size();
        boolean boolean11 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor13 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor14 = strComparableBag0.iterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(strComparableItor13);
        org.junit.Assert.assertNotNull(strComparableItor14);
    }

    @Test
    public void test6729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6729");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator13 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator16 = strComparableBag0.spliterator();
        boolean boolean17 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor20 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator21 = strComparableBag0.spliterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertNotNull(strComparableSpliterator13);
        org.junit.Assert.assertNotNull(strComparableSpliterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strComparableItor20);
        org.junit.Assert.assertNotNull(strComparableSpliterator21);
    }

    @Test
    public void test6730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6730");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor7 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableBag0.spliterator();
        boolean boolean11 = strComparableBag0.isEmpty();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertNotNull(strComparableItor7);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test6731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6731");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        boolean boolean7 = strComparableBag0.isEmpty();
        boolean boolean9 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean14 = strComparableBag0.isEmpty();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6732");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor10 = strComparableBag0.iterator();
        int int11 = strComparableBag0.size();
        int int12 = strComparableBag0.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertNotNull(strComparableItor8);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertNotNull(strComparableItor10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test6733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6733");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean3 = strComparableBag0.isEmpty();
        boolean boolean4 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableBag0.iterator();
        boolean boolean6 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableBag0.spliterator();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
    }

    @Test
    public void test6734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6734");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        boolean boolean4 = strComparableBag0.isEmpty();
        boolean boolean5 = strComparableBag0.isEmpty();
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        int int9 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor14 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor15 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator16 = strComparableBag0.spliterator();
        boolean boolean17 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor18 = strComparableBag0.iterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNotNull(strComparableItor14);
        org.junit.Assert.assertNotNull(strComparableItor15);
        org.junit.Assert.assertNotNull(strComparableSpliterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strComparableItor18);
    }

    @Test
    public void test6735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6735");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable2 = null;
        boolean boolean3 = strComparableBag0.contains(strComparable2);
        int int4 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableBag0.spliterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
    }

    @Test
    public void test6736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6736");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        boolean boolean7 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor10 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor15 = strComparableBag0.iterator();
        java.lang.Class<?> wildcardClass16 = strComparableItor15.getClass();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strComparableItor10);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
        org.junit.Assert.assertNotNull(strComparableItor15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6737");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor15 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean18 = strComparableBag0.isEmpty();
        boolean boolean20 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean21 = strComparableBag0.isEmpty();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(strComparableItor15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test6738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6738");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        boolean boolean4 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableBag0.iterator();
        int int6 = strComparableBag0.size();
        boolean boolean8 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableBag0.iterator();
        int int10 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator16 = strComparableBag0.spliterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNotNull(strComparableSpliterator16);
    }

    @Test
    public void test6739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6739");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        boolean boolean7 = strComparableBag0.isEmpty();
        boolean boolean8 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableBag0.iterator();
        boolean boolean10 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableBag0.spliterator();
        int int12 = strComparableBag0.size();
        boolean boolean14 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test6740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6740");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableBag0.iterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strComparableItor5);
    }

    @Test
    public void test6741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6741");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableBag0.size();
        boolean boolean8 = strComparableBag0.isEmpty();
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        int int11 = strComparableBag0.size();
        int int12 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass15 = strComparableBag0.getClass();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6742");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean12 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator15 = strComparableBag0.spliterator();
        boolean boolean17 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test6743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6743");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        boolean boolean4 = strComparableBag0.isEmpty();
        boolean boolean5 = strComparableBag0.isEmpty();
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor10 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator13 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        int int16 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor17 = strComparableBag0.iterator();
        int int18 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator19 = strComparableBag0.spliterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertNotNull(strComparableItor10);
        org.junit.Assert.assertNotNull(strComparableSpliterator13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(strComparableItor17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator19);
    }

    @Test
    public void test6744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6744");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        boolean boolean4 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor7 = strComparableBag0.iterator();
        boolean boolean8 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableBag0.spliterator();
        int int11 = strComparableBag0.size();
        java.lang.Class<?> wildcardClass12 = strComparableBag0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertNotNull(strComparableItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6745");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        int int4 = strComparableBag0.size();
        boolean boolean6 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        boolean boolean10 = strComparableBag0.contains(strComparable9);
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor11 = strComparableBag0.iterator();
        int int12 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean16 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor19 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor22 = strComparableBag0.iterator();
        int int23 = strComparableBag0.size();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strComparableItor11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strComparableItor19);
        org.junit.Assert.assertNotNull(strComparableItor22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
    }

    @Test
    public void test6746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6746");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        int int4 = strComparableBag0.size();
        boolean boolean6 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        boolean boolean10 = strComparableBag0.contains(strComparable9);
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor11 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor16 = strComparableBag0.iterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strComparableItor11);
        org.junit.Assert.assertNotNull(strComparableItor16);
    }

    @Test
    public void test6747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6747");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        strComparableBag0.add(strComparable9);
        boolean boolean11 = strComparableBag0.isEmpty();
        int int12 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor13 = strComparableBag0.iterator();
        int int14 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator15 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator16 = strComparableBag0.spliterator();
        int int17 = strComparableBag0.size();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(strComparableItor13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator15);
        org.junit.Assert.assertNotNull(strComparableSpliterator16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test6748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6748");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        strComparableBag0.add(strComparable9);
        boolean boolean11 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean15 = strComparableBag0.isEmpty();
        int int16 = strComparableBag0.size();
        boolean boolean18 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test6749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6749");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor4 = strComparableBag0.iterator();
        int int5 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor7 = strComparableBag0.iterator();
        boolean boolean8 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableBag0.spliterator();
        java.lang.Class<?> wildcardClass10 = strComparableSpliterator9.getClass();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertNotNull(strComparableItor4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertNotNull(strComparableItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test6750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6750");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableBag0.spliterator();
        boolean boolean11 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor13 = strComparableBag0.iterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strComparableItor8);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertNotNull(strComparableItor13);
    }

    @Test
    public void test6751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6751");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean3 = strComparableBag0.isEmpty();
        boolean boolean4 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        int int9 = strComparableBag0.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test6752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6752");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableBag0.spliterator();
        boolean boolean6 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableBag0.size();
        int int8 = strComparableBag0.size();
        boolean boolean9 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean12 = strComparableBag0.isEmpty();
        int int13 = strComparableBag0.size();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test6753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6753");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        boolean boolean7 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = strComparableBag0.iterator();
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strComparableItor8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test6754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6754");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableBag0.spliterator();
        java.lang.Class<?> wildcardClass11 = strComparableBag0.getClass();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strComparableItor8);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test6755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6755");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable2 = null;
        strComparableBag0.add(strComparable2);
        int int4 = strComparableBag0.size();
        boolean boolean5 = strComparableBag0.isEmpty();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test6756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6756");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor7 = strComparableBag0.iterator();
        boolean boolean9 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator13 = strComparableBag0.spliterator();
        boolean boolean14 = strComparableBag0.isEmpty();
        boolean boolean16 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertNotNull(strComparableItor7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6757");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        int int2 = strComparableBag0.size();
        boolean boolean4 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor10 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        int int13 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor14 = strComparableBag0.iterator();
        boolean boolean15 = strComparableBag0.isEmpty();
        boolean boolean17 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean19 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertNotNull(strComparableItor10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(strComparableItor14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test6758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6758");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean5 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable6 = null;
        boolean boolean7 = strComparableBag0.contains(strComparable6);
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor10 = strComparableBag0.iterator();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strComparableItor10);
    }

    @Test
    public void test6759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6759");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean3 = strComparableBag0.isEmpty();
        boolean boolean4 = strComparableBag0.isEmpty();
        int int5 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        int int7 = strComparableBag0.size();
        boolean boolean9 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableBag0.spliterator();
        boolean boolean13 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean14 = strComparableBag0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6760");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableBag0.isEmpty();
        boolean boolean13 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor14 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean19 = strComparableBag0.isEmpty();
        boolean boolean20 = strComparableBag0.isEmpty();
        boolean boolean21 = strComparableBag0.isEmpty();
        int int22 = strComparableBag0.size();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strComparableItor14);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test6761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6761");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        int int2 = strComparableBag0.size();
        int int3 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableBag0.isEmpty();
        boolean boolean13 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator18 = strComparableBag0.spliterator();
        java.lang.Class<?> wildcardClass19 = strComparableBag0.getClass();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6762");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        boolean boolean4 = strComparableBag0.isEmpty();
        boolean boolean6 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableBag0.spliterator();
        boolean boolean9 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor10 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableBag0.spliterator();
        java.lang.Class<?> wildcardClass13 = strComparableBag0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strComparableItor10);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6763");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableBag0.size();
        boolean boolean8 = strComparableBag0.isEmpty();
        int int9 = strComparableBag0.size();
        int int10 = strComparableBag0.size();
        boolean boolean11 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableBag0.iterator();
        boolean boolean13 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean17 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor18 = strComparableBag0.iterator();
        java.lang.Class<?> wildcardClass19 = strComparableBag0.getClass();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strComparableItor12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strComparableItor18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test6764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6764");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        boolean boolean7 = strComparableBag0.isEmpty();
        boolean boolean8 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableBag0.isEmpty();
        java.lang.Class<?> wildcardClass12 = strComparableBag0.getClass();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6765");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean3 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor4 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableBag0.size();
        int int8 = strComparableBag0.size();
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        int int11 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        int int15 = strComparableBag0.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableItor4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(strComparableItor12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test6766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6766");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        int int6 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableBag0.spliterator();
        boolean boolean9 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        boolean boolean11 = strComparableBag0.contains(strComparable10);
        boolean boolean12 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator13 = strComparableBag0.spliterator();
        java.lang.Class<?> wildcardClass14 = strComparableBag0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6767");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        strComparableBag0.add(strComparable9);
        boolean boolean11 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean15 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator16 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor17 = strComparableBag0.iterator();
        boolean boolean18 = strComparableBag0.isEmpty();
        int int19 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean23 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator16);
        org.junit.Assert.assertNotNull(strComparableItor17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test6768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6768");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        boolean boolean4 = strComparableBag0.isEmpty();
        boolean boolean5 = strComparableBag0.isEmpty();
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor10 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator13 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor16 = strComparableBag0.iterator();
        java.lang.Class<?> wildcardClass17 = strComparableItor16.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertNotNull(strComparableItor10);
        org.junit.Assert.assertNotNull(strComparableSpliterator13);
        org.junit.Assert.assertNotNull(strComparableItor16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test6769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6769");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor13 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor14 = strComparableBag0.iterator();
        int int15 = strComparableBag0.size();
        int int16 = strComparableBag0.size();
        int int17 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strComparableItor13);
        org.junit.Assert.assertNotNull(strComparableItor14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test6770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6770");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        boolean boolean4 = strComparableBag0.isEmpty();
        boolean boolean5 = strComparableBag0.isEmpty();
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        boolean boolean9 = strComparableBag0.isEmpty();
        boolean boolean11 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableBag0.iterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strComparableItor12);
    }

    @Test
    public void test6771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6771");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        int int4 = strComparableBag0.size();
        int int5 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableBag0.spliterator();
        boolean boolean13 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test6772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6772");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        boolean boolean4 = strComparableBag0.isEmpty();
        int int5 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        boolean boolean7 = strComparableBag0.isEmpty();
        int int8 = strComparableBag0.size();
        int int9 = strComparableBag0.size();
        boolean boolean11 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableBag0.size();
        boolean boolean14 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean15 = strComparableBag0.isEmpty();
        boolean boolean16 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test6773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6773");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor10 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor11 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor14 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator15 = strComparableBag0.spliterator();
        boolean boolean16 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator17 = strComparableBag0.spliterator();
        boolean boolean18 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator19 = strComparableBag0.spliterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strComparableItor8);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertNotNull(strComparableItor10);
        org.junit.Assert.assertNotNull(strComparableItor11);
        org.junit.Assert.assertNotNull(strComparableItor14);
        org.junit.Assert.assertNotNull(strComparableSpliterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator19);
    }

    @Test
    public void test6774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6774");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableBag0.spliterator();
        int int10 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableBag0.spliterator();
        boolean boolean13 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor14 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor15 = strComparableBag0.iterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strComparableItor14);
        org.junit.Assert.assertNotNull(strComparableItor15);
    }

    @Test
    public void test6775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6775");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableBag0.spliterator();
        boolean boolean9 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor13 = strComparableBag0.iterator();
        boolean boolean15 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator16 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator19 = strComparableBag0.spliterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertNotNull(strComparableItor13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator16);
        org.junit.Assert.assertNotNull(strComparableSpliterator19);
    }

    @Test
    public void test6776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6776");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable4 = null;
        boolean boolean5 = strComparableBag0.contains(strComparable4);
        int int6 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor7 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = strComparableBag0.iterator();
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableBag0.spliterator();
        boolean boolean13 = strComparableBag0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(strComparableItor7);
        org.junit.Assert.assertNotNull(strComparableItor8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test6777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6777");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        strComparableBag0.add(strComparable9);
        boolean boolean11 = strComparableBag0.isEmpty();
        boolean boolean12 = strComparableBag0.isEmpty();
        int int13 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableBag0.spliterator();
        int int15 = strComparableBag0.size();
        int int16 = strComparableBag0.size();
        int int17 = strComparableBag0.size();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test6778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6778");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable4 = null;
        boolean boolean5 = strComparableBag0.contains(strComparable4);
        int int6 = strComparableBag0.size();
        boolean boolean7 = strComparableBag0.isEmpty();
        int int8 = strComparableBag0.size();
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableBag0.spliterator();
        int int12 = strComparableBag0.size();
        boolean boolean14 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test6779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6779");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor2 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableBag0.iterator();
        int int6 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableBag0.spliterator();
        boolean boolean9 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableBag0.spliterator();
        java.lang.Class<?> wildcardClass12 = strComparableSpliterator11.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(strComparableItor2);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6780");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        boolean boolean4 = strComparableBag0.isEmpty();
        boolean boolean5 = strComparableBag0.isEmpty();
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        int int9 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableBag0.spliterator();
        int int11 = strComparableBag0.size();
        boolean boolean13 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor14 = strComparableBag0.iterator();
        int int15 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator16 = strComparableBag0.spliterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strComparableItor14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator16);
    }

    @Test
    public void test6781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6781");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        int int2 = strComparableBag0.size();
        int int3 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableBag0.isEmpty();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test6782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6782");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable2 = null;
        strComparableBag0.add(strComparable2);
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor4 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator16 = strComparableBag0.spliterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableItor4);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertNotNull(strComparableSpliterator16);
    }

    @Test
    public void test6783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6783");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor7 = strComparableBag0.iterator();
        int int8 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableBag0.iterator();
        int int10 = strComparableBag0.size();
        boolean boolean12 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor14 = strComparableBag0.iterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertNotNull(strComparableItor7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strComparableItor14);
    }

    @Test
    public void test6784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6784");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableBag0.size();
        boolean boolean9 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor13 = strComparableBag0.iterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertNotNull(strComparableItor13);
    }

    @Test
    public void test6785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6785");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        int int7 = strComparableBag0.size();
        boolean boolean8 = strComparableBag0.isEmpty();
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = null;
        boolean boolean14 = strComparableBag0.contains(strComparable13);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator15 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator16 = strComparableBag0.spliterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator15);
        org.junit.Assert.assertNotNull(strComparableSpliterator16);
    }

    @Test
    public void test6786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6786");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        int int2 = strComparableBag0.size();
        boolean boolean4 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor11 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor13 = strComparableBag0.iterator();
        java.lang.Class<?> wildcardClass14 = strComparableBag0.getClass();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(strComparableItor11);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertNotNull(strComparableItor13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6787");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        boolean boolean4 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor7 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableBag0.spliterator();
        boolean boolean11 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableBag0.size();
        java.lang.Class<?> wildcardClass13 = strComparableBag0.getClass();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertNotNull(strComparableItor7);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6788");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean3 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor4 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableBag0.size();
        int int8 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableBag0.spliterator();
        java.lang.Class<?> wildcardClass12 = strComparableSpliterator11.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableItor4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6789");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        int int2 = strComparableBag0.size();
        boolean boolean4 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableBag0.size();
        boolean boolean6 = strComparableBag0.isEmpty();
        boolean boolean8 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor10 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor11 = strComparableBag0.iterator();
        java.lang.Class<?> wildcardClass12 = strComparableBag0.getClass();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strComparableItor10);
        org.junit.Assert.assertNotNull(strComparableItor11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test6790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6790");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        boolean boolean7 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableBag0.isEmpty();
        int int14 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor15 = strComparableBag0.iterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strComparableItor8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(strComparableItor15);
    }

    @Test
    public void test6791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6791");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        int int7 = strComparableBag0.size();
        boolean boolean8 = strComparableBag0.isEmpty();
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableBag0.isEmpty();
        int int14 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor15 = strComparableBag0.iterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(strComparableItor15);
    }

    @Test
    public void test6792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6792");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        boolean boolean4 = strComparableBag0.isEmpty();
        boolean boolean5 = strComparableBag0.isEmpty();
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor10 = strComparableBag0.iterator();
        int int11 = strComparableBag0.size();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertNotNull(strComparableItor10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test6793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6793");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        boolean boolean7 = strComparableBag0.isEmpty();
        boolean boolean8 = strComparableBag0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        boolean boolean10 = strComparableBag0.contains(strComparable9);
        int int11 = strComparableBag0.size();
        boolean boolean13 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator15 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator16 = strComparableBag0.spliterator();
        boolean boolean17 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int20 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator21 = strComparableBag0.spliterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
        org.junit.Assert.assertNotNull(strComparableSpliterator15);
        org.junit.Assert.assertNotNull(strComparableSpliterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator21);
    }

    @Test
    public void test6794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6794");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor7 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableBag0.iterator();
        int int10 = strComparableBag0.size();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertNotNull(strComparableItor7);
        org.junit.Assert.assertNotNull(strComparableItor8);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test6795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6795");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        int int7 = strComparableBag0.size();
        boolean boolean9 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strComparableItor12);
    }

    @Test
    public void test6796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6796");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableBag0.spliterator();
        boolean boolean10 = strComparableBag0.isEmpty();
        boolean boolean12 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator13 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor14 = strComparableBag0.iterator();
        java.lang.Class<?> wildcardClass15 = strComparableBag0.getClass();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator13);
        org.junit.Assert.assertNotNull(strComparableItor14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6797");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        int int7 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableBag0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableBag0.add(strComparable10);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableBag0.spliterator();
        int int13 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor14 = strComparableBag0.iterator();
        boolean boolean15 = strComparableBag0.isEmpty();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(strComparableItor14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test6798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6798");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        boolean boolean4 = strComparableBag0.isEmpty();
        int int5 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        boolean boolean7 = strComparableBag0.isEmpty();
        boolean boolean8 = strComparableBag0.isEmpty();
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableBag0.spliterator();
        int int12 = strComparableBag0.size();
        boolean boolean14 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean16 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor17 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strComparableItor17);
    }

    @Test
    public void test6799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6799");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable4 = null;
        boolean boolean5 = strComparableBag0.contains(strComparable4);
        int int6 = strComparableBag0.size();
        boolean boolean7 = strComparableBag0.isEmpty();
        int int8 = strComparableBag0.size();
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableBag0.spliterator();
        int int12 = strComparableBag0.size();
        boolean boolean13 = strComparableBag0.isEmpty();
        int int14 = strComparableBag0.size();
        int int15 = strComparableBag0.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test6800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6800");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        int int4 = strComparableBag0.size();
        boolean boolean6 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableBag0.spliterator();
        int int12 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator13 = strComparableBag0.spliterator();
        boolean boolean15 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable20 = null;
        boolean boolean21 = strComparableBag0.contains(strComparable20);
        int int22 = strComparableBag0.size();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test6801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6801");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable2 = null;
        strComparableBag0.add(strComparable2);
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor4 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableBag0.iterator();
        boolean boolean6 = strComparableBag0.isEmpty();
        boolean boolean7 = strComparableBag0.isEmpty();
        int int8 = strComparableBag0.size();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableItor4);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test6802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6802");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable2 = null;
        strComparableBag0.add(strComparable2);
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor4 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableBag0.spliterator();
        int int13 = strComparableBag0.size();
        boolean boolean14 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator15 = strComparableBag0.spliterator();
        boolean boolean16 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor17 = strComparableBag0.iterator();
        boolean boolean18 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableItor4);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strComparableItor17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6803");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean3 = strComparableBag0.isEmpty();
        boolean boolean5 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableBag0.isEmpty();
        boolean boolean9 = strComparableBag0.isEmpty();
        int int10 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableBag0.spliterator();
        boolean boolean12 = strComparableBag0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6804");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        int int4 = strComparableBag0.size();
        boolean boolean6 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableBag0.spliterator();
        int int12 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator13 = strComparableBag0.spliterator();
        boolean boolean15 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean16 = strComparableBag0.isEmpty();
        int int17 = strComparableBag0.size();
        boolean boolean18 = strComparableBag0.isEmpty();
        boolean boolean20 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor21 = strComparableBag0.iterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strComparableItor21);
    }

    @Test
    public void test6805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6805");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        boolean boolean4 = strComparableBag0.isEmpty();
        int int5 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6806");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        int int7 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor11 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strComparableItor11);
    }

    @Test
    public void test6807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6807");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        boolean boolean4 = strComparableBag0.isEmpty();
        boolean boolean5 = strComparableBag0.isEmpty();
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        int int9 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableBag0.spliterator();
        boolean boolean13 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableBag0.spliterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
    }

    @Test
    public void test6808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6808");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor10 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor13 = strComparableBag0.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertNotNull(strComparableItor8);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertNotNull(strComparableItor10);
        org.junit.Assert.assertNotNull(strComparableItor13);
    }

    @Test
    public void test6809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6809");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        int int2 = strComparableBag0.size();
        boolean boolean4 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableBag0.size();
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableBag0.spliterator();
        boolean boolean11 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableBag0.size();
        boolean boolean14 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean16 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6810");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        boolean boolean4 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableBag0.iterator();
        int int6 = strComparableBag0.size();
        boolean boolean8 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableBag0.iterator();
        int int10 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        int int16 = strComparableBag0.size();
        boolean boolean17 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator18 = strComparableBag0.spliterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator18);
    }

    @Test
    public void test6811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6811");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean3 = strComparableBag0.isEmpty();
        boolean boolean4 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertNotNull(strComparableItor6);
    }

    @Test
    public void test6812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6812");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableBag0.isEmpty();
        boolean boolean13 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        int int14 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor15 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(strComparableItor15);
    }

    @Test
    public void test6813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6813");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        boolean boolean8 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableBag0.size();
        boolean boolean11 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean16 = strComparableBag0.isEmpty();
        int int17 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator20 = strComparableBag0.spliterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator20);
    }

    @Test
    public void test6814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6814");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor10 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor11 = strComparableBag0.iterator();
        boolean boolean13 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean15 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strComparableItor8);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertNotNull(strComparableItor10);
        org.junit.Assert.assertNotNull(strComparableItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test6815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6815");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        int int7 = strComparableBag0.size();
        boolean boolean8 = strComparableBag0.isEmpty();
        int int9 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor10 = strComparableBag0.iterator();
        boolean boolean12 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        int int13 = strComparableBag0.size();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(strComparableItor10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test6816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6816");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean3 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor4 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableBag0.iterator();
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass10 = strComparableBag0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableItor4);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test6817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6817");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        boolean boolean7 = strComparableBag0.isEmpty();
        boolean boolean8 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableBag0.iterator();
        int int10 = strComparableBag0.size();
        boolean boolean12 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        int int13 = strComparableBag0.size();
        int int14 = strComparableBag0.size();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test6818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6818");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        int int4 = strComparableBag0.size();
        boolean boolean6 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableBag0.spliterator();
        boolean boolean12 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass13 = strComparableBag0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test6819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6819");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableBag0.size();
        boolean boolean8 = strComparableBag0.isEmpty();
        int int9 = strComparableBag0.size();
        int int10 = strComparableBag0.size();
        boolean boolean11 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableBag0.iterator();
        boolean boolean13 = strComparableBag0.isEmpty();
        boolean boolean14 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator15 = strComparableBag0.spliterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strComparableItor12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator15);
    }

    @Test
    public void test6820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6820");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor7 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        boolean boolean9 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableBag0.spliterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strComparableItor7);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
    }

    @Test
    public void test6821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6821");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        strComparableBag0.add(strComparable9);
        boolean boolean11 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableBag0.spliterator();
        boolean boolean13 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean17 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        int int18 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor19 = strComparableBag0.iterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(strComparableItor19);
    }

    @Test
    public void test6822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6822");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean3 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor4 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableBag0.spliterator();
        boolean boolean8 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        int int14 = strComparableBag0.size();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableItor4);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test6823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6823");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean3 = strComparableBag0.isEmpty();
        boolean boolean5 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor7 = strComparableBag0.iterator();
        int int8 = strComparableBag0.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertNotNull(strComparableItor7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test6824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6824");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        int int3 = strComparableBag0.size();
        int int4 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableBag0.iterator();
        boolean boolean6 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableBag0.spliterator();
        boolean boolean8 = strComparableBag0.isEmpty();
        int int9 = strComparableBag0.size();
        boolean boolean11 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableBag0.isEmpty();
        boolean boolean14 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean15 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test6825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6825");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor13 = strComparableBag0.iterator();
        int int14 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator17 = strComparableBag0.spliterator();
        boolean boolean19 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strComparableItor13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test6826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6826");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor10 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor11 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableBag0.iterator();
        boolean boolean13 = strComparableBag0.isEmpty();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strComparableItor10);
        org.junit.Assert.assertNotNull(strComparableItor11);
        org.junit.Assert.assertNotNull(strComparableItor12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test6827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6827");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
    }

    @Test
    public void test6828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6828");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        int int3 = strComparableBag0.size();
        int int4 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableBag0.iterator();
        boolean boolean6 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableBag0.spliterator();
        boolean boolean9 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableBag0.spliterator();
        boolean boolean12 = strComparableBag0.isEmpty();
        boolean boolean13 = strComparableBag0.isEmpty();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test6829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6829");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        boolean boolean8 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor14 = strComparableBag0.iterator();
        boolean boolean16 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        int int17 = strComparableBag0.size();
        int int18 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator19 = strComparableBag0.spliterator();
        int int20 = strComparableBag0.size();
        int int21 = strComparableBag0.size();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNotNull(strComparableItor14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
    }

    @Test
    public void test6830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6830");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        int int2 = strComparableBag0.size();
        int int3 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor7 = strComparableBag0.iterator();
        boolean boolean9 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableBag0.spliterator();
        boolean boolean12 = strComparableBag0.isEmpty();
        boolean boolean13 = strComparableBag0.isEmpty();
        java.lang.Class<?> wildcardClass14 = strComparableBag0.getClass();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertNotNull(strComparableItor7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test6831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6831");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        boolean boolean4 = strComparableBag0.isEmpty();
        boolean boolean5 = strComparableBag0.isEmpty();
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        int int9 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableBag0.spliterator();
        int int12 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor13 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor14 = strComparableBag0.iterator();
        java.lang.Class<?> wildcardClass15 = strComparableBag0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strComparableItor13);
        org.junit.Assert.assertNotNull(strComparableItor14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6832");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableBag0.isEmpty();
        boolean boolean9 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableBag0.size();
        boolean boolean13 = strComparableBag0.isEmpty();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test6833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6833");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor7 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = strComparableBag0.iterator();
        boolean boolean9 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean14 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean18 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertNotNull(strComparableItor7);
        org.junit.Assert.assertNotNull(strComparableItor8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test6834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6834");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        int int6 = strComparableBag0.size();
        int int7 = strComparableBag0.size();
        java.lang.Class<?> wildcardClass8 = strComparableBag0.getClass();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test6835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6835");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        int int3 = strComparableBag0.size();
        int int4 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableBag0.iterator();
        boolean boolean6 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableBag0.spliterator();
        boolean boolean8 = strComparableBag0.isEmpty();
        int int9 = strComparableBag0.size();
        boolean boolean11 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableBag0.iterator();
        boolean boolean14 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean15 = strComparableBag0.isEmpty();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strComparableItor12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test6836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6836");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean3 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor4 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        boolean boolean7 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableItor4);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test6837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6837");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        boolean boolean7 = strComparableBag0.isEmpty();
        boolean boolean8 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor11 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strComparableItor11);
        org.junit.Assert.assertNotNull(strComparableItor12);
    }

    @Test
    public void test6838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6838");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        int int4 = strComparableBag0.size();
        boolean boolean6 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        boolean boolean10 = strComparableBag0.contains(strComparable9);
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor11 = strComparableBag0.iterator();
        int int12 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean16 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor19 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator22 = strComparableBag0.spliterator();
        boolean boolean23 = strComparableBag0.isEmpty();
        boolean boolean24 = strComparableBag0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strComparableItor11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strComparableItor19);
        org.junit.Assert.assertNotNull(strComparableSpliterator22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test6839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6839");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        int int4 = strComparableBag0.size();
        boolean boolean6 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableBag0.spliterator();
        int int12 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator13 = strComparableBag0.spliterator();
        boolean boolean15 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean16 = strComparableBag0.isEmpty();
        int int17 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean21 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        int int22 = strComparableBag0.size();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test6840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6840");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean3 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor4 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableBag0.size();
        int int8 = strComparableBag0.size();
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        int int11 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean17 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor18 = strComparableBag0.iterator();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableItor4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(strComparableItor12);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strComparableItor18);
    }

    @Test
    public void test6841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6841");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        int int7 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableBag0.iterator();
        boolean boolean10 = strComparableBag0.isEmpty();
        boolean boolean12 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor15 = strComparableBag0.iterator();
        int int16 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor17 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable20 = null;
        strComparableBag0.add(strComparable20);
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
        org.junit.Assert.assertNotNull(strComparableItor15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertNotNull(strComparableItor17);
    }

    @Test
    public void test6842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6842");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        int int7 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableBag0.iterator();
        int int10 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor11 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableBag0.spliterator();
        boolean boolean16 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor17 = strComparableBag0.iterator();
        java.lang.Class<?> wildcardClass18 = strComparableBag0.getClass();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strComparableItor8);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(strComparableItor11);
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strComparableItor17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6843");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        boolean boolean4 = strComparableBag0.isEmpty();
        boolean boolean5 = strComparableBag0.isEmpty();
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        int int9 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator17 = strComparableBag0.spliterator();
        boolean boolean18 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator19 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor20 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator21 = strComparableBag0.spliterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertNotNull(strComparableSpliterator17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator19);
        org.junit.Assert.assertNotNull(strComparableItor20);
        org.junit.Assert.assertNotNull(strComparableSpliterator21);
    }

    @Test
    public void test6844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6844");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean3 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableBag0.spliterator();
        boolean boolean5 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableBag0.spliterator();
        boolean boolean8 = strComparableBag0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test6845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6845");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor2 = strComparableBag0.iterator();
        java.lang.Class<?> wildcardClass3 = strComparableBag0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(strComparableItor2);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test6846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6846");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        boolean boolean7 = strComparableBag0.isEmpty();
        boolean boolean8 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableBag0.size();
        boolean boolean13 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean14 = strComparableBag0.isEmpty();
        boolean boolean16 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean17 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor20 = strComparableBag0.iterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strComparableItor20);
    }

    @Test
    public void test6847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6847");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        int int7 = strComparableBag0.size();
        boolean boolean8 = strComparableBag0.isEmpty();
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableBag0.spliterator();
        boolean boolean12 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator13 = strComparableBag0.spliterator();
        boolean boolean15 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test6848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6848");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertNotNull(strComparableItor8);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
    }

    @Test
    public void test6849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6849");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        int int2 = strComparableBag0.size();
        boolean boolean4 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor10 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        int int13 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor14 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator15 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator16 = strComparableBag0.spliterator();
        int int17 = strComparableBag0.size();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertNotNull(strComparableItor10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(strComparableItor14);
        org.junit.Assert.assertNotNull(strComparableSpliterator15);
        org.junit.Assert.assertNotNull(strComparableSpliterator16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test6850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6850");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableBag0.spliterator();
        boolean boolean6 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableBag0.size();
        int int8 = strComparableBag0.size();
        boolean boolean9 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor13 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableBag0.spliterator();
        java.lang.Class<?> wildcardClass15 = strComparableBag0.getClass();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(strComparableItor13);
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test6851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6851");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        boolean boolean8 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean12 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6852");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        boolean boolean7 = strComparableBag0.isEmpty();
        boolean boolean8 = strComparableBag0.isEmpty();
        boolean boolean9 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor10 = strComparableBag0.iterator();
        int int11 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean16 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        int int17 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strComparableItor10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(strComparableItor12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test6853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6853");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        boolean boolean7 = strComparableBag0.isEmpty();
        int int8 = strComparableBag0.size();
        boolean boolean9 = strComparableBag0.isEmpty();
        boolean boolean11 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor15 = strComparableBag0.iterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
        org.junit.Assert.assertNotNull(strComparableItor15);
    }

    @Test
    public void test6854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6854");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableBag0.spliterator();
        int int10 = strComparableBag0.size();
        boolean boolean11 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableBag0.spliterator();
        boolean boolean13 = strComparableBag0.isEmpty();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strComparableItor8);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test6855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6855");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator13 = strComparableBag0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        strComparableBag0.add(strComparable14);
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator13);
    }

    @Test
    public void test6856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6856");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        boolean boolean8 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean17 = strComparableBag0.isEmpty();
        int int18 = strComparableBag0.size();
        boolean boolean20 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test6857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6857");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable4 = null;
        boolean boolean5 = strComparableBag0.contains(strComparable4);
        int int6 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor7 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        int int9 = strComparableBag0.size();
        boolean boolean10 = strComparableBag0.isEmpty();
        boolean boolean11 = strComparableBag0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(strComparableItor7);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test6858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6858");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableBag0.size();
        boolean boolean2 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        boolean boolean5 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass6 = strComparableBag0.getClass();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(wildcardClass6);
    }

    @Test
    public void test6859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6859");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableBag0.spliterator();
        int int10 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        int int13 = strComparableBag0.size();
        boolean boolean15 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean17 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test6860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6860");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor10 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableBag0.spliterator();
        int int12 = strComparableBag0.size();
        boolean boolean13 = strComparableBag0.isEmpty();
        boolean boolean15 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertNotNull(strComparableItor10);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test6861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6861");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        int int2 = strComparableBag0.size();
        int int3 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor7 = strComparableBag0.iterator();
        boolean boolean8 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableBag0.iterator();
        int int10 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean16 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean18 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertNotNull(strComparableItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test6862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6862");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        boolean boolean3 = strComparableBag0.isEmpty();
        boolean boolean5 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        boolean boolean9 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableBag0.spliterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
    }

    @Test
    public void test6863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6863");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        int int2 = strComparableBag0.size();
        int int3 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor7 = strComparableBag0.iterator();
        boolean boolean9 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor10 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean14 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator15 = strComparableBag0.spliterator();
        boolean boolean16 = strComparableBag0.isEmpty();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertNotNull(strComparableItor7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strComparableItor10);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6864");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable4 = null;
        boolean boolean5 = strComparableBag0.contains(strComparable4);
        int int6 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor7 = strComparableBag0.iterator();
        boolean boolean8 = strComparableBag0.isEmpty();
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableBag0.spliterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(strComparableItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
    }

    @Test
    public void test6865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6865");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        int int4 = strComparableBag0.size();
        boolean boolean6 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        boolean boolean10 = strComparableBag0.contains(strComparable9);
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor11 = strComparableBag0.iterator();
        int int12 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean16 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor19 = strComparableBag0.iterator();
        boolean boolean21 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator22 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass25 = strComparableBag0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strComparableItor11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strComparableItor19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator22);
        org.junit.Assert.assertNotNull(wildcardClass25);
    }

    @Test
    public void test6866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6866");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor11 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableBag0.iterator();
        int int13 = strComparableBag0.size();
        boolean boolean14 = strComparableBag0.isEmpty();
        boolean boolean15 = strComparableBag0.isEmpty();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertNotNull(strComparableItor11);
        org.junit.Assert.assertNotNull(strComparableItor12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test6867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6867");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        boolean boolean8 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean15 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        int int16 = strComparableBag0.size();
        boolean boolean17 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test6868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6868");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        boolean boolean4 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        boolean boolean8 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test6869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6869");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        int int4 = strComparableBag0.size();
        boolean boolean6 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator15 = strComparableBag0.spliterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator15);
    }

    @Test
    public void test6870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6870");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        int int2 = strComparableBag0.size();
        int int3 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableBag0.isEmpty();
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor11 = strComparableBag0.iterator();
        boolean boolean13 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strComparableItor11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test6871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6871");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        int int7 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableBag0.spliterator();
        boolean boolean12 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean14 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator15 = strComparableBag0.spliterator();
        boolean boolean16 = strComparableBag0.isEmpty();
        boolean boolean17 = strComparableBag0.isEmpty();
        int int18 = strComparableBag0.size();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test6872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6872");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableBag0.isEmpty();
        boolean boolean8 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableBag0.spliterator();
        boolean boolean10 = strComparableBag0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6873");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        boolean boolean7 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean10 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableBag0.spliterator();
        int int13 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor14 = strComparableBag0.iterator();
        boolean boolean16 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor17 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator18 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor19 = strComparableBag0.iterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(strComparableItor14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strComparableItor17);
        org.junit.Assert.assertNotNull(strComparableSpliterator18);
        org.junit.Assert.assertNotNull(strComparableItor19);
    }

    @Test
    public void test6874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6874");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        boolean boolean4 = strComparableBag0.isEmpty();
        int int5 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor7 = strComparableBag0.iterator();
        boolean boolean8 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator13 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableBag0.spliterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertNotNull(strComparableItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(strComparableItor12);
        org.junit.Assert.assertNotNull(strComparableSpliterator13);
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
    }

    @Test
    public void test6875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6875");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean3 = strComparableBag0.isEmpty();
        boolean boolean5 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableBag0.size();
        int int9 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor10 = strComparableBag0.iterator();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(strComparableItor10);
    }

    @Test
    public void test6876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6876");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean3 = strComparableBag0.isEmpty();
        boolean boolean4 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableBag0.iterator();
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass10 = strComparableBag0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test6877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6877");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        boolean boolean4 = strComparableBag0.isEmpty();
        boolean boolean5 = strComparableBag0.isEmpty();
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        int int9 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableBag0.spliterator();
        boolean boolean16 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator19 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator20 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator19);
        org.junit.Assert.assertNotNull(strComparableSpliterator20);
    }

    @Test
    public void test6878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6878");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        int int7 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        int int12 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor13 = strComparableBag0.iterator();
        boolean boolean14 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean17 = strComparableBag0.isEmpty();
        int int18 = strComparableBag0.size();
        boolean boolean19 = strComparableBag0.isEmpty();
        boolean boolean20 = strComparableBag0.isEmpty();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strComparableItor8);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(strComparableItor13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test6879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6879");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        boolean boolean9 = strComparableBag0.isEmpty();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test6880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6880");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable2 = null;
        strComparableBag0.add(strComparable2);
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor4 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableBag0.iterator();
        boolean boolean6 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        int int13 = strComparableBag0.size();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableItor4);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test6881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6881");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        int int6 = strComparableBag0.size();
        boolean boolean8 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableBag0.spliterator();
        boolean boolean16 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        int int17 = strComparableBag0.size();
        int int18 = strComparableBag0.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test6882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6882");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        int int7 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableBag0.iterator();
        int int10 = strComparableBag0.size();
        boolean boolean12 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableBag0.spliterator();
        boolean boolean15 = strComparableBag0.isEmpty();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strComparableItor8);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test6883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6883");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableBag0.spliterator();
        boolean boolean8 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor11 = strComparableBag0.iterator();
        java.lang.Comparable<java.lang.String> strComparable12 = null;
        strComparableBag0.add(strComparable12);
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strComparableItor11);
    }

    @Test
    public void test6884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6884");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        boolean boolean4 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableBag0.iterator();
        boolean boolean6 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test6885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6885");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        boolean boolean4 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableBag0.iterator();
        int int6 = strComparableBag0.size();
        boolean boolean8 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableBag0.iterator();
        int int10 = strComparableBag0.size();
        java.lang.Class<?> wildcardClass11 = strComparableBag0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test6886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6886");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor2 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableBag0.size();
        boolean boolean12 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean14 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator15 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor16 = strComparableBag0.iterator();
        boolean boolean18 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean19 = strComparableBag0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(strComparableItor2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator15);
        org.junit.Assert.assertNotNull(strComparableItor16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test6887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6887");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        boolean boolean4 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableBag0.iterator();
        boolean boolean6 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        int int9 = strComparableBag0.size();
        int int10 = strComparableBag0.size();
        boolean boolean12 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6888");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableBag0.size();
        boolean boolean11 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor13 = strComparableBag0.iterator();
        int int14 = strComparableBag0.size();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strComparableItor12);
        org.junit.Assert.assertNotNull(strComparableItor13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test6889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6889");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        boolean boolean4 = strComparableBag0.isEmpty();
        int int5 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = strComparableBag0.iterator();
        boolean boolean9 = strComparableBag0.isEmpty();
        boolean boolean11 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strComparableItor8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test6890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6890");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        strComparableBag0.add(strComparable9);
        boolean boolean11 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean15 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator16 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor17 = strComparableBag0.iterator();
        boolean boolean18 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean22 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator16);
        org.junit.Assert.assertNotNull(strComparableItor17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test6891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6891");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        int int4 = strComparableBag0.size();
        boolean boolean6 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableBag0.size();
        int int13 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableBag0.spliterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
    }

    @Test
    public void test6892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6892");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor3 = strComparableBag0.iterator();
        boolean boolean5 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableBag0.isEmpty();
        int int7 = strComparableBag0.size();
        int int8 = strComparableBag0.size();
        int int9 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor10 = strComparableBag0.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strComparableItor3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(strComparableItor10);
    }

    @Test
    public void test6893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6893");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        int int7 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        boolean boolean9 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor11 = strComparableBag0.iterator();
        boolean boolean12 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor13 = strComparableBag0.iterator();
        java.lang.Comparable<java.lang.String> strComparable14 = null;
        boolean boolean15 = strComparableBag0.contains(strComparable14);
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertNotNull(strComparableItor11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strComparableItor13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test6894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6894");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean14 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean17 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor18 = strComparableBag0.iterator();
        boolean boolean19 = strComparableBag0.isEmpty();
        boolean boolean20 = strComparableBag0.isEmpty();
        int int21 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor22 = strComparableBag0.iterator();
        boolean boolean23 = strComparableBag0.isEmpty();
        java.lang.Class<?> wildcardClass24 = strComparableBag0.getClass();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strComparableItor18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertNotNull(strComparableItor22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(wildcardClass24);
    }

    @Test
    public void test6895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6895");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        int int3 = strComparableBag0.size();
        int int4 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableBag0.iterator();
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableBag0.size();
        boolean boolean11 = strComparableBag0.isEmpty();
        boolean boolean13 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean15 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test6896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6896");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        boolean boolean7 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableBag0.isEmpty();
        boolean boolean12 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator13 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor14 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor19 = strComparableBag0.iterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator13);
        org.junit.Assert.assertNotNull(strComparableItor14);
        org.junit.Assert.assertNotNull(strComparableItor19);
    }

    @Test
    public void test6897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6897");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        boolean boolean4 = strComparableBag0.isEmpty();
        int int5 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strComparableItor8);
    }

    @Test
    public void test6898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6898");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean3 = strComparableBag0.isEmpty();
        boolean boolean4 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        int int7 = strComparableBag0.size();
        int int8 = strComparableBag0.size();
        boolean boolean9 = strComparableBag0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test6899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6899");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        int int4 = strComparableBag0.size();
        boolean boolean6 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor11 = strComparableBag0.iterator();
        boolean boolean12 = strComparableBag0.isEmpty();
        int int13 = strComparableBag0.size();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strComparableItor11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test6900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6900");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        boolean boolean8 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableBag0.spliterator();
        boolean boolean11 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableBag0.spliterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
    }

    @Test
    public void test6901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6901");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        boolean boolean8 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        int int9 = strComparableBag0.size();
        boolean boolean11 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean14 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator15 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor16 = strComparableBag0.iterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator15);
        org.junit.Assert.assertNotNull(strComparableItor16);
    }

    @Test
    public void test6902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6902");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean14 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator15 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator16 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator17 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator18 = strComparableBag0.spliterator();
        int int19 = strComparableBag0.size();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator15);
        org.junit.Assert.assertNotNull(strComparableSpliterator16);
        org.junit.Assert.assertNotNull(strComparableSpliterator17);
        org.junit.Assert.assertNotNull(strComparableSpliterator18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test6903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6903");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        boolean boolean7 = strComparableBag0.isEmpty();
        boolean boolean8 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor10 = strComparableBag0.iterator();
        boolean boolean12 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        int int13 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertNotNull(strComparableItor10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
    }

    @Test
    public void test6904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6904");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        int int4 = strComparableBag0.size();
        int int5 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor7 = strComparableBag0.iterator();
        boolean boolean9 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor10 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertNotNull(strComparableItor7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strComparableItor10);
    }

    @Test
    public void test6905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6905");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        int int4 = strComparableBag0.size();
        int int5 = strComparableBag0.size();
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = strComparableBag0.iterator();
        int int9 = strComparableBag0.size();
        int int10 = strComparableBag0.size();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strComparableItor8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test6906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6906");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        int int7 = strComparableBag0.size();
        boolean boolean8 = strComparableBag0.isEmpty();
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean15 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator16 = strComparableBag0.spliterator();
        boolean boolean17 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor18 = strComparableBag0.iterator();
        int int19 = strComparableBag0.size();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strComparableItor18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test6907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6907");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        int int4 = strComparableBag0.size();
        boolean boolean6 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        boolean boolean10 = strComparableBag0.contains(strComparable9);
        int int11 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableBag0.spliterator();
        int int13 = strComparableBag0.size();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test6908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6908");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        int int7 = strComparableBag0.size();
        boolean boolean9 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test6909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6909");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableBag0.size();
        boolean boolean2 = strComparableBag0.isEmpty();
        boolean boolean4 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor11 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(strComparableItor11);
    }

    @Test
    public void test6910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6910");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        boolean boolean8 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableBag0.isEmpty();
        boolean boolean11 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor13 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableBag0.spliterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strComparableItor12);
        org.junit.Assert.assertNotNull(strComparableItor13);
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
    }

    @Test
    public void test6911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6911");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor2 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableBag0.iterator();
        int int6 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableBag0.spliterator();
        boolean boolean9 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean17 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean18 = strComparableBag0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(strComparableItor2);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test6912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6912");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        boolean boolean4 = strComparableBag0.isEmpty();
        boolean boolean5 = strComparableBag0.isEmpty();
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        int int9 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor14 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor15 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor16 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator17 = strComparableBag0.spliterator();
        java.lang.Class<?> wildcardClass18 = strComparableSpliterator17.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNotNull(strComparableItor14);
        org.junit.Assert.assertNotNull(strComparableItor15);
        org.junit.Assert.assertNotNull(strComparableItor16);
        org.junit.Assert.assertNotNull(strComparableSpliterator17);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test6913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6913");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        int int2 = strComparableBag0.size();
        boolean boolean4 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableBag0.iterator();
        boolean boolean10 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator13 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator13);
    }

    @Test
    public void test6914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6914");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        boolean boolean4 = strComparableBag0.isEmpty();
        int int5 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        boolean boolean7 = strComparableBag0.isEmpty();
        boolean boolean8 = strComparableBag0.isEmpty();
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableBag0.spliterator();
        boolean boolean14 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean16 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        int int17 = strComparableBag0.size();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
    }

    @Test
    public void test6915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6915");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor13 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableBag0.spliterator();
        boolean boolean15 = strComparableBag0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable16 = null;
        strComparableBag0.add(strComparable16);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator18 = strComparableBag0.spliterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(strComparableItor13);
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator18);
    }

    @Test
    public void test6916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6916");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        boolean boolean4 = strComparableBag0.isEmpty();
        int int5 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        boolean boolean7 = strComparableBag0.isEmpty();
        int int8 = strComparableBag0.size();
        int int9 = strComparableBag0.size();
        boolean boolean11 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        int int12 = strComparableBag0.size();
        boolean boolean14 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean16 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        int int17 = strComparableBag0.size();
        boolean boolean19 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator20 = strComparableBag0.spliterator();
        boolean boolean22 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean23 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor24 = strComparableBag0.iterator();
        boolean boolean26 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(strComparableItor24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test6917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6917");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        boolean boolean4 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableBag0.isEmpty();
        boolean boolean10 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test6918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6918");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        int int2 = strComparableBag0.size();
        boolean boolean4 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableBag0.spliterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
    }

    @Test
    public void test6919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6919");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable4 = null;
        boolean boolean5 = strComparableBag0.contains(strComparable4);
        int int6 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor7 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        int int9 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor10 = strComparableBag0.iterator();
        boolean boolean12 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(strComparableItor7);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(strComparableItor10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6920");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableBag0.iterator();
        boolean boolean11 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        int int14 = strComparableBag0.size();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertNotNull(strComparableItor8);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test6921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6921");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        int int7 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableBag0.iterator();
        int int10 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor11 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableBag0.spliterator();
        boolean boolean16 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean17 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor18 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator19 = strComparableBag0.spliterator();
        int int20 = strComparableBag0.size();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strComparableItor8);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(strComparableItor11);
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strComparableItor18);
        org.junit.Assert.assertNotNull(strComparableSpliterator19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
    }

    @Test
    public void test6922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6922");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableBag0.spliterator();
        boolean boolean9 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor15 = strComparableBag0.iterator();
        java.lang.Class<?> wildcardClass16 = strComparableItor15.getClass();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
        org.junit.Assert.assertNotNull(strComparableItor15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6923");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        int int2 = strComparableBag0.size();
        int int3 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor7 = strComparableBag0.iterator();
        boolean boolean8 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableBag0.iterator();
        int int10 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor13 = strComparableBag0.iterator();
        int int14 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor15 = strComparableBag0.iterator();
        boolean boolean17 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator18 = strComparableBag0.spliterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertNotNull(strComparableItor7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(strComparableItor13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(strComparableItor15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator18);
    }

    @Test
    public void test6924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6924");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        boolean boolean4 = strComparableBag0.isEmpty();
        boolean boolean5 = strComparableBag0.isEmpty();
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        int int9 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableBag0.spliterator();
        boolean boolean15 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor16 = strComparableBag0.iterator();
        boolean boolean17 = strComparableBag0.isEmpty();
        int int18 = strComparableBag0.size();
        int int19 = strComparableBag0.size();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strComparableItor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test6925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6925");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        int int4 = strComparableBag0.size();
        int int5 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor7 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor11 = strComparableBag0.iterator();
        int int12 = strComparableBag0.size();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertNotNull(strComparableItor7);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strComparableItor11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test6926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6926");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int3 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableBag0.spliterator();
        int int5 = strComparableBag0.size();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test6927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6927");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        int int4 = strComparableBag0.size();
        boolean boolean6 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        boolean boolean10 = strComparableBag0.contains(strComparable9);
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor11 = strComparableBag0.iterator();
        int int12 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean15 = strComparableBag0.isEmpty();
        int int16 = strComparableBag0.size();
        boolean boolean18 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator19 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator20 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator21 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator22 = strComparableBag0.spliterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strComparableItor11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator19);
        org.junit.Assert.assertNotNull(strComparableSpliterator20);
        org.junit.Assert.assertNotNull(strComparableSpliterator21);
        org.junit.Assert.assertNotNull(strComparableSpliterator22);
    }

    @Test
    public void test6928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6928");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean15 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean17 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test6929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6929");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test6930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6930");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean14 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean17 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int20 = strComparableBag0.size();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 5 + "'", int20 == 5);
    }

    @Test
    public void test6931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6931");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor3 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor4 = strComparableBag0.iterator();
        boolean boolean6 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        int int11 = strComparableBag0.size();
        int int12 = strComparableBag0.size();
        org.junit.Assert.assertNotNull(strComparableItor3);
        org.junit.Assert.assertNotNull(strComparableItor4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
    }

    @Test
    public void test6932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6932");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        int int4 = strComparableBag0.size();
        boolean boolean6 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor15 = strComparableBag0.iterator();
        boolean boolean16 = strComparableBag0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strComparableItor15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test6933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6933");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableBag0.spliterator();
        int int11 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator13 = strComparableBag0.spliterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strComparableItor8);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertNotNull(strComparableSpliterator13);
    }

    @Test
    public void test6934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6934");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        boolean boolean4 = strComparableBag0.isEmpty();
        int int5 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        boolean boolean7 = strComparableBag0.isEmpty();
        boolean boolean8 = strComparableBag0.isEmpty();
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        int int11 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
    }

    @Test
    public void test6935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6935");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        int int2 = strComparableBag0.size();
        boolean boolean4 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor10 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean14 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator15 = strComparableBag0.spliterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertNotNull(strComparableItor10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator15);
    }

    @Test
    public void test6936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6936");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor2 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableBag0.iterator();
        boolean boolean6 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = strComparableBag0.iterator();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(strComparableItor2);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertNotNull(strComparableItor8);
    }

    @Test
    public void test6937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6937");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        boolean boolean7 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        int int12 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator15 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator15);
    }

    @Test
    public void test6938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6938");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        boolean boolean4 = strComparableBag0.isEmpty();
        boolean boolean6 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableBag0.spliterator();
        boolean boolean9 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor10 = strComparableBag0.iterator();
        boolean boolean12 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strComparableItor10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test6939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6939");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        boolean boolean8 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator15 = strComparableBag0.spliterator();
        boolean boolean17 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor18 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor19 = strComparableBag0.iterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertNotNull(strComparableSpliterator15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(strComparableItor18);
        org.junit.Assert.assertNotNull(strComparableItor19);
    }

    @Test
    public void test6940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6940");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableBag0.spliterator();
        boolean boolean11 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean14 = strComparableBag0.isEmpty();
        boolean boolean15 = strComparableBag0.isEmpty();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test6941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6941");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        boolean boolean4 = strComparableBag0.isEmpty();
        boolean boolean5 = strComparableBag0.isEmpty();
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableBag0.iterator();
        boolean boolean13 = strComparableBag0.isEmpty();
        boolean boolean14 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator15 = strComparableBag0.spliterator();
        java.lang.Class<?> wildcardClass16 = strComparableSpliterator15.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strComparableItor8);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertNotNull(strComparableItor12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test6942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6942");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor7 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = strComparableBag0.iterator();
        boolean boolean9 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableBag0.isEmpty();
        int int13 = strComparableBag0.size();
        int int14 = strComparableBag0.size();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertNotNull(strComparableItor7);
        org.junit.Assert.assertNotNull(strComparableItor8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test6943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6943");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor2 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableBag0.iterator();
        boolean boolean6 = strComparableBag0.isEmpty();
        boolean boolean7 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = strComparableBag0.iterator();
        boolean boolean9 = strComparableBag0.isEmpty();
        boolean boolean11 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(strComparableItor2);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strComparableItor8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test6944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6944");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        int int4 = strComparableBag0.size();
        boolean boolean6 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableBag0.spliterator();
        int int12 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator13 = strComparableBag0.spliterator();
        boolean boolean15 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean16 = strComparableBag0.isEmpty();
        int int17 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator20 = strComparableBag0.spliterator();
        boolean boolean21 = strComparableBag0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
    }

    @Test
    public void test6945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6945");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        int int3 = strComparableBag0.size();
        int int4 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableBag0.iterator();
        boolean boolean6 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableBag0.spliterator();
        boolean boolean9 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean11 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor13 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor14 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor15 = strComparableBag0.iterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertNotNull(strComparableItor13);
        org.junit.Assert.assertNotNull(strComparableItor14);
        org.junit.Assert.assertNotNull(strComparableItor15);
    }

    @Test
    public void test6946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6946");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        int int4 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableBag0.iterator();
        int int6 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor7 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(strComparableItor7);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
    }

    @Test
    public void test6947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6947");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableBag0.spliterator();
        boolean boolean8 = strComparableBag0.isEmpty();
        boolean boolean9 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean15 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator16 = strComparableBag0.spliterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator16);
    }

    @Test
    public void test6948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6948");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        boolean boolean4 = strComparableBag0.isEmpty();
        boolean boolean5 = strComparableBag0.isEmpty();
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        int int9 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator17 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator18 = strComparableBag0.spliterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertNotNull(strComparableSpliterator17);
        org.junit.Assert.assertNotNull(strComparableSpliterator18);
    }

    @Test
    public void test6949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest13.test6949");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        int int4 = strComparableBag0.size();
        boolean boolean6 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor13 = strComparableBag0.iterator();
        boolean boolean15 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor16 = strComparableBag0.iterator();
        boolean boolean18 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean19 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor20 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor21 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor22 = strComparableBag0.iterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strComparableItor13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strComparableItor16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strComparableItor20);
        org.junit.Assert.assertNotNull(strComparableItor21);
        org.junit.Assert.assertNotNull(strComparableItor22);
    }
}

