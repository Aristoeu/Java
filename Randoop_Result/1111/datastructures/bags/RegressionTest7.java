package datastructures.bags;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest7 {

    public static boolean debug = false;

    @Test
    public void test3501() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3501");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        boolean boolean7 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor14 = strComparableBag0.iterator();
        int int15 = strComparableBag0.size();
        boolean boolean16 = strComparableBag0.isEmpty();
        boolean boolean17 = strComparableBag0.isEmpty();
        java.lang.Class<?> wildcardClass18 = strComparableBag0.getClass();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strComparableItor8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(strComparableItor14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(wildcardClass18);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableBag0.spliterator();
        boolean boolean8 = strComparableBag0.isEmpty();
        int int9 = strComparableBag0.size();
        boolean boolean11 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = strComparableBag0.iterator();
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableBag0.spliterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertNotNull(strComparableItor8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean3 = strComparableBag0.isEmpty();
        boolean boolean4 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = null;
        boolean boolean9 = strComparableBag0.contains(strComparable8);
        boolean boolean10 = strComparableBag0.isEmpty();
        boolean boolean11 = strComparableBag0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean3 = strComparableBag0.isEmpty();
        boolean boolean4 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor11 = strComparableBag0.iterator();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertNotNull(strComparableItor11);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        boolean boolean7 = strComparableBag0.isEmpty();
        boolean boolean9 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableBag0.spliterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable2 = null;
        strComparableBag0.add(strComparable2);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor10 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor14 = strComparableBag0.iterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strComparableItor10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(strComparableItor14);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator13 = strComparableBag0.spliterator();
        int int14 = strComparableBag0.size();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNotNull(strComparableItor12);
        org.junit.Assert.assertNotNull(strComparableSpliterator13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
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
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
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
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableBag0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable11 = null;
        boolean boolean12 = strComparableBag0.contains(strComparable11);
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
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
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor14 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean17 = strComparableBag0.isEmpty();
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
        org.junit.Assert.assertNotNull(strComparableItor14);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        int int2 = strComparableBag0.size();
        boolean boolean4 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableBag0.size();
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean10 = strComparableBag0.isEmpty();
        boolean boolean11 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableBag0.iterator();
        int int13 = strComparableBag0.size();
        boolean boolean15 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strComparableItor12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
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
        boolean boolean15 = strComparableBag0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable16 = null;
        boolean boolean17 = strComparableBag0.contains(strComparable16);
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strComparableItor8);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertNotNull(strComparableItor10);
        org.junit.Assert.assertNotNull(strComparableItor11);
        org.junit.Assert.assertNotNull(strComparableItor14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        int int2 = strComparableBag0.size();
        boolean boolean4 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        int int5 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor10 = strComparableBag0.iterator();
        boolean boolean11 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableBag0.iterator();
        int int13 = strComparableBag0.size();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertNotNull(strComparableItor10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strComparableItor12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        boolean boolean7 = strComparableBag0.isEmpty();
        boolean boolean8 = strComparableBag0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        boolean boolean10 = strComparableBag0.contains(strComparable9);
        boolean boolean11 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass15 = strComparableBag0.getClass();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strComparableItor12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean3 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor4 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableBag0.spliterator();
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableBag0.iterator();
        java.lang.Class<?> wildcardClass10 = strComparableItor9.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableItor4);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor7 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor10 = strComparableBag0.iterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertNotNull(strComparableItor7);
        org.junit.Assert.assertNotNull(strComparableItor8);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertNotNull(strComparableItor10);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        boolean boolean7 = strComparableBag0.isEmpty();
        boolean boolean9 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        int int10 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean4 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean5 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor7 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertNotNull(strComparableItor7);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
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
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        int int4 = strComparableBag0.size();
        int int5 = strComparableBag0.size();
        boolean boolean6 = strComparableBag0.isEmpty();
        boolean boolean8 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        int int4 = strComparableBag0.size();
        boolean boolean6 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int13 = strComparableBag0.size();
        int int14 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor15 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor16 = strComparableBag0.iterator();
        boolean boolean17 = strComparableBag0.isEmpty();
        int int18 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator19 = strComparableBag0.spliterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(strComparableItor15);
        org.junit.Assert.assertNotNull(strComparableItor16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator19);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor2 = strComparableBag0.iterator();
        int int3 = strComparableBag0.size();
        boolean boolean4 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableBag0.spliterator();
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(strComparableItor2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int5 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        int int7 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = strComparableBag0.iterator();
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableBag0.spliterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strComparableItor8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
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
        boolean boolean15 = strComparableBag0.isEmpty();
        boolean boolean16 = strComparableBag0.isEmpty();
        java.lang.Class<?> wildcardClass17 = strComparableBag0.getClass();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        boolean boolean4 = strComparableBag0.isEmpty();
        int int5 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        boolean boolean7 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        int int9 = strComparableBag0.size();
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableBag0.add(strComparable10);
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableBag0.iterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(strComparableItor12);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
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
        boolean boolean17 = strComparableBag0.isEmpty();
        int int18 = strComparableBag0.size();
        java.lang.Class<?> wildcardClass19 = strComparableBag0.getClass();
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
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
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
        boolean boolean16 = strComparableBag0.isEmpty();
        int int17 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator18 = strComparableBag0.spliterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strComparableItor13);
        org.junit.Assert.assertNotNull(strComparableItor14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator18);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        int int4 = strComparableBag0.size();
        boolean boolean6 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableBag0.spliterator();
        boolean boolean11 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator13 = strComparableBag0.spliterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(strComparableSpliterator13);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
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
        boolean boolean19 = strComparableBag0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        boolean boolean4 = strComparableBag0.isEmpty();
        boolean boolean5 = strComparableBag0.isEmpty();
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableBag0.isEmpty();
        boolean boolean9 = strComparableBag0.isEmpty();
        boolean boolean10 = strComparableBag0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
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
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator15 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int18 = strComparableBag0.size();
        int int19 = strComparableBag0.size();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNotNull(strComparableItor14);
        org.junit.Assert.assertNotNull(strComparableSpliterator15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        int int4 = strComparableBag0.size();
        boolean boolean6 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator13 = strComparableBag0.spliterator();
        boolean boolean15 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        boolean boolean8 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor13 = strComparableBag0.iterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertNotNull(strComparableItor12);
        org.junit.Assert.assertNotNull(strComparableItor13);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor2 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean6 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableBag0.iterator();
        boolean boolean13 = strComparableBag0.isEmpty();
        boolean boolean14 = strComparableBag0.isEmpty();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(strComparableItor2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNotNull(strComparableItor12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
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
        boolean boolean17 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        int int18 = strComparableBag0.size();
        boolean boolean20 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor21 = strComparableBag0.iterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(strComparableItor15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strComparableItor21);
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean3 = strComparableBag0.isEmpty();
        boolean boolean4 = strComparableBag0.isEmpty();
        int int5 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        int int7 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableBag0.spliterator();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        int int1 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor2 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableBag0.iterator();
        boolean boolean6 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor7 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = strComparableBag0.iterator();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(strComparableItor2);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableItor7);
        org.junit.Assert.assertNotNull(strComparableItor8);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean3 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor4 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        java.lang.Class<?> wildcardClass7 = strComparableSpliterator6.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableItor4);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        int int4 = strComparableBag0.size();
        int int5 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass10 = strComparableBag0.getClass();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
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
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator16 = strComparableBag0.spliterator();
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
        org.junit.Assert.assertNotNull(strComparableSpliterator16);
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        int int3 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor4 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strComparableItor4);
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
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
        boolean boolean13 = strComparableBag0.isEmpty();
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
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
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
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator23 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int28 = strComparableBag0.size();
        boolean boolean29 = strComparableBag0.isEmpty();
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
        org.junit.Assert.assertNotNull(strComparableSpliterator23);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 3 + "'", int28 == 3);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableBag0.isEmpty();
        boolean boolean13 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableBag0.spliterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean3 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor4 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableBag0.iterator();
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = strComparableBag0.iterator();
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass11 = strComparableBag0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableItor4);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strComparableItor8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
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
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
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
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
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
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        int int4 = strComparableBag0.size();
        boolean boolean6 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableBag0.spliterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        int int10 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableBag0.spliterator();
        boolean boolean12 = strComparableBag0.isEmpty();
        int int13 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor14 = strComparableBag0.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(strComparableItor14);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
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
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        int int4 = strComparableBag0.size();
        boolean boolean5 = strComparableBag0.isEmpty();
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        java.lang.Class<?> wildcardClass9 = strComparableSpliterator8.getClass();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
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
        boolean boolean15 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator16 = strComparableBag0.spliterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator16);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        int int8 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableBag0.spliterator();
        boolean boolean14 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor15 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator16 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean20 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean22 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strComparableItor15);
        org.junit.Assert.assertNotNull(strComparableSpliterator16);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor4 = strComparableBag0.iterator();
        boolean boolean6 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean7 = strComparableBag0.isEmpty();
        int int8 = strComparableBag0.size();
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = null;
        strComparableBag0.add(strComparable13);
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertNotNull(strComparableItor4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
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
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(strComparableItor15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableBag0.spliterator();
        int int5 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        boolean boolean8 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean9 = strComparableBag0.isEmpty();
        boolean boolean11 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        boolean boolean7 = strComparableBag0.isEmpty();
        int int8 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableBag0.spliterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableBag0.spliterator();
        boolean boolean4 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean6 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableBag0.isEmpty();
        boolean boolean11 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean13 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.lang.Class<?> wildcardClass14 = strComparableBag0.getClass();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
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
        int int15 = strComparableBag0.size();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean5 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableBag0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableBag0.spliterator();
        int int10 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        boolean boolean7 = strComparableBag0.isEmpty();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        int int12 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass15 = strComparableBag0.getClass();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableBag0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableBag0.spliterator();
        int int12 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor13 = strComparableBag0.iterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(strComparableItor13);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        boolean boolean8 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableBag0.spliterator();
        java.lang.Class<?> wildcardClass10 = strComparableBag0.getClass();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        int int4 = strComparableBag0.size();
        boolean boolean6 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableBag0.spliterator();
        boolean boolean11 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator16 = strComparableBag0.spliterator();
        java.lang.Class<?> wildcardClass17 = strComparableBag0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        boolean boolean4 = strComparableBag0.isEmpty();
        boolean boolean5 = strComparableBag0.isEmpty();
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor8 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strComparableItor8);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableBag0.isEmpty();
        int int2 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        int int4 = strComparableBag0.size();
        boolean boolean6 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean8 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean10 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        int int11 = strComparableBag0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor12 = strComparableBag0.iterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strComparableItor12);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean3 = strComparableBag0.isEmpty();
        boolean boolean5 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean7 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableBag0.isEmpty();
        boolean boolean9 = strComparableBag0.isEmpty();
        int int10 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableBag0.spliterator();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable2 = null;
        strComparableBag0.add(strComparable2);
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor4 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor5 = strComparableBag0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableBag0.spliterator();
        int int7 = strComparableBag0.size();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertNotNull(strComparableItor4);
        org.junit.Assert.assertNotNull(strComparableItor5);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        boolean boolean7 = strComparableBag0.isEmpty();
        boolean boolean8 = strComparableBag0.isEmpty();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableBag0.iterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor10 = strComparableBag0.iterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        int int13 = strComparableBag0.size();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strComparableItor9);
        org.junit.Assert.assertNotNull(strComparableItor10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        boolean boolean2 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableBag0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableBag0.spliterator();
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean8 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor9 = strComparableBag0.iterator();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strComparableItor9);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>> strComparableBag0 = new com.thealgorithms.datastructures.bags.Bag<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableBag0.spliterator();
        boolean boolean3 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableBag0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator<java.lang.Comparable<java.lang.String>> strComparableItor6 = strComparableBag0.iterator();
        boolean boolean7 = strComparableBag0.isEmpty();
        boolean boolean9 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean11 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean13 = strComparableBag0.contains((java.lang.Comparable<java.lang.String>) "");
        int int14 = strComparableBag0.size();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator15 = strComparableBag0.spliterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableItor6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator15);
    }
}

