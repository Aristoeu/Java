package datastructures.dynamicarray;

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
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        java.lang.String str4 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator9 = strComparableDynamicArray0.iterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream10 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(strComparableStream10);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
    }

    @Test
    public void test3502() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3502");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [hi!]]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableDynamicArray0.stream();
        java.lang.String str8 = strComparableDynamicArray0.toString();
        java.lang.String str9 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[[hi!, [hi!]]]" + "'", str8, "[[hi!, [hi!]]]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[[hi!, [hi!]]]" + "'", str9, "[[hi!, [hi!]]]");
    }

    @Test
    public void test3503() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3503");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        java.lang.String str4 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray0.remove(10);
        int int10 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDynamicArray0.remove((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            strComparableDynamicArray0.put((-1), (java.lang.Comparable<java.lang.String>) "[hi!, [[], hi!, , ]]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNull(strComparable9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNull(strComparable12);
    }

    @Test
    public void test3504() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3504");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream3 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[], hi!]");
        java.util.Iterator iterator7 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [], , [[, ], [hi!], [hi!, hi!], [[], hi!]]]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertNotNull(strComparableStream3);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertNotNull(iterator7);
    }

    @Test
    public void test3505() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3505");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        int int11 = strComparableDynamicArray0.getSize();
        java.lang.String str12 = strComparableDynamicArray0.toString();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream13 = strComparableDynamicArray0.stream();
        int int14 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [hi!, []]]");
        java.util.Iterator iterator17 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[hi!]" + "'", str12, "[hi!]");
        org.junit.Assert.assertNotNull(strComparableStream13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(iterator17);
    }

    @Test
    public void test3506() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3506");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator iterator11 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray0.get((int) (byte) 10);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream14 = strComparableDynamicArray0.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream15 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableDynamicArray0.get(3);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator18 = strComparableDynamicArray0.spliterator();
        java.lang.Class<?> wildcardClass19 = strComparableSpliterator18.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertNotNull(strComparableStream14);
        org.junit.Assert.assertNotNull(strComparableStream15);
        org.junit.Assert.assertNull(strComparable17);
        org.junit.Assert.assertNotNull(strComparableSpliterator18);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3507() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3507");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[[[hi!]]], , [hi!, []], [[hi!]]]");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Class<?> wildcardClass7 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3508() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3508");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableDynamicArray0.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableDynamicArray0.stream();
        int int8 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator9 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, []]");
        java.lang.String str12 = strComparableDynamicArray0.toString();
        java.lang.Class<?> wildcardClass13 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableStream6);
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[hi!, [hi!, []]]" + "'", str12, "[hi!, [hi!, []]]");
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3509() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3509");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        int int7 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[]");
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        java.lang.String str11 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableDynamicArray0.spliterator();
        java.lang.String str13 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!]");
        int int16 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!, []]" + "'", str11, "[hi!, []]");
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[hi!, []]" + "'", str13, "[hi!, []]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
    }

    @Test
    public void test3510() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3510");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>(0);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableDynamicArray1.spliterator();
        int int3 = strComparableDynamicArray1.getSize();
        java.util.Iterator iterator4 = strComparableDynamicArray1.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray1.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableDynamicArray1.stream();
        java.util.Iterator iterator7 = strComparableDynamicArray1.iterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream8 = strComparableDynamicArray1.stream();
        boolean boolean9 = strComparableDynamicArray1.isEmpty();
        java.util.Iterator iterator10 = strComparableDynamicArray1.iterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream11 = strComparableDynamicArray1.stream();
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNotNull(strComparableStream6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(strComparableStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(strComparableStream11);
    }

    @Test
    public void test3511() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3511");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream4 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!]");
        java.lang.String str8 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableDynamicArray0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableDynamicArray0.spliterator();
        boolean boolean11 = strComparableDynamicArray0.isEmpty();
        int int12 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator13 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[hi!, [hi!]]" + "'", str8, "[hi!, [hi!]]");
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(iterator13);
    }

    @Test
    public void test3512() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3512");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableDynamicArray0.isEmpty();
        java.lang.String str10 = strComparableDynamicArray0.toString();
        java.lang.String str11 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, hi!]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream15 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableDynamicArray0.remove(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
        org.junit.Assert.assertNotNull(strComparableStream15);
        org.junit.Assert.assertNull(strComparable17);
    }

    @Test
    public void test3513() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3513");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream2 = strComparableDynamicArray0.stream();
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        java.lang.String str4 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
    }

    @Test
    public void test3514() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3514");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        int int7 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[]");
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableDynamicArray0.spliterator();
        java.util.Iterator iterator12 = strComparableDynamicArray0.iterator();
        int int13 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDynamicArray0.remove(1);
        int int16 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable20 = strComparableDynamicArray0.get(3);
        int int21 = strComparableDynamicArray0.getSize();
        java.lang.String str22 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertEquals("'" + strComparable15 + "' != '" + "hi!" + "'", strComparable15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNull(strComparable20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "[[], ]" + "'", str22, "[[], ]");
    }

    @Test
    public void test3515() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3515");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream4 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!]");
        java.lang.String str8 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, hi!]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream11 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator12 = strComparableDynamicArray0.iterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream13 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[hi!, [hi!]]" + "'", str8, "[hi!, [hi!]]");
        org.junit.Assert.assertNotNull(strComparableStream11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(strComparableStream13);
    }

    @Test
    public void test3516() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3516");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        java.lang.String str7 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDynamicArray0.remove((int) (byte) 0);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableDynamicArray0.spliterator();
        int int12 = strComparableDynamicArray0.getSize();
        int int13 = strComparableDynamicArray0.getSize();
        boolean boolean14 = strComparableDynamicArray0.isEmpty();
        java.lang.String str15 = strComparableDynamicArray0.toString();
        java.lang.String str16 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNull(strComparable10);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[]" + "'", str15, "[]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
    }

    @Test
    public void test3517() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3517");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        int int7 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[]");
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        java.lang.String str11 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableDynamicArray0.spliterator();
        java.lang.String str13 = strComparableDynamicArray0.toString();
        boolean boolean14 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator15 = strComparableDynamicArray0.spliterator();
        java.lang.String str16 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableDynamicArray0.get((int) (short) 0);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator19 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!, []]" + "'", str11, "[hi!, []]");
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[hi!, []]" + "'", str13, "[hi!, []]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[hi!, []]" + "'", str16, "[hi!, []]");
        org.junit.Assert.assertNull(strComparable18);
        org.junit.Assert.assertNotNull(strComparableSpliterator19);
    }

    @Test
    public void test3518() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3518");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        java.lang.String str4 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        int int9 = strComparableDynamicArray0.getSize();
        java.lang.String str10 = strComparableDynamicArray0.toString();
        int int11 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray0.get(2);
        java.lang.String str14 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[hi!]" + "'", str10, "[hi!]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[hi!]" + "'", str14, "[hi!]");
    }

    @Test
    public void test3519() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3519");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        strComparableDynamicArray1.add((java.lang.Comparable<java.lang.String>) "[, ]");
        int int4 = strComparableDynamicArray1.getSize();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableDynamicArray1.remove(1);
        java.lang.String str7 = strComparableDynamicArray1.toString();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray1.get(1);
        java.util.Iterator iterator10 = strComparableDynamicArray1.iterator();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDynamicArray1.get((int) (byte) 1);
        int int13 = strComparableDynamicArray1.getSize();
        strComparableDynamicArray1.add((java.lang.Comparable<java.lang.String>) "[hi!, hi!]");
        java.util.Iterator iterator16 = strComparableDynamicArray1.iterator();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(strComparable6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNull(strComparable9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(strComparable12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(iterator16);
    }

    @Test
    public void test3520() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3520");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) (byte) 10);
        strComparableDynamicArray1.put((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "[[hi!]]");
        java.lang.String str5 = strComparableDynamicArray1.toString();
        strComparableDynamicArray1.add((java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableDynamicArray1.getSize();
        java.lang.Class<?> wildcardClass9 = strComparableDynamicArray1.getClass();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[[[hi!]]]" + "'", str5, "[[[hi!]]]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3521() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3521");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put((int) (byte) 10, (java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream10 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator11 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertNotNull(strComparableStream10);
        org.junit.Assert.assertNotNull(iterator11);
    }

    @Test
    public void test3522() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3522");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        java.lang.String str9 = strComparableDynamicArray0.toString();
        int int10 = strComparableDynamicArray0.getSize();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream11 = strComparableDynamicArray0.stream();
        boolean boolean12 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.put(2, (java.lang.Comparable<java.lang.String>) "[, hi!, , hi!]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream16 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[[], hi!]" + "'", str9, "[[], hi!]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(strComparableStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strComparableStream16);
    }

    @Test
    public void test3523() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3523");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableDynamicArray0.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        int int9 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        int int11 = strComparableDynamicArray0.getSize();
        java.lang.String str12 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDynamicArray0.get((int) (byte) 10);
        java.util.Iterator iterator15 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableStream6);
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[hi!]" + "'", str12, "[hi!]");
        org.junit.Assert.assertNull(strComparable14);
        org.junit.Assert.assertNotNull(iterator15);
    }

    @Test
    public void test3524() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3524");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>(100);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream2 = strComparableDynamicArray1.stream();
        strComparableDynamicArray1.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray1.put(1, (java.lang.Comparable<java.lang.String>) "[[hi!]]");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray1.get(0);
        strComparableDynamicArray1.add((java.lang.Comparable<java.lang.String>) "[[[[[hi!]]], , [hi!, []], [[hi!]]], [[]]]");
        strComparableDynamicArray1.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[[hi!, [hi!]]]");
        org.junit.Assert.assertNotNull(strComparableStream2);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "" + "'", strComparable9, "");
    }

    @Test
    public void test3525() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3525");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable8 = null;
        strComparableDynamicArray0.put((int) (short) 1, strComparable8);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!]");
        boolean boolean12 = strComparableDynamicArray0.isEmpty();
        boolean boolean13 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream14 = strComparableDynamicArray0.stream();
        boolean boolean15 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [hi!, [hi!]]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strComparableStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3526() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3526");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableDynamicArray0.remove((int) (short) 0);
        java.util.Iterator iterator7 = strComparableDynamicArray0.iterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream8 = strComparableDynamicArray0.stream();
        boolean boolean9 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strComparable6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(strComparableStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3527() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3527");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator iterator11 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray0.get((int) (byte) 10);
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDynamicArray0.get(0);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream20 = strComparableDynamicArray0.stream();
        int int21 = strComparableDynamicArray0.getSize();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream22 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator23 = strComparableDynamicArray0.spliterator();
        boolean boolean24 = strComparableDynamicArray0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable26 = strComparableDynamicArray0.remove((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertNull(strComparable15);
        org.junit.Assert.assertNotNull(strComparableStream20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertNotNull(strComparableStream22);
        org.junit.Assert.assertNotNull(strComparableSpliterator23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3528() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3528");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[[], hi!, , ]]");
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream11 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(strComparableStream11);
    }

    @Test
    public void test3529() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3529");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>(0);
        java.lang.String str2 = strComparableDynamicArray1.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableDynamicArray1.spliterator();
        int int4 = strComparableDynamicArray1.getSize();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test3530() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3530");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator iterator6 = strComparableDynamicArray0.iterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray0.remove(4);
        strComparableDynamicArray0.put((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "[hi!, [], [hi!]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertNull(strComparable9);
    }

    @Test
    public void test3531() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3531");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        java.util.Iterator iterator9 = strComparableDynamicArray0.iterator();
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDynamicArray0.remove((int) (byte) 0);
        java.util.Iterator iterator13 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertEquals("'" + strComparable12 + "' != '" + "[]" + "'", strComparable12, "[]");
        org.junit.Assert.assertNotNull(iterator13);
    }

    @Test
    public void test3532() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3532");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator iterator11 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray0.get((int) (byte) 10);
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDynamicArray0.get(0);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream18 = strComparableDynamicArray0.stream();
        int int19 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable21 = strComparableDynamicArray0.remove(0);
        java.lang.Comparable<java.lang.String> strComparable23 = strComparableDynamicArray0.remove(2);
        java.lang.String str24 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertNull(strComparable15);
        org.junit.Assert.assertNotNull(strComparableStream18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertNull(strComparable21);
        org.junit.Assert.assertEquals("'" + strComparable23 + "' != '" + "[hi!]" + "'", strComparable23, "[hi!]");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "[hi!, hi!]" + "'", str24, "[hi!, hi!]");
    }

    @Test
    public void test3533() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3533");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableDynamicArray0.remove((int) (short) 0);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableDynamicArray0.spliterator();
        int int8 = strComparableDynamicArray0.getSize();
        boolean boolean9 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream10 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator11 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, [[hi!]]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strComparable6);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strComparableStream10);
        org.junit.Assert.assertNotNull(iterator11);
    }

    @Test
    public void test3534() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3534");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableDynamicArray0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray0.remove(1);
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDynamicArray0.remove(5);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[hi!, hi!]]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [hi!], [hi!, hi!], [[], hi!]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertNull(strComparable11);
    }

    @Test
    public void test3535() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3535");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!]");
        int int6 = strComparableDynamicArray0.getSize();
        int int7 = strComparableDynamicArray0.getSize();
        boolean boolean8 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator9 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
    }

    @Test
    public void test3536() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3536");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator iterator11 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray0.get((int) (byte) 10);
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDynamicArray0.get(0);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!]");
        java.util.Iterator iterator20 = strComparableDynamicArray0.iterator();
        java.util.Iterator iterator21 = strComparableDynamicArray0.iterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream22 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator23 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertNull(strComparable15);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertNotNull(strComparableStream22);
        org.junit.Assert.assertNotNull(strComparableSpliterator23);
    }

    @Test
    public void test3537() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3537");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        int int7 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        java.lang.String str9 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, []]");
        strComparableDynamicArray0.put((int) (short) 1, (java.lang.Comparable<java.lang.String>) "[[hi!, hi!, [, ], [[], hi!]]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
    }

    @Test
    public void test3538() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3538");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        int int7 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray0.remove(3);
        java.lang.String str10 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[], hi!]");
        int int13 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDynamicArray0.remove((int) (short) 1);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream16 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(strComparable9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(strComparable15);
        org.junit.Assert.assertNotNull(strComparableStream16);
    }

    @Test
    public void test3539() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3539");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        java.lang.String str5 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[]");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray0.get((int) (short) 1);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put(10, (java.lang.Comparable<java.lang.String>) "[[hi!]]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream14 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDynamicArray0.remove(4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "[]" + "'", strComparable9, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertNotNull(strComparableStream14);
        org.junit.Assert.assertNull(strComparable16);
    }

    @Test
    public void test3540() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3540");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream4 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!]");
        java.lang.String str8 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, hi!]");
        strComparableDynamicArray0.put(4, (java.lang.Comparable<java.lang.String>) "[[], hi!]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream14 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.put((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "[, ]");
        boolean boolean18 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable20 = strComparableDynamicArray0.get(5);
        java.util.Iterator iterator21 = strComparableDynamicArray0.iterator();
        java.util.Iterator iterator22 = strComparableDynamicArray0.iterator();
        int int23 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[hi!, [hi!]]" + "'", str8, "[hi!, [hi!]]");
        org.junit.Assert.assertNotNull(strComparableStream14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(strComparable20);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 3 + "'", int23 == 3);
    }

    @Test
    public void test3541() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3541");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator2 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableDynamicArray0.spliterator();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator5 = strComparableDynamicArray0.iterator();
        java.lang.String str6 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
    }

    @Test
    public void test3542() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3542");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator iterator11 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean16 = strComparableDynamicArray0.isEmpty();
        java.lang.String str17 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable19 = strComparableDynamicArray0.remove((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[hi!, hi!, , hi!]" + "'", str17, "[hi!, hi!, , hi!]");
        org.junit.Assert.assertEquals("'" + strComparable19 + "' != '" + "hi!" + "'", strComparable19, "hi!");
    }

    @Test
    public void test3543() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3543");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDynamicArray0.get(0);
        java.util.Iterator iterator13 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDynamicArray0.get(2);
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableDynamicArray0.get(1);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, []]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(strComparable12);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNull(strComparable15);
        org.junit.Assert.assertEquals("'" + strComparable17 + "' != '" + "hi!" + "'", strComparable17, "hi!");
    }

    @Test
    public void test3544() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3544");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) (byte) 10);
        strComparableDynamicArray1.put((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "[[hi!]]");
        java.lang.String str5 = strComparableDynamicArray1.toString();
        java.lang.String str6 = strComparableDynamicArray1.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray1.get(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[[[hi!]]]" + "'", str5, "[[[hi!]]]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[[[hi!]]]" + "'", str6, "[[[hi!]]]");
    }

    @Test
    public void test3545() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3545");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        int int6 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, ]");
        int int9 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDynamicArray0.get(0);
        strComparableDynamicArray0.put(0, (java.lang.Comparable<java.lang.String>) "[[hi!, hi!, [hi!]]]");
        java.util.Iterator iterator16 = strComparableDynamicArray0.iterator();
        java.lang.String str17 = strComparableDynamicArray0.toString();
        boolean boolean18 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator19 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(strComparable12);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[[[hi!, hi!, [hi!]]], [, ]]" + "'", str17, "[[[hi!, hi!, [hi!]]], [, ]]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator19);
    }

    @Test
    public void test3546() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3546");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableDynamicArray0.get(4);
        java.util.Iterator iterator5 = strComparableDynamicArray0.iterator();
        int int6 = strComparableDynamicArray0.getSize();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableDynamicArray0.stream();
        boolean boolean8 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[], hi!]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream11 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, ]");
        org.junit.Assert.assertNull(strComparable4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strComparableStream11);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
    }

    @Test
    public void test3547() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3547");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator6 = strComparableDynamicArray0.iterator();
        java.util.Iterator iterator7 = strComparableDynamicArray0.iterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream8 = strComparableDynamicArray0.stream();
        java.lang.String str9 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.put((int) (byte) 10, (java.lang.Comparable<java.lang.String>) "[hi!, hi!, [hi!], [hi!]]");
        java.util.Iterator iterator13 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(strComparableStream8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(iterator13);
    }

    @Test
    public void test3548() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3548");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        java.lang.String str4 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream8 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableDynamicArray0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDynamicArray0.remove((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strComparableStream8);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertNull(strComparable11);
    }

    @Test
    public void test3549() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3549");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        java.lang.String str5 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray0.remove((int) (short) 10);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        boolean boolean9 = strComparableDynamicArray0.isEmpty();
        boolean boolean10 = strComparableDynamicArray0.isEmpty();
        int int11 = strComparableDynamicArray0.getSize();
        int int12 = strComparableDynamicArray0.getSize();
        int int13 = strComparableDynamicArray0.getSize();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream14 = strComparableDynamicArray0.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream15 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strComparableStream14);
        org.junit.Assert.assertNotNull(strComparableStream15);
    }

    @Test
    public void test3550() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3550");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[]");
        int int8 = strComparableDynamicArray0.getSize();
        java.lang.String str9 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream11 = strComparableDynamicArray0.stream();
        java.lang.String str12 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[[], hi!]" + "'", str9, "[[], hi!]");
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertNotNull(strComparableStream11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[[], hi!]" + "'", str12, "[[], hi!]");
    }

    @Test
    public void test3551() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3551");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator iterator6 = strComparableDynamicArray0.iterator();
        java.lang.String str7 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray0.get((int) (short) 0);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableDynamicArray0.spliterator();
        java.util.Iterator iterator11 = strComparableDynamicArray0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray0.get((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[hi!]" + "'", str7, "[hi!]");
        org.junit.Assert.assertNull(strComparable9);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertNotNull(iterator11);
    }

    @Test
    public void test3552() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3552");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>(100);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream2 = strComparableDynamicArray1.stream();
        java.lang.String str3 = strComparableDynamicArray1.toString();
        java.lang.Class<?> wildcardClass4 = strComparableDynamicArray1.getClass();
        org.junit.Assert.assertNotNull(strComparableStream2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3553() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3553");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str11 = strComparableDynamicArray0.toString();
        boolean boolean12 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator13 = strComparableDynamicArray0.iterator();
        int int14 = strComparableDynamicArray0.getSize();
        boolean boolean15 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[, ]" + "'", str11, "[, ]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3554() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3554");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        java.lang.String str4 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        boolean boolean10 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3555() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3555");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream5 = strComparableDynamicArray0.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.put((int) (short) 1, (java.lang.Comparable<java.lang.String>) "[[hi!]]");
        org.junit.Assert.assertNotNull(strComparableStream5);
        org.junit.Assert.assertNotNull(strComparableStream6);
    }

    @Test
    public void test3556() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3556");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream3 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!]");
        java.lang.String str9 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertNotNull(strComparableStream3);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[[hi!]]" + "'", str9, "[[hi!]]");
    }

    @Test
    public void test3557() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3557");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator2 = strComparableDynamicArray0.iterator();
        java.lang.String str3 = strComparableDynamicArray0.toString();
        java.lang.String str4 = strComparableDynamicArray0.toString();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray0.remove((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3558() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3558");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        int int10 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[hi!]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream14 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator15 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[], hi!, [hi!, hi!, [hi!], [hi!]]]");
        java.lang.Comparable<java.lang.String> strComparable19 = strComparableDynamicArray0.remove(10);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator20 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream21 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(strComparableStream14);
        org.junit.Assert.assertNotNull(strComparableSpliterator15);
        org.junit.Assert.assertNull(strComparable19);
        org.junit.Assert.assertNotNull(strComparableSpliterator20);
        org.junit.Assert.assertNotNull(strComparableStream21);
    }

    @Test
    public void test3559() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3559");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        java.lang.String str4 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, []]");
        int int9 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableDynamicArray0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableDynamicArray0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[hi!, []]]");
        java.lang.Class<?> wildcardClass15 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3560() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3560");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        int int7 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[]");
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        java.lang.String str11 = strComparableDynamicArray0.toString();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream12 = strComparableDynamicArray0.stream();
        int int13 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDynamicArray0.remove((int) (byte) 1);
        boolean boolean16 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[[hi!]]]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator19 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!, []]" + "'", str11, "[hi!, []]");
        org.junit.Assert.assertNotNull(strComparableStream12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertEquals("'" + strComparable15 + "' != '" + "hi!" + "'", strComparable15, "hi!");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator19);
    }

    @Test
    public void test3561() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3561");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        strComparableDynamicArray0.put(0, (java.lang.Comparable<java.lang.String>) "[[], hi!, [[hi!]]]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableDynamicArray0.spliterator();
        java.util.Iterator iterator13 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertNotNull(iterator13);
    }

    @Test
    public void test3562() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3562");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.put(3, (java.lang.Comparable<java.lang.String>) "[hi!, []]");
        int int12 = strComparableDynamicArray0.getSize();
        int int13 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test3563() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3563");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.put(2, (java.lang.Comparable<java.lang.String>) "[[], hi!, [[hi!]]]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[hi!, hi!]]");
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(iterator10);
    }

    @Test
    public void test3564() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3564");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        int int5 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator6 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream8 = strComparableDynamicArray0.stream();
        boolean boolean9 = strComparableDynamicArray0.isEmpty();
        boolean boolean10 = strComparableDynamicArray0.isEmpty();
        boolean boolean11 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertNotNull(strComparableStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test3565() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3565");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        int int10 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[hi!]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream14 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator15 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(strComparableStream14);
        org.junit.Assert.assertNotNull(iterator15);
    }

    @Test
    public void test3566() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3566");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!]");
        int int6 = strComparableDynamicArray0.getSize();
        int int7 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        strComparableDynamicArray0.put((int) (short) 1, strComparable9);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream11 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(strComparableStream11);
    }

    @Test
    public void test3567() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3567");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableDynamicArray0.spliterator();
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDynamicArray0.remove(10);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableDynamicArray0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put(0, (java.lang.Comparable<java.lang.String>) "[[[hi!, [hi!]]], [[[[hi!]]], , [hi!, []], [[hi!]]]]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream16 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNull(strComparable10);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertNotNull(strComparableStream16);
    }

    @Test
    public void test3568() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3568");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator iterator11 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray0.get((int) (byte) 10);
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDynamicArray0.get(0);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream20 = strComparableDynamicArray0.stream();
        int int21 = strComparableDynamicArray0.getSize();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream22 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.put(0, (java.lang.Comparable<java.lang.String>) "[[], [hi!, hi!, [hi!], [hi!]]]");
        java.lang.String str26 = strComparableDynamicArray0.toString();
        boolean boolean27 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertNull(strComparable15);
        org.junit.Assert.assertNotNull(strComparableStream20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 5 + "'", int21 == 5);
        org.junit.Assert.assertNotNull(strComparableStream22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "[[[], [hi!, hi!, [hi!], [hi!]]], hi!, hi!, [hi!], [hi!]]" + "'", str26, "[[[], [hi!, hi!, [hi!], [hi!]]], hi!, hi!, [hi!], [hi!]]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test3569() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3569");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator iterator11 = strComparableDynamicArray0.iterator();
        int int12 = strComparableDynamicArray0.getSize();
        int int13 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test3570() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3570");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        boolean boolean2 = strComparableDynamicArray1.isEmpty();
        java.util.Iterator iterator3 = strComparableDynamicArray1.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable5 = strComparableDynamicArray1.remove((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(iterator3);
    }

    @Test
    public void test3571() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3571");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream3 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, []]");
        int int7 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray0.remove(10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertNotNull(strComparableStream3);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(strComparable9);
    }

    @Test
    public void test3572() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3572");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        java.lang.String str7 = strComparableDynamicArray0.toString();
        boolean boolean8 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableDynamicArray0.spliterator();
        boolean boolean10 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3573() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3573");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put((int) (byte) 10, (java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDynamicArray0.remove(0);
        int int11 = strComparableDynamicArray0.getSize();
        boolean boolean12 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable13 = null;
        strComparableDynamicArray0.add(strComparable13);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [hi!, []]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNull(strComparable10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3574() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3574");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        java.lang.String str4 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, []]");
        strComparableDynamicArray0.put((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "[[[hi!]]]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[hi!]]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator17 = strComparableDynamicArray0.spliterator();
        java.lang.String str18 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream21 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
        org.junit.Assert.assertNotNull(strComparableSpliterator17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[[[[hi!]]], , [hi!, []], [[hi!]]]" + "'", str18, "[[[[hi!]]], , [hi!, []], [[hi!]]]");
        org.junit.Assert.assertNotNull(strComparableStream21);
    }

    @Test
    public void test3575() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3575");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator iterator11 = strComparableDynamicArray0.iterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream12 = strComparableDynamicArray0.stream();
        boolean boolean13 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator14 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDynamicArray0.get(3);
        int int17 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(strComparableStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNull(strComparable16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
    }

    @Test
    public void test3576() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3576");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator2 = strComparableDynamicArray0.iterator();
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "[, ]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        boolean boolean9 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3577() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3577");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.util.Iterator> iteratorDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.util.Iterator>((int) (byte) 10);
    }

    @Test
    public void test3578() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3578");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        boolean boolean11 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put((int) (short) 10, (java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream16 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[hi!, [hi!, []]]");
        java.lang.Comparable<java.lang.String> strComparable21 = strComparableDynamicArray0.get(1);
        int int22 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertNotNull(strComparableStream16);
        org.junit.Assert.assertEquals("'" + strComparable21 + "' != '" + "hi!" + "'", strComparable21, "hi!");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
    }

    @Test
    public void test3579() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3579");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableDynamicArray0.get(5);
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[, [[hi!]]]");
        org.junit.Assert.assertNull(strComparable4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test3580() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3580");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream4 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!]");
        java.lang.String str8 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, hi!]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream11 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator12 = strComparableDynamicArray0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable14 = strComparableDynamicArray0.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[hi!, [hi!]]" + "'", str8, "[hi!, [hi!]]");
        org.junit.Assert.assertNotNull(strComparableStream11);
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test3581() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3581");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        boolean boolean11 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray0.get((int) (byte) 0);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableDynamicArray0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDynamicArray0.remove(0);
        boolean boolean17 = strComparableDynamicArray0.isEmpty();
        boolean boolean18 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable20 = strComparableDynamicArray0.remove(0);
        strComparableDynamicArray0.put((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "[[[hi!]]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
        org.junit.Assert.assertNull(strComparable16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertEquals("'" + strComparable20 + "' != '" + "hi!" + "'", strComparable20, "hi!");
    }

    @Test
    public void test3582() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3582");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream3 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDynamicArray0.get((int) (short) 0);
        java.lang.String str6 = strComparableDynamicArray0.toString();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray0.get(0);
        org.junit.Assert.assertNotNull(strComparableStream3);
        org.junit.Assert.assertEquals("'" + strComparable5 + "' != '" + "" + "'", strComparable5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[]" + "'", str6, "[]");
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "" + "'", strComparable9, "");
    }

    @Test
    public void test3583() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3583");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        int int7 = strComparableDynamicArray0.getSize();
        boolean boolean8 = strComparableDynamicArray0.isEmpty();
        boolean boolean9 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableDynamicArray0.add(strComparable10);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream12 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator13 = strComparableDynamicArray0.spliterator();
        boolean boolean14 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDynamicArray0.remove(2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strComparableStream12);
        org.junit.Assert.assertNotNull(strComparableSpliterator13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(strComparable16);
    }

    @Test
    public void test3584() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3584");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        int int7 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[]");
        java.lang.String str10 = strComparableDynamicArray0.toString();
        java.lang.String str11 = strComparableDynamicArray0.toString();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream12 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!]");
        int int15 = strComparableDynamicArray0.getSize();
        java.lang.String str16 = strComparableDynamicArray0.toString();
        int int17 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[hi!, []]" + "'", str10, "[hi!, []]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!, []]" + "'", str11, "[hi!, []]");
        org.junit.Assert.assertNotNull(strComparableStream12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[hi!, [], [hi!]]" + "'", str16, "[hi!, [], [hi!]]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test3585() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3585");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable8 = null;
        strComparableDynamicArray0.put((int) (short) 1, strComparable8);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!]");
        boolean boolean12 = strComparableDynamicArray0.isEmpty();
        boolean boolean13 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream14 = strComparableDynamicArray0.stream();
        boolean boolean15 = strComparableDynamicArray0.isEmpty();
        int int16 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.put((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "[, [hi!]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strComparableStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test3586() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3586");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.put(0, (java.lang.Comparable<java.lang.String>) "[hi!]");
        java.util.Iterator iterator7 = strComparableDynamicArray0.iterator();
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableDynamicArray0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDynamicArray0.get((int) (short) 0);
        java.lang.String str12 = strComparableDynamicArray0.toString();
        java.util.Iterator iterator13 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "[hi!]" + "'", strComparable11, "[hi!]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[[hi!]]" + "'", str12, "[[hi!]]");
        org.junit.Assert.assertNotNull(iterator13);
    }

    @Test
    public void test3587() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3587");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>(100);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream2 = strComparableDynamicArray1.stream();
        java.lang.String str3 = strComparableDynamicArray1.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray1.spliterator();
        org.junit.Assert.assertNotNull(strComparableStream2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
    }

    @Test
    public void test3588() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3588");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) '4');
        java.util.Iterator iterator2 = strComparableDynamicArray1.iterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream3 = strComparableDynamicArray1.stream();
        int int4 = strComparableDynamicArray1.getSize();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream5 = strComparableDynamicArray1.stream();
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(strComparableStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(strComparableStream5);
    }

    @Test
    public void test3589() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3589");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str4 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[hi!, hi!]]");
        java.lang.Class<?> wildcardClass7 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[hi!]" + "'", str4, "[hi!]");
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3590() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3590");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        int int10 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[hi!]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[hi!]]");
        int int16 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableDynamicArray0.get((int) (short) 10);
        java.util.Iterator iterator19 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNull(strComparable18);
        org.junit.Assert.assertNotNull(iterator19);
    }

    @Test
    public void test3591() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3591");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDynamicArray0.get(0);
        java.util.Iterator iterator13 = strComparableDynamicArray0.iterator();
        int int14 = strComparableDynamicArray0.getSize();
        java.lang.String str15 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, hi!]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream18 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable19 = null;
        strComparableDynamicArray0.add(strComparable19);
        boolean boolean21 = strComparableDynamicArray0.isEmpty();
        int int22 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator23 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator24 = strComparableDynamicArray0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable26 = strComparableDynamicArray0.get((int) (short) 0);
        java.lang.Comparable<java.lang.String> strComparable28 = strComparableDynamicArray0.remove(0);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[[[[hi!]]], , [hi!, []], [[hi!]]]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(strComparable12);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[hi!]" + "'", str15, "[hi!]");
        org.junit.Assert.assertNotNull(strComparableStream18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertNotNull(strComparableSpliterator24);
        org.junit.Assert.assertNull(strComparable26);
        org.junit.Assert.assertNull(strComparable28);
    }

    @Test
    public void test3592() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3592");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream2 = strComparableDynamicArray0.stream();
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDynamicArray0.get((int) (byte) 1);
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray0.get((int) (short) 10);
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        java.util.Iterator iterator9 = strComparableDynamicArray0.iterator();
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(iterator10);
    }

    @Test
    public void test3593() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3593");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        int int6 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, ]");
        int int9 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDynamicArray0.get(0);
        strComparableDynamicArray0.put(0, (java.lang.Comparable<java.lang.String>) "[[hi!, hi!, [hi!]]]");
        int int16 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(strComparable12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test3594() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3594");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator iterator11 = strComparableDynamicArray0.iterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream12 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDynamicArray0.get(2);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, [hi!]]");
        boolean boolean17 = strComparableDynamicArray0.isEmpty();
        java.lang.String str18 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(strComparableStream12);
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "hi!" + "'", strComparable14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[hi!, hi!, [, [hi!]]]" + "'", str18, "[hi!, hi!, [, [hi!]]]");
    }

    @Test
    public void test3595() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3595");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator iterator11 = strComparableDynamicArray0.iterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream12 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDynamicArray0.get(2);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream15 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[hi!]]");
        java.util.Iterator iterator18 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable20 = strComparableDynamicArray0.get((int) (byte) 1);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, hi!, , hi!]");
        // The following exception was thrown during execution in test generation
        try {
            strComparableDynamicArray0.put((int) 'a', (java.lang.Comparable<java.lang.String>) "[[[[[hi!]]], , [hi!, []], [[hi!]]]]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(strComparableStream12);
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "hi!" + "'", strComparable14, "hi!");
        org.junit.Assert.assertNotNull(strComparableStream15);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertEquals("'" + strComparable20 + "' != '" + "hi!" + "'", strComparable20, "hi!");
    }

    @Test
    public void test3596() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3596");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableDynamicArray0.remove((int) (short) 0);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableDynamicArray0.spliterator();
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, []]");
        java.lang.String str11 = strComparableDynamicArray0.toString();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream12 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator13 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [hi!]]");
        java.lang.String str16 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strComparable6);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[[hi!, []]]" + "'", str11, "[[hi!, []]]");
        org.junit.Assert.assertNotNull(strComparableStream12);
        org.junit.Assert.assertNotNull(strComparableSpliterator13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[[hi!, []], [hi!, [hi!]]]" + "'", str16, "[[hi!, []], [hi!, [hi!]]]");
    }

    @Test
    public void test3597() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3597");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, ]");
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDynamicArray0.remove(10);
        int int13 = strComparableDynamicArray0.getSize();
        java.lang.String str14 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator15 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[[[hi!]]], , [hi!, []], [[hi!]]]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable19 = strComparableDynamicArray0.get((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strComparable12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator15);
    }

    @Test
    public void test3598() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3598");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        boolean boolean11 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator12 = strComparableDynamicArray0.iterator();
        java.lang.String str13 = strComparableDynamicArray0.toString();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream14 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, hi!, [[], hi!]]");
        strComparableDynamicArray0.put(10, (java.lang.Comparable<java.lang.String>) "[[[hi!, hi!, [hi!], [hi!]], ]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[hi!]" + "'", str13, "[hi!]");
        org.junit.Assert.assertNotNull(strComparableStream14);
    }

    @Test
    public void test3599() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3599");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.String> strDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.String>((int) (byte) 1);
    }

    @Test
    public void test3600() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3600");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, ]");
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDynamicArray0.remove(10);
        int int13 = strComparableDynamicArray0.getSize();
        java.lang.String str14 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator15 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[[[hi!]]], , [hi!, []], [[hi!]]]");
        strComparableDynamicArray0.put(5, (java.lang.Comparable<java.lang.String>) "[hi!, hi!, [, ], [[], hi!]]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator21 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strComparable12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator15);
        org.junit.Assert.assertNotNull(strComparableSpliterator21);
    }

    @Test
    public void test3601() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3601");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        java.lang.String str4 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[[hi!, [hi!]]], [[[[hi!]]], , [hi!, []], [[hi!]]]]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
    }

    @Test
    public void test3602() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3602");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        java.lang.String str4 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        java.util.Iterator iterator6 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get(10);
        java.lang.String str9 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, ]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream12 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, hi!, [hi!], [hi!]]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream15 = strComparableDynamicArray0.stream();
        java.lang.String str16 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableDynamicArray0.get(0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(strComparableStream12);
        org.junit.Assert.assertNotNull(strComparableStream15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[[, ], [hi!, hi!, [hi!], [hi!]]]" + "'", str16, "[[, ], [hi!, hi!, [hi!], [hi!]]]");
        org.junit.Assert.assertNull(strComparable18);
    }

    @Test
    public void test3603() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3603");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>(100);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableDynamicArray1.spliterator();
        java.util.Iterator iterator3 = strComparableDynamicArray1.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray1.spliterator();
        int int5 = strComparableDynamicArray1.getSize();
        strComparableDynamicArray1.put((int) '4', (java.lang.Comparable<java.lang.String>) "[, [hi!, []]]");
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3604() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3604");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        int int7 = strComparableDynamicArray0.getSize();
        boolean boolean8 = strComparableDynamicArray0.isEmpty();
        boolean boolean9 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDynamicArray0.get(0);
        int int12 = strComparableDynamicArray0.getSize();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream13 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strComparable11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(strComparableStream13);
    }

    @Test
    public void test3605() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3605");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[hi!]]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[hi!]]");
        java.util.Iterator iterator12 = strComparableDynamicArray0.iterator();
        java.util.Iterator iterator13 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(iterator13);
    }

    @Test
    public void test3606() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3606");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator iterator6 = strComparableDynamicArray0.iterator();
        java.lang.String str7 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray0.get((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableDynamicArray0.get((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[hi!]" + "'", str7, "[hi!]");
        org.junit.Assert.assertNull(strComparable9);
    }

    @Test
    public void test3607() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3607");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[, []]]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[hi!, []], hi!, ]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
    }

    @Test
    public void test3608() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3608");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        int int7 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, hi!, [hi!]]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable12 = strComparableDynamicArray0.remove((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(iterator8);
    }

    @Test
    public void test3609() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3609");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        java.lang.String str9 = strComparableDynamicArray0.toString();
        int int10 = strComparableDynamicArray0.getSize();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream11 = strComparableDynamicArray0.stream();
        boolean boolean12 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.put(2, (java.lang.Comparable<java.lang.String>) "[, hi!, , hi!]");
        strComparableDynamicArray0.put(4, (java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator19 = strComparableDynamicArray0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator20 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[[], hi!]" + "'", str9, "[[], hi!]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(strComparableStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator19);
        org.junit.Assert.assertNotNull(strComparableSpliterator20);
    }

    @Test
    public void test3610() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3610");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        strComparableDynamicArray1.add((java.lang.Comparable<java.lang.String>) "[, ]");
        int int4 = strComparableDynamicArray1.getSize();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableDynamicArray1.remove(1);
        java.lang.String str7 = strComparableDynamicArray1.toString();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray1.get(1);
        java.util.Iterator iterator10 = strComparableDynamicArray1.iterator();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDynamicArray1.get((int) (byte) 1);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator13 = strComparableDynamicArray1.spliterator();
        strComparableDynamicArray1.add((java.lang.Comparable<java.lang.String>) "[[], hi!, [[hi!]]]");
        boolean boolean16 = strComparableDynamicArray1.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable18 = strComparableDynamicArray1.remove((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(strComparable6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNull(strComparable9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(strComparable12);
        org.junit.Assert.assertNotNull(strComparableSpliterator13);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3611() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3611");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[hi!]]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[hi!]]");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray0.remove((int) (byte) 10);
        java.lang.Class<?> wildcardClass14 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertNotNull(wildcardClass14);
    }

    @Test
    public void test3612() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3612");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableDynamicArray0.remove((int) (short) 0);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableDynamicArray0.spliterator();
        int int8 = strComparableDynamicArray0.getSize();
        boolean boolean9 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream10 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDynamicArray0.get((int) (byte) 0);
        int int13 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, hi!]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream16 = strComparableDynamicArray0.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream17 = strComparableDynamicArray0.stream();
        boolean boolean18 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strComparable6);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strComparableStream10);
        org.junit.Assert.assertNull(strComparable12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strComparableStream16);
        org.junit.Assert.assertNotNull(strComparableStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test3613() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3613");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator iterator11 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.put((int) (short) 10, (java.lang.Comparable<java.lang.String>) "[[], hi!]");
        boolean boolean15 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableDynamicArray0.remove((int) (short) 0);
        java.lang.String str18 = strComparableDynamicArray0.toString();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream19 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator20 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(strComparable17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[hi!, hi!, [[], hi!]]" + "'", str18, "[hi!, hi!, [[], hi!]]");
        org.junit.Assert.assertNotNull(strComparableStream19);
        org.junit.Assert.assertNotNull(iterator20);
    }

    @Test
    public void test3614() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3614");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[[[hi!]]], , [hi!, []], [[hi!]]]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream6);
    }

    @Test
    public void test3615() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3615");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream4 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!]");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray0.remove((int) (short) 1);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray0.remove((int) (short) 0);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableDynamicArray0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator15 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "[[[[[hi!]]], , [hi!, []], [[hi!]]], [[]]]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream19 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "[hi!]" + "'", strComparable9, "[hi!]");
        org.junit.Assert.assertEquals("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13, "hi!");
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
        org.junit.Assert.assertNotNull(strComparableSpliterator15);
        org.junit.Assert.assertNotNull(strComparableStream19);
    }

    @Test
    public void test3616() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3616");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream4 = strComparableDynamicArray0.stream();
        int int5 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray0.remove((int) (byte) 10);
        java.lang.String str8 = strComparableDynamicArray0.toString();
        java.lang.String str9 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDynamicArray0.get(0);
        java.util.Iterator iterator12 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNull(strComparable11);
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test3617() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3617");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>(100);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream2 = strComparableDynamicArray1.stream();
        strComparableDynamicArray1.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray1.put(1, (java.lang.Comparable<java.lang.String>) "[[hi!]]");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray1.get(0);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableDynamicArray1.spliterator();
        java.lang.Class<?> wildcardClass11 = strComparableDynamicArray1.getClass();
        org.junit.Assert.assertNotNull(strComparableStream2);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "" + "'", strComparable9, "");
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3618() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3618");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>(0);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableDynamicArray1.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream3 = strComparableDynamicArray1.stream();
        java.lang.String str4 = strComparableDynamicArray1.toString();
        java.lang.Comparable<java.lang.String> strComparable5 = null;
        // The following exception was thrown during execution in test generation
        try {
            strComparableDynamicArray1.add(strComparable5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertNotNull(strComparableStream3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
    }

    @Test
    public void test3619() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3619");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        java.lang.String str5 = strComparableDynamicArray0.toString();
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get(2);
        int int9 = strComparableDynamicArray0.getSize();
        boolean boolean10 = strComparableDynamicArray0.isEmpty();
        int int11 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test3620() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3620");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream4 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!]");
        java.lang.String str8 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, hi!]");
        strComparableDynamicArray0.put(4, (java.lang.Comparable<java.lang.String>) "[[], hi!]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream14 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.put((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "[, ]");
        boolean boolean18 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable20 = strComparableDynamicArray0.get(5);
        java.util.Iterator iterator21 = strComparableDynamicArray0.iterator();
        java.util.Iterator iterator22 = strComparableDynamicArray0.iterator();
        java.lang.String str23 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable25 = strComparableDynamicArray0.remove(10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[hi!, [hi!]]" + "'", str8, "[hi!, [hi!]]");
        org.junit.Assert.assertNotNull(strComparableStream14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(strComparable20);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "[[, ], [hi!], [hi!, hi!], [[], hi!]]" + "'", str23, "[[, ], [hi!], [hi!, hi!], [[], hi!]]");
        org.junit.Assert.assertNull(strComparable25);
    }

    @Test
    public void test3621() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3621");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>(0);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableDynamicArray1.spliterator();
        int int3 = strComparableDynamicArray1.getSize();
        java.util.Iterator iterator4 = strComparableDynamicArray1.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray1.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableDynamicArray1.stream();
        java.util.Iterator iterator7 = strComparableDynamicArray1.iterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream8 = strComparableDynamicArray1.stream();
        boolean boolean9 = strComparableDynamicArray1.isEmpty();
        java.util.Iterator iterator10 = strComparableDynamicArray1.iterator();
        java.util.Iterator iterator11 = strComparableDynamicArray1.iterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(iterator4);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNotNull(strComparableStream6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(strComparableStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(iterator11);
    }

    @Test
    public void test3622() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3622");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        java.lang.String str4 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, []]");
        strComparableDynamicArray0.put((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "[[[hi!]]]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[hi!]]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator17 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put(10, (java.lang.Comparable<java.lang.String>) "[hi!, , []]");
        boolean boolean21 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator22 = strComparableDynamicArray0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator23 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
        org.junit.Assert.assertNotNull(strComparableSpliterator17);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator22);
        org.junit.Assert.assertNotNull(strComparableSpliterator23);
    }

    @Test
    public void test3623() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3623");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableDynamicArray0.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableDynamicArray0.stream();
        int int8 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator9 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDynamicArray0.remove((int) (byte) 10);
        java.lang.String str12 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[[[hi!]]]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableStream6);
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNull(strComparable11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
    }

    @Test
    public void test3624() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3624");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableDynamicArray0.isEmpty();
        java.lang.String str10 = strComparableDynamicArray0.toString();
        java.lang.String str11 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, hi!]");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDynamicArray0.get((int) (short) 1);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream16 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertEquals("'" + strComparable15 + "' != '" + "" + "'", strComparable15, "");
        org.junit.Assert.assertNotNull(strComparableStream16);
    }

    @Test
    public void test3625() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3625");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put(10, (java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream13 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        int int16 = strComparableDynamicArray0.getSize();
        java.lang.String str17 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable19 = strComparableDynamicArray0.get((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            strComparableDynamicArray0.put((int) '#', (java.lang.Comparable<java.lang.String>) "[hi!, hi!, [[], hi!]]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strComparableStream13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[[], hi!, , ]" + "'", str17, "[[], hi!, , ]");
        org.junit.Assert.assertEquals("'" + strComparable19 + "' != '" + "hi!" + "'", strComparable19, "hi!");
    }

    @Test
    public void test3626() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3626");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream2 = strComparableDynamicArray0.stream();
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDynamicArray0.get((int) (byte) 1);
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray0.get((int) (short) 10);
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        java.lang.String str9 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
    }

    @Test
    public void test3627() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3627");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        int int7 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[]");
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        java.lang.String str11 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableDynamicArray0.spliterator();
        java.lang.String str13 = strComparableDynamicArray0.toString();
        boolean boolean14 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator15 = strComparableDynamicArray0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator16 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!, []]" + "'", str11, "[hi!, []]");
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[hi!, []]" + "'", str13, "[hi!, []]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator15);
        org.junit.Assert.assertNotNull(strComparableSpliterator16);
    }

    @Test
    public void test3628() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3628");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        int int7 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[]");
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableDynamicArray0.spliterator();
        java.util.Iterator iterator12 = strComparableDynamicArray0.iterator();
        int int13 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDynamicArray0.remove(1);
        int int16 = strComparableDynamicArray0.getSize();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream17 = strComparableDynamicArray0.stream();
        boolean boolean18 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator19 = strComparableDynamicArray0.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable21 = strComparableDynamicArray0.remove((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertEquals("'" + strComparable15 + "' != '" + "hi!" + "'", strComparable15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(strComparableStream17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator19);
    }

    @Test
    public void test3629() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3629");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        java.lang.String str7 = strComparableDynamicArray0.toString();
        boolean boolean8 = strComparableDynamicArray0.isEmpty();
        boolean boolean9 = strComparableDynamicArray0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            strComparableDynamicArray0.put((int) '4', (java.lang.Comparable<java.lang.String>) "[hi!, [], , [[, ], [hi!], [hi!, hi!], [[], hi!]]]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3630() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3630");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream11 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator12 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator13 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator iterator16 = strComparableDynamicArray0.iterator();
        int int17 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableStream11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(strComparableSpliterator13);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
    }

    @Test
    public void test3631() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3631");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        int int11 = strComparableDynamicArray0.getSize();
        java.lang.String str12 = strComparableDynamicArray0.toString();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream13 = strComparableDynamicArray0.stream();
        int int14 = strComparableDynamicArray0.getSize();
        int int15 = strComparableDynamicArray0.getSize();
        int int16 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[hi!]" + "'", str12, "[hi!]");
        org.junit.Assert.assertNotNull(strComparableStream13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test3632() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3632");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        strComparableDynamicArray1.add((java.lang.Comparable<java.lang.String>) "[[[hi!, [hi!]]], ]");
    }

    @Test
    public void test3633() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3633");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        int int7 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray0.remove(3);
        java.lang.String str10 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDynamicArray0.get((int) (byte) 10);
        boolean boolean13 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(strComparable9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNull(strComparable12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3634() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3634");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream4 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!]");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray0.remove((int) (short) 1);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray0.remove((int) (short) 0);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableDynamicArray0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator15 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "[[[[[hi!]]], , [hi!, []], [[hi!]]], [[]]]");
        int int19 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "[hi!]" + "'", strComparable9, "[hi!]");
        org.junit.Assert.assertEquals("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13, "hi!");
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
        org.junit.Assert.assertNotNull(strComparableSpliterator15);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test3635() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3635");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        int int11 = strComparableDynamicArray0.getSize();
        java.lang.String str12 = strComparableDynamicArray0.toString();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream13 = strComparableDynamicArray0.stream();
        int int14 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[], [hi!, hi!, [hi!], [hi!]]]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator17 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream18 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable20 = strComparableDynamicArray0.get(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[hi!]" + "'", str12, "[hi!]");
        org.junit.Assert.assertNotNull(strComparableStream13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator17);
        org.junit.Assert.assertNotNull(strComparableStream18);
        org.junit.Assert.assertNull(strComparable20);
    }

    @Test
    public void test3636() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3636");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put((int) (byte) 10, (java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        java.lang.String str9 = strComparableDynamicArray0.toString();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream10 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[hi!]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(strComparableStream10);
    }

    @Test
    public void test3637() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3637");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put(0, (java.lang.Comparable<java.lang.String>) "[hi!, hi!, [hi!], [hi!]]");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDynamicArray0.get(3);
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDynamicArray0.get((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertNull(strComparable14);
        org.junit.Assert.assertEquals("'" + strComparable16 + "' != '" + "[hi!, hi!, [hi!], [hi!]]" + "'", strComparable16, "[hi!, hi!, [hi!], [hi!]]");
    }

    @Test
    public void test3638() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3638");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableDynamicArray0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray0.remove(1);
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDynamicArray0.get(2);
        boolean boolean12 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDynamicArray0.remove((int) (byte) 1);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator15 = strComparableDynamicArray0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator16 = strComparableDynamicArray0.spliterator();
        boolean boolean17 = strComparableDynamicArray0.isEmpty();
        boolean boolean18 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator19 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertNull(strComparable11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(strComparable14);
        org.junit.Assert.assertNotNull(strComparableSpliterator15);
        org.junit.Assert.assertNotNull(strComparableSpliterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator19);
    }

    @Test
    public void test3639() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3639");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        int int10 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[hi!]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[hi!]]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream16 = strComparableDynamicArray0.stream();
        java.lang.String str17 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(strComparableStream16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[[hi!], hi!, [[hi!]]]" + "'", str17, "[[hi!], hi!, [[hi!]]]");
    }

    @Test
    public void test3640() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3640");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.lang.String str2 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable3 = null;
        strComparableDynamicArray0.add(strComparable3);
        java.util.Iterator iterator5 = strComparableDynamicArray0.iterator();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator7 = strComparableDynamicArray0.iterator();
        java.lang.String str8 = strComparableDynamicArray0.toString();
        java.lang.Class<?> wildcardClass9 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "[]" + "'", str2, "[]");
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3641() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3641");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator iterator11 = strComparableDynamicArray0.iterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream12 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDynamicArray0.get(2);
        boolean boolean15 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[hi!, hi!, [hi!]]]");
        java.util.Iterator iterator18 = strComparableDynamicArray0.iterator();
        boolean boolean19 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(strComparableStream12);
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "hi!" + "'", strComparable14, "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3642() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3642");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        java.lang.String str4 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        int int9 = strComparableDynamicArray0.getSize();
        java.lang.String str10 = strComparableDynamicArray0.toString();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream11 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[hi!]" + "'", str10, "[hi!]");
        org.junit.Assert.assertNotNull(strComparableStream11);
    }

    @Test
    public void test3643() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3643");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put(10, (java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream13 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[], hi!, [hi!, hi!, [hi!], [hi!]]]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, hi!, , hi!]");
        boolean boolean20 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strComparableStream13);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3644() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3644");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableDynamicArray0.remove((int) (short) 0);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableDynamicArray0.spliterator();
        int int8 = strComparableDynamicArray0.getSize();
        boolean boolean9 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream10 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator11 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, []]");
        java.util.Iterator iterator14 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strComparable6);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strComparableStream10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(iterator14);
    }

    @Test
    public void test3645() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3645");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator iterator11 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.put((int) (short) 10, (java.lang.Comparable<java.lang.String>) "[[], hi!]");
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDynamicArray0.get((int) (short) 10);
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableDynamicArray0.remove(10);
        strComparableDynamicArray0.put((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "[[], [hi!, hi!, [hi!], [hi!]]]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream22 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator23 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertEquals("'" + strComparable16 + "' != '" + "[[], hi!]" + "'", strComparable16, "[[], hi!]");
        org.junit.Assert.assertEquals("'" + strComparable18 + "' != '" + "[[], hi!]" + "'", strComparable18, "[[], hi!]");
        org.junit.Assert.assertNotNull(strComparableStream22);
        org.junit.Assert.assertNotNull(strComparableSpliterator23);
    }

    @Test
    public void test3646() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3646");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream2 = strComparableDynamicArray0.stream();
        java.lang.String str3 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, [[, ]]]");
        strComparableDynamicArray0.put((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "[[[hi!, hi!, [hi!], [hi!]], ]]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
    }

    @Test
    public void test3647() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3647");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put((int) (byte) 10, (java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableDynamicArray0.spliterator();
        int int10 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test3648() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3648");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        strComparableDynamicArray0.put((int) (short) 10, (java.lang.Comparable<java.lang.String>) "[]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableDynamicArray0.spliterator();
        java.lang.String str13 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[hi!, []]" + "'", str13, "[hi!, []]");
    }

    @Test
    public void test3649() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3649");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        java.lang.String str4 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        java.util.Iterator iterator6 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get(10);
        java.lang.String str9 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[[hi!, hi!, [hi!], [hi!]], ]]");
        boolean boolean12 = strComparableDynamicArray0.isEmpty();
        java.lang.String str13 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[[[[hi!, hi!, [hi!], [hi!]], ]]]" + "'", str13, "[[[[hi!, hi!, [hi!], [hi!]], ]]]");
    }

    @Test
    public void test3650() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3650");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        int int2 = strComparableDynamicArray1.getSize();
        java.lang.String str3 = strComparableDynamicArray1.toString();
        // The following exception was thrown during execution in test generation
        try {
            strComparableDynamicArray1.put((int) (byte) 10, (java.lang.Comparable<java.lang.String>) "[, [hi!]]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
    }

    @Test
    public void test3651() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3651");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        int int7 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[]");
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        java.lang.String str11 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.put(10, (java.lang.Comparable<java.lang.String>) "[hi!]");
        strComparableDynamicArray0.put((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "[[[[], hi!, , ]]]");
        java.lang.Comparable<java.lang.String> strComparable19 = strComparableDynamicArray0.remove((int) (short) 1);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator20 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream21 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!, []]" + "'", str11, "[hi!, []]");
        org.junit.Assert.assertEquals("'" + strComparable19 + "' != '" + "[[[[], hi!, , ]]]" + "'", strComparable19, "[[[[], hi!, , ]]]");
        org.junit.Assert.assertNotNull(strComparableSpliterator20);
        org.junit.Assert.assertNotNull(strComparableStream21);
    }

    @Test
    public void test3652() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3652");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        java.lang.String str4 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        java.util.Iterator iterator6 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get(10);
        java.lang.String str9 = strComparableDynamicArray0.toString();
        int int10 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[[], hi!, , ], hi!]");
        java.util.Iterator iterator13 = strComparableDynamicArray0.iterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream14 = strComparableDynamicArray0.stream();
        java.lang.String str15 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(strComparableStream14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[[[[], hi!, , ], hi!]]" + "'", str15, "[[[[], hi!, , ], hi!]]");
    }

    @Test
    public void test3653() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3653");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator iterator11 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray0.get((int) (byte) 10);
        java.util.Iterator iterator14 = strComparableDynamicArray0.iterator();
        java.util.Iterator iterator15 = strComparableDynamicArray0.iterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream16 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(strComparableStream16);
    }

    @Test
    public void test3654() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3654");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, hi!, [hi!]]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableDynamicArray0.spliterator();
        int int11 = strComparableDynamicArray0.getSize();
        java.lang.Class<?> wildcardClass12 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3655() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3655");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableDynamicArray0.isEmpty();
        java.lang.String str10 = strComparableDynamicArray0.toString();
        java.lang.String str11 = strComparableDynamicArray0.toString();
        int int12 = strComparableDynamicArray0.getSize();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream13 = strComparableDynamicArray0.stream();
        java.lang.String str14 = strComparableDynamicArray0.toString();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream15 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(strComparableStream13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
        org.junit.Assert.assertNotNull(strComparableStream15);
    }

    @Test
    public void test3656() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3656");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.util.Iterator> iteratorDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.util.Iterator>(1);
    }

    @Test
    public void test3657() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3657");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        int int7 = strComparableDynamicArray0.getSize();
        java.lang.String str8 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDynamicArray0.get(0);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[], hi!, , ]");
        int int13 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator14 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[hi!]" + "'", str8, "[hi!]");
        org.junit.Assert.assertNull(strComparable10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(iterator14);
    }

    @Test
    public void test3658() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3658");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator iterator11 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray0.get((int) (byte) 10);
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDynamicArray0.get(0);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!]");
        boolean boolean18 = strComparableDynamicArray0.isEmpty();
        boolean boolean19 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream20 = strComparableDynamicArray0.stream();
        java.lang.String str21 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable23 = strComparableDynamicArray0.get((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertNull(strComparable15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(strComparableStream20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[hi!, hi!, [hi!]]" + "'", str21, "[hi!, hi!, [hi!]]");
        org.junit.Assert.assertEquals("'" + strComparable23 + "' != '" + "hi!" + "'", strComparable23, "hi!");
    }

    @Test
    public void test3659() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3659");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream4 = strComparableDynamicArray0.stream();
        int int5 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray0.remove((int) (byte) 10);
        java.lang.String str8 = strComparableDynamicArray0.toString();
        java.lang.String str9 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDynamicArray0.get(0);
        boolean boolean12 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator13 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNull(strComparable11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(iterator13);
    }

    @Test
    public void test3660() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3660");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        java.lang.String str4 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, []]");
        strComparableDynamicArray0.put((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "[[[hi!]]]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[hi!]]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator17 = strComparableDynamicArray0.spliterator();
        java.lang.String str18 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable22 = strComparableDynamicArray0.get(0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
        org.junit.Assert.assertNotNull(strComparableSpliterator17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[[[[hi!]]], , [hi!, []], [[hi!]]]" + "'", str18, "[[[[hi!]]], , [hi!, []], [[hi!]]]");
        org.junit.Assert.assertEquals("'" + strComparable22 + "' != '" + "[[[hi!]]]" + "'", strComparable22, "[[[hi!]]]");
    }

    @Test
    public void test3661() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3661");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableDynamicArray0.spliterator();
        int int7 = strComparableDynamicArray0.getSize();
        int int8 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableDynamicArray0.spliterator();
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
    }

    @Test
    public void test3662() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3662");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        int int7 = strComparableDynamicArray0.getSize();
        java.lang.String str8 = strComparableDynamicArray0.toString();
        int int9 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream11 = strComparableDynamicArray0.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream12 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[hi!]" + "'", str8, "[hi!]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(strComparableStream11);
        org.junit.Assert.assertNotNull(strComparableStream12);
    }

    @Test
    public void test3663() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3663");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.CharSequence> charSequenceDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.CharSequence>((int) (byte) 10);
    }

    @Test
    public void test3664() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3664");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        int int7 = strComparableDynamicArray0.getSize();
        java.lang.String str8 = strComparableDynamicArray0.toString();
        int int9 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream11 = strComparableDynamicArray0.stream();
        int int12 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[hi!]" + "'", str8, "[hi!]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(strComparableStream11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
    }

    @Test
    public void test3665() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3665");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        boolean boolean11 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray0.get((int) (byte) 0);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableDynamicArray0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDynamicArray0.remove(0);
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableDynamicArray0.get(4);
        strComparableDynamicArray0.put(4, (java.lang.Comparable<java.lang.String>) "[, [hi!, []]]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [hi!], [hi!, hi!]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
        org.junit.Assert.assertNull(strComparable16);
        org.junit.Assert.assertNull(strComparable18);
    }

    @Test
    public void test3666() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3666");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        int int7 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[]");
        java.lang.String str10 = strComparableDynamicArray0.toString();
        java.lang.String str11 = strComparableDynamicArray0.toString();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream12 = strComparableDynamicArray0.stream();
        boolean boolean13 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator14 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[hi!, []]" + "'", str10, "[hi!, []]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!, []]" + "'", str11, "[hi!, []]");
        org.junit.Assert.assertNotNull(strComparableStream12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator14);
    }

    @Test
    public void test3667() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3667");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream4 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!]");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray0.remove((int) (short) 1);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray0.remove((int) (short) 0);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableDynamicArray0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator15 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "[[[[[hi!]]], , [hi!, []], [[hi!]]], [[]]]");
        java.util.Iterator iterator19 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "[hi!]" + "'", strComparable9, "[hi!]");
        org.junit.Assert.assertEquals("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13, "hi!");
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
        org.junit.Assert.assertNotNull(strComparableSpliterator15);
        org.junit.Assert.assertNotNull(iterator19);
    }

    @Test
    public void test3668() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3668");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        java.lang.String str5 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray0.remove((int) (short) 10);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream8 = strComparableDynamicArray0.stream();
        java.lang.String str9 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [hi!]]");
        int int13 = strComparableDynamicArray0.getSize();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream14 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertNotNull(strComparableStream8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(strComparableStream14);
    }

    @Test
    public void test3669() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3669");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream3 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.put(1, (java.lang.Comparable<java.lang.String>) "[hi!, []]");
        strComparableDynamicArray0.put(0, (java.lang.Comparable<java.lang.String>) "");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream10 = strComparableDynamicArray0.stream();
        java.lang.String str11 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.put(10, (java.lang.Comparable<java.lang.String>) "[, [[hi!]]]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertNotNull(strComparableStream3);
        org.junit.Assert.assertNotNull(strComparableStream10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[, [hi!, []]]" + "'", str11, "[, [hi!, []]]");
    }

    @Test
    public void test3670() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3670");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Iterable<java.lang.Comparable<java.lang.String>>> strComparableIterableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Iterable<java.lang.Comparable<java.lang.String>>>(4);
    }

    @Test
    public void test3671() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3671");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        int int7 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[]");
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        java.lang.String str11 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put(1, (java.lang.Comparable<java.lang.String>) "[hi!, hi!, [[], hi!]]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream16 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableDynamicArray0.get((int) (short) 0);
        boolean boolean19 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!, []]" + "'", str11, "[hi!, []]");
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertNotNull(strComparableStream16);
        org.junit.Assert.assertNull(strComparable18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3672() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3672");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.reflect.AnnotatedElement> annotatedElementDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.reflect.AnnotatedElement>((int) 'a');
    }

    @Test
    public void test3673() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3673");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>(5);
        java.lang.Class<?> wildcardClass2 = strComparableDynamicArray1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3674() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3674");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        int int10 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[hi!]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream14 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator15 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[], hi!, [hi!, hi!, [hi!], [hi!]]]");
        java.lang.Comparable<java.lang.String> strComparable19 = strComparableDynamicArray0.remove(10);
        boolean boolean20 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(strComparableStream14);
        org.junit.Assert.assertNotNull(strComparableSpliterator15);
        org.junit.Assert.assertNull(strComparable19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test3675() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3675");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        int int11 = strComparableDynamicArray0.getSize();
        java.lang.String str12 = strComparableDynamicArray0.toString();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream13 = strComparableDynamicArray0.stream();
        int int14 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[], [hi!, hi!, [hi!], [hi!]]]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator17 = strComparableDynamicArray0.spliterator();
        java.util.Iterator iterator18 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[hi!]" + "'", str12, "[hi!]");
        org.junit.Assert.assertNotNull(strComparableStream13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator17);
        org.junit.Assert.assertNotNull(iterator18);
    }

    @Test
    public void test3676() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3676");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        java.lang.String str4 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, []]");
        int int9 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, ]");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDynamicArray0.remove((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "hi!" + "'", strComparable14, "hi!");
    }

    @Test
    public void test3677() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3677");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        java.lang.String str5 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[]");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray0.get((int) (short) 1);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableDynamicArray0.spliterator();
        boolean boolean11 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableDynamicArray0.spliterator();
        boolean boolean13 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[], hi!, ]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream16 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "[]" + "'", strComparable9, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strComparableStream16);
    }

    @Test
    public void test3678() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3678");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator iterator11 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.put((int) (short) 10, (java.lang.Comparable<java.lang.String>) "[[], hi!]");
        // The following exception was thrown during execution in test generation
        try {
            strComparableDynamicArray0.put((int) ' ', (java.lang.Comparable<java.lang.String>) "[[hi!, [[[[hi!]]], , [hi!, []], [[hi!]]]]]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 32 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
    }

    @Test
    public void test3679() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3679");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        int int7 = strComparableDynamicArray0.getSize();
        java.lang.String str8 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDynamicArray0.get(0);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[], hi!, , ]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator13 = strComparableDynamicArray0.spliterator();
        int int14 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[hi!]" + "'", str8, "[hi!]");
        org.junit.Assert.assertNull(strComparable10);
        org.junit.Assert.assertNotNull(strComparableSpliterator13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test3680() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3680");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        int int10 = strComparableDynamicArray0.getSize();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream11 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(strComparableStream11);
    }

    @Test
    public void test3681() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3681");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator6 = strComparableDynamicArray0.iterator();
        java.util.Iterator iterator7 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        java.lang.Class<?> wildcardClass9 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3682() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3682");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>> wildcardClassOfFieldDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.invoke.TypeDescriptor.OfField<java.lang.Class<?>>>((int) (byte) 100);
        java.lang.Class<?> wildcardClass2 = wildcardClassOfFieldDynamicArray1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test3683() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3683");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableDynamicArray0.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableDynamicArray0.stream();
        int int8 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator9 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.put(3, (java.lang.Comparable<java.lang.String>) "[, hi!, , hi!]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator13 = strComparableDynamicArray0.spliterator();
        int int14 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableStream6);
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(strComparableSpliterator13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test3684() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3684");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        java.lang.String str4 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        int int9 = strComparableDynamicArray0.getSize();
        boolean boolean10 = strComparableDynamicArray0.isEmpty();
        int int11 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[[], hi!, , ]]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test3685() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3685");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.String str1 = strComparableDynamicArray0.toString();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream2 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator3 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[]");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray0.remove((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[]" + "'", str1, "[]");
        org.junit.Assert.assertNotNull(strComparableStream2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(strComparable7);
    }

    @Test
    public void test3686() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3686");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        java.lang.String str4 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        java.util.Iterator iterator6 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get(10);
        java.lang.String str9 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream11 = strComparableDynamicArray0.stream();
        java.lang.String str12 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDynamicArray0.get((int) (short) 10);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertNotNull(strComparableStream11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertNull(strComparable14);
    }

    @Test
    public void test3687() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3687");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator iterator6 = strComparableDynamicArray0.iterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray0.remove(4);
        int int10 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableDynamicArray0.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            strComparableDynamicArray0.put((int) (short) -1, (java.lang.Comparable<java.lang.String>) "[[], hi!, ]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertNull(strComparable9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
    }

    @Test
    public void test3688() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3688");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        int int7 = strComparableDynamicArray0.getSize();
        boolean boolean8 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.put((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "[[hi!]]");
        int int12 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [hi!]]");
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDynamicArray0.get(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(strComparable16);
    }

    @Test
    public void test3689() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3689");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        int int7 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray0.remove(3);
        java.lang.String str10 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDynamicArray0.get((int) (byte) 10);
        java.lang.Class<?> wildcardClass13 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(strComparable9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNull(strComparable12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3690() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3690");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        int int7 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[]");
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        java.lang.String str11 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.put(10, (java.lang.Comparable<java.lang.String>) "[hi!]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator15 = strComparableDynamicArray0.spliterator();
        boolean boolean16 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableDynamicArray0.remove((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!, []]" + "'", str11, "[hi!, []]");
        org.junit.Assert.assertNotNull(strComparableSpliterator15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertEquals("'" + strComparable18 + "' != '" + "hi!" + "'", strComparable18, "hi!");
    }

    @Test
    public void test3691() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3691");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator iterator11 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray0.get((int) (byte) 10);
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDynamicArray0.get(0);
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableDynamicArray0.get((int) (byte) 0);
        java.lang.String str18 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertNull(strComparable15);
        org.junit.Assert.assertNull(strComparable17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[hi!, hi!]" + "'", str18, "[hi!, hi!]");
    }

    @Test
    public void test3692() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3692");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>(0);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableDynamicArray1.spliterator();
        int int3 = strComparableDynamicArray1.getSize();
        java.lang.String str4 = strComparableDynamicArray1.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray1.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableDynamicArray1.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray1.get((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
    }

    @Test
    public void test3693() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3693");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator2 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableDynamicArray0.spliterator();
        java.lang.String str4 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [], [hi!]]");
        java.util.Iterator iterator7 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        boolean boolean9 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3694() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3694");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator7 = strComparableDynamicArray0.iterator();
        java.lang.String str8 = strComparableDynamicArray0.toString();
        int int9 = strComparableDynamicArray0.getSize();
        boolean boolean10 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableDynamicArray0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray0.remove((int) (short) 0);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, , []]");
        java.lang.String str16 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[hi!]" + "'", str8, "[hi!]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[hi!, [hi!, , []]]" + "'", str16, "[hi!, [hi!, , []]]");
    }

    @Test
    public void test3695() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3695");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableDynamicArray0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray0.remove(1);
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDynamicArray0.get(2);
        boolean boolean12 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDynamicArray0.remove((int) (byte) 1);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator15 = strComparableDynamicArray0.spliterator();
        java.lang.String str16 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertNull(strComparable11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(strComparable14);
        org.junit.Assert.assertNotNull(strComparableSpliterator15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[]" + "'", str16, "[]");
    }

    @Test
    public void test3696() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3696");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream3 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, []]");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get(0);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, [hi!, []]]");
        boolean boolean11 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray0.remove(5);
        java.lang.String str14 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertNotNull(strComparableStream3);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertEquals("'" + strComparable8 + "' != '" + "[hi!, []]" + "'", strComparable8, "[hi!, []]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[[hi!, []]]" + "'", str14, "[[hi!, []]]");
    }

    @Test
    public void test3697() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3697");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator iterator11 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.put((int) (short) 10, (java.lang.Comparable<java.lang.String>) "[[], hi!]");
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDynamicArray0.get((int) (short) 10);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, ]");
        java.lang.String str19 = strComparableDynamicArray0.toString();
        java.lang.String str20 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertEquals("'" + strComparable16 + "' != '" + "[[], hi!]" + "'", strComparable16, "[[], hi!]");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[hi!, hi!, [, ], [[], hi!]]" + "'", str19, "[hi!, hi!, [, ], [[], hi!]]");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "[hi!, hi!, [, ], [[], hi!]]" + "'", str20, "[hi!, hi!, [, ], [[], hi!]]");
    }

    @Test
    public void test3698() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3698");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator iterator6 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableDynamicArray0.spliterator();
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertNotNull(iterator8);
    }

    @Test
    public void test3699() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3699");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.invoke.TypeDescriptor> typeDescriptorDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.invoke.TypeDescriptor>((int) '#');
    }

    @Test
    public void test3700() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3700");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream4 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!]");
        java.lang.String str8 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableDynamicArray0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableDynamicArray0.spliterator();
        int int11 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[hi!, [[], hi!, , ]], hi!]");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDynamicArray0.remove(0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[hi!, [hi!]]" + "'", str8, "[hi!, [hi!]]");
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + strComparable15 + "' != '" + "hi!" + "'", strComparable15, "hi!");
    }

    @Test
    public void test3701() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3701");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put(10, (java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream13 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        int int16 = strComparableDynamicArray0.getSize();
        java.lang.String str17 = strComparableDynamicArray0.toString();
        java.lang.String str18 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable20 = strComparableDynamicArray0.get((int) (short) 10);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator21 = strComparableDynamicArray0.spliterator();
        int int22 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strComparableStream13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[[], hi!, , ]" + "'", str17, "[[], hi!, , ]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[[], hi!, , ]" + "'", str18, "[[], hi!, , ]");
        org.junit.Assert.assertEquals("'" + strComparable20 + "' != '" + "" + "'", strComparable20, "");
        org.junit.Assert.assertNotNull(strComparableSpliterator21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test3702() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3702");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        int int7 = strComparableDynamicArray0.getSize();
        boolean boolean8 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator9 = strComparableDynamicArray0.iterator();
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        int int11 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableDynamicArray0.spliterator();
        java.lang.String str13 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
    }

    @Test
    public void test3703() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3703");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream3 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        int int7 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.put((int) (short) 1, (java.lang.Comparable<java.lang.String>) "[[], hi!]");
        int int11 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableDynamicArray0.spliterator();
        boolean boolean13 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertNotNull(strComparableStream3);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test3704() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3704");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        int int6 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, ]");
        int int9 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDynamicArray0.remove(4);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[], hi!, , ]");
        boolean boolean15 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNull(strComparable11);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3705() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3705");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator iterator6 = strComparableDynamicArray0.iterator();
        java.lang.String str7 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, hi!, , hi!]");
        // The following exception was thrown during execution in test generation
        try {
            strComparableDynamicArray0.put((int) '#', (java.lang.Comparable<java.lang.String>) "[, ]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[hi!]" + "'", str7, "[hi!]");
    }

    @Test
    public void test3706() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3706");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator iterator11 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.put((int) (short) 10, (java.lang.Comparable<java.lang.String>) "[[], hi!]");
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDynamicArray0.get((int) (short) 10);
        java.lang.Comparable<java.lang.String> strComparable17 = null;
        strComparableDynamicArray0.add(strComparable17);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream19 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertEquals("'" + strComparable16 + "' != '" + "[[], hi!]" + "'", strComparable16, "[[], hi!]");
        org.junit.Assert.assertNotNull(strComparableStream19);
    }

    @Test
    public void test3707() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3707");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator iterator11 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.put((int) (short) 10, (java.lang.Comparable<java.lang.String>) "[[], hi!]");
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDynamicArray0.get((int) (short) 10);
        java.lang.Comparable<java.lang.String> strComparable17 = null;
        strComparableDynamicArray0.add(strComparable17);
        int int19 = strComparableDynamicArray0.getSize();
        boolean boolean20 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream21 = strComparableDynamicArray0.stream();
        boolean boolean22 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream23 = strComparableDynamicArray0.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream24 = strComparableDynamicArray0.stream();
        boolean boolean25 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [[[[hi!]]], , [hi!, []], [[hi!]]]]");
        int int28 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable30 = strComparableDynamicArray0.get(5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertEquals("'" + strComparable16 + "' != '" + "[[], hi!]" + "'", strComparable16, "[[], hi!]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strComparableStream21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strComparableStream23);
        org.junit.Assert.assertNotNull(strComparableStream24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 5 + "'", int28 == 5);
        org.junit.Assert.assertNull(strComparable30);
    }

    @Test
    public void test3708() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3708");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        int int7 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray0.remove(3);
        java.lang.String str10 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[], hi!]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream13 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(strComparable9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(strComparableStream13);
    }

    @Test
    public void test3709() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3709");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator iterator11 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray0.get((int) (byte) 10);
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDynamicArray0.get(0);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream18 = strComparableDynamicArray0.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream19 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable21 = strComparableDynamicArray0.get(1);
        // The following exception was thrown during execution in test generation
        try {
            strComparableDynamicArray0.put((int) (byte) -1, (java.lang.Comparable<java.lang.String>) "[[[hi!, [hi!]]], [[[[hi!]]], , [hi!, []], [[hi!]]]]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertNull(strComparable15);
        org.junit.Assert.assertNotNull(strComparableStream18);
        org.junit.Assert.assertNotNull(strComparableStream19);
        org.junit.Assert.assertEquals("'" + strComparable21 + "' != '" + "hi!" + "'", strComparable21, "hi!");
    }

    @Test
    public void test3710() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3710");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableDynamicArray0.isEmpty();
        java.lang.String str10 = strComparableDynamicArray0.toString();
        java.lang.String str11 = strComparableDynamicArray0.toString();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream12 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator13 = strComparableDynamicArray0.iterator();
        java.util.Iterator iterator14 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDynamicArray0.remove((int) (short) 10);
        java.lang.String str17 = strComparableDynamicArray0.toString();
        int int18 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(strComparableStream12);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNull(strComparable16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
    }

    @Test
    public void test3711() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3711");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream2 = strComparableDynamicArray0.stream();
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDynamicArray0.get((int) (byte) 1);
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (short) 1);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull(strComparable8);
    }

    @Test
    public void test3712() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3712");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        int int6 = strComparableDynamicArray0.getSize();
        boolean boolean7 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        int int10 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableDynamicArray0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray0.remove(0);
        java.lang.String str14 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
    }

    @Test
    public void test3713() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3713");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream4 = strComparableDynamicArray0.stream();
        int int5 = strComparableDynamicArray0.getSize();
        java.lang.String str6 = strComparableDynamicArray0.toString();
        java.lang.String str7 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray0.get((int) (short) 0);
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        java.lang.String str11 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[hi!]" + "'", str6, "[hi!]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[hi!]" + "'", str7, "[hi!]");
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!]" + "'", str11, "[hi!]");
    }

    @Test
    public void test3714() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3714");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableDynamicArray0.stream();
        boolean boolean7 = strComparableDynamicArray0.isEmpty();
        java.lang.Class<?> wildcardClass8 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strComparableStream6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test3715() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3715");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator iterator11 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray0.get((int) (byte) 10);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream14 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.put(4, (java.lang.Comparable<java.lang.String>) "[[[[[hi!]]], , [hi!, []], [[hi!]]], [[]]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertNotNull(strComparableStream14);
    }

    @Test
    public void test3716() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3716");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put(10, (java.lang.Comparable<java.lang.String>) "");
        java.lang.String str12 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator13 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream14 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[[], hi!, [[hi!]]], hi!]");
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[[], hi!, ]" + "'", str12, "[[], hi!, ]");
        org.junit.Assert.assertNotNull(strComparableSpliterator13);
        org.junit.Assert.assertNotNull(strComparableStream14);
    }

    @Test
    public void test3717() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3717");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        int int7 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[]");
        java.lang.String str10 = strComparableDynamicArray0.toString();
        java.lang.String str11 = strComparableDynamicArray0.toString();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream12 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!]");
        int int15 = strComparableDynamicArray0.getSize();
        java.lang.String str16 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator17 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[hi!, []]" + "'", str10, "[hi!, []]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!, []]" + "'", str11, "[hi!, []]");
        org.junit.Assert.assertNotNull(strComparableStream12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[hi!, [], [hi!]]" + "'", str16, "[hi!, [], [hi!]]");
        org.junit.Assert.assertNotNull(strComparableSpliterator17);
    }

    @Test
    public void test3718() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3718");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableDynamicArray0.isEmpty();
        java.lang.String str10 = strComparableDynamicArray0.toString();
        java.lang.String str11 = strComparableDynamicArray0.toString();
        int int12 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDynamicArray0.get((int) (byte) 0);
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDynamicArray0.get((int) (byte) 0);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream17 = strComparableDynamicArray0.stream();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable19 = strComparableDynamicArray0.remove((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNull(strComparable14);
        org.junit.Assert.assertNull(strComparable16);
        org.junit.Assert.assertNotNull(strComparableStream17);
    }

    @Test
    public void test3719() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3719");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        int int7 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[]");
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        java.lang.String str11 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableDynamicArray0.spliterator();
        java.lang.String str13 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDynamicArray0.get(3);
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableDynamicArray0.get(4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!, []]" + "'", str11, "[hi!, []]");
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[hi!, []]" + "'", str13, "[hi!, []]");
        org.junit.Assert.assertNull(strComparable15);
        org.junit.Assert.assertNull(strComparable17);
    }

    @Test
    public void test3720() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3720");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>(100);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableDynamicArray1.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable4 = strComparableDynamicArray1.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
    }

    @Test
    public void test3721() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3721");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        int int6 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, ]");
        boolean boolean9 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream10 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, hi!, [[hi!, hi!, [hi!], [hi!]]]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strComparableStream10);
    }

    @Test
    public void test3722() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3722");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.put(0, (java.lang.Comparable<java.lang.String>) "[hi!]");
        java.util.Iterator iterator7 = strComparableDynamicArray0.iterator();
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableDynamicArray0.spliterator();
        java.lang.String str10 = strComparableDynamicArray0.toString();
        java.util.Iterator iterator11 = strComparableDynamicArray0.iterator();
        boolean boolean12 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.put((int) (short) 1, (java.lang.Comparable<java.lang.String>) "[, [[, ]]]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream16 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[[hi!]]" + "'", str10, "[[hi!]]");
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strComparableStream16);
    }

    @Test
    public void test3723() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3723");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.remove((int) (byte) 10);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[hi!, [hi!]]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
    }

    @Test
    public void test3724() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3724");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableDynamicArray0.remove((int) (short) 0);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableDynamicArray0.spliterator();
        int int8 = strComparableDynamicArray0.getSize();
        boolean boolean9 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream10 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDynamicArray0.get((int) (byte) 0);
        boolean boolean13 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator14 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator15 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strComparable6);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strComparableStream10);
        org.junit.Assert.assertNull(strComparable12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(strComparableSpliterator15);
    }

    @Test
    public void test3725() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3725");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        java.lang.String str4 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableDynamicArray0.isEmpty();
        int int8 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDynamicArray0.remove(0);
        strComparableDynamicArray0.put(4, (java.lang.Comparable<java.lang.String>) "[[[], hi!, , ], hi!]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNull(strComparable10);
    }

    @Test
    public void test3726() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3726");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [hi!]]");
        boolean boolean8 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3727() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3727");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        int int7 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[]");
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        java.lang.String str11 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableDynamicArray0.spliterator();
        java.lang.String str13 = strComparableDynamicArray0.toString();
        boolean boolean14 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream15 = strComparableDynamicArray0.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream16 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator17 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!, []]" + "'", str11, "[hi!, []]");
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[hi!, []]" + "'", str13, "[hi!, []]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strComparableStream15);
        org.junit.Assert.assertNotNull(strComparableStream16);
        org.junit.Assert.assertNotNull(iterator17);
    }

    @Test
    public void test3728() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3728");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.String str1 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableDynamicArray0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream4 = strComparableDynamicArray0.stream();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray0.remove((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[]" + "'", str1, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test3729() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3729");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        int int7 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[]");
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        int int11 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.put(2, (java.lang.Comparable<java.lang.String>) "[hi!]");
        java.lang.String str15 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, hi!, [[hi!, hi!, [hi!], [hi!]]]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[hi!, [hi!]]" + "'", str15, "[hi!, [hi!]]");
    }

    @Test
    public void test3730() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3730");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        int int11 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDynamicArray0.remove(3);
        java.util.Iterator iterator16 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, hi!, [[], hi!]]");
        java.util.Iterator iterator19 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNull(strComparable15);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(iterator19);
    }

    @Test
    public void test3731() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3731");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator iterator11 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray0.get((int) (byte) 10);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream14 = strComparableDynamicArray0.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream15 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableDynamicArray0.get(3);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator18 = strComparableDynamicArray0.spliterator();
        int int19 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable21 = strComparableDynamicArray0.get(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertNotNull(strComparableStream14);
        org.junit.Assert.assertNotNull(strComparableStream15);
        org.junit.Assert.assertNull(strComparable17);
        org.junit.Assert.assertNotNull(strComparableSpliterator18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNull(strComparable21);
    }

    @Test
    public void test3732() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3732");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream4 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableDynamicArray0.get(2);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream8 = strComparableDynamicArray0.stream();
        java.lang.String str9 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertNull(strComparable6);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertNotNull(strComparableStream8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[hi!]" + "'", str9, "[hi!]");
    }

    @Test
    public void test3733() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3733");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, ]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream12 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDynamicArray0.get(1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNotNull(strComparableStream12);
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "" + "'", strComparable14, "");
    }

    @Test
    public void test3734() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3734");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, []]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream5 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray0.get((int) (short) 0);
        boolean boolean8 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        java.lang.Class<?> wildcardClass10 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertNotNull(strComparableStream5);
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3735() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3735");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put((int) (byte) 10, (java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        int int9 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableDynamicArray0.spliterator();
        java.util.Iterator iterator11 = strComparableDynamicArray0.iterator();
        java.lang.String str12 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDynamicArray0.remove((int) (short) 0);
        boolean boolean15 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.put((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "[hi!, hi!]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertNull(strComparable14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test3736() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3736");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableDynamicArray0.spliterator();
        int int10 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.put((int) (short) 10, (java.lang.Comparable<java.lang.String>) "[, [hi!], [[], hi!, , ], [[, ]]]");
        java.util.Iterator iterator14 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[[[hi!]]], , [hi!, []], [[hi!]]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(iterator14);
    }

    @Test
    public void test3737() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3737");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream2 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableDynamicArray0.get(1);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream2);
        org.junit.Assert.assertNull(strComparable4);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
    }

    @Test
    public void test3738() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3738");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        int int7 = strComparableDynamicArray0.getSize();
        boolean boolean8 = strComparableDynamicArray0.isEmpty();
        boolean boolean9 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, ]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[], [hi!, hi!, [hi!], [hi!]]]");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDynamicArray0.get(10);
        int int16 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator17 = strComparableDynamicArray0.iterator();
        java.util.Iterator iterator18 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNull(strComparable15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(iterator18);
    }

    @Test
    public void test3739() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3739");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        int int7 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        java.lang.String str9 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDynamicArray0.remove(1);
        boolean boolean12 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNull(strComparable11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3740() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3740");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        strComparableDynamicArray1.add((java.lang.Comparable<java.lang.String>) "[, ]");
        int int4 = strComparableDynamicArray1.getSize();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableDynamicArray1.remove(1);
        java.util.Iterator iterator7 = strComparableDynamicArray1.iterator();
        java.lang.String str8 = strComparableDynamicArray1.toString();
        boolean boolean9 = strComparableDynamicArray1.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableDynamicArray1.spliterator();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(strComparable6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
    }

    @Test
    public void test3741() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3741");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        int int7 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[]");
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        int int11 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.put(2, (java.lang.Comparable<java.lang.String>) "[hi!]");
        java.lang.String str15 = strComparableDynamicArray0.toString();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream16 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[], ]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[hi!, [hi!]]" + "'", str15, "[hi!, [hi!]]");
        org.junit.Assert.assertNotNull(strComparableStream16);
    }

    @Test
    public void test3742() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3742");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator iterator11 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.put((int) (short) 10, (java.lang.Comparable<java.lang.String>) "[[], hi!]");
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDynamicArray0.get((int) (short) 10);
        java.lang.Comparable<java.lang.String> strComparable17 = null;
        strComparableDynamicArray0.add(strComparable17);
        int int19 = strComparableDynamicArray0.getSize();
        boolean boolean20 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream21 = strComparableDynamicArray0.stream();
        boolean boolean22 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream23 = strComparableDynamicArray0.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream24 = strComparableDynamicArray0.stream();
        boolean boolean25 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [[[[hi!]]], , [hi!, []], [[hi!]]]]");
        int int28 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable30 = strComparableDynamicArray0.remove((int) (short) 0);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator31 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertEquals("'" + strComparable16 + "' != '" + "[[], hi!]" + "'", strComparable16, "[[], hi!]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strComparableStream21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strComparableStream23);
        org.junit.Assert.assertNotNull(strComparableStream24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 5 + "'", int28 == 5);
        org.junit.Assert.assertNull(strComparable30);
        org.junit.Assert.assertNotNull(strComparableSpliterator31);
    }

    @Test
    public void test3743() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3743");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableDynamicArray0.remove((int) (short) 0);
        java.util.Iterator iterator7 = strComparableDynamicArray0.iterator();
        boolean boolean8 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strComparable6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test3744() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3744");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream4 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!]");
        java.lang.String str8 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, hi!]");
        strComparableDynamicArray0.put(4, (java.lang.Comparable<java.lang.String>) "[[], hi!]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream14 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.put((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "[, ]");
        boolean boolean18 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.put(10, (java.lang.Comparable<java.lang.String>) "[[hi!, hi!]]");
        boolean boolean22 = strComparableDynamicArray0.isEmpty();
        boolean boolean23 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[hi!, [hi!]]" + "'", str8, "[hi!, [hi!]]");
        org.junit.Assert.assertNotNull(strComparableStream14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test3745() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3745");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        java.lang.String str9 = strComparableDynamicArray0.toString();
        java.lang.String str10 = strComparableDynamicArray0.toString();
        // The following exception was thrown during execution in test generation
        try {
            strComparableDynamicArray0.put((int) (short) 100, (java.lang.Comparable<java.lang.String>) "[, []]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[[], hi!]" + "'", str9, "[[], hi!]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[[], hi!]" + "'", str10, "[[], hi!]");
    }

    @Test
    public void test3746() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3746");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        java.lang.String str4 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        java.util.Iterator iterator6 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get(10);
        java.lang.String str9 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.put(3, (java.lang.Comparable<java.lang.String>) "[hi!]");
        int int13 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDynamicArray0.get(0);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator16 = strComparableDynamicArray0.spliterator();
        boolean boolean17 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNull(strComparable15);
        org.junit.Assert.assertNotNull(strComparableSpliterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3747() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3747");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put((int) (byte) 10, (java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        int int9 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableDynamicArray0.spliterator();
        java.util.Iterator iterator11 = strComparableDynamicArray0.iterator();
        java.lang.String str12 = strComparableDynamicArray0.toString();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream13 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertNotNull(strComparableStream13);
    }

    @Test
    public void test3748() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3748");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream4 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableDynamicArray0.get(2);
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertNull(strComparable6);
        org.junit.Assert.assertNull(strComparable8);
    }

    @Test
    public void test3749() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3749");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) '4');
        java.util.Iterator iterator2 = strComparableDynamicArray1.iterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream3 = strComparableDynamicArray1.stream();
        int int4 = strComparableDynamicArray1.getSize();
        java.util.Iterator iterator5 = strComparableDynamicArray1.iterator();
        strComparableDynamicArray1.add((java.lang.Comparable<java.lang.String>) "[hi!, [hi!, hi!, [, ], [[], hi!]]]");
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(strComparableStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(iterator5);
    }

    @Test
    public void test3750() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3750");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        int int7 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[]");
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableDynamicArray0.spliterator();
        java.util.Iterator iterator12 = strComparableDynamicArray0.iterator();
        int int13 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, hi!]");
        int int16 = strComparableDynamicArray0.getSize();
        int int17 = strComparableDynamicArray0.getSize();
        java.lang.String str18 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 4 + "'", int16 == 4);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[hi!, [], [hi!, hi!]]" + "'", str18, "[hi!, [], [hi!, hi!]]");
    }

    @Test
    public void test3751() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3751");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator7 = strComparableDynamicArray0.iterator();
        java.lang.String str8 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDynamicArray0.get((int) (byte) 10);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream11 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray0.get((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[hi!]" + "'", str8, "[hi!]");
        org.junit.Assert.assertNull(strComparable10);
        org.junit.Assert.assertNotNull(strComparableStream11);
        org.junit.Assert.assertNull(strComparable13);
    }

    @Test
    public void test3752() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3752");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream2 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableDynamicArray0.spliterator();
        java.util.Iterator iterator4 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream2);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertNotNull(iterator4);
    }

    @Test
    public void test3753() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3753");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        java.lang.String str4 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        java.util.Iterator iterator6 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get(10);
        java.lang.String str9 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream11 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, hi!, [[], hi!]]");
        boolean boolean14 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.put(1, (java.lang.Comparable<java.lang.String>) "[, [hi!, [[], hi!], [[hi!, hi!, [hi!]]]]]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertNotNull(strComparableStream11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3754() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3754");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray0.remove(1);
        int int8 = strComparableDynamicArray0.getSize();
        java.lang.String str9 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
    }

    @Test
    public void test3755() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3755");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        int int11 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator12 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDynamicArray0.get((int) (short) 10);
        java.lang.String str15 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableDynamicArray0.remove((int) (short) 10);
        java.lang.String str18 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNull(strComparable14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[hi!]" + "'", str15, "[hi!]");
        org.junit.Assert.assertNull(strComparable17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[]" + "'", str18, "[]");
    }

    @Test
    public void test3756() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3756");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        java.lang.String str5 = strComparableDynamicArray0.toString();
        int int6 = strComparableDynamicArray0.getSize();
        boolean boolean7 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put((int) (short) 1, (java.lang.Comparable<java.lang.String>) "[hi!]");
        java.lang.String str12 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, hi!, [hi!], [hi!]]");
        int int15 = strComparableDynamicArray0.getSize();
        java.lang.String str16 = strComparableDynamicArray0.toString();
        boolean boolean17 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[[hi!]]" + "'", str12, "[[hi!]]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[[hi!, hi!, [hi!], [hi!]]]" + "'", str16, "[[hi!, hi!, [hi!], [hi!]]]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3757() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3757");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        int int7 = strComparableDynamicArray0.getSize();
        boolean boolean8 = strComparableDynamicArray0.isEmpty();
        boolean boolean9 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, ]");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray0.get(1);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + strComparable13 + "' != '" + "[, ]" + "'", strComparable13, "[, ]");
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
    }

    @Test
    public void test3758() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3758");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        strComparableDynamicArray0.put((int) (short) 10, (java.lang.Comparable<java.lang.String>) "[]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableDynamicArray0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator15 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream16 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator17 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
        org.junit.Assert.assertNotNull(strComparableSpliterator15);
        org.junit.Assert.assertNotNull(strComparableStream16);
        org.junit.Assert.assertNotNull(strComparableSpliterator17);
    }

    @Test
    public void test3759() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3759");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableDynamicArray0.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        int int9 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableStream6);
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
    }

    @Test
    public void test3760() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3760");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        java.lang.String str4 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, []]");
        int int9 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableDynamicArray0.spliterator();
        java.lang.String str11 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!, [hi!, []]]" + "'", str11, "[hi!, [hi!, []]]");
    }

    @Test
    public void test3761() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3761");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableDynamicArray0.stream();
        java.lang.String str7 = strComparableDynamicArray0.toString();
        boolean boolean8 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator9 = strComparableDynamicArray0.iterator();
        java.lang.Class<?> wildcardClass10 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNotNull(strComparableStream6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[hi!]" + "'", str7, "[hi!]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test3762() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3762");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator iterator11 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray0.get((int) (byte) 10);
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDynamicArray0.get(0);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream20 = strComparableDynamicArray0.stream();
        java.lang.Class<?> wildcardClass21 = strComparableStream20.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertNull(strComparable15);
        org.junit.Assert.assertNotNull(strComparableStream20);
        org.junit.Assert.assertNotNull(wildcardClass21);
    }

    @Test
    public void test3763() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3763");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator iterator11 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray0.get((int) (byte) 10);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream14 = strComparableDynamicArray0.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream15 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableDynamicArray0.get(3);
        java.lang.String str18 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable20 = strComparableDynamicArray0.get((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertNotNull(strComparableStream14);
        org.junit.Assert.assertNotNull(strComparableStream15);
        org.junit.Assert.assertNull(strComparable17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "[hi!, hi!]" + "'", str18, "[hi!, hi!]");
        org.junit.Assert.assertNull(strComparable20);
    }

    @Test
    public void test3764() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3764");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator iterator6 = strComparableDynamicArray0.iterator();
        boolean boolean7 = strComparableDynamicArray0.isEmpty();
        java.lang.String str8 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDynamicArray0.get(2);
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDynamicArray0.get((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable14 = strComparableDynamicArray0.get((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[hi!]" + "'", str8, "[hi!]");
        org.junit.Assert.assertNull(strComparable10);
        org.junit.Assert.assertNull(strComparable12);
    }

    @Test
    public void test3765() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3765");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        int int6 = strComparableDynamicArray0.getSize();
        int int7 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(iterator8);
    }

    @Test
    public void test3766() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3766");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        int int5 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator6 = strComparableDynamicArray0.iterator();
        boolean boolean7 = strComparableDynamicArray0.isEmpty();
        java.lang.String str8 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.put(0, (java.lang.Comparable<java.lang.String>) "[[hi!], [hi!, hi!]]");
        int int12 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test3767() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3767");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        int int7 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[]");
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        java.lang.String str11 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[]");
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDynamicArray0.remove(2);
        java.lang.String str17 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!, []]" + "'", str11, "[hi!, []]");
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertEquals("'" + strComparable16 + "' != '" + "[]" + "'", strComparable16, "[]");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[hi!, []]" + "'", str17, "[hi!, []]");
    }

    @Test
    public void test3768() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3768");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream4 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!]");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray0.remove((int) (short) 1);
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDynamicArray0.remove(4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray0.remove((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "[hi!]" + "'", strComparable9, "[hi!]");
        org.junit.Assert.assertNull(strComparable11);
    }

    @Test
    public void test3769() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3769");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableDynamicArray0.remove((int) (short) 0);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableDynamicArray0.spliterator();
        int int8 = strComparableDynamicArray0.getSize();
        boolean boolean9 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.put(10, (java.lang.Comparable<java.lang.String>) "[hi!, hi!]");
        boolean boolean13 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream14 = strComparableDynamicArray0.stream();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable16 = strComparableDynamicArray0.remove(0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strComparable6);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strComparableStream14);
    }

    @Test
    public void test3770() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3770");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        java.lang.String str5 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[]");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray0.get((int) (short) 1);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableDynamicArray0.spliterator();
        boolean boolean11 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableDynamicArray0.spliterator();
        java.util.Iterator iterator13 = strComparableDynamicArray0.iterator();
        int int14 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "[]" + "'", strComparable9, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
    }

    @Test
    public void test3771() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3771");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableDynamicArray0.remove((int) (short) 0);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableDynamicArray0.spliterator();
        int int8 = strComparableDynamicArray0.getSize();
        boolean boolean9 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream10 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator11 = strComparableDynamicArray0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray0.remove(4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strComparable6);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strComparableStream10);
        org.junit.Assert.assertNotNull(iterator11);
    }

    @Test
    public void test3772() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3772");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>(0);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableDynamicArray1.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream3 = strComparableDynamicArray1.stream();
        java.lang.String str4 = strComparableDynamicArray1.toString();
        boolean boolean5 = strComparableDynamicArray1.isEmpty();
        int int6 = strComparableDynamicArray1.getSize();
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertNotNull(strComparableStream3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test3773() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3773");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDynamicArray0.get(5);
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get(4);
        boolean boolean9 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test3774() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3774");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator iterator11 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray0.get((int) (byte) 10);
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDynamicArray0.get(0);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!]");
        java.util.Iterator iterator20 = strComparableDynamicArray0.iterator();
        java.util.Iterator iterator21 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator22 = strComparableDynamicArray0.spliterator();
        java.util.Iterator iterator23 = strComparableDynamicArray0.iterator();
        boolean boolean24 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertNull(strComparable15);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertNotNull(strComparableSpliterator22);
        org.junit.Assert.assertNotNull(iterator23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test3775() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3775");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        java.lang.String str5 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray0.remove((int) (short) 10);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[], hi!]");
        boolean boolean12 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator13 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator13);
    }

    @Test
    public void test3776() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3776");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDynamicArray0.remove(2);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
    }

    @Test
    public void test3777() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3777");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableDynamicArray0.isEmpty();
        java.lang.String str10 = strComparableDynamicArray0.toString();
        java.lang.String str11 = strComparableDynamicArray0.toString();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream12 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDynamicArray0.remove((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertNotNull(strComparableStream12);
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "" + "'", strComparable14, "");
    }

    @Test
    public void test3778() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3778");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream4 = strComparableDynamicArray0.stream();
        int int5 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray0.remove((int) (byte) 10);
        java.lang.String str8 = strComparableDynamicArray0.toString();
        java.lang.String str9 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDynamicArray0.get(0);
        boolean boolean12 = strComparableDynamicArray0.isEmpty();
        boolean boolean13 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator14 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNull(strComparable11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(iterator14);
    }

    @Test
    public void test3779() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3779");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.String> strDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.String>(0);
    }

    @Test
    public void test3780() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3780");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator iterator11 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray0.get((int) (byte) 10);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream14 = strComparableDynamicArray0.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream15 = strComparableDynamicArray0.stream();
        java.lang.String str16 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [hi!, [hi!]]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertNotNull(strComparableStream14);
        org.junit.Assert.assertNotNull(strComparableStream15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[hi!, hi!]" + "'", str16, "[hi!, hi!]");
    }

    @Test
    public void test3781() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3781");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.util.Iterator> iteratorDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.util.Iterator>((int) (short) 0);
    }

    @Test
    public void test3782() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3782");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        java.lang.String str4 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, []]");
        strComparableDynamicArray0.put((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "[[[hi!]]]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[hi!]]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator17 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put(10, (java.lang.Comparable<java.lang.String>) "[hi!, , []]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[hi!, hi!]]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
        org.junit.Assert.assertNotNull(strComparableSpliterator17);
    }

    @Test
    public void test3783() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3783");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!]");
        int int6 = strComparableDynamicArray0.getSize();
        int int7 = strComparableDynamicArray0.getSize();
        boolean boolean8 = strComparableDynamicArray0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable10 = strComparableDynamicArray0.remove((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3784() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3784");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator2 = strComparableDynamicArray0.iterator();
        java.lang.String str3 = strComparableDynamicArray0.toString();
        java.lang.String str4 = strComparableDynamicArray0.toString();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strComparableStream6);
    }

    @Test
    public void test3785() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3785");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator iterator11 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.put((int) (short) 10, (java.lang.Comparable<java.lang.String>) "[[], hi!]");
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDynamicArray0.get((int) (short) 10);
        java.lang.Comparable<java.lang.String> strComparable17 = null;
        strComparableDynamicArray0.add(strComparable17);
        int int19 = strComparableDynamicArray0.getSize();
        boolean boolean20 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream21 = strComparableDynamicArray0.stream();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable23 = strComparableDynamicArray0.get(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertEquals("'" + strComparable16 + "' != '" + "[[], hi!]" + "'", strComparable16, "[[], hi!]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strComparableStream21);
    }

    @Test
    public void test3786() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3786");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        int int10 = strComparableDynamicArray0.getSize();
        boolean boolean11 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, hi!, [hi!], [hi!]]");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDynamicArray0.remove(1);
        java.lang.String str16 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableDynamicArray0.get(0);
        boolean boolean19 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + strComparable15 + "' != '" + "hi!" + "'", strComparable15, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[[], [hi!, hi!, [hi!], [hi!]]]" + "'", str16, "[[], [hi!, hi!, [hi!], [hi!]]]");
        org.junit.Assert.assertEquals("'" + strComparable18 + "' != '" + "[]" + "'", strComparable18, "[]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3787() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3787");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream4 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!]");
        java.lang.String str8 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, hi!]");
        strComparableDynamicArray0.put(4, (java.lang.Comparable<java.lang.String>) "[[], hi!]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream14 = strComparableDynamicArray0.stream();
        java.lang.String str15 = strComparableDynamicArray0.toString();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream16 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableDynamicArray0.get(10);
        java.lang.Comparable<java.lang.String> strComparable20 = strComparableDynamicArray0.get(0);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator21 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[hi!, [hi!]]" + "'", str8, "[hi!, [hi!]]");
        org.junit.Assert.assertNotNull(strComparableStream14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[hi!, [hi!], [hi!, hi!], [[], hi!]]" + "'", str15, "[hi!, [hi!], [hi!, hi!], [[], hi!]]");
        org.junit.Assert.assertNotNull(strComparableStream16);
        org.junit.Assert.assertNull(strComparable18);
        org.junit.Assert.assertEquals("'" + strComparable20 + "' != '" + "hi!" + "'", strComparable20, "hi!");
        org.junit.Assert.assertNotNull(strComparableSpliterator21);
    }

    @Test
    public void test3788() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3788");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        java.lang.String str5 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray0.remove((int) (short) 10);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        boolean boolean9 = strComparableDynamicArray0.isEmpty();
        boolean boolean10 = strComparableDynamicArray0.isEmpty();
        int int11 = strComparableDynamicArray0.getSize();
        int int12 = strComparableDynamicArray0.getSize();
        int int13 = strComparableDynamicArray0.getSize();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream14 = strComparableDynamicArray0.stream();
        int int15 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator16 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strComparableStream14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator16);
    }

    @Test
    public void test3789() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3789");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        int int7 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[]");
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        java.lang.String str11 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableDynamicArray0.spliterator();
        java.lang.String str13 = strComparableDynamicArray0.toString();
        boolean boolean14 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream15 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator16 = strComparableDynamicArray0.iterator();
        java.lang.Class<?> wildcardClass17 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!, []]" + "'", str11, "[hi!, []]");
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[hi!, []]" + "'", str13, "[hi!, []]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(strComparableStream15);
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3790() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3790");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put((int) (byte) 10, (java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable9 = null;
        strComparableDynamicArray0.add(strComparable9);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [[], hi!, , ]]");
        java.util.Iterator iterator13 = strComparableDynamicArray0.iterator();
        java.lang.String str14 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[[hi!, [[], hi!, , ]], ]" + "'", str14, "[[hi!, [[], hi!, , ]], ]");
    }

    @Test
    public void test3791() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3791");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        java.lang.String str5 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray0.remove((int) (short) 10);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        int int9 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        boolean boolean11 = strComparableDynamicArray0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray0.remove((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3792() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3792");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        int int7 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[]");
        int int10 = strComparableDynamicArray0.getSize();
        boolean boolean11 = strComparableDynamicArray0.isEmpty();
        boolean boolean12 = strComparableDynamicArray0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable14 = strComparableDynamicArray0.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3793() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3793");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        java.lang.String str4 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        java.util.Iterator iterator6 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[hi!, [hi!]]");
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDynamicArray0.remove((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertNull(strComparable12);
    }

    @Test
    public void test3794() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3794");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDynamicArray0.get(0);
        java.util.Iterator iterator13 = strComparableDynamicArray0.iterator();
        int int14 = strComparableDynamicArray0.getSize();
        boolean boolean15 = strComparableDynamicArray0.isEmpty();
        int int16 = strComparableDynamicArray0.getSize();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream17 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(strComparable12);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(strComparableStream17);
    }

    @Test
    public void test3795() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3795");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put((int) (byte) 10, (java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableDynamicArray0.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableDynamicArray0.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
    }

    @Test
    public void test3796() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3796");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableDynamicArray0.remove(0);
        java.lang.String str7 = strComparableDynamicArray0.toString();
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertNull(strComparable6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(iterator8);
    }

    @Test
    public void test3797() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3797");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        int int7 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray0.remove(3);
        java.lang.String str10 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[], hi!]");
        int int13 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator14 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDynamicArray0.get(5);
        int int17 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(strComparable9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNull(strComparable16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test3798() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3798");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put((int) (byte) 10, (java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        java.lang.String str9 = strComparableDynamicArray0.toString();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream10 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.put(0, (java.lang.Comparable<java.lang.String>) "[[hi!, [hi!]]]");
        int int14 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(strComparableStream10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test3799() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3799");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDynamicArray0.remove(5);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strComparable12);
    }

    @Test
    public void test3800() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3800");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator2 = strComparableDynamicArray0.iterator();
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableDynamicArray0.get((int) (byte) 0);
        java.util.Iterator iterator7 = strComparableDynamicArray0.iterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream8 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertNull(strComparable6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(strComparableStream8);
    }

    @Test
    public void test3801() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3801");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        boolean boolean11 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray0.get((int) (byte) 0);
        int int14 = strComparableDynamicArray0.getSize();
        int int15 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator16 = strComparableDynamicArray0.spliterator();
        java.lang.Class<?> wildcardClass17 = strComparableSpliterator16.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test3802() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3802");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str11 = strComparableDynamicArray0.toString();
        java.lang.String str12 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDynamicArray0.get(0);
        int int15 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[, ]" + "'", str11, "[, ]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[, ]" + "'", str12, "[, ]");
        org.junit.Assert.assertNull(strComparable14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test3803() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3803");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put(10, (java.lang.Comparable<java.lang.String>) "[[]]");
        java.lang.String str10 = strComparableDynamicArray0.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable12 = strComparableDynamicArray0.get((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[hi!, [[]]]" + "'", str10, "[hi!, [[]]]");
    }

    @Test
    public void test3804() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3804");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.String str1 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.put(0, (java.lang.Comparable<java.lang.String>) "[hi!]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator7 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDynamicArray0.remove(3);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[]" + "'", str1, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNotNull(strComparableStream6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNull(strComparable11);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
    }

    @Test
    public void test3805() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3805");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        int int11 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDynamicArray0.remove(0);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, ]");
        int int18 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNull(strComparable15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
    }

    @Test
    public void test3806() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3806");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream4 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!]");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray0.remove((int) (short) 1);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, hi!, [[hi!, hi!, [hi!]]]]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "[hi!]" + "'", strComparable9, "[hi!]");
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
    }

    @Test
    public void test3807() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3807");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator iterator6 = strComparableDynamicArray0.iterator();
        boolean boolean7 = strComparableDynamicArray0.isEmpty();
        java.lang.String str8 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDynamicArray0.get((int) (byte) 10);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableDynamicArray0.spliterator();
        boolean boolean12 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[hi!]" + "'", str8, "[hi!]");
        org.junit.Assert.assertNull(strComparable10);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3808() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3808");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableDynamicArray0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray0.remove(1);
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDynamicArray0.get(2);
        boolean boolean12 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDynamicArray0.remove((int) (byte) 1);
        java.lang.Class<?> wildcardClass15 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertNull(strComparable11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(strComparable14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3809() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3809");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) (byte) 10);
        strComparableDynamicArray1.add((java.lang.Comparable<java.lang.String>) "[hi!, []]");
        int int4 = strComparableDynamicArray1.getSize();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream5 = strComparableDynamicArray1.stream();
        java.util.Iterator iterator6 = strComparableDynamicArray1.iterator();
        java.lang.String str7 = strComparableDynamicArray1.toString();
        boolean boolean8 = strComparableDynamicArray1.isEmpty();
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(strComparableStream5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[[hi!, []]]" + "'", str7, "[[hi!, []]]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3810() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3810");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream3 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[], hi!]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableDynamicArray0.spliterator();
        boolean boolean8 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertNotNull(strComparableStream3);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3811() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3811");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator6 = strComparableDynamicArray0.iterator();
        java.util.Iterator iterator7 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable8 = null;
        strComparableDynamicArray0.add(strComparable8);
        boolean boolean10 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream11 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator12 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strComparableStream11);
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test3812() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3812");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        java.lang.String str5 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[]");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray0.get((int) (short) 1);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableDynamicArray0.spliterator();
        boolean boolean11 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableDynamicArray0.spliterator();
        boolean boolean13 = strComparableDynamicArray0.isEmpty();
        int int14 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator15 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "[]" + "'", strComparable9, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator15);
    }

    @Test
    public void test3813() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3813");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        java.lang.String str5 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray0.remove((int) (short) 10);
        boolean boolean8 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableDynamicArray0.spliterator();
        int int10 = strComparableDynamicArray0.getSize();
        boolean boolean11 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test3814() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3814");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.String str1 = strComparableDynamicArray0.toString();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream2 = strComparableDynamicArray0.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream3 = strComparableDynamicArray0.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream4 = strComparableDynamicArray0.stream();
        int int5 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[]" + "'", str1, "[]");
        org.junit.Assert.assertNotNull(strComparableStream2);
        org.junit.Assert.assertNotNull(strComparableStream3);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test3815() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3815");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        int int7 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        java.util.Iterator iterator9 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
    }

    @Test
    public void test3816() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3816");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        strComparableDynamicArray1.add((java.lang.Comparable<java.lang.String>) "[, ]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray1.spliterator();
        int int5 = strComparableDynamicArray1.getSize();
        boolean boolean6 = strComparableDynamicArray1.isEmpty();
        strComparableDynamicArray1.add((java.lang.Comparable<java.lang.String>) "[[], hi!]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableDynamicArray1.spliterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
    }

    @Test
    public void test3817() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3817");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!]");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray0.get(0);
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDynamicArray0.remove((int) (short) 10);
        boolean boolean16 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertNull(strComparable15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3818() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3818");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        strComparableDynamicArray0.put((int) (short) 1, (java.lang.Comparable<java.lang.String>) "[[[hi!, hi!, [hi!]]], [, ]]");
        java.lang.String str6 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[[[[hi!, hi!, [hi!]]], [, ]]]" + "'", str6, "[[[[hi!, hi!, [hi!]]], [, ]]]");
    }

    @Test
    public void test3819() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3819");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) (byte) 10);
        strComparableDynamicArray1.put((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "[[hi!]]");
        java.lang.String str5 = strComparableDynamicArray1.toString();
        java.lang.String str6 = strComparableDynamicArray1.toString();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableDynamicArray1.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream8 = strComparableDynamicArray1.stream();
        java.lang.String str9 = strComparableDynamicArray1.toString();
        strComparableDynamicArray1.add((java.lang.Comparable<java.lang.String>) "[hi!, [hi!, [hi!, []]]]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableDynamicArray1.spliterator();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[[[hi!]]]" + "'", str5, "[[[hi!]]]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[[[hi!]]]" + "'", str6, "[[[hi!]]]");
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertNotNull(strComparableStream8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[[[hi!]]]" + "'", str9, "[[[hi!]]]");
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
    }

    @Test
    public void test3820() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3820");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>(100);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream2 = strComparableDynamicArray1.stream();
        strComparableDynamicArray1.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator iterator5 = strComparableDynamicArray1.iterator();
        strComparableDynamicArray1.put((int) '4', (java.lang.Comparable<java.lang.String>) "[]");
        int int9 = strComparableDynamicArray1.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableDynamicArray1.spliterator();
        strComparableDynamicArray1.put((int) ' ', (java.lang.Comparable<java.lang.String>) "[hi!, [[[[hi!]]], , [hi!, []], [[hi!]]]]");
        strComparableDynamicArray1.put((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "[hi!, [[hi!]]]");
        org.junit.Assert.assertNotNull(strComparableStream2);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
    }

    @Test
    public void test3821() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3821");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator iterator11 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.put((int) (short) 10, (java.lang.Comparable<java.lang.String>) "[[], hi!]");
        boolean boolean15 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableDynamicArray0.remove((int) (short) 0);
        boolean boolean18 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream19 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.put((int) (short) 10, (java.lang.Comparable<java.lang.String>) "[[[[hi!]]], , [hi!, []], [[hi!]]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(strComparable17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(strComparableStream19);
    }

    @Test
    public void test3822() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3822");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        int int7 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[]");
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        int int11 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.put(2, (java.lang.Comparable<java.lang.String>) "[hi!]");
        java.lang.String str15 = strComparableDynamicArray0.toString();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream16 = strComparableDynamicArray0.stream();
        int int17 = strComparableDynamicArray0.getSize();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream18 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[hi!, [hi!]]" + "'", str15, "[hi!, [hi!]]");
        org.junit.Assert.assertNotNull(strComparableStream16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 3 + "'", int17 == 3);
        org.junit.Assert.assertNotNull(strComparableStream18);
    }

    @Test
    public void test3823() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3823");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get(4);
        strComparableDynamicArray0.put(0, (java.lang.Comparable<java.lang.String>) "[[], hi!, , ]");
        java.lang.String str12 = strComparableDynamicArray0.toString();
        int int13 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDynamicArray0.remove((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[[[], hi!, , ], hi!]" + "'", str12, "[[[], hi!, , ], hi!]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNull(strComparable15);
    }

    @Test
    public void test3824() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3824");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableDynamicArray0.get(4);
        java.util.Iterator iterator5 = strComparableDynamicArray0.iterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableDynamicArray0.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertNull(strComparable4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(strComparableStream6);
        org.junit.Assert.assertNotNull(strComparableStream7);
    }

    @Test
    public void test3825() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3825");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        boolean boolean11 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray0.get((int) (byte) 0);
        int int14 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[], hi!, , ]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator17 = strComparableDynamicArray0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable19 = strComparableDynamicArray0.get(3);
        int int20 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator17);
        org.junit.Assert.assertNull(strComparable19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
    }

    @Test
    public void test3826() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3826");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        java.lang.String str5 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[]");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray0.get((int) (short) 1);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put(10, (java.lang.Comparable<java.lang.String>) "[[hi!]]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream14 = strComparableDynamicArray0.stream();
        java.lang.Class<?> wildcardClass15 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "[]" + "'", strComparable9, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertNotNull(strComparableStream14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3827() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3827");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableDynamicArray0.remove((int) (short) 0);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableDynamicArray0.spliterator();
        int int8 = strComparableDynamicArray0.getSize();
        boolean boolean9 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableDynamicArray0.spliterator();
        java.util.Iterator iterator11 = strComparableDynamicArray0.iterator();
        java.util.Iterator iterator12 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.put((int) (byte) 10, (java.lang.Comparable<java.lang.String>) "[[], [hi!, hi!, [hi!], [hi!]]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strComparable6);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test3828() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3828");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        int int11 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDynamicArray0.remove(0);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[], hi!, [[hi!]]]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream18 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNull(strComparable15);
        org.junit.Assert.assertNotNull(strComparableStream18);
    }

    @Test
    public void test3829() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3829");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        int int7 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        boolean boolean9 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
    }

    @Test
    public void test3830() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3830");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Iterable<java.lang.Comparable<java.lang.String>>> strComparableIterableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Iterable<java.lang.Comparable<java.lang.String>>>(3);
    }

    @Test
    public void test3831() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3831");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        int int7 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray0.remove(3);
        java.lang.String str10 = strComparableDynamicArray0.toString();
        boolean boolean11 = strComparableDynamicArray0.isEmpty();
        java.lang.String str12 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(strComparable9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
    }

    @Test
    public void test3832() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3832");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.put(0, (java.lang.Comparable<java.lang.String>) "[hi!]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, hi!]");
        java.lang.String str9 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[hi!], [hi!, hi!]]");
        java.lang.Class<?> wildcardClass12 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[[hi!], [hi!, hi!]]" + "'", str9, "[[hi!], [hi!, hi!]]");
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3833() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3833");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.put(2, (java.lang.Comparable<java.lang.String>) "[[], hi!, [[hi!]]]");
        strComparableDynamicArray0.put((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "[hi!]");
        boolean boolean17 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3834() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3834");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.String str7 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [[], hi!, , ]]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
    }

    @Test
    public void test3835() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3835");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableDynamicArray0.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableDynamicArray0.stream();
        int int8 = strComparableDynamicArray0.getSize();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        boolean boolean10 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableStream6);
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3836() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3836");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        int int7 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[]");
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableDynamicArray0.spliterator();
        java.util.Iterator iterator12 = strComparableDynamicArray0.iterator();
        int int13 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDynamicArray0.remove(1);
        java.util.Iterator iterator16 = strComparableDynamicArray0.iterator();
        java.lang.String str17 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertEquals("'" + strComparable15 + "' != '" + "hi!" + "'", strComparable15, "hi!");
        org.junit.Assert.assertNotNull(iterator16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[[]]" + "'", str17, "[[]]");
    }

    @Test
    public void test3837() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3837");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDynamicArray0.get(0);
        java.util.Iterator iterator13 = strComparableDynamicArray0.iterator();
        int int14 = strComparableDynamicArray0.getSize();
        boolean boolean15 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[], hi!, , ]");
        java.util.Iterator iterator18 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable20 = strComparableDynamicArray0.remove((int) (short) 10);
        java.util.Iterator iterator21 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(strComparable12);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNull(strComparable20);
        org.junit.Assert.assertNotNull(iterator21);
    }

    @Test
    public void test3838() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3838");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put(10, (java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableDynamicArray0.isEmpty();
        int int13 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableDynamicArray0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDynamicArray0.get(0);
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableDynamicArray0.get(0);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
        org.junit.Assert.assertEquals("'" + strComparable16 + "' != '" + "[]" + "'", strComparable16, "[]");
        org.junit.Assert.assertEquals("'" + strComparable18 + "' != '" + "[]" + "'", strComparable18, "[]");
    }

    @Test
    public void test3839() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3839");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        java.lang.String str7 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDynamicArray0.remove((int) (byte) 0);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[], hi!, , ]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableDynamicArray0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator15 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNull(strComparable10);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
        org.junit.Assert.assertNotNull(strComparableSpliterator15);
    }

    @Test
    public void test3840() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3840");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream4 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!]");
        java.lang.String str8 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, hi!]");
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDynamicArray0.remove((int) (byte) 10);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[hi!, hi!, [hi!], [hi!]]]");
        boolean boolean15 = strComparableDynamicArray0.isEmpty();
        int int16 = strComparableDynamicArray0.getSize();
        boolean boolean17 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator18 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[hi!, [hi!]]" + "'", str8, "[hi!, [hi!]]");
        org.junit.Assert.assertNull(strComparable12);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator18);
    }

    @Test
    public void test3841() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3841");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream2 = strComparableDynamicArray0.stream();
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDynamicArray0.get((int) (byte) 1);
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        int int7 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, ]");
        java.lang.String str10 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[[, ]]" + "'", str10, "[[, ]]");
    }

    @Test
    public void test3842() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3842");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator iterator11 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray0.get((int) (byte) 10);
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDynamicArray0.get(0);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream18 = strComparableDynamicArray0.stream();
        java.lang.String str19 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[]");
        java.util.Iterator iterator22 = strComparableDynamicArray0.iterator();
        int int23 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator24 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertNull(strComparable15);
        org.junit.Assert.assertNotNull(strComparableStream18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[hi!, hi!, [hi!]]" + "'", str19, "[hi!, hi!, [hi!]]");
        org.junit.Assert.assertNotNull(iterator22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 5 + "'", int23 == 5);
        org.junit.Assert.assertNotNull(iterator24);
    }

    @Test
    public void test3843() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3843");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        strComparableDynamicArray0.put((int) (short) 10, (java.lang.Comparable<java.lang.String>) "[]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.put((int) (short) 1, (java.lang.Comparable<java.lang.String>) "[hi!, [hi!]]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator17 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream18 = strComparableDynamicArray0.stream();
        java.lang.String str19 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableSpliterator17);
        org.junit.Assert.assertNotNull(strComparableStream18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "[[hi!, [hi!]], , []]" + "'", str19, "[[hi!, [hi!]], , []]");
    }

    @Test
    public void test3844() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3844");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        int int10 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[hi!]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream14 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator15 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[], hi!, [hi!, hi!, [hi!], [hi!]]]");
        java.lang.Comparable<java.lang.String> strComparable19 = strComparableDynamicArray0.remove(10);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator20 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put((int) (short) 10, (java.lang.Comparable<java.lang.String>) "[, []]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator24 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(strComparableStream14);
        org.junit.Assert.assertNotNull(strComparableSpliterator15);
        org.junit.Assert.assertNull(strComparable19);
        org.junit.Assert.assertNotNull(strComparableSpliterator20);
        org.junit.Assert.assertNotNull(strComparableSpliterator24);
    }

    @Test
    public void test3845() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3845");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable8 = null;
        strComparableDynamicArray0.put((int) (short) 1, strComparable8);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!]");
        boolean boolean12 = strComparableDynamicArray0.isEmpty();
        boolean boolean13 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream14 = strComparableDynamicArray0.stream();
        boolean boolean15 = strComparableDynamicArray0.isEmpty();
        int int16 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableDynamicArray0.get(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(strComparableStream14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNull(strComparable18);
    }

    @Test
    public void test3846() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3846");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        java.lang.String str7 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDynamicArray0.remove((int) (byte) 0);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableDynamicArray0.spliterator();
        int int12 = strComparableDynamicArray0.getSize();
        int int13 = strComparableDynamicArray0.getSize();
        boolean boolean14 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, hi!, , hi!]");
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableDynamicArray0.get((int) (byte) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNull(strComparable10);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNull(strComparable18);
    }

    @Test
    public void test3847() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3847");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        java.lang.String str7 = strComparableDynamicArray0.toString();
        int int8 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[[hi!, [hi!]]], [[[[hi!]]], , [hi!, []], [[hi!]]]]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[hi!, hi!, [hi!]]]");
        boolean boolean13 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator14 = strComparableDynamicArray0.iterator();
        int int15 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test3848() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3848");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        int int2 = strComparableDynamicArray1.getSize();
        java.lang.String str3 = strComparableDynamicArray1.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray1.spliterator();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "[]" + "'", str3, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
    }

    @Test
    public void test3849() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3849");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDynamicArray0.get(0);
        java.util.Iterator iterator13 = strComparableDynamicArray0.iterator();
        int int14 = strComparableDynamicArray0.getSize();
        boolean boolean15 = strComparableDynamicArray0.isEmpty();
        int int16 = strComparableDynamicArray0.getSize();
        boolean boolean17 = strComparableDynamicArray0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable19 = strComparableDynamicArray0.get((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(strComparable12);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3850() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3850");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        java.lang.String str4 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        int int8 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, []]");
        strComparableDynamicArray0.put((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "[[[hi!]]]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[hi!]]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator17 = strComparableDynamicArray0.spliterator();
        java.util.Iterator iterator18 = strComparableDynamicArray0.iterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream19 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
        org.junit.Assert.assertNotNull(strComparableSpliterator17);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(strComparableStream19);
    }

    @Test
    public void test3851() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3851");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        int int9 = strComparableDynamicArray0.getSize();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream10 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDynamicArray0.remove(0);
        java.util.Iterator iterator13 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(strComparableStream10);
        org.junit.Assert.assertEquals("'" + strComparable12 + "' != '" + "[]" + "'", strComparable12, "[]");
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
    }

    @Test
    public void test3852() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3852");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream4 = strComparableDynamicArray0.stream();
        int int5 = strComparableDynamicArray0.getSize();
        java.lang.String str6 = strComparableDynamicArray0.toString();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableDynamicArray0.stream();
        boolean boolean8 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDynamicArray0.get((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable12 = strComparableDynamicArray0.get((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[hi!]" + "'", str6, "[hi!]");
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNull(strComparable10);
    }

    @Test
    public void test3853() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3853");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!]");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.String str7 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray0.remove((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[hi!, [hi!]]" + "'", str7, "[hi!, [hi!]]");
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
    }

    @Test
    public void test3854() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3854");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put(10, (java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, hi!, [hi!], [hi!]]");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDynamicArray0.remove(4);
        boolean boolean16 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNull(strComparable15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3855() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3855");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream3 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        int int7 = strComparableDynamicArray0.getSize();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream8 = strComparableDynamicArray0.stream();
        boolean boolean9 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream10 = strComparableDynamicArray0.stream();
        java.lang.String str11 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertNotNull(strComparableStream3);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strComparableStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strComparableStream10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test3856() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3856");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[], hi!, , ]");
        java.util.Iterator iterator9 = strComparableDynamicArray0.iterator();
        java.lang.String str10 = strComparableDynamicArray0.toString();
        java.lang.String str11 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray0.remove((int) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[hi!, [[], hi!, , ]]" + "'", str10, "[hi!, [[], hi!, , ]]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!, [[], hi!, , ]]" + "'", str11, "[hi!, [[], hi!, , ]]");
        org.junit.Assert.assertEquals("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13, "hi!");
    }

    @Test
    public void test3857() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3857");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream3 = strComparableDynamicArray0.stream();
        int int4 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator5 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableDynamicArray0.spliterator();
        java.lang.Class<?> wildcardClass7 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertNotNull(strComparableStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3858() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3858");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableDynamicArray0.spliterator();
        int int7 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray0.remove((int) (byte) 0);
        boolean boolean10 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableDynamicArray0.spliterator();
        java.lang.Class<?> wildcardClass12 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "" + "'", strComparable9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3859() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3859");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableDynamicArray0.get(4);
        java.util.Iterator iterator5 = strComparableDynamicArray0.iterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.put((int) (byte) 10, (java.lang.Comparable<java.lang.String>) "[[, ]]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream10 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertNull(strComparable4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNotNull(strComparableStream6);
        org.junit.Assert.assertNotNull(strComparableStream10);
    }

    @Test
    public void test3860() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3860");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        strComparableDynamicArray1.add((java.lang.Comparable<java.lang.String>) "[, ]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray1.spliterator();
        strComparableDynamicArray1.add((java.lang.Comparable<java.lang.String>) "[[[], hi!, [[hi!]]]]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableDynamicArray1.stream();
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertNotNull(strComparableStream7);
    }

    @Test
    public void test3861() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3861");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put((int) (byte) 10, (java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        java.lang.String str9 = strComparableDynamicArray0.toString();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream10 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.put(0, (java.lang.Comparable<java.lang.String>) "[[hi!, [hi!]]]");
        strComparableDynamicArray0.put(1, (java.lang.Comparable<java.lang.String>) "[hi!, [], hi!]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(strComparableStream10);
    }

    @Test
    public void test3862() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3862");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDynamicArray0.get(0);
        java.util.Iterator iterator13 = strComparableDynamicArray0.iterator();
        int int14 = strComparableDynamicArray0.getSize();
        java.lang.String str15 = strComparableDynamicArray0.toString();
        java.lang.String str16 = strComparableDynamicArray0.toString();
        int int17 = strComparableDynamicArray0.getSize();
        int int18 = strComparableDynamicArray0.getSize();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream19 = strComparableDynamicArray0.stream();
        java.lang.Class<?> wildcardClass20 = strComparableStream19.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(strComparable12);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[hi!]" + "'", str15, "[hi!]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[hi!]" + "'", str16, "[hi!]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertNotNull(strComparableStream19);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3863() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3863");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        java.lang.String str4 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, []]");
        int int9 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, ]");
        java.lang.Class<?> wildcardClass13 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3864() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3864");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        boolean boolean11 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray0.get((int) (byte) 0);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableDynamicArray0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDynamicArray0.remove(0);
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableDynamicArray0.get(4);
        strComparableDynamicArray0.put(4, (java.lang.Comparable<java.lang.String>) "[, [hi!, []]]");
        java.util.Iterator iterator22 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
        org.junit.Assert.assertNull(strComparable16);
        org.junit.Assert.assertNull(strComparable18);
        org.junit.Assert.assertNotNull(iterator22);
    }

    @Test
    public void test3865() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3865");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        strComparableDynamicArray1.add((java.lang.Comparable<java.lang.String>) "[, ]");
        int int4 = strComparableDynamicArray1.getSize();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableDynamicArray1.remove(1);
        java.lang.String str7 = strComparableDynamicArray1.toString();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray1.get(1);
        java.util.Iterator iterator10 = strComparableDynamicArray1.iterator();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDynamicArray1.get((int) (byte) 1);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator13 = strComparableDynamicArray1.spliterator();
        strComparableDynamicArray1.add((java.lang.Comparable<java.lang.String>) "[[], hi!, [[hi!]]]");
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableDynamicArray1.get(2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable19 = strComparableDynamicArray1.get((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 52 out of bounds for length 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNull(strComparable6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNull(strComparable9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(strComparable12);
        org.junit.Assert.assertNotNull(strComparableSpliterator13);
        org.junit.Assert.assertNull(strComparable17);
    }

    @Test
    public void test3866() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3866");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream2 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableDynamicArray0.get(1);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.put(3, (java.lang.Comparable<java.lang.String>) "[[], hi!, ]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream2);
        org.junit.Assert.assertNull(strComparable4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
    }

    @Test
    public void test3867() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3867");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator7 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [hi!]]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream10 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream12 = strComparableDynamicArray0.stream();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable14 = strComparableDynamicArray0.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(strComparableStream10);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNotNull(strComparableStream12);
    }

    @Test
    public void test3868() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3868");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableDynamicArray0.get((int) (short) 0);
        java.util.Iterator iterator7 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.put(0, (java.lang.Comparable<java.lang.String>) "[[[[hi!]]], , [hi!, []], [[hi!]]]");
        boolean boolean11 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray0.get((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertNull(strComparable6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull(strComparable13);
    }

    @Test
    public void test3869() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3869");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        java.lang.String str5 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray0.remove((int) (short) 10);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        int int9 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableDynamicArray0.spliterator();
        java.util.Iterator iterator11 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertNotNull(iterator11);
    }

    @Test
    public void test3870() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3870");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        strComparableDynamicArray0.put((int) (short) 10, (java.lang.Comparable<java.lang.String>) "[]");
        java.lang.String str12 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator13 = strComparableDynamicArray0.spliterator();
        int int14 = strComparableDynamicArray0.getSize();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream15 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[hi!, []]" + "'", str12, "[hi!, []]");
        org.junit.Assert.assertNotNull(strComparableSpliterator13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(strComparableStream15);
    }

    @Test
    public void test3871() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3871");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator iterator11 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray0.get((int) (byte) 10);
        java.util.Iterator iterator14 = strComparableDynamicArray0.iterator();
        java.util.Iterator iterator15 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[hi!]]");
        java.util.Iterator iterator18 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable20 = strComparableDynamicArray0.get((int) (byte) 10);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[, [hi!], [[], hi!, , ], [[, ]]], [hi!]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertNotNull(iterator14);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNull(strComparable20);
    }

    @Test
    public void test3872() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3872");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, []]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream5 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray0.get((int) (short) 0);
        boolean boolean8 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDynamicArray0.remove(0);
        boolean boolean13 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertNotNull(strComparableStream5);
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(strComparable12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3873() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3873");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[hi!]]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream10 = strComparableDynamicArray0.stream();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable12 = strComparableDynamicArray0.get((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableStream10);
    }

    @Test
    public void test3874() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3874");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator iterator11 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.put((int) (short) 10, (java.lang.Comparable<java.lang.String>) "[[], hi!]");
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDynamicArray0.get((int) (short) 10);
        java.lang.Comparable<java.lang.String> strComparable17 = null;
        strComparableDynamicArray0.add(strComparable17);
        java.lang.Comparable<java.lang.String> strComparable19 = null;
        strComparableDynamicArray0.add(strComparable19);
        java.util.Iterator iterator21 = strComparableDynamicArray0.iterator();
        int int22 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator23 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertEquals("'" + strComparable16 + "' != '" + "[[], hi!]" + "'", strComparable16, "[[], hi!]");
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 5 + "'", int22 == 5);
        org.junit.Assert.assertNotNull(strComparableSpliterator23);
    }

    @Test
    public void test3875() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3875");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream3 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[], hi!]");
        strComparableDynamicArray0.put((int) (byte) 10, (java.lang.Comparable<java.lang.String>) "[[hi!, [hi!]], , []]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertNotNull(strComparableStream3);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
    }

    @Test
    public void test3876() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3876");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!]");
        java.util.Iterator iterator12 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[], hi!, , ]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[, ]]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [hi!]]");
        boolean boolean19 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test3877() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3877");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDynamicArray0.get(0);
        java.util.Iterator iterator13 = strComparableDynamicArray0.iterator();
        int int14 = strComparableDynamicArray0.getSize();
        boolean boolean15 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[], hi!, , ]");
        int int18 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable20 = strComparableDynamicArray0.remove((int) (byte) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(strComparable12);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNull(strComparable20);
    }

    @Test
    public void test3878() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3878");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator6 = strComparableDynamicArray0.iterator();
        java.util.Iterator iterator7 = strComparableDynamicArray0.iterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream8 = strComparableDynamicArray0.stream();
        boolean boolean9 = strComparableDynamicArray0.isEmpty();
        java.lang.String str10 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDynamicArray0.get((int) (byte) 10);
        java.lang.String str13 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDynamicArray0.get(10);
        boolean boolean16 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(strComparableStream8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNull(strComparable12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[]" + "'", str13, "[]");
        org.junit.Assert.assertNull(strComparable15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3879() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3879");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, ]");
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDynamicArray0.remove(10);
        int int13 = strComparableDynamicArray0.getSize();
        java.lang.String str14 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.put(0, (java.lang.Comparable<java.lang.String>) "[[[], [hi!, hi!, [hi!], [hi!]]]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strComparable12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[]" + "'", str14, "[]");
    }

    @Test
    public void test3880() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3880");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.String str1 = strComparableDynamicArray0.toString();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream2 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator3 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[]");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray0.get((int) (byte) 10);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream8 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[]" + "'", str1, "[]");
        org.junit.Assert.assertNotNull(strComparableStream2);
        org.junit.Assert.assertNotNull(iterator3);
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertNotNull(strComparableStream8);
    }

    @Test
    public void test3881() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3881");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>(0);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableDynamicArray1.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream3 = strComparableDynamicArray1.stream();
        java.lang.String str4 = strComparableDynamicArray1.toString();
        java.util.Iterator iterator5 = strComparableDynamicArray1.iterator();
        boolean boolean6 = strComparableDynamicArray1.isEmpty();
        boolean boolean7 = strComparableDynamicArray1.isEmpty();
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertNotNull(strComparableStream3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3882() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3882");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        java.lang.String str4 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        int int9 = strComparableDynamicArray0.getSize();
        java.lang.String str10 = strComparableDynamicArray0.toString();
        int int11 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray0.get(2);
        boolean boolean14 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[hi!]" + "'", str10, "[hi!]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3883() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3883");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        int int2 = strComparableDynamicArray1.getSize();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream3 = strComparableDynamicArray1.stream();
        strComparableDynamicArray1.put(1, (java.lang.Comparable<java.lang.String>) "[, [[, ]]]");
        boolean boolean7 = strComparableDynamicArray1.isEmpty();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(strComparableStream3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test3884() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3884");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableDynamicArray0.remove((int) (short) 0);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableDynamicArray0.spliterator();
        int int8 = strComparableDynamicArray0.getSize();
        boolean boolean9 = strComparableDynamicArray0.isEmpty();
        java.lang.String str10 = strComparableDynamicArray0.toString();
        java.lang.String str11 = strComparableDynamicArray0.toString();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray0.remove((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strComparable6);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
    }

    @Test
    public void test3885() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3885");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream2 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableDynamicArray0.get(1);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int7 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDynamicArray0.get(0);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream11 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.put((int) (short) 10, (java.lang.Comparable<java.lang.String>) "[[, [hi!], [[], hi!, , ], [[, ]]], [hi!]]");
        boolean boolean15 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator16 = strComparableDynamicArray0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator17 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream2);
        org.junit.Assert.assertNull(strComparable4);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertEquals("'" + strComparable10 + "' != '" + "hi!" + "'", strComparable10, "hi!");
        org.junit.Assert.assertNotNull(strComparableStream11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator16);
        org.junit.Assert.assertNotNull(strComparableSpliterator17);
    }

    @Test
    public void test3886() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3886");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream2 = strComparableDynamicArray0.stream();
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDynamicArray0.get((int) (byte) 1);
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        int int7 = strComparableDynamicArray0.getSize();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream8 = strComparableDynamicArray0.stream();
        java.lang.String str9 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(strComparableStream8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
    }

    @Test
    public void test3887() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3887");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator1 = strComparableDynamicArray0.spliterator();
        boolean boolean2 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableDynamicArray0.spliterator();
        java.lang.Class<?> wildcardClass4 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertNotNull(strComparableSpliterator1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test3888() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3888");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator4 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(iterator4);
    }

    @Test
    public void test3889() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3889");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDynamicArray0.get(0);
        java.util.Iterator iterator13 = strComparableDynamicArray0.iterator();
        int int14 = strComparableDynamicArray0.getSize();
        boolean boolean15 = strComparableDynamicArray0.isEmpty();
        int int16 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator17 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put((int) (short) 10, (java.lang.Comparable<java.lang.String>) "[[hi!]]");
        java.lang.Comparable<java.lang.String> strComparable22 = strComparableDynamicArray0.remove((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(strComparable12);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator17);
        org.junit.Assert.assertEquals("'" + strComparable22 + "' != '" + "[[hi!]]" + "'", strComparable22, "[[hi!]]");
    }

    @Test
    public void test3890() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3890");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        int int5 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[[[hi!]]], , [hi!, []], [[hi!]]]");
        strComparableDynamicArray0.put(5, (java.lang.Comparable<java.lang.String>) "[[]]");
        java.lang.String str12 = strComparableDynamicArray0.toString();
        java.lang.String str13 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[[[[[hi!]]], , [hi!, []], [[hi!]]], [[]]]" + "'", str12, "[[[[[hi!]]], , [hi!, []], [[hi!]]], [[]]]");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[[[[[hi!]]], , [hi!, []], [[hi!]]], [[]]]" + "'", str13, "[[[[[hi!]]], , [hi!, []], [[hi!]]], [[]]]");
    }

    @Test
    public void test3891() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3891");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.put(2, (java.lang.Comparable<java.lang.String>) "[hi!]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[hi!]]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable11 = strComparableDynamicArray0.remove((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test3892() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3892");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>(0);
        java.util.Iterator iterator2 = strComparableDynamicArray1.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable4 = strComparableDynamicArray1.get(10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 10 out of bounds for length 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(iterator2);
    }

    @Test
    public void test3893() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3893");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        strComparableDynamicArray1.add((java.lang.Comparable<java.lang.String>) "[, ]");
        boolean boolean4 = strComparableDynamicArray1.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream5 = strComparableDynamicArray1.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableDynamicArray1.stream();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray1.get(2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strComparableStream5);
        org.junit.Assert.assertNotNull(strComparableStream6);
        org.junit.Assert.assertNull(strComparable8);
    }

    @Test
    public void test3894() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3894");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        java.lang.String str4 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, []]");
        int int9 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableDynamicArray0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableDynamicArray0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableDynamicArray0.spliterator();
        java.lang.String str13 = strComparableDynamicArray0.toString();
        java.lang.String str14 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDynamicArray0.get((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[hi!, [hi!, []]]" + "'", str13, "[hi!, [hi!, []]]");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "[hi!, [hi!, []]]" + "'", str14, "[hi!, [hi!, []]]");
        org.junit.Assert.assertNull(strComparable16);
    }

    @Test
    public void test3895() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3895");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator iterator11 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray0.get((int) (byte) 10);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream14 = strComparableDynamicArray0.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream15 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableDynamicArray0.get(3);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator18 = strComparableDynamicArray0.spliterator();
        int int19 = strComparableDynamicArray0.getSize();
        java.lang.Class<?> wildcardClass20 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertNotNull(strComparableStream14);
        org.junit.Assert.assertNotNull(strComparableStream15);
        org.junit.Assert.assertNull(strComparable17);
        org.junit.Assert.assertNotNull(strComparableSpliterator18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(wildcardClass20);
    }

    @Test
    public void test3896() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3896");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        boolean boolean11 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put((int) (short) 10, (java.lang.Comparable<java.lang.String>) "hi!");
        int int16 = strComparableDynamicArray0.getSize();
        java.lang.String str17 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[hi!, hi!]" + "'", str17, "[hi!, hi!]");
    }

    @Test
    public void test3897() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3897");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[hi!]]");
        java.lang.String str10 = strComparableDynamicArray0.toString();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream11 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[[], hi!, [[hi!]]]" + "'", str10, "[[], hi!, [[hi!]]]");
        org.junit.Assert.assertNotNull(strComparableStream11);
    }

    @Test
    public void test3898() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3898");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.String str1 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableDynamicArray0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream4 = strComparableDynamicArray0.stream();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[]" + "'", str1, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
    }

    @Test
    public void test3899() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3899");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>(100);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream2 = strComparableDynamicArray1.stream();
        strComparableDynamicArray1.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray1.put(1, (java.lang.Comparable<java.lang.String>) "[[hi!]]");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray1.get(0);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableDynamicArray1.spliterator();
        strComparableDynamicArray1.add((java.lang.Comparable<java.lang.String>) "[[], [hi!, hi!, [hi!], [hi!]]]");
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDynamicArray1.get((int) ' ');
        org.junit.Assert.assertNotNull(strComparableStream2);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "" + "'", strComparable9, "");
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertNull(strComparable14);
    }

    @Test
    public void test3900() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3900");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        java.lang.String str5 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray0.remove((int) (short) 10);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        boolean boolean9 = strComparableDynamicArray0.isEmpty();
        boolean boolean10 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator11 = strComparableDynamicArray0.iterator();
        boolean boolean12 = strComparableDynamicArray0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            strComparableDynamicArray0.put((int) 'a', (java.lang.Comparable<java.lang.String>) "[[, []], [hi!]]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
    }

    @Test
    public void test3901() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3901");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream2 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableDynamicArray0.get(1);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "[[], [hi!, hi!, [hi!], [hi!]]]");
        java.lang.String str10 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableDynamicArray0.spliterator();
        int int12 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream2);
        org.junit.Assert.assertNull(strComparable4);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[[[], [hi!, hi!, [hi!], [hi!]]]]" + "'", str10, "[[[], [hi!, hi!, [hi!], [hi!]]]]");
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test3902() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3902");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        int int5 = strComparableDynamicArray0.getSize();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, hi!, [hi!], [hi!]]");
        java.util.Iterator iterator9 = strComparableDynamicArray0.iterator();
        boolean boolean10 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(strComparableStream6);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3903() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3903");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        java.lang.String str9 = strComparableDynamicArray0.toString();
        int int10 = strComparableDynamicArray0.getSize();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream11 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableDynamicArray0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDynamicArray0.remove(4);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[[], hi!]" + "'", str9, "[[], hi!]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(strComparableStream11);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertNull(strComparable14);
    }

    @Test
    public void test3904() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3904");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableDynamicArray0.spliterator();
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDynamicArray0.remove((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable14 = strComparableDynamicArray0.get((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(strComparable12);
    }

    @Test
    public void test3905() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3905");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[hi!]]");
        java.lang.String str10 = strComparableDynamicArray0.toString();
        boolean boolean11 = strComparableDynamicArray0.isEmpty();
        boolean boolean12 = strComparableDynamicArray0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable14 = strComparableDynamicArray0.get((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[[], hi!, [[hi!]]]" + "'", str10, "[[], hi!, [[hi!]]]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test3906() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3906");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.String str1 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.put(0, (java.lang.Comparable<java.lang.String>) "[hi!]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator7 = strComparableDynamicArray0.iterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream8 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableDynamicArray0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray0.get(0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "[]" + "'", str1, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNotNull(strComparableStream6);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(strComparableStream8);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertEquals("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13, "hi!");
    }

    @Test
    public void test3907() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3907");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        int int7 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable10 = strComparableDynamicArray0.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(iterator8);
    }

    @Test
    public void test3908() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3908");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.put(2, (java.lang.Comparable<java.lang.String>) "[[], hi!, [[hi!]]]");
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDynamicArray0.get(1);
        java.lang.Class<?> wildcardClass16 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertEquals("'" + strComparable15 + "' != '" + "hi!" + "'", strComparable15, "hi!");
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3909() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3909");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [hi!]]");
        java.util.Iterator iterator9 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDynamicArray0.remove((int) (short) 1);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableDynamicArray0.spliterator();
        int int13 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertEquals("'" + strComparable11 + "' != '" + "[]" + "'", strComparable11, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
    }

    @Test
    public void test3910() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3910");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream4 = strComparableDynamicArray0.stream();
        int int5 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray0.remove((int) (byte) 10);
        java.lang.String str8 = strComparableDynamicArray0.toString();
        java.lang.String str9 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDynamicArray0.get(0);
        boolean boolean12 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream13 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNull(strComparable11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(strComparableStream13);
    }

    @Test
    public void test3911() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3911");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray0.remove(1);
        // The following exception was thrown during execution in test generation
        try {
            strComparableDynamicArray0.put((int) (short) 100, (java.lang.Comparable<java.lang.String>) "[[], hi!, ]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull(strComparable7);
    }

    @Test
    public void test3912() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3912");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        java.lang.String str5 = strComparableDynamicArray0.toString();
        int int6 = strComparableDynamicArray0.getSize();
        boolean boolean7 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put((int) (short) 1, (java.lang.Comparable<java.lang.String>) "[hi!]");
        boolean boolean12 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [hi!]]");
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDynamicArray0.remove(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable18 = strComparableDynamicArray0.remove((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(strComparable16);
    }

    @Test
    public void test3913() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3913");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableDynamicArray0.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [hi!]]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, hi!, [[hi!, hi!, [hi!]]]]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[, ]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableStream6);
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
    }

    @Test
    public void test3914() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3914");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable8 = null;
        strComparableDynamicArray0.put((int) (short) 1, strComparable8);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!]");
        java.util.Iterator iterator12 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test3915() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3915");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        int int7 = strComparableDynamicArray0.getSize();
        boolean boolean8 = strComparableDynamicArray0.isEmpty();
        boolean boolean9 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.put((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "[]");
        java.util.Iterator iterator13 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(iterator13);
    }

    @Test
    public void test3916() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3916");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put(10, (java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableDynamicArray0.isEmpty();
        int int13 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableDynamicArray0.spliterator();
        java.lang.Class<?> wildcardClass15 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
        org.junit.Assert.assertNotNull(wildcardClass15);
    }

    @Test
    public void test3917() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3917");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.remove((int) (byte) 10);
        strComparableDynamicArray0.put(10, (java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, hi!, [[], hi!]]");
        boolean boolean14 = strComparableDynamicArray0.isEmpty();
        java.lang.String str15 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[[hi!, hi!, [[], hi!]], ]" + "'", str15, "[[hi!, hi!, [[], hi!]], ]");
    }

    @Test
    public void test3918() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3918");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        boolean boolean9 = strComparableDynamicArray0.isEmpty();
        java.lang.String str10 = strComparableDynamicArray0.toString();
        java.lang.String str11 = strComparableDynamicArray0.toString();
        int int12 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDynamicArray0.get((int) (byte) 0);
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDynamicArray0.get((int) (byte) 0);
        java.lang.String str17 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[]" + "'", str11, "[]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNull(strComparable14);
        org.junit.Assert.assertNull(strComparable16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[]" + "'", str17, "[]");
    }

    @Test
    public void test3919() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3919");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream3 = strComparableDynamicArray0.stream();
        int int4 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator5 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray0.get((int) (byte) 10);
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray0.get((int) (byte) 1);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[[], hi!], []]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertNotNull(strComparableStream3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertNull(strComparable9);
    }

    @Test
    public void test3920() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3920");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableDynamicArray0.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray0.get((int) (byte) 0);
        java.lang.String str10 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableDynamicArray0.spliterator();
        java.util.Iterator iterator12 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(strComparableStream6);
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertNull(strComparable9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[]" + "'", str10, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNotNull(iterator12);
    }

    @Test
    public void test3921() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3921");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream4 = strComparableDynamicArray0.stream();
        int int5 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray0.remove((int) (byte) 10);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream8 = strComparableDynamicArray0.stream();
        java.lang.Class<?> wildcardClass9 = strComparableStream8.getClass();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertNotNull(strComparableStream8);
        org.junit.Assert.assertNotNull(wildcardClass9);
    }

    @Test
    public void test3922() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3922");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator iterator11 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator iterator14 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable15 = null;
        strComparableDynamicArray0.add(strComparable15);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(iterator14);
    }

    @Test
    public void test3923() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3923");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        int int7 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[]");
        java.lang.String str10 = strComparableDynamicArray0.toString();
        java.lang.String str11 = strComparableDynamicArray0.toString();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream12 = strComparableDynamicArray0.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream13 = strComparableDynamicArray0.stream();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable15 = strComparableDynamicArray0.remove((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 97 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[hi!, []]" + "'", str10, "[hi!, []]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!, []]" + "'", str11, "[hi!, []]");
        org.junit.Assert.assertNotNull(strComparableStream12);
        org.junit.Assert.assertNotNull(strComparableStream13);
    }

    @Test
    public void test3924() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3924");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        int int7 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray0.remove(3);
        int int10 = strComparableDynamicArray0.getSize();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable12 = strComparableDynamicArray0.get(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNull(strComparable9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test3925() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3925");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.put((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "[]");
        java.util.Iterator iterator13 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDynamicArray0.remove((int) (short) 1);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator16 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [hi!], [[], hi!]]");
        java.util.Iterator iterator19 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator20 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertEquals("'" + strComparable15 + "' != '" + "hi!" + "'", strComparable15, "hi!");
        org.junit.Assert.assertNotNull(strComparableSpliterator16);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(strComparableSpliterator20);
    }

    @Test
    public void test3926() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3926");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        int int5 = strComparableDynamicArray0.getSize();
        int int6 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
    }

    @Test
    public void test3927() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3927");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableDynamicArray0.remove((int) (short) 0);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableDynamicArray0.spliterator();
        int int8 = strComparableDynamicArray0.getSize();
        boolean boolean9 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.put(10, (java.lang.Comparable<java.lang.String>) "[hi!, hi!]");
        int int13 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator14 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.put(2, (java.lang.Comparable<java.lang.String>) "[, ]");
        strComparableDynamicArray0.put((int) (short) 1, (java.lang.Comparable<java.lang.String>) "hi!");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strComparable6);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(iterator14);
    }

    @Test
    public void test3928() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3928");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put(10, (java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream13 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str16 = strComparableDynamicArray0.toString();
        java.util.Iterator iterator17 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator18 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strComparableStream13);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[[], hi!, , ]" + "'", str16, "[[], hi!, , ]");
        org.junit.Assert.assertNotNull(iterator17);
        org.junit.Assert.assertNotNull(strComparableSpliterator18);
    }

    @Test
    public void test3929() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3929");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!]");
        java.util.Iterator iterator12 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[], hi!, , ]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator15 = strComparableDynamicArray0.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable17 = strComparableDynamicArray0.remove((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 35 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(strComparableSpliterator15);
    }

    @Test
    public void test3930() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3930");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        java.lang.String str7 = strComparableDynamicArray0.toString();
        boolean boolean8 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableDynamicArray0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableDynamicArray0.spliterator();
        java.lang.Class<?> wildcardClass11 = strComparableSpliterator10.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3931() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3931");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        int int7 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[]");
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        int int11 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.put(2, (java.lang.Comparable<java.lang.String>) "[hi!]");
        java.lang.String str15 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableDynamicArray0.get((int) (short) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[hi!, [hi!]]" + "'", str15, "[hi!, [hi!]]");
        org.junit.Assert.assertNull(strComparable17);
    }

    @Test
    public void test3932() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3932");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        int int7 = strComparableDynamicArray0.getSize();
        boolean boolean8 = strComparableDynamicArray0.isEmpty();
        // The following exception was thrown during execution in test generation
        try {
            strComparableDynamicArray0.put((int) (short) 100, (java.lang.Comparable<java.lang.String>) "[[[hi!, [hi!]]], ]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3933() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3933");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableDynamicArray0.remove((int) (short) 0);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableDynamicArray0.stream();
        boolean boolean8 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.put(2, (java.lang.Comparable<java.lang.String>) "[hi!]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, [hi!], [[], hi!, , ], [[, ]]]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [[hi!]]]");
        int int17 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strComparable6);
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
    }

    @Test
    public void test3934() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3934");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator6 = strComparableDynamicArray0.spliterator();
        int int7 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray0.remove((int) (byte) 0);
        boolean boolean10 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableDynamicArray0.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray0.remove(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNotNull(strComparableSpliterator6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "" + "'", strComparable9, "");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
    }

    @Test
    public void test3935() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3935");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        java.util.Iterator iterator9 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, []]");
        boolean boolean12 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream13 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(iterator9);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strComparableStream13);
    }

    @Test
    public void test3936() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3936");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator7 = strComparableDynamicArray0.iterator();
        java.lang.String str8 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, []]");
        boolean boolean11 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator12 = strComparableDynamicArray0.iterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream13 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[hi!]" + "'", str8, "[hi!]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertNotNull(strComparableStream13);
    }

    @Test
    public void test3937() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3937");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable8 = null;
        strComparableDynamicArray0.put((int) (short) 1, strComparable8);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!]");
        java.lang.String str12 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDynamicArray0.get((int) (short) 1);
        int int15 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator16 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[[hi!]]" + "'", str12, "[[hi!]]");
        org.junit.Assert.assertEquals("'" + strComparable14 + "' != '" + "[hi!]" + "'", strComparable14, "[hi!]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2 + "'", int15 == 2);
        org.junit.Assert.assertNotNull(strComparableSpliterator16);
    }

    @Test
    public void test3938() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3938");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream8 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableDynamicArray0.spliterator();
        boolean boolean10 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.put((int) (short) 10, (java.lang.Comparable<java.lang.String>) "[hi!, [hi!]]");
        strComparableDynamicArray0.put((int) (byte) 10, (java.lang.Comparable<java.lang.String>) "hi!");
        int int17 = strComparableDynamicArray0.getSize();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream18 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertNotNull(strComparableStream8);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2 + "'", int17 == 2);
        org.junit.Assert.assertNotNull(strComparableStream18);
    }

    @Test
    public void test3939() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3939");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableDynamicArray0.remove((int) (short) 0);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableDynamicArray0.spliterator();
        int int8 = strComparableDynamicArray0.getSize();
        boolean boolean9 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "[[[[[hi!]]], , [hi!, []], [[hi!]]], [[]]]");
        boolean boolean14 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strComparable6);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test3940() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3940");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        int int7 = strComparableDynamicArray0.getSize();
        boolean boolean8 = strComparableDynamicArray0.isEmpty();
        boolean boolean9 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableDynamicArray0.add(strComparable10);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableDynamicArray0.spliterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable14 = strComparableDynamicArray0.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
    }

    @Test
    public void test3941() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3941");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        int int7 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[]");
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableDynamicArray0.spliterator();
        java.util.Iterator iterator12 = strComparableDynamicArray0.iterator();
        int int13 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDynamicArray0.remove(1);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator16 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put(2, (java.lang.Comparable<java.lang.String>) "[[hi!, hi!, [hi!]]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertEquals("'" + strComparable15 + "' != '" + "hi!" + "'", strComparable15, "hi!");
        org.junit.Assert.assertNotNull(strComparableSpliterator16);
    }

    @Test
    public void test3942() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3942");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDynamicArray0.get(0);
        java.util.Iterator iterator13 = strComparableDynamicArray0.iterator();
        int int14 = strComparableDynamicArray0.getSize();
        boolean boolean15 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[], hi!, , ]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator18 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(strComparable12);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator18);
    }

    @Test
    public void test3943() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3943");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        java.lang.String str4 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        java.util.Iterator iterator6 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get(10);
        java.lang.String str9 = strComparableDynamicArray0.toString();
        int int10 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableDynamicArray0.spliterator();
        java.lang.Class<?> wildcardClass12 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNotNull(wildcardClass12);
    }

    @Test
    public void test3944() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3944");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        java.lang.String str4 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str8 = strComparableDynamicArray0.toString();
        java.lang.String str9 = strComparableDynamicArray0.toString();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream10 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, [hi!]]");
        boolean boolean13 = strComparableDynamicArray0.isEmpty();
        int int14 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(strComparableStream10);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
    }

    @Test
    public void test3945() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3945");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        java.lang.String str4 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable7 = null;
        strComparableDynamicArray0.put(1, strComparable7);
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDynamicArray0.get((int) (short) 0);
        java.util.Iterator iterator11 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNull(strComparable10);
        org.junit.Assert.assertNotNull(iterator11);
    }

    @Test
    public void test3946() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3946");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        boolean boolean11 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableDynamicArray0.spliterator();
        java.lang.Class<?> wildcardClass13 = strComparableSpliterator12.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test3947() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3947");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator7 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[], hi!, , ]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, hi!, [hi!]]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, ]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream14 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator15 = strComparableDynamicArray0.iterator();
        java.lang.Class<?> wildcardClass16 = iterator15.getClass();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(strComparableStream14);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test3948() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3948");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        int int7 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[]");
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableDynamicArray0.spliterator();
        java.util.Iterator iterator12 = strComparableDynamicArray0.iterator();
        int int13 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDynamicArray0.remove(1);
        int int16 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        int int19 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable21 = strComparableDynamicArray0.get(0);
        int int22 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertEquals("'" + strComparable15 + "' != '" + "hi!" + "'", strComparable15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNull(strComparable21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 3 + "'", int22 == 3);
    }

    @Test
    public void test3949() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3949");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, ]");
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray0.remove(10);
        java.lang.String str8 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[]" + "'", str8, "[]");
    }

    @Test
    public void test3950() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3950");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str4 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[hi!, hi!]]");
        boolean boolean7 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray0.remove(1);
        boolean boolean10 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[hi!]" + "'", str4, "[hi!]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "[[hi!, hi!]]" + "'", strComparable9, "[[hi!, hi!]]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test3951() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3951");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        java.lang.String str5 = strComparableDynamicArray0.toString();
        int int6 = strComparableDynamicArray0.getSize();
        boolean boolean7 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put((int) (short) 1, (java.lang.Comparable<java.lang.String>) "[hi!]");
        boolean boolean12 = strComparableDynamicArray0.isEmpty();
        java.lang.String str13 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.put(4, (java.lang.Comparable<java.lang.String>) "[[hi!]]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream17 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[[hi!]]" + "'", str13, "[[hi!]]");
        org.junit.Assert.assertNotNull(strComparableStream17);
    }

    @Test
    public void test3952() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3952");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable5 = strComparableDynamicArray0.remove(2);
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        java.lang.Class<?> wildcardClass7 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNull(strComparable5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test3953() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3953");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>((int) (short) 10);
        strComparableDynamicArray1.put(4, (java.lang.Comparable<java.lang.String>) "[hi!, []]");
        java.lang.String str5 = strComparableDynamicArray1.toString();
        strComparableDynamicArray1.put(3, (java.lang.Comparable<java.lang.String>) "[[, ]]");
        boolean boolean9 = strComparableDynamicArray1.isEmpty();
        strComparableDynamicArray1.add((java.lang.Comparable<java.lang.String>) "[[[hi!, [hi!]]], [[[[hi!]]], , [hi!, []], [[hi!]]]]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[[hi!, []]]" + "'", str5, "[[hi!, []]]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test3954() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3954");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableDynamicArray0.spliterator();
        boolean boolean10 = strComparableDynamicArray0.isEmpty();
        int int11 = strComparableDynamicArray0.getSize();
        java.lang.String str12 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[], hi!]");
        boolean boolean15 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream16 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[]" + "'", str12, "[]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strComparableStream16);
    }

    @Test
    public void test3955() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3955");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator iterator6 = strComparableDynamicArray0.iterator();
        java.lang.String str7 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray0.get((int) (short) 0);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableDynamicArray0.spliterator();
        java.util.Iterator iterator11 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray0.get((int) (byte) 0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(iterator6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[hi!]" + "'", str7, "[hi!]");
        org.junit.Assert.assertNull(strComparable9);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(strComparable13);
    }

    @Test
    public void test3956() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3956");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        int int7 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[]");
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream12 = strComparableDynamicArray0.stream();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable14 = strComparableDynamicArray0.remove((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNotNull(strComparableStream12);
    }

    @Test
    public void test3957() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3957");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        java.lang.String str5 = strComparableDynamicArray0.toString();
        int int6 = strComparableDynamicArray0.getSize();
        boolean boolean7 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put((int) (short) 1, (java.lang.Comparable<java.lang.String>) "[hi!]");
        int int12 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDynamicArray0.get((int) (short) 10);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNull(strComparable14);
    }

    @Test
    public void test3958() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3958");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        java.lang.String str7 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(strComparableStream9);
    }

    @Test
    public void test3959() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3959");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator iterator11 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray0.get((int) (byte) 10);
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDynamicArray0.get(0);
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableDynamicArray0.get(4);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertNull(strComparable15);
        org.junit.Assert.assertNull(strComparable17);
    }

    @Test
    public void test3960() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3960");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        java.lang.String str7 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable10 = strComparableDynamicArray0.remove((int) (byte) 0);
        strComparableDynamicArray0.put(3, (java.lang.Comparable<java.lang.String>) "[, [hi!, []]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[]" + "'", str7, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNull(strComparable10);
    }

    @Test
    public void test3961() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3961");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray0.remove(2);
        boolean boolean8 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [], hi!]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable12 = strComparableDynamicArray0.remove((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNull(strComparable7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test3962() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3962");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable6 = strComparableDynamicArray0.remove((int) (short) 0);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator7 = strComparableDynamicArray0.spliterator();
        int int8 = strComparableDynamicArray0.getSize();
        boolean boolean9 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream10 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDynamicArray0.get((int) (byte) 0);
        int int13 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, hi!]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream16 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable18 = strComparableDynamicArray0.remove(2);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator19 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNull(strComparable6);
        org.junit.Assert.assertNotNull(strComparableSpliterator7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(strComparableStream10);
        org.junit.Assert.assertNull(strComparable12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(strComparableStream16);
        org.junit.Assert.assertNull(strComparable18);
        org.junit.Assert.assertNotNull(strComparableSpliterator19);
    }

    @Test
    public void test3963() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3963");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream4 = strComparableDynamicArray0.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream5 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[[[hi!]]], , [hi!, []], [[hi!]]]");
        strComparableDynamicArray0.put((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "[[hi!, [hi!]]]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableDynamicArray0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [[], hi!], [[hi!, hi!, [hi!]]]]");
        java.util.Iterator iterator15 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertNotNull(strComparableStream5);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertNotNull(iterator15);
    }

    @Test
    public void test3964() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3964");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        java.lang.String str9 = strComparableDynamicArray0.toString();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream10 = strComparableDynamicArray0.stream();
        boolean boolean11 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream12 = strComparableDynamicArray0.stream();
        java.lang.String str13 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[[], hi!]]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator16 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[hi!]" + "'", str9, "[hi!]");
        org.junit.Assert.assertNotNull(strComparableStream10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strComparableStream12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[hi!]" + "'", str13, "[hi!]");
        org.junit.Assert.assertNotNull(strComparableSpliterator16);
    }

    @Test
    public void test3965() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3965");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[hi!]]");
        java.lang.String str10 = strComparableDynamicArray0.toString();
        boolean boolean11 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray0.get((int) (byte) 0);
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator14 = strComparableDynamicArray0.spliterator();
        int int15 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[[], hi!, [[hi!]]]" + "'", str10, "[[], hi!, [[hi!]]]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + strComparable13 + "' != '" + "[]" + "'", strComparable13, "[]");
        org.junit.Assert.assertNotNull(strComparableSpliterator14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 3 + "'", int15 == 3);
    }

    @Test
    public void test3966() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3966");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator iterator11 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.put((int) (short) 10, (java.lang.Comparable<java.lang.String>) "[[], hi!]");
        java.lang.Comparable<java.lang.String> strComparable16 = strComparableDynamicArray0.get((int) (short) 10);
        java.lang.Comparable<java.lang.String> strComparable17 = null;
        strComparableDynamicArray0.add(strComparable17);
        int int19 = strComparableDynamicArray0.getSize();
        boolean boolean20 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream21 = strComparableDynamicArray0.stream();
        boolean boolean22 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream23 = strComparableDynamicArray0.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream24 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable26 = strComparableDynamicArray0.remove(3);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream27 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertEquals("'" + strComparable16 + "' != '" + "[[], hi!]" + "'", strComparable16, "[[], hi!]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 4 + "'", int19 == 4);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(strComparableStream21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(strComparableStream23);
        org.junit.Assert.assertNotNull(strComparableStream24);
        org.junit.Assert.assertNull(strComparable26);
        org.junit.Assert.assertNotNull(strComparableStream27);
    }

    @Test
    public void test3967() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3967");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[]");
        int int8 = strComparableDynamicArray0.getSize();
        // The following exception was thrown during execution in test generation
        try {
            strComparableDynamicArray0.put((int) (byte) 100, (java.lang.Comparable<java.lang.String>) "[[hi!], [hi!, hi!]]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test3968() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3968");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        int int7 = strComparableDynamicArray0.getSize();
        boolean boolean8 = strComparableDynamicArray0.isEmpty();
        boolean boolean9 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable10 = null;
        strComparableDynamicArray0.add(strComparable10);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream12 = strComparableDynamicArray0.stream();
        int int13 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[[], hi!, , ]]");
        java.lang.String str16 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator17 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strComparableStream12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[[[[], hi!, , ]]]" + "'", str16, "[[[[], hi!, , ]]]");
        org.junit.Assert.assertNotNull(strComparableSpliterator17);
    }

    @Test
    public void test3969() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3969");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        int int7 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[]");
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableDynamicArray0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray0.get(10);
        boolean boolean14 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNull(strComparable13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
    }

    @Test
    public void test3970() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3970");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.put(0, (java.lang.Comparable<java.lang.String>) "[hi!]");
        java.util.Iterator iterator7 = strComparableDynamicArray0.iterator();
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableDynamicArray0.spliterator();
        java.lang.String str10 = strComparableDynamicArray0.toString();
        java.util.Iterator iterator11 = strComparableDynamicArray0.iterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream12 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(iterator7);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "[[hi!]]" + "'", str10, "[[hi!]]");
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertNotNull(strComparableStream12);
    }

    @Test
    public void test3971() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3971");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        int int7 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[]");
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableDynamicArray0.spliterator();
        java.util.Iterator iterator12 = strComparableDynamicArray0.iterator();
        int int13 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDynamicArray0.remove(1);
        int int16 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, [[hi!]]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertEquals("'" + strComparable15 + "' != '" + "hi!" + "'", strComparable15, "hi!");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test3972() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3972");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        int int7 = strComparableDynamicArray0.getSize();
        java.lang.String str8 = strComparableDynamicArray0.toString();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream10 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator11 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream12 = strComparableDynamicArray0.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream13 = strComparableDynamicArray0.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream14 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.put((int) (byte) 1, (java.lang.Comparable<java.lang.String>) "[[[[hi!]]]]");
        java.util.Iterator iterator18 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[hi!]" + "'", str8, "[hi!]");
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(strComparableStream10);
        org.junit.Assert.assertNotNull(strComparableSpliterator11);
        org.junit.Assert.assertNotNull(strComparableStream12);
        org.junit.Assert.assertNotNull(strComparableStream13);
        org.junit.Assert.assertNotNull(strComparableStream14);
        org.junit.Assert.assertNotNull(iterator18);
    }

    @Test
    public void test3973() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3973");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream4 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!]");
        java.lang.String str8 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, hi!]");
        strComparableDynamicArray0.put(4, (java.lang.Comparable<java.lang.String>) "[[], hi!]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream14 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.put((int) (byte) 0, (java.lang.Comparable<java.lang.String>) "[, ]");
        boolean boolean18 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable20 = strComparableDynamicArray0.get(5);
        java.util.Iterator iterator21 = strComparableDynamicArray0.iterator();
        java.util.Iterator iterator22 = strComparableDynamicArray0.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable24 = strComparableDynamicArray0.get((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[hi!, [hi!]]" + "'", str8, "[hi!, [hi!]]");
        org.junit.Assert.assertNotNull(strComparableStream14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(strComparable20);
        org.junit.Assert.assertNotNull(iterator21);
        org.junit.Assert.assertNotNull(iterator22);
    }

    @Test
    public void test3974() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3974");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDynamicArray0.get(0);
        java.util.Iterator iterator13 = strComparableDynamicArray0.iterator();
        int int14 = strComparableDynamicArray0.getSize();
        java.lang.String str15 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, hi!]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream18 = strComparableDynamicArray0.stream();
        boolean boolean19 = strComparableDynamicArray0.isEmpty();
        int int20 = strComparableDynamicArray0.getSize();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream21 = strComparableDynamicArray0.stream();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(strComparable12);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "[hi!]" + "'", str15, "[hi!]");
        org.junit.Assert.assertNotNull(strComparableStream18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertNotNull(strComparableStream21);
    }

    @Test
    public void test3975() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3975");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDynamicArray0.get(0);
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDynamicArray0.get(0);
        boolean boolean15 = strComparableDynamicArray0.isEmpty();
        java.lang.String str16 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNull(strComparable12);
        org.junit.Assert.assertNull(strComparable14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "[hi!]" + "'", str16, "[hi!]");
    }

    @Test
    public void test3976() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3976");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator2 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator3 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put((int) (short) 10, (java.lang.Comparable<java.lang.String>) "[[], hi!, , ]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableDynamicArray0.stream();
        java.lang.String str8 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream10 = strComparableDynamicArray0.stream();
        int int11 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(iterator2);
        org.junit.Assert.assertNotNull(strComparableSpliterator3);
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "[[[], hi!, , ]]" + "'", str8, "[[[], hi!, , ]]");
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertNotNull(strComparableStream10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test3977() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3977");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator9 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, ]");
        boolean boolean14 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator15 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator16 = strComparableDynamicArray0.spliterator();
        boolean boolean17 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator9);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(iterator15);
        org.junit.Assert.assertNotNull(strComparableSpliterator16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test3978() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3978");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        java.lang.String str9 = strComparableDynamicArray0.toString();
        boolean boolean10 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream11 = strComparableDynamicArray0.stream();
        int int12 = strComparableDynamicArray0.getSize();
        boolean boolean13 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[hi!]" + "'", str9, "[hi!]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(strComparableStream11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test3979() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3979");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put(10, (java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream13 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        int int16 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[], hi!, , ]");
        java.util.Iterator iterator19 = strComparableDynamicArray0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator20 = strComparableDynamicArray0.spliterator();
        java.util.Iterator iterator21 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strComparableStream13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 3 + "'", int16 == 3);
        org.junit.Assert.assertNotNull(iterator19);
        org.junit.Assert.assertNotNull(strComparableSpliterator20);
        org.junit.Assert.assertNotNull(iterator21);
    }

    @Test
    public void test3980() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3980");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        int int7 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[]");
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        java.lang.String str11 = strComparableDynamicArray0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableDynamicArray0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator13 = strComparableDynamicArray0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDynamicArray0.get((int) (short) 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2 + "'", int7 == 2);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!, []]" + "'", str11, "[hi!, []]");
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertNotNull(strComparableSpliterator13);
        org.junit.Assert.assertEquals("'" + strComparable15 + "' != '" + "hi!" + "'", strComparable15, "hi!");
    }

    @Test
    public void test3981() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3981");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        java.lang.String str9 = strComparableDynamicArray0.toString();
        int int10 = strComparableDynamicArray0.getSize();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream11 = strComparableDynamicArray0.stream();
        boolean boolean12 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.put(2, (java.lang.Comparable<java.lang.String>) "[, hi!, , hi!]");
        strComparableDynamicArray0.put(4, (java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Class<?> wildcardClass19 = strComparableDynamicArray0.getClass();
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[[], hi!]" + "'", str9, "[[], hi!]");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(strComparableStream11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(wildcardClass19);
    }

    @Test
    public void test3982() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3982");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        java.lang.Comparable<java.lang.String> strComparable4 = strComparableDynamicArray0.get(4);
        java.util.Iterator iterator5 = strComparableDynamicArray0.iterator();
        int int6 = strComparableDynamicArray0.getSize();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableDynamicArray0.stream();
        boolean boolean8 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[], hi!]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream11 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator12 = strComparableDynamicArray0.spliterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator13 = strComparableDynamicArray0.spliterator();
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDynamicArray0.remove(3);
        boolean boolean16 = strComparableDynamicArray0.isEmpty();
        int int17 = strComparableDynamicArray0.getSize();
        org.junit.Assert.assertNull(strComparable4);
        org.junit.Assert.assertNotNull(iterator5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(strComparableStream11);
        org.junit.Assert.assertNotNull(strComparableSpliterator12);
        org.junit.Assert.assertNotNull(strComparableSpliterator13);
        org.junit.Assert.assertNull(strComparable15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
    }

    @Test
    public void test3983() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3983");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        int int6 = strComparableDynamicArray0.getSize();
        java.lang.Comparable<java.lang.String> strComparable8 = strComparableDynamicArray0.get((int) (byte) 10);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Iterator iterator11 = strComparableDynamicArray0.iterator();
        int int12 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, []]");
        boolean boolean15 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2 + "'", int6 == 2);
        org.junit.Assert.assertNull(strComparable8);
        org.junit.Assert.assertNotNull(iterator11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 3 + "'", int12 == 3);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test3984() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3984");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        java.lang.String str4 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean7 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        java.lang.String str9 = strComparableDynamicArray0.toString();
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        int int11 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, [hi!, [hi!]]]");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[hi!]" + "'", str9, "[hi!]");
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
    }

    @Test
    public void test3985() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3985");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        java.lang.String str5 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable7 = strComparableDynamicArray0.remove((int) (short) 10);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, hi!, [[hi!, hi!, [hi!], [hi!]]]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertNull(strComparable7);
    }

    @Test
    public void test3986() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3986");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        int int6 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, ]");
        boolean boolean9 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream10 = strComparableDynamicArray0.stream();
        java.lang.String str11 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[hi!, []], [hi!, [hi!]]]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(strComparableStream10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[[, ]]" + "'", str11, "[[, ]]");
    }

    @Test
    public void test3987() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3987");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream4 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!]");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray0.remove((int) (short) 1);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        java.lang.Comparable<java.lang.String> strComparable13 = strComparableDynamicArray0.remove((int) (short) 0);
        int int14 = strComparableDynamicArray0.getSize();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream15 = strComparableDynamicArray0.stream();
        boolean boolean16 = strComparableDynamicArray0.isEmpty();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "[hi!]" + "'", strComparable9, "[hi!]");
        org.junit.Assert.assertEquals("'" + strComparable13 + "' != '" + "hi!" + "'", strComparable13, "hi!");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(strComparableStream15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test3988() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3988");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream4 = strComparableDynamicArray0.stream();
        int int5 = strComparableDynamicArray0.getSize();
        java.lang.String str6 = strComparableDynamicArray0.toString();
        java.lang.String str7 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray0.get((int) (short) 0);
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        java.lang.String str11 = strComparableDynamicArray0.toString();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream12 = strComparableDynamicArray0.stream();
        java.lang.String str13 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "[hi!]" + "'", str6, "[hi!]");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "[hi!]" + "'", str7, "[hi!]");
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "hi!" + "'", strComparable9, "hi!");
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "[hi!]" + "'", str11, "[hi!]");
        org.junit.Assert.assertNotNull(strComparableStream12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[hi!]" + "'", str13, "[hi!]");
    }

    @Test
    public void test3989() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3989");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put(10, (java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableDynamicArray0.isEmpty();
        java.util.Iterator iterator13 = strComparableDynamicArray0.iterator();
        int int14 = strComparableDynamicArray0.getSize();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream15 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable17 = strComparableDynamicArray0.get(4);
        java.util.Iterator iterator18 = strComparableDynamicArray0.iterator();
        strComparableDynamicArray0.put(5, (java.lang.Comparable<java.lang.String>) "[[], hi!, , ]");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream22 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, , []]");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.Comparable<java.lang.String> strComparable26 = strComparableDynamicArray0.remove((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index -1 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(iterator13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(strComparableStream15);
        org.junit.Assert.assertNull(strComparable17);
        org.junit.Assert.assertNotNull(iterator18);
        org.junit.Assert.assertNotNull(strComparableStream22);
    }

    @Test
    public void test3990() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3990");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator2 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream3 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        int int7 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.put((int) (short) 1, (java.lang.Comparable<java.lang.String>) "[[], hi!]");
        int int11 = strComparableDynamicArray0.getSize();
        java.lang.String str12 = strComparableDynamicArray0.toString();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableSpliterator2);
        org.junit.Assert.assertNotNull(strComparableStream3);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "[[[], hi!]]" + "'", str12, "[[[], hi!]]");
    }

    @Test
    public void test3991() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3991");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put(10, (java.lang.Comparable<java.lang.String>) "");
        boolean boolean12 = strComparableDynamicArray0.isEmpty();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream13 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDynamicArray0.remove((int) (short) 10);
        java.util.Iterator iterator16 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(strComparableStream13);
        org.junit.Assert.assertEquals("'" + strComparable15 + "' != '" + "" + "'", strComparable15, "");
        org.junit.Assert.assertNotNull(iterator16);
    }

    @Test
    public void test3992() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3992");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream6 = strComparableDynamicArray0.stream();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream7 = strComparableDynamicArray0.stream();
        int int8 = strComparableDynamicArray0.getSize();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        java.lang.Comparable<java.lang.String> strComparable11 = strComparableDynamicArray0.remove(0);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableStream6);
        org.junit.Assert.assertNotNull(strComparableStream7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertNull(strComparable11);
    }

    @Test
    public void test3993() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3993");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put((int) (byte) 10, (java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator iterator8 = strComparableDynamicArray0.iterator();
        java.lang.String str9 = strComparableDynamicArray0.toString();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream10 = strComparableDynamicArray0.stream();
        strComparableDynamicArray0.put(0, (java.lang.Comparable<java.lang.String>) "[[hi!, [hi!]]]");
        strComparableDynamicArray0.put(10, (java.lang.Comparable<java.lang.String>) "[[[[hi!]]], , [hi!, []], [[hi!]]]");
        java.lang.String str17 = strComparableDynamicArray0.toString();
        java.lang.Comparable<java.lang.String> strComparable19 = strComparableDynamicArray0.remove(5);
        java.util.Iterator iterator20 = strComparableDynamicArray0.iterator();
        java.lang.String str21 = strComparableDynamicArray0.toString();
        // The following exception was thrown during execution in test generation
        try {
            strComparableDynamicArray0.put(100, (java.lang.Comparable<java.lang.String>) "[[hi!, hi!, [hi!]]]");
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Index 100 out of bounds for length 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertNotNull(iterator8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "[]" + "'", str9, "[]");
        org.junit.Assert.assertNotNull(strComparableStream10);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "[[[hi!, [hi!]]], [[[[hi!]]], , [hi!, []], [[hi!]]]]" + "'", str17, "[[[hi!, [hi!]]], [[[[hi!]]], , [hi!, []], [[hi!]]]]");
        org.junit.Assert.assertNull(strComparable19);
        org.junit.Assert.assertNotNull(iterator20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "[[[[[hi!]]], , [hi!, []], [[hi!]]]]" + "'", str21, "[[[[[hi!]]], , [hi!, []], [[hi!]]]]");
    }

    @Test
    public void test3994() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3994");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        boolean boolean3 = strComparableDynamicArray0.isEmpty();
        java.lang.String str4 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, []]");
        int int9 = strComparableDynamicArray0.getSize();
        java.util.Iterator iterator10 = strComparableDynamicArray0.iterator();
        java.lang.Class<?> wildcardClass11 = iterator10.getClass();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "[]" + "'", str4, "[]");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(iterator10);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3995() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3995");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.put((int) (short) 0, (java.lang.Comparable<java.lang.String>) "[]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream9 = strComparableDynamicArray0.stream();
        int int10 = strComparableDynamicArray0.getSize();
        boolean boolean11 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!, hi!, [hi!], [hi!]]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[[[hi!]]], , [hi!, []], [[hi!]]]");
        java.util.Iterator iterator16 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertNotNull(strComparableStream9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(iterator16);
    }

    @Test
    public void test3996() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3996");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        boolean boolean4 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[hi!, hi!, [[], hi!]], []]");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator10 = strComparableDynamicArray0.spliterator();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertNotNull(strComparableSpliterator10);
    }

    @Test
    public void test3997() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3997");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray1 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>(100);
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream2 = strComparableDynamicArray1.stream();
        strComparableDynamicArray1.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray1.put(1, (java.lang.Comparable<java.lang.String>) "[[hi!]]");
        strComparableDynamicArray1.add((java.lang.Comparable<java.lang.String>) "[hi!, []]");
        boolean boolean10 = strComparableDynamicArray1.isEmpty();
        java.lang.Class<?> wildcardClass11 = strComparableDynamicArray1.getClass();
        org.junit.Assert.assertNotNull(strComparableStream2);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(wildcardClass11);
    }

    @Test
    public void test3998() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3998");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        boolean boolean1 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.stream.Stream<java.lang.Comparable<java.lang.String>> strComparableStream4 = strComparableDynamicArray0.stream();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator5 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[hi!]");
        java.lang.Comparable<java.lang.String> strComparable9 = strComparableDynamicArray0.remove((int) (short) 1);
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        java.util.Iterator iterator12 = strComparableDynamicArray0.iterator();
        boolean boolean13 = strComparableDynamicArray0.isEmpty();
        java.lang.Comparable<java.lang.String> strComparable15 = strComparableDynamicArray0.remove(5);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(strComparableStream4);
        org.junit.Assert.assertNotNull(strComparableSpliterator5);
        org.junit.Assert.assertEquals("'" + strComparable9 + "' != '" + "[hi!]" + "'", strComparable9, "[hi!]");
        org.junit.Assert.assertNotNull(iterator12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNull(strComparable15);
    }

    @Test
    public void test3999() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test3999");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        boolean boolean5 = strComparableDynamicArray0.isEmpty();
        boolean boolean6 = strComparableDynamicArray0.isEmpty();
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[, ]");
        java.lang.Comparable<java.lang.String> strComparable12 = strComparableDynamicArray0.remove(10);
        java.lang.Comparable<java.lang.String> strComparable14 = strComparableDynamicArray0.remove(2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(strComparable12);
        org.junit.Assert.assertNull(strComparable14);
    }

    @Test
    public void test4000() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest7.test4000");
        com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>> strComparableDynamicArray0 = new com.thealgorithms.datastructures.dynamicarray.DynamicArray<java.lang.Comparable<java.lang.String>>();
        java.lang.Comparable<java.lang.String> strComparable1 = null;
        strComparableDynamicArray0.add(strComparable1);
        int int3 = strComparableDynamicArray0.getSize();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator4 = strComparableDynamicArray0.spliterator();
        java.lang.String str5 = strComparableDynamicArray0.toString();
        int int6 = strComparableDynamicArray0.getSize();
        boolean boolean7 = strComparableDynamicArray0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> strComparableSpliterator8 = strComparableDynamicArray0.spliterator();
        strComparableDynamicArray0.put((int) (short) 1, (java.lang.Comparable<java.lang.String>) "[hi!]");
        boolean boolean12 = strComparableDynamicArray0.isEmpty();
        java.lang.String str13 = strComparableDynamicArray0.toString();
        strComparableDynamicArray0.put(4, (java.lang.Comparable<java.lang.String>) "[[hi!]]");
        strComparableDynamicArray0.add((java.lang.Comparable<java.lang.String>) "[[hi!, []]]");
        java.util.Iterator iterator19 = strComparableDynamicArray0.iterator();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(strComparableSpliterator4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "[]" + "'", str5, "[]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(strComparableSpliterator8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "[[hi!]]" + "'", str13, "[[hi!]]");
        org.junit.Assert.assertNotNull(iterator19);
    }
}

